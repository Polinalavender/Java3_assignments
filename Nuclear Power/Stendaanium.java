public class Stendaanium extends FuelCore {

    public Stendaanium() {
        this.THRESHOLD_TEMPERATURE = 334;
    }
    @Override
    public SplitResult split(double temp, double time) {
        super.split(temp, time);


        // Updating the residual percentage
        double residualPercentageLost = this.residualPercentage - ((0.00008 * temp * time) + 0.0003);

        double steam = 0;
        double residualHeat = 0;

        if (temp < THRESHOLD_TEMPERATURE) {
            steam = temp * 50;
            residualHeat = time * 23 / 0.7;
        } else {
            this.residualPercentage = Validator.isPositive(residualPercentageLost) ? residualPercentageLost : 0;
        }

        return new SplitResult(residualHeat, steam);
    }
}