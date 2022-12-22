package lab4_4;

import static lab4_4.Mark.*;

public class Main {
    public static void main(String[] args) {

        Computer[] comp = {
                new Memory(LENOVO,"black",256,"memory"),
                new Monitor(ISUS,"white",27,"monitor"),
                new Processor(SUMSUNG,"blue",37.5,"processor")
        };

        new all().print(comp);
    }

}
