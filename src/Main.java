import java.util.Scanner;

class Person{
    int id;
    String name;
    double salary;
    //Display the arrays.
    void display(int id[], String name[], double salary[]){

        System.out.println("ID            Name          Salary");

        for(int i=0; i<id.length; i++) {
            System.out.println(id[i] + "            " + name[i] + "          " + salary[i]);
        }
    }
    //Display the arrays.
    void display(int id[], String name[]){
        System.out.println("ID            Name");

        for(int i=0; i<id.length; i++) {
            System.out.println(id[i] + "            " + name[i]);
        }
    }
    //Display the arrays.
    void display(String searchName, int id[], String name[], double salary[]){
        System.out.println("ID            Name            Salary");

        for(int i=0; i<id.length; i++) {
            if (name[i].equals(searchName))
                System.out.println(id[i] + "            " + name[i] + "            " + salary[i]);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        int id[] = new int[5];
        String name[] = new String[5];
        double salary[] = new double[5];
        //Accepting data...
        Scanner sc = new Scanner(System.in);

        for(int i =0; i<5; i++){
            System.out.println("Enter the employees ID, Name, and Salary format...");
            id[i] = sc.nextInt();
            name[i] = sc.next();
            salary[i] = sc.nextDouble();
        }
        Person p1 = new Person();
        p1.display(id, name, salary);
        System.out.println();

        p1.display(id, name);

        System.out.println("Enter the name searching for :");
        String searchName = sc.next();
        p1.display(searchName, id, name, salary);
    }
}