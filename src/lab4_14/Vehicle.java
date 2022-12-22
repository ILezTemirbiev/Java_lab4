package lab4_14;

public abstract class Vehicle {
    protected int pricePerPerson;
    protected int pricePerKG;
    protected int kilometerPerHour;

    public Vehicle(int pricePerPerson, int pricePerKG, int kilometerPerHour) {
        this.pricePerPerson = pricePerPerson;
        this.pricePerKG = pricePerKG;
        this.kilometerPerHour = kilometerPerHour;
    }

    abstract int countPricePerPerson(int n);

    abstract int countPricePerKG(int n);

    abstract double countTime(int kil);

}
