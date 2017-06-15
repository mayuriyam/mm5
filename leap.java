import java.io.*;
import java.util.*;
class leap
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        
        if(a%4==0)
        {
            System.out.println("leap year");
        }
        else
        {
            System.out.println("not a leap year");
        }
       
    }
}
