package lab4_14;

public class Plain extends Vehicle{
    public Plain(int pricePerPerson, int pricePerKG, int kilometerPerHour) {
        super(pricePerPerson, pricePerKG, kilometerPerHour);
    }

    @Override
    int countPricePerPerson(int n) {
        return this.pricePerPerson * n;
    }

    @Override
    int countPricePerKG(int n) {
        return this.pricePerKG * n;
    }

    @Override
    double countTime(int kil) {
        return (kil + 5.0) / kilometerPerHour;
    }

}
