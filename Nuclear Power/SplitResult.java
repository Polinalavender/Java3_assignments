public class SplitResult {
    private double heatAmountOfSteam;
    private double residualHeat;

    public SplitResult(double residualHeat, double heatAmountOfSteam) {
        this.residualHeat = residualHeat;
        this.heatAmountOfSteam = heatAmountOfSteam;
    }

    public double getResidualHeat() {
        return this.residualHeat;
        //return Conter.getFormattedDouble(this.residualHeat);
    }

    public void setResidualHeat(double residualHeat) {
        this.residualHeat = residualHeat;
    }

    public double getHeatAmount() {
        return this.heatAmountOfSteam;
        //return Counter.getFormattedDouble(this.heatAmountOfSteam);
    }

    public void setHeatAmount(double heatAmount) {
        this.heatAmountOfSteam = heatAmount;
    }
}