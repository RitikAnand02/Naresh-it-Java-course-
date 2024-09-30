public class Loop6
{
        public static void main(String[] argv)
        {
               int x = 1;
               switch(x) 
               {
                     case 1: 
                     {
                           System.out.println("x is one"); 
                           break;
                     }
                     case 2:  
                     {
                           System.out.println("x is two"); 
                           break;
                     }
                     case 3:  
                     {
                           System.out.println("x is two");  break;
                     }
               }
               System.out.println("out of the switch");
       }
}