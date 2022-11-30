import java.util.Set;

public class Reactor {
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
}