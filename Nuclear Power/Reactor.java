import java.util.Set;

public class Reactor implements Status {
    private Set<FuelCore> cores;

    public Reactor(Set<FuelCore> cores) {
        this.cores = cores;
    }

    public Set<FuelCore> getCores() {
        return cores;
    }

    public void setCores(Set<FuelCore> cores) {
        this.cores = cores;
    }

    public void addCore(FuelCore fuelcore) {
        this.cores.add(fuelcore);
    }

//    public double getTotalSteam(double temp, double time) {
//
//    }
    @Override
    public Statuses getStatus() {
        for (FuelCore fuelCore: cores) {
            if (fuelCore.getResidualPercentage() <= 0.2) {
                return Statuses.NEEDS_ATTENTION;
            }
        }
        return Statuses.STABLE;
    }
}