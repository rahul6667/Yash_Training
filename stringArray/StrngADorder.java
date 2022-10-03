package strinArray;
import java.util.Arrays;
import java.util.Scanner;

public class StrngADorder {

   public static String sortString(String inputString)
   {
     
       char tempArray[] = inputString.toCharArray();
       Arrays.sort(tempArray);
       return new String(tempArray);
   }

   public static String descendingorder(String dString)
   {
	   String des="";
	  int  lentg=dString.length();
	  for(int i=lentg-1;i>=0;i--) {
    	des=des+dString.charAt(i);
       }
	return des;

   }

   
   public static void main(String[] args)
   {
	   System.out.println("enter string");
	   Scanner sc= new Scanner(System.in);
       String str = sc.nextLine();
       String outputString = sortString(str);
       System.out.println("Input String : " + str);
       System.out.println("ascending String : " + outputString);
       
       String desce=descendingorder(outputString);
       System.out.println("descending String : " + desce);
              
       
       
   }
}
