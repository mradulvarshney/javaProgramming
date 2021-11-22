class MathOperation
{
    public static void main(String[] args)
    {
        int[] arr =new int[args.length];
        try
        {
            int sum=0;
            for(int i=0;i< args.length;i++)
            {
                arr[i]=Integer.parseInt(args[i]);
                sum+=arr[i];
            }
            float avg = (float)(sum / arr.length);
            System.out.println("Sum ="+sum+"\nAverage="+avg);
        }
        catch (NumberFormatException | ArithmeticException e)
        {
            System.out.println(e.getClass().getName());
        }
        catch(Exception e)
        {
        	System.out.println(e.getMessage());
        }
    }
}
