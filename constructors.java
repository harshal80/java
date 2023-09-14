class Employee {
    // First constructor
    Employee(String s, int i) {
        System.out.println("The name of the first employee is : " + s);
        System.out.println("The id of the first employee is : " + i);
    }

    // Constructor overloaded
    Employee(String s, int i, int salary) {
        System.out.println("The name of the second employee is : " + s);
        System.out.println("The id of the second employee is : " + i);
        System.out.println("The salary of second employee is : " + salary);
    }

}

class MyMainEmployee {
    private int id;
    private String name;

    public MyMainEmployee() {
        id = 0;
        name = "Your-Name-Here";
    }

    public MyMainEmployee(String myName, int myId) {
        id = myId;
        name = myName;
    }

    public MyMainEmployee(String myName) {
        id = 1;
        name = myName;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setId(int i) {
        this.id = i;
    }

    public int getId() {
        return id;
    }
}

public class constructors {
    public static void main(String[] args) {

        // Employee shubham = new Employee("Shubham", 1);
        // Employee harry = new Employee("harshal", 2, 70000);

        // MyMainEmployee harry = new MyMainEmployee("ProgrammingWithHarry", 12);
        MyMainEmployee harshal = new MyMainEmployee();
        // harry.setName("CodeWithHarry");
        // harry.setId(34);
        System.out.println(harshal.getId());
        System.out.println(harshal.getName());

    }
}
