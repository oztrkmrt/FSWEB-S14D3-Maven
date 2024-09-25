package org.example.arge;

public class CarFactory {
    public static void main(String[] args) {

        CarSkeleton electricCar = new ElectricCar("byd" ,"byd desc", 600,100);
        CarSkeleton hybridCar = new HybridCar("toyota","toyota desc", 40, 800,4);
        CarSkeleton gasPoweredCar = new GasPoweredCar("honda", "honda desc", 20,4);

    }
}
