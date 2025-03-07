public class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary){
        this.id=id;
        this.name=name;
        this.salary= salary;

    }

    public void  displayDetails(){
        System.out.println("Employee Id: "+id);
        System.out.println("Employee Name: "+name);
        System.out.println("Employee Salary: "+salary);

    }
}

