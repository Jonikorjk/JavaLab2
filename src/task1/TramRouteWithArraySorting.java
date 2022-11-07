package task1;

import java.util.Arrays;
import java.util.Comparator;

public class TramRouteWithArraySorting extends TramRouteWithArray {
    public TramRouteWithArraySorting(int num, int avarageInterval, Station[] stations) {
        super(num, avarageInterval, stations);
    }

    @Override
    public Station[] nameOfStationSort() {
        if (stations.length == 0 || stations == null) return null;
        Station[] sortedStations = stations.clone();
        Arrays.sort(sortedStations);
        return sortedStations;
    }

    @Override
    public Station[] passengersSort() {
        if (stations.length == 0 || stations == null) return null;
        Station[] sortedStations = stations.clone();
        Arrays.sort(sortedStations, new Comparator<Station>() {
            @Override
            public int compare(Station o1, Station o2) {
                return o1.getNameOfStation().compareTo(o2.getNameOfStation());
            }
        });
        return sortedStations;
    }
}
