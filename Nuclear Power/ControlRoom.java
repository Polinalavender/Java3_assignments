public class ControlRoom {

    public interface Reactor() {
        public default String getStatus() {
            if (fuelCore.getResidualPercentage() <= 0.2){
            return "Needs Attention";
        }
    }

    public interface CoolingSystem(double temp) {}
        if (temp > 80 && temp < 90) {
            return "Needs Attention";
        } else if (temp > 90) {
            return "Unstable";
        }
    }

    public interface  Generator() {
        if (generator.generateEnergy() > 500){
            return "Unstable";
        }
    }

    public boolean isNuclearReactorStable() {
        if{}
            return false;
    } else {
        return true;
    }
}
