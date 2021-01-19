import java.util.*;
public class Green
{
    public static void main(String []args)
    {
        Scanner kbd = new Scanner(System.in);
        int  i = 1;
        double sum = 0;
        double tc;
        double c = kbd.nextDouble();
        int l = kbd.nextInt();
        if(c > 0 && c <= 100 && l > 0 && l <= 100)
        {
           while(i <= l)
           {
             double w = kbd.nextDouble();
             double l1 = kbd.nextDouble();
             sum = sum + w * l1;
             i = i + 1;
           }
           tc = sum * c;
           System.out.print(tc);
        }
    }
}