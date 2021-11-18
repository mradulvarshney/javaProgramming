import java.util.Scanner;
public class stringMerge
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		int l1=s1.length();
		int l2=s2.length();
		String s3="";
		int i;
		int l = (l1 < l2)? l1 : l2;
		char[] arr1 = s1.toCharArray();
		char[] arr2 = s2.toCharArray();
		for(i=0;i<l;i++)
		{
			s3+=arr1[i];
			s3+=arr2[i];
		}
		while(i <l1) {
			s3 += s1.charAt(i);
			i++;
		}
		while(i <l2) {
			s3 += s2.charAt(i);
			i++;
        }
		System.out.println(s3);
	}
}
