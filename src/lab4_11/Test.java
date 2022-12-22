package lab4_11;

public class Test {
    public static void main(String[] args) {
        Pupil[] arr = new Pupil[5];
        arr[0] = new Student("Pasha");
        arr[1] = new Schooler("Sasha");
        arr[2] = new Schooler("Vova");
        arr[3] = new Student("Kolya");
        arr[4] = new Student("Andrew");

        System.out.println("Students:");
        for(int i=0;i<5;i++){
            if(arr[i].getClass().toString().equals("class ru.mirea.lab4_11.Student")){
                System.out.println(arr[i].getName());
            }
        }
        System.out.println("Schoolers:");
        for(int i=0;i<5;i++){
            if(arr[i].getClass().toString().equals("class ru.mirea.lab4_11.Schooler")){
                System.out.println(arr[i].getName());
            }
        }
    }
}
