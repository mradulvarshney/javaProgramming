import java.util.Scanner;

class Car
{
    public String Car_name;
    public int Car_No;
    public int price;
    public Car(String Car_name,int Car_No,int price)
    {
        this.Car_name=Car_name;
        this.Car_No=Car_No;
        this.price=price;
    }
    public static void Display(Car[] obj)
    {
        for (int i = 0; i < obj.length; i++)
        {
            for (int j = i+1; j < obj.length; j++)
            {
				if(obj[i].price < obj[j].price)
				{
					Car t = obj[i];
					obj[i]= obj[j];
					obj[j]= t;
				}
			}
        }
        for (int i=0;i<obj.length;i++)
        {
            System.out.println(obj[i].Car_name +" "+ obj[i].Car_No);
        }
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter size");
        int size = s.nextInt();
        Car obj[] = new Car[size];
        for(int i=0;i<obj.length;i++)
        {
            System.out.println("enter the Details");
            obj[i]=new Car(s.next(),s.nextInt(),s.nextInt());
        }
        Car.Display(obj);
    }
}
