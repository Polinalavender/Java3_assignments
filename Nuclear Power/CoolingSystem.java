public class CoolingSystem implements Status{
    private double waterTemp;

    public CoolingSystem(double waterTemp) {
        if (!Counter.isPositive(waterTemp)) {
            throw new IllegalArgumentException("Water temperature must be above 0!");
        }
        this.waterTemp = waterTemp;
    }

    public double getWaterTemp() {
        return this.waterTemp;
    }

    public double abductResidualHeat(double heat) {
        double waterTemp = heat * 0.4;
        this.waterTemp = waterTemp;
        return waterTemp;
    }

    @Override
    public Statuses getStatus() {
        if(waterTemp > 80 && waterTemp < 90) {
            return Statuses.NEEDS_ATTENTION;
        } else if (waterTemp > 90){
            return Statuses.UNSTABLE;
        } else {
            return Statuses.STABLE;
        }
    }
}