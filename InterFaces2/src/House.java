public class House implements CarbonProducer {
    public double covArea;

    public House(double covArea) {
        this.covArea = covArea;
    }

    @Override
    public double getCarbonFootPrint() {
        return covArea * 0.005;
    }
}