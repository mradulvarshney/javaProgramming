class Student
{
    String name,address;
    int age;
    Student()
    {
        name ="unknown";
        age=0;
        address="not available";
    }
    public void setInfo(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public void setInfo(String name,int age,String address)
    {
        this.name=name;
        this.age=age;
        this.address=address;
    }
}
class StudentMain
{
    public static void main(String[] args)
    {
        Student obj[]=new Student[10];
        for (int i=0;i<10;i++)
        {
            obj[i]=new Student();
        }
        obj[2].setInfo("Jayash",19);
        obj[5].setInfo("Amit",19,"Kosi");
        obj[7].setInfo("Anamika",19,"Chhata");
        obj[9].setInfo("Mohak",22);
        obj[1].setInfo("Mradul",19,"Mathura");
        obj[0].setInfo("Garima",19,"Radhapuram");
        obj[4].setInfo("Priyanshi",18);
        obj[3].setInfo("Vibhu",20);
        for (int i=0;i<10;i++)
        {
            System.out.println(obj[i].name+"  "+obj[i].age+"  "+obj[i].address);
        }
    }
}
