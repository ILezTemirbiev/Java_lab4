package lab4_9;

public class Reader {
    private String fio;
    private int id;
    private String facul;
    private String birthDay;
    private String number;

    public Reader(String fio, int id, String facul, String birthDay, String number) {
        this.fio = fio;
        this.id = id;
        this.facul = facul;
        this.birthDay = birthDay;
        this.number = number;
    }
    public void takeBook(int num){System.out.println(this.fio + " take " + num + " books");}
    public void takeBook(Book... books){
        System.out.println(this.fio+ " take books: ");
        for(Book bk:books){
            System.out.println(bk);
        }
    }
    public void returnBook(int num){System.out.println(this.fio+ " return" + num + " books");}

    public void returnBook(Book... books){
        System.out.println(this.fio+ " return books: ");
        for(Book bk : books)
        {
            System.out.println(bk);
        }
    }

    @Override
    public String toString() {
        return "Reader{" +
                "fio='" + fio + '\'' +
                ", id=" + id +
                ", facul='" + facul + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", number='" + number + '\'' +
                '}';
    }

}
