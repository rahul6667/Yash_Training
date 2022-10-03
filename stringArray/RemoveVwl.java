package strinArray;
import java.util.Scanner;

class RemoveVwl
{   

 public static void main(String[] args)
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter string");
     String str = sc.nextLine();       
     System.out.println(str.replaceAll("[aeiouAEIOU]", ""));
 }
}