public abstract class FuelCore {
    private static final int DEFAULT_PERCENTAGE = 100;
    protected double residualPercentage;
    protected int THRESHOLD_TEMPERATURE;


    public FuelCore(int thresholdTemp) {
        this.residualPercentage = DEFAULT_PERCENTAGE;
        THRESHOLD_TEMPERATURE = thresholdTemp;
    }

    public double getResidualPercentage() {
        return this.residualPercentage;
        //return Counter.getFormattedDouble(this.residualPercentage);
    }

    /**
     * The "split" inside a core to produce heat and steam
     * Will calculate the results differently based on the core type
     */
    public SplitResult split(double temperature, double time) throws MeltdownException {
        // Temperature cannot be below freezing
        if (!Counter.isAboveFreezingTemp(temperature)) {
            throw new IllegalArgumentException("Temperature cannot be below the freezing point!");
        }
        // Time obviously cannot be negative
        if (!Counter.isPositive(time)) {
            throw new IllegalArgumentException("Time cannot be negative!");
        }
        // avoid errors
        return null;
    }
}

