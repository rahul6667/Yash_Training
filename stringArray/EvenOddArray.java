package strinArray;


import java.util.Scanner;  
public class EvenOddArray  
{  
public static void main(String args[])    
{  
long n, sum=0;  
Scanner sc=new Scanner(System.in);         
System.out.print("Enter the number: ");  
n=sc.nextLong();  
int i=1;  

while(i <= n/2)  
{  
if(n % i == 0)  
{  
  
sum = sum + i;  
}  
i++;  
} 
if(sum==n)  
{  

System.out.println(n+" is a perfect number.");  
}   
else  
  
System.out.println(n+" is not a perfect number.");   




int i1,m=0,flag=0;      
int n1=(int) n;  
m=n1/2;      
if(n1==0||n1==1){  
 System.out.println(n1+" is not prime number");      
}else{  
 for(i1=2;i1<=m;i1++){      
  if(n1%i1==0){      
   System.out.println(n+" is not prime number");      
   flag=1;      
   break;      
  }      
 }      
 if(flag==0)  { System.out.println(n1+" is prime number"); }  
}//end of el



















}  
}  