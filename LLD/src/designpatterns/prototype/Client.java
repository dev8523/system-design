package designpatterns.prototype;

import designpatterns.prototype.registry.LocalTrainRegistry;

public class Client {
    public static void main(String[] args) {
        // created registry as local trains can have multiple batches
        LocalTrainRegistry localTrainRegistry = new LocalTrainRegistry();

        LocalTrain centralLineLocal = new LocalTrain();
        centralLineLocal.setFare(10);
        centralLineLocal.setTrainType("central-line");
        centralLineLocal.setEngineType("SF Exp");
        centralLineLocal.setNoOfSeats(100);

        LocalTrain westernLineLocal = new LocalTrain();
        westernLineLocal.setFare(20);
        westernLineLocal.setTrainType("western-line");
        westernLineLocal.setEngineType("SF Exp");
        westernLineLocal.setNoOfSeats(200);

        LocalTrain harbourLineLocal = new LocalTrain();
        harbourLineLocal.setFare(30);
        harbourLineLocal.setTrainType("harbour-line");
        harbourLineLocal.setEngineType("SF Exp");
        harbourLineLocal.setNoOfSeats(300);

        // Save into the registry
        localTrainRegistry.save(centralLineLocal);
        localTrainRegistry.save(westernLineLocal);
        localTrainRegistry.save(harbourLineLocal);

        // Local train of harbour-line trainType
        LocalTrain centralLineLocalPrototype = localTrainRegistry.get("central-line");
        LocalTrain l1 = centralLineLocalPrototype.clone();
        l1.setTiming("1:00 PM");
        l1.setStation("Badlapur");

        // Local train of western-line trainType
        LocalTrain westernLineLocalPrototype = localTrainRegistry.get("western-line");
        LocalTrain l2 = westernLineLocalPrototype.clone();
        l2.setTiming("2:00 PM");
        l2.setStation("Vashi");

        // Local train of western-line trainType
        LocalTrain harbourLineLocalPrototype = localTrainRegistry.get("harbour-line");
        LocalTrain l3 = harbourLineLocalPrototype.clone();
        l3.setTiming("3:00 PM");
        l3.setStation("Chembur");

        System.out.println("central-line prototype: " + centralLineLocalPrototype);
        System.out.println("western-line prototype: " + westernLineLocalPrototype);
        System.out.println("harbour-line prototype: " + harbourLineLocalPrototype);
    }
}
