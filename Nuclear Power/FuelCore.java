public abstract class FuelCore {
    private static final int DEFAULT_PERCENTAGE = 100;
    protected double residualPercentage;
    protected int THRESHOLD_TEMPERATURE;


    public FuelCore(int thresholdTemp) {
        this.residualPercentage = DEFAULT_PERCENTAGE;
        THRESHOLD_TEMPERATURE = thresholdTemp;
    }

    public double getResidualPercentage() {
        return Validator.getFormattedDouble(this.residualPercentage);
    }

    /**
     * The "split" inside a core to produce heat and steam
     * Will calculate the results differently based on the core type
     *
     * @param temperature inside the core
     * @param time temperature passed was maintained
     * @return The heat and steam in the SplitResult class
     */
    public SplitResult split(double temperature, double time) {
        // Temperature cannot be below freezing
        if (!Validator.isAboveFreezingTemperatureKelvin(temperature)) {
            throw new IllegalArgumentException("Temperature cannot be below the freezing point!");
        }
        // Time obviously cannot be negative
        if (!Validator.isPositive(time)) {
            throw new IllegalArgumentException("Time cannot be negative!");
        }
        // avoid errors
        return null;
    }

    @Override
    public String toString() {
        // Returns the class name
        return this.getClass().getSimpleName();
    }
}

