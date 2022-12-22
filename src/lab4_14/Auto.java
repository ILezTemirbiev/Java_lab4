package lab4_14;

public class Auto extends Vehicle{
    public Auto(int pricePerPerson, int pricePerKG, int kilometerPerHour) {
        super(pricePerPerson, pricePerKG, kilometerPerHour);
    }


    public int countPricePerPerson(int n) {
        return this.pricePerPerson * n;
    }


    public int countPricePerKG(int n) {
        return this.pricePerKG * n;
    }


    public double countTime(int kil) {
        return (kil + 5.0) / kilometerPerHour;
    }

}
