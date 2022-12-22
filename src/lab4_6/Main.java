package lab4_6;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("89250925060","Apple",7.9);
        Phone phone2 = new Phone("89250874598","Samsung");
        Phone phone3 = new Phone();


        System.out.println(phone1.getNumber() + "\t"+ phone1.getModel() +"\t"+ phone1.getWeight() +"\n");
        System.out.println(phone2.getNumber() +"\t"+ phone2.getModel() +"\t"+ phone2.getWeight() +"\n");
        System.out.println(phone3.getNumber() +"\t"+ phone3.getModel() +"\t"+ phone3.getWeight() +"\n");

        phone1.receiveCall("Mother");
        phone2.receiveCall("Father");
        phone2.receiveCall("Sister","89254356523");

        phone1.sendMessage("423984723947","385739857435","34753475375");

    }

}
