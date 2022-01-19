public class Person {
    String name;
    Person(String name)
    {
        this.name=name;
    }
}
class Student extends Person
{
    String CollegeName;

    public Student(String name, String CollegeName) {
        super(name);
        this.CollegeName = CollegeName;
    }
}
class Teacher extends Person
{
    int salary;
    String subject;

    public Teacher(String name,int salary, String subject) {
        super(name);
        this.salary = salary;
        this.subject = subject;
    }
    void display()
    {
        System.out.println(name+" "+salary+" "+subject);
    }
}
class CollegeStudent extends Student
{
    int year;String major;

    public CollegeStudent(String name, String collegeName, int year, String major) {
        super(name, collegeName);
        this.year = year;
        this.major = major;
    }
    void display()
    {
        System.out.println(name+" "+CollegeName+" "+year+" "+major);
    }
}
class PersonStudent
{
    public static void main(String[] args) {
        CollegeStudent obj1=new CollegeStudent("Mradul","GLA",2,"CS");
        Teacher obj2=new Teacher("Neeraj",200000,"OOP");
        obj1.display();
        obj2.display();
    }
}
