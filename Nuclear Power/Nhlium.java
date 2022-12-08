public class Nhlium extends FuelCore {
    public Nhlium(int thresholdTemp) {
        super(thresholdTemp);
    }

    public SplitResult split(double temp, double time) throws MeltdownException {
        super.split(temp, time);
        this.THRESHOLD_TEMPERATURE = 328;

            if ((time > 60 && temp > 100) || (getResidualPercentage() < 0.1)) {
                throw new MeltdownException("Meltdown NHLium");
            }
            // Updating the residual percentage
            double residualPercentageLost = this.residualPercentage - time * 0.08;
            this.residualPercentage = Counter.isPositive(residualPercentageLost) ? residualPercentageLost : 0;

            double steam;
            double residualHeat;

            if (temp < THRESHOLD_TEMPERATURE) {
                steam = temp / 80 * time * 0.7;
                residualHeat = time * 9;
            } else {
                steam = 0.8 * temp * 0.6 * Math.sqrt(4);
                residualHeat = temp / 0.8;
            }
            return new SplitResult(residualHeat, steam);
    }
}
