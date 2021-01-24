//Practice Program (January 20, 2021)
//Function Overload
import java.util.*;
public class Rev200121
{
    public static void polygon(int n, char ch)
    {
        for(int i = 1; i<=n; i++)
        {
            for (int j=1; j<=n; j++)
            {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    public static void polygon(int x, int y)
    {
        for (int i = 1; i<=x; i++ )
        {
            for (int j = 1; j<=y; j++)
            {
                System.out.print("@");
            }
            System.out.println();
        }
    }
    public static void polygon()
    {
        System.out.println('*');
        System.out.println("**");
        System.out.println("***");
    }
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int s, len, wid; char le;
        s = in.nextInt();
        len = in.nextInt();
        wid = in.nextInt();
        le= in.nextLine().charAt(0);
        Rev200121.polygon(s, le);
        Rev200121.polygon(len, wid);
        Rev200121.polygon();
        in.close();
    }
}