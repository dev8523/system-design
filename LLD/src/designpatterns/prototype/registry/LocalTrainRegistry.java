package designpatterns.prototype.registry;

import designpatterns.prototype.LocalTrain;

import java.util.HashMap;
import java.util.Map;

public class LocalTrainRegistry {
    private Map<String, LocalTrain> registry;

    public LocalTrainRegistry() {
        this.registry = new HashMap<>();
    }

    public LocalTrain get(String trainType) {
        return registry.get(trainType);
    }

    public void save(LocalTrain localTrain) {
        registry.put(localTrain.getTrainType(), localTrain);
    }
}
