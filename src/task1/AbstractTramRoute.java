package task1;

import java.util.Arrays;
import java.util.Objects;

public abstract class AbstractTramRoute {
    protected int num = 0;
    protected int averageInterval = 0;


    public int getNum() { return  num; }
    public int getAverageInterval() { return averageInterval; }
    public void setNum(int num) { this.num = num; }
    public void setAverageInterval(int averageInterval) { this.averageInterval = averageInterval; }

    private Station[] append(Station[] stations, Station station) {
        Station[] newStations = new Station[stations.length + 1];
        for (int i = 0; i < stations.length; i++) {
            newStations[i] = stations[i];
        }
        newStations[newStations.length - 1] = station;
        return newStations;
    }

    public int getAllPassengers() {
        Station[] stations = getTramRoute().clone();
        Station minPassengers = stations[0];
        int allPassengers = 0;
        for (var i : stations) {
            allPassengers += i.getPassengers();
        }
        return allPassengers;
    }

    public Station[] getStationsWithLeastNumberOfPassengers() {
        Station[] stations = getTramRoute().clone();
        Station minPassengers = stations[0];
        for (var i : stations) {
            if (minPassengers.getPassengers() > i.getPassengers()) {
                minPassengers = i;
            }
        }
        Station[] leastPassengers = new Station[1];
        leastPassengers[0] = minPassengers;
        for (int i = 0; i < stations.length; i++) {
            if ((leastPassengers[0].getPassengers() == stations[i].getPassengers()) &&
                    (!leastPassengers[0].equals(stations[i]))) {
                leastPassengers = append(leastPassengers, stations[i]);
            }
        }
        return leastPassengers;
    }

    public Station[] getStationWithTheLargestName() {
        Station[] stations = getTramRoute().clone();
        Station largestName = stations[0];
        for (var i : stations) {
            if (largestName.getNameOfStation().length() < i.getNameOfStation().length()) {
                largestName = i;
            }
        }
        Station[] largestNames = new Station[1];
        largestNames[0] = largestName;
        for (int i = 0; i < stations.length; i++) {
            if ((largestNames[0].getNameOfStation().length() == stations[i].getNameOfStation().length()) &&
                    (!largestNames[0].equals(stations[i]))) {
               largestNames = append(largestNames, stations[i]);
            }
        }
        return largestNames;
    }

    public abstract Station[] getTramRoute();
    public abstract void setTramRouteWithArray(Station[] t);

    @Override
    public String toString() {
        String info = "Amount of all station: " + num + " Avarage time interval between stations: " + averageInterval + '\n';
        Station[] stations = getTramRoute();
        for (var i : stations) {
            info += i.toLongFormString() + '\n';
        }
        return info;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof AbstractTramRoute c)) return false;
        if (num != c.num || averageInterval != c.averageInterval || getAllPassengers() != c.getAllPassengers()) return false;
        return Arrays.equals(getTramRoute(), c.getTramRoute());
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, averageInterval);
    }

    public Station[] passengersSort() {
        boolean mustSort = false;
        Station[] stations = getTramRoute().clone();
        if (stations.length == 0 || stations == null) return null;
        do {
            mustSort = false;
            for (int i = 0; i < stations.length - 1; i++) {
                if (stations[i].getPassengers() < stations[i + 1].getPassengers()) {
                    Station buffer = stations[i];
                    stations[i] = stations[i + 1];
                    stations[i + 1] = buffer;
                    mustSort = true;
                }
            }
        } while(mustSort);
        return stations;
    }

    public Station[] nameOfStationSort() {
        Station[] stations = getTramRoute().clone();
        if (stations.length == 0 || stations == null) return null;
        for (int i = 1; i < stations.length; ++i) {
            Station key = stations[i];
            int j = i - 1;
            while (j >= 0 && stations[j].getNameOfStation().compareTo(key.getNameOfStation()) > 0) {
                stations[j + 1] = stations[j];
                j = j - 1;
            }
            stations[j + 1] = key;
        }
        return stations;
    }

    public static void test() {
        Station[] stations = {
                new Station("Porkovsk", 15),
                new Station("Dobropolie", 2),
                new Station("Kramatorsk", 37),
                new Station("Slavyansk", 33),
                new Station("Izum", 15),
                new Station("Chygyev", 2),
                new Station("Kharkov", 74)
        };
        TramRouteWithArray tramRouteWithArray = new TramRouteWithArray(127, 15, stations);
        tramRouteWithArray.addStation(new Station("Kiev", 73));
        System.out.print(tramRouteWithArray);

        System.out.println("Total number of passengers: " + tramRouteWithArray.getAllPassengers());
        System.out.println( "The station with the least number of passengers: " + Arrays.deepToString(tramRouteWithArray.getStationsWithLeastNumberOfPassengers()));
        System.out.println("With the longest name: " + Arrays.deepToString(tramRouteWithArray.getStationWithTheLargestName()));

        System.out.println("Bubble sort (in abstract class): " +  Arrays.deepToString(tramRouteWithArray.passengersSort()));
        System.out.println("Insert sort (in abstract class): " + Arrays.deepToString(tramRouteWithArray.nameOfStationSort()));

        System.out.println();
        TramRouteWithArraySorting tramRouteWithArraySorting = new TramRouteWithArraySorting(128, 15, stations);
        System.out.println(tramRouteWithArraySorting);
        System.out.println("Comparable way: " + Arrays.deepToString(tramRouteWithArraySorting.nameOfStationSort()));
        System.out.println("Comparator way: " + Arrays.deepToString(tramRouteWithArraySorting.passengersSort()));
    }

}
