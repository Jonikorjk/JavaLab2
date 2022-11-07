package task1;

import java.util.Objects;

public class Station implements Comparable<Station> {
    private String name;
    private int amountOfPassengers;

    Station(String name, int amountOfPassengers) {
        this.name = name;
        this.amountOfPassengers = amountOfPassengers;
    }

    public String getNameOfStation() { return name; }
    public int getPassengers() { return amountOfPassengers; }

    public void setPassengers(int passengers) { amountOfPassengers = passengers; }
    public void setNameOfStation(String station) { name = station; }

    @Override
    public String toString() {
        return name + " passengers: " + amountOfPassengers;
    }

    public String toLongFormString() {
        return "Station Name: " +  name + " amount of passengers on this station: " + amountOfPassengers;
    }

    @Override
    public boolean equals(Object station) {
        if (this == station) {
            return true;
        }
        if (station == null || !(station instanceof Station)) {
            return  false;
        }

        Station st = (Station)station;
        return name.equals(st.name) && amountOfPassengers == st.amountOfPassengers;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, amountOfPassengers);
    }
    @Override
    public int compareTo(Station o) {
        return name.compareTo(o.name);
    }
}
