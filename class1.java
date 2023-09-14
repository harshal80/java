class employee {
    int id;
    int salary;
    String name;

    public void printDetais() {
        System.out.println("My id is " + id);
        System.out.println("My name is " + name);

    }

    public int getSalary() {
        return salary;
    }
}

public class class1 {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        employee harsh = new employee();
        employee sumit = new employee();
        harsh.id = 118;
        harsh.salary = 20000;
        harsh.name = "HarshaL Patil";

        sumit.id = 119;
        sumit.salary = 25000;
        sumit.name = "Sumit Patil";

        harsh.printDetais();
        sumit.printDetais();
        int salary = sumit.getSalary();
        System.out.println(salary);
        System.out.println(harsh.id);
        System.out.println(harsh.name);

    }
}
