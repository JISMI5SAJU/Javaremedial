package Javaprg;
import java.util.StringTokenizer;
public class TokenDemo {
     public static void main(String[] args) {
    	 System.out.println("Using Space as a delimiter");
    	 StringTokenizer string1=new  StringTokenizer("This is a test string");
    	 int noOfTokens= string1.countTokens();
    	 System.out.println(noOfTokens);
    	 while( string1.hasMoreTokens()) {
    		 System.out.print("Next Token:");
        	 System.out.println(string1.nextToken());
    	 }
    	 System.out.println();{
    	 System.out.println("Using comma as delimitor && using boolean TRUE");
    	 StringTokenizer string2=new  StringTokenizer("This,is,a,test,string",",",true);
    	 int noOfTokens2= string2.countTokens();
    	 System.out.println(noOfTokens2);
    	 while( string2.hasMoreTokens()) {
    		 System.out.print("Next Token:");
        	 System.out.println(string2.nextToken());
    	 }
    	 System.out.println();{
    		 System.out.println("Using comma as delimitor && using boolean FALSE");
    		 StringTokenizer string3=new  StringTokenizer("This,is,a,test,string",",",false);
        	 int noOfTokens3= string3.countTokens();
        	 System.out.println(noOfTokens3);
        	 while( string3.hasMoreTokens()) {
        		 System.out.print("Next Token:");
            	 System.out.println(string3.nextToken()); 
    	 }
        	 System.out.println();
     }
}}}
