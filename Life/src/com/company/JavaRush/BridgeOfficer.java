package com.company.JavaRush;

public class BridgeOfficer {

    int maxWeight;

    public BridgeOfficer(int normalVolume) {
        this.maxWeight = normalVolume;
    }

    public boolean checkTruck(Truck truck) {

        if (truck.weight > maxWeight) {


            return false;
        } else {

            return true;
        }
    }
}
