package task1;

public class TramRouteWithArray extends AbstractTramRoute {
    protected Station[] stations;

    public TramRouteWithArray(int num, int avarageInterval, Station[] stations) {
        this.num = num;
        this.averageInterval = avarageInterval;
        this.stations = stations.clone();
    }

    public void addStation(Station station) {
        Station[] temp = new Station[stations.length + 1];
        for (int i = 0; i < stations.length; i++) {
            temp[i] = stations[i];
        }
        temp[temp.length - 1] = station;
        stations = temp;
    }

    @Override
    public Station[] getTramRoute() {
        return stations;
    }

    @Override
    public void setTramRouteWithArray(Station[] t) {
        stations = t;
    }

}
