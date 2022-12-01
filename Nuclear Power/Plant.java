public class Plant {
    private Reactor reactor;
    private Generator generator;
    private CoolingSystem coolingSystem;

    private ControlRoom controlRoom;

    public Plant(Reactor reactor, Generator generator, CoolingSystem coolingSystem, ControlRoom controlRoom) {
        this.reactor = reactor;
        this.generator = generator;
        this.coolingSystem = coolingSystem;
        this.controlRoom = controlRoom;
    }

    public Reactor getReactor() {
        return this.reactor;
    }

    public void setReactor(Reactor reactor) {
        this.reactor = reactor;
    }

    public Generator getGenerator() {
        return this.generator;
    }

    public void setGenerator(Generator generator) {
        this.generator = generator;
    }

    public CoolingSystem getCoolingSystem() {
        return this.coolingSystem;
    }

    public void setCoolingSystem(CoolingSystem coolingSystem) {
        this.coolingSystem = coolingSystem;
    }

    public ControlRoom getControlRoom() {
        return controlRoom;
    }

    public void setControlRoom(ControlRoom controlRoom) {
        this.controlRoom = controlRoom;
    }

    /**
     * Returns all the energy generated
     */

    public double run(double temp, double time) {
        double totalResidualHeat = 0;
        double totalSteam = 0;

        // Getting all the steam and residual heat generated by the reactor
        for(FuelCore fuelcore : this.reactor.getCores()){
            SplitResult splitResult = fuelcore.split(temp, time);
            totalSteam += splitResult.getHeatAmount();
            totalResidualHeat += splitResult.getResidualHeat();
        }
        this.generator.generateEnergy(totalSteam);
        this.coolingSystem.abductResidualHeat(totalResidualHeat);

        return this.generator.getTotalAmountEnergy();
    }
}