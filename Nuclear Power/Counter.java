import java.text.DecimalFormat;

public abstract class Counter {
    public static final double FREEZING_TEMPERATURE_KELVIN = 273.15;

    public static boolean isPositive(double number) {
        return number > 0;
    }

    public static boolean isAboveFreezingTemp(double temperature) {
        return temperature > FREEZING_TEMPERATURE_KELVIN;
    }

//    public static double getFormattedDouble(double number) {
//        // Formatting the double to return only the last 4 decimals
//        DecimalFormat format = new DecimalFormat("0.0000");
//        return Double.parseDouble(format.format(number));
//     }
}

