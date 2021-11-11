class Fruit
{
	String name, taste,size;
	Fruit(String n,String t,String s){
		name = n;
		taste = t;
		size = s;
	}
	public void eat()
	{
		System.out.println(name + " tastes " + taste + " is " + size);
	}
}

class Apple extends Fruit
{
	Apple(String n,String t,String s)
	{
		super(n,t,s);
	}
	public void print()
	{
		super.eat();
	}
}

class Orange extends Fruit
{
	Orange(String n,String t,String s)
	{
			super(n,t,s);
	}
	public void print()
	{
		super.eat();
	}
}

class Main1
{
	public static void main(String args[])
	{
		Apple obj1 = new Apple("Apple", "sweet", "big");
		Orange obj2 = new Orange("Orange", "bitter", "small");
		obj1.print();
		obj2.print();
	}
}
