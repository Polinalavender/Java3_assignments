public class Nhlium extends FuelCore {

    public Nhlium() {
        this.THRESHOLD_TEMPERATURE = 328;
    }

    public SplitResult split(double temp, double time){
        super.split (temp, time);

        // Updating the residual percentage
        double residualPercentageLost = this.residualPercentage - time * 0.08; // If Java knows math it will multiply first
        this.residualPercentage = Validator.isPositive(residualPercentageLost) ? residualPercentageLost : 0;

        double steam;
        double residualHeat;

        if (temp < THRESHOLD_TEMPERATURE) {
            steam = temp / 80 * time * 0.7;
            residualHeat = time * 9;
        } else {
            // 0.8 * T * 0.6 * (square root of 4) * t / t => time (t) can be simplified
            steam = 0.8 * temp * 0.6 * Math.sqrt(4); // * time / time;
            residualHeat = temp / 0.8;
        }

        return new SplitResult(residualHeat, steam);
    }
}
