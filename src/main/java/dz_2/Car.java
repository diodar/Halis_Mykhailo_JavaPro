package dz_2;

public class Car {

    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
    }

    private void startElectricity() {
        System.out.println("Electricity was activated");
    }

    private void startCommand() {
        System.out.println("Command was activated");
    }

    private void startFuelSystem() {
        System.out.println("Fuel System was activated");
    }
}