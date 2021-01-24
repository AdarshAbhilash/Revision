import java.util.*;
class BubbleSort
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int a[] = new int[15]; int temp;
        for (int i=0;i<15; i++)
        {
            a[i] = in.nextInt();
        }
        for (int j = 0; j<15; j++)
        {
            if (j+1>j)
            {
                if(j==14)
                {
                    continue;
                }
                else
                {
                    a[j] = temp;
                    a[j+1] = a[j];
                    temp = a[j+1];
                }
            }
        }
        System.out.println(a);  
    }
}