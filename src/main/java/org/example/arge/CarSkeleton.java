package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton() {
    }

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String startEngine(){
        System.out.println("classname: " + getClass().getSimpleName());
        return getName() + " starting engine";
    }

    public String drive(){
        runEngine(this);
        return getName() + " is driving";
    }

    public void runEngine(CarSkeleton carSkeleton){
        if(carSkeleton instanceof ElectricCar){
            double avgKmPerChange = ((ElectricCar) carSkeleton).getAvgKmPerCharge();
            int batterySize = ((ElectricCar) carSkeleton).getBatterySize();
            System.out.println("electric car is starting. Per charge: " + avgKmPerChange + " battery size" + batterySize);
        } else if(carSkeleton instanceof HybridCar){
            HybridCar hybridCar = (HybridCar) carSkeleton;
            System.out.println("hybrid car is starting. Per charge: " + hybridCar.getAvgKmPerLiter() + "battery size: " + hybridCar.getBatterySize() + " cylinder: " + hybridCar.getCylinders());
        } else if(carSkeleton instanceof GasPoweredCar){
            GasPoweredCar gasPoweredCar = (GasPoweredCar) carSkeleton;
            System.out.println("gas powered car is starting. Per charge " + gasPoweredCar.getAverageKmPerLiter());
        } else {
            System.out.println("invalid car type!");
        }
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
