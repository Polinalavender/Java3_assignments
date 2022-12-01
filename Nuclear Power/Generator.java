public class Generator  implements Status {
    private double totalEnergy;

    public double generateEnergy(double steamAmount) {
        double energy = Counter.isPositive(steamAmount) ? steamAmount * 12 : 0;
        this.addEnergy(energy);
        return energy;
    }

    public double getTotalAmountEnergy() {
        return this.totalEnergy;
    }

    private void addEnergy(double amount) {
        this.totalEnergy += amount;
    }

    @Override
    public Statuses getStatus() {
        if(totalEnergy > 500) {
            return Statuses.UNSTABLE;
            }
        return Statuses.STABLE;
    }
}