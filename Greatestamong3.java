/*******************************
*
*File        :Greatest among 3 no.Java
*Description :To find greatest among three numbers
*Author      :Jismi
*version     :1.0
*Date        :27/09/23
*/
import java.util.Scanner;
public class Greatestamong3 {
	public static void main(String[] args)
	{
     int a,b,c;
     Scanner sc=new Scanner(System.in);
     System.out.println("Input the 1st number");
     a=sc.nextInt();
     System.out.println("Input the 2nd number");
     b=sc.nextInt();
     System.out.println("Input the 3rd number");
     c=sc.nextInt();
     if(a>b&&a>c)
    	 System.out.println("Greatest number:"+a);
     else if(b>a&&b>c)
    	 System.out.println("Greatest number:"+b);
     else
    	 System.out.println("Greatest number:"+c);
	}
}
    	 



