import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello, World!");
        Employee emp1 = new Employee(1, "Umakant Patil",10000);
        Employee emp2 = new Employee(2, "Devesh Patil",20000);
        Employee emp3 = new Employee(3, "Yash Patil",40000);

        List<Employee> arrayList=new ArrayList<>();

        arrayList.add(emp1);
        arrayList.add(emp2);
        arrayList.add(emp3);

        System.out.println("\n Employee Details...\n");
        for(Employee emp :arrayList)
        {
           emp.displayDetails();
           System.out.println("--------------------");
        }


    }
}
