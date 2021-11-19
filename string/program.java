import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        int n = sc.nextInt();
        s1 = s1.substring(s1.length()-n);
        for(int i=0;i<n;i++)
        {
            System.out.print(s1);    
        }
    }
}
