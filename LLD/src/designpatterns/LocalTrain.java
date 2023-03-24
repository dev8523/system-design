package designpatterns;

/**
 * local trains in Mumbai
 */
public class LocalTrain implements Prototype<LocalTrain> {
    // All trains have same fare, same train type, same engine type, same number of seats
    // but have different timings, and stations
    private int fare;
    private String trainType;
    private String engineType;
    private int noOfSeats;
    private String timing;
    private String station;

    /**
     * Copy constructor only contains the same attributes
     */
    public LocalTrain(LocalTrain localTrain) {
        this.fare = localTrain.fare;
        this.trainType = localTrain.trainType;
        this.engineType = localTrain.engineType;
        this.noOfSeats = localTrain.noOfSeats;
    }

    public LocalTrain() {
    }

    @Override
    public LocalTrain clone() {
        return new LocalTrain(this);
    }

    public int getFare() {
        return fare;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }

    public String getTrainType() {
        return trainType;
    }

    public void setTrainType(String trainType) {
        this.trainType = trainType;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public String getTiming() {
        return timing;
    }

    public void setTiming(String timing) {
        this.timing = timing;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    @Override
    public String toString() {
        return "LocalTrain{" +
                "fare=" + fare +
                ", trainType='" + trainType + '\'' +
                ", engineType='" + engineType + '\'' +
                ", noOfSeats=" + noOfSeats +
                ", timing='" + timing + '\'' +
                ", station='" + station + '\'' +
                '}';
    }
}
