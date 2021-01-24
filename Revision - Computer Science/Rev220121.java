import java.util.*;
class Rev220121
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 10 Numbers");
        int[] x = new int[10];
        for (int i = 0; i<10; i++)
        {
            x[i] = in.nextInt();
        }
        for (int i = 0; i<10; i++)
        {
            for (int j = 0; j<10-i-1; j++)
            {
                if (x[j]<x[j+1])
                {
                    int temp = x[j];
                    x[j] = x[j+1];
                    x[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted Numbers:");
        for (int i = 0; i<10; i++)
        {
            System.out.println(x[i]);
        }
        in.close();
    }
}