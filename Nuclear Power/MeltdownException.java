//    Throw the MeltdownException in the following cases while splitting:
//            • NHLium: The time is more than 60 seconds and the temperature
//    above 100 Kelvin. Also if the residual percentage is below 0.1%.
//            • Stendaanium: When the temperature is above 150 Kelvin
public class MeltdownException extends Exception {
    public MeltdownException(String message){
        super(message);
    }
}
