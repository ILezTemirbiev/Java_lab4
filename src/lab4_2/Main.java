package lab4_2;

import static lab4_2.SizeClose.*;

public class Main {
    public static void main(String[] args) {
        Clothes[] cloth={
                new TShirt(XXS,"желтый",1000),
                new Pants(XXS,"синий",2000),
                new Skirt(XS,"оранжевый",3000),
                new Tie(M,"красный",200)

        };

        new Atelier().dressMan2(cloth);
        new Atelier().dressWoman2(cloth);
    }
}
