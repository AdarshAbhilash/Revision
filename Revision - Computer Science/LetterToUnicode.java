public class LetterToUnicode
{
   public static void main(String[]args)
   {
    System.out.println("Letters    Unicode");
    int uni_end = 90;
    char alpha;
    for(int i = 65; i<=uni_end; i++)
    {
        alpha = (char) i;
        System.out.println(alpha+"          "+i);
    }
  }
}