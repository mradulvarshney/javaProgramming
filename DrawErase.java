class Shape
{
	public void draw(String shape)
	{
		System.out.println("Drawing " + shape);
	}
	public void erase(String shape)
	{
		System.out.println("Erasing "+shape);
	}
}
class Circle extends Shape
{
	public void draw()
	{
		super.draw("Circle");

	}
	public void erase()
	{
		super.erase("Circle");
	}
}
class Triangle extends Shape
{
	public void draw()
		{
			super.draw("Triangle");
	
		}
		public void erase()
		{
			super.erase("Triangle");
	}
}
class Square extends Shape
{
	public void draw()
		{
			super.draw("Square");
	
		}
		public void erase()
		{
			super.erase("Square");
	}
}
class DrawErase
{
	public static void main(String args[])
	{
	    Circle c = new Circle();
	    Triangle t = new Triangle();
	    Square s= new Square();
	    c.draw();
	    c.erase();
	    t.draw();
	    t.erase();
	    s.draw();
	    s.erase();
		}
}
