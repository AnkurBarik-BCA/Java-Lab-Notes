class Employee {
    int id;
    String name;
    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    void display() {
        System.out.println("\nEmployee ID: " + id);
        System.out.println("Employee Name: " + name);
    }
}

class Manager extends Employee{
    String dept;
    int team;
    Manager(int empid, String empname, String department, int teamno){
        super(empid, empname); 
        this.dept = department;
        this.team = teamno;
    }
    
    void display() {
        super.display();
        System.out.println("Department: " + dept);
        System.out.println("Team Size: " + team);
    }
}

class Developer extends Employee{
    String prolan;
    int year;
    Developer(int empid, String empname,String language,int exp){
        super(empid,empname);
        this.prolan=language;
        this.year=exp;
    }
    
    void display() {
        super.display();
        System.out.println("Programming Language: " + prolan);
        System.out.println("Experience: " + year + " years");
    }
}

class Supportstaff extends Employee{
    int shiftHours;
    Supportstaff(int empid, String empname, int shiftHours){
        super(empid, empname);
        this.shiftHours = shiftHours;
    }
    
    void display() {
        super.display();
        System.out.println("Shift Hours: " + shiftHours);
    }
}

class FullTimeSupportStaff extends Supportstaff{
    double monthlySalary;
    FullTimeSupportStaff(int empid, String empname, int shiftHours, double salary){
        super(empid, empname, shiftHours);
        this.monthlySalary = salary;
    }
    
    void display() {
        super.display();
        System.out.println("Monthly Salary: " + monthlySalary);
    }
}

class PartTimeSupportStaff extends Supportstaff{
    double HourlyWage;
    PartTimeSupportStaff(int empid, String empname, int shiftHours, double wage){
        super(empid, empname, shiftHours);
        this.HourlyWage = wage;
    }
    
    void display() {
        super.display();
        System.out.println("Hourly Wage: " + HourlyWage);
    }
}

public class office {
    public static void main(String[] args) {
        
        Manager manager = new Manager(55, "Ankur Barik", "IT", 4);
        
        
        Developer developer = new Developer(40, "Rudrashis Das", "Java", 5);
        
        
        FullTimeSupportStaff supportStaff = new FullTimeSupportStaff(42, "Sayan Ghosh", 6, 80000.0);
        
        manager.display();
        developer.display();
        supportStaff.display();
    
    }
}