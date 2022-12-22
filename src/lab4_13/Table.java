package lab4_13;

public class Table extends Furniture{
    private int size;

    public Table(String material, int price,int size) {
        super(material, price);
        this.size=size;
    }



    @Override
    int getPrice() {
        return this.price * size;
    }

    @Override
    public String toString() {
        return "Table: made of " + this.material + " for "
                + this.price + " with size " + this.size
                + "; full price is " + (this.price * this.size);
    }
}
