import java.lang.Math;
import java.util.Scanner;
class Number
{
	private int num;
	Number(int num)
	{
		this.num = num;
	}
	public boolean isZero()
	{
		if(num==0)
			return true;
		else
			return false;
	}
	public boolean isPositive()
	{
		if(num>0)
			return true;
		else
			return false;
	}
	public boolean isNegative()
	{
		if(num<0)
			return true;
		else
			return false;
	}
	public boolean isOdd()
	{
		if(num%2!=0)
			return true;
		else
			return false;
	}
	public boolean isEven()
	{
		if(num%2==0)
			return true;
		else
			return false;
	}
	public boolean isPrime()
	{
		int t=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				t=1;
				break;
			}
		}
		if(t==0)
			return true;
		else
			return false;
	}
	public boolean isArmstrong()
	{
		int t, rem, sum=0, count=0;
		t=num;
		while(t!=0)
		{
			count+=1;
			t/=10;
		}
		t=num;
		while(t!=0)
		{
			rem = t%10;
			sum = sum + (int)Math.pow(rem,count);
			t/=10;

		}
		if(sum==num)
			return true;
		else
			return false;
	}
	public int getFactorial()
	{
		int f=1;
		for(int i=1;i<=num;i++)
		{
			f*=i;
		}
		return f;
	}
	public int getSqrt()
	{
		return (int)Math.sqrt(num);
	}
	public int getSqr()
	{
		return (int)Math.pow(num,2);
	}
	public int sumDigits()
	{
		int sum= 0, rem, t=num;
		while(t!=0)
		{
			rem = t%10;
			sum+=rem;
			t/=10;
		}
		return sum;
	}
	public String dispBinary()
	{
		return Integer.toBinaryString(num);
	}
	public String dispOctal()
	{
		return Integer.toOctalString(num);
	}
	public String dispHexa()
	{
		return Integer.toHexString(num);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Number obj = new Number(num);
		System.out.println(obj.isZero());
		System.out.println(obj.isPositive());
		System.out.println(obj.isNegative());
		System.out.println(obj.isOdd());
		System.out.println(obj.isEven());
		System.out.println(obj.isPrime());
		System.out.println(obj.isArmstrong());
		System.out.println(obj.getFactorial());
		System.out.println(obj.getSqrt());
		System.out.println(obj.getSqr());
		System.out.println(obj.sumDigits());
		System.out.println(obj.dispBinary());
		System.out.println(obj.dispOctal());
		System.out.println(obj.dispHexa());
	}
}
