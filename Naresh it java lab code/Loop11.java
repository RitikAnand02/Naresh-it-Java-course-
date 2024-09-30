
public class Loop11
{
      public static void main(String[] argv) 
      {
           int j = 3;
           switch (j) 
           {
                case 2:
                      System.out.println("value is two");
                case 2 + 1:
                     System.out.println("value is three");
                     break;
                default:
                     System.out.println("value is " + j);
                     break;
          }
    }
}