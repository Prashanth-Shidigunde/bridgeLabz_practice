import java.util.*;
class Student {

 
    private int id;
    private String name;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public String toString() {
    	return id+" "+name;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
        Student s = new Student();

        System.out.println("Enter name:");
        String name=sc.nextLine();
        sc.nextLine();
        int id=sc.nextInt();
        s.setName(name);
        s.setId(id);

  
        System.out.println("Student ID: " + s.getId());
        System.out.println("Student Name: " + s.getName());
    }
