import java.util.Scanner;
class Student
{
	public String name;
	public float percentage;
	Student(String name, float percentage)
	{
		this.name=name;
		this.percentage=percentage;
	}
}
class Test extends Student
{
	Test(String name, float percentage)
	{
		super(name, percentage);
	}
	public static void display(Test[] obj)
	{
		for(int i=0;i<obj.length;i++)
		{
			for(int j=i+1;j<obj.length;j++)
			{
				if(obj[i].percentage<obj[j].percentage)
				{
					Test t = obj[i];
					obj[i]=obj[j];
					obj[j]=t;
				}
			}
		}
		System.out.println(obj[0].name + " " + obj[0].percentage);
	}
}
class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of students appeared in the test");
		int size = sc.nextInt();
		Test obj[] = new Test[size];
		for(int i=0;i<obj.length;i++)
		{
			System.out.println("Enter the details");
			obj[i]=new Test(sc.next(), sc.nextFloat());
		}
		Test.display(obj);
	}
}
