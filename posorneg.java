/*******************************
*
*File        :posorneg.Java
*Description :Calculating marks
*Author      :Jismi
*Date        :26/09/23
*/
import java.util.Scanner;
public class posorneg {
	public static void main(String[] args)
	{
		int number;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		number=sc.nextInt();
		if(number>0)
			System.out.println("Number is positive");
		else if(number<0)
			System.out.println("Number is negative");
		else
			System.out.println("Number is 0");
	}
}
       


