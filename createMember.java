import java.util.Scanner;

class Member
{
    String name,address;
    int age;
    long phone_number;
    float salary;

    Member(String name, String address, int age, long phone_number, float salary)
    {
        this.name = name;
        this.address = address;
        this.age = age;
        this.phone_number = phone_number;
        this.salary = salary;
    }
    public void display()
    {
        System.out.println("Name= "+name+" Address= "+address+" Age= "+age+" Phone number= "+phone_number+" Salary=Rs."+salary);
    }
}
class Employee extends Member
{
    String specialization;

    public Employee(String name, String address, String specialization, int age, long phone_number, float salary)
    {
        super(name, address, age, phone_number, salary);
        this.specialization = specialization;
    }
    public void display()
    {
        super.display();
        System.out.println("Specialization= "+specialization);
    }
}
class Manager extends Member
{
    String department;

    Manager(String name, String address, String department, int age, long phone_number, float salary)
    {
        super(name, address, age, phone_number, salary);
        this.department = department;
    }
    public void display()
    {
        super.display();
        System.out.println("Department= "+department);
    }
}
class createMember
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name, address, specialization, age ,phone number and salary of employee");
        Employee obj1 = new Employee(sc.next(),sc.next(),sc.next(),sc.nextInt(),sc.nextLong(),sc.nextFloat());
        System.out.println("Enter name, address, department, age ,phone number and salary of employee");
        Manager obj2 = new Manager(sc.next(),sc.next(),sc.next(),sc.nextInt(),sc.nextLong(),sc.nextFloat());
        obj1.display();
        obj2.display();
    }
}
