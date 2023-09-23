public class Car implements CarbonProducer {
    public double drivenMiles;

    public Car(double drivenMiles) {
        this.drivenMiles = drivenMiles;
    }

    @Override
    public double getCarbonFootPrint() {
        return drivenMiles * 0.0000292;
    }
}
