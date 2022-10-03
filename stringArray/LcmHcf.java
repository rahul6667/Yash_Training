package strinArray;

class LcmHcf
{
static int gcd(int a, int b)
{
    if (a % b == 0)
        return b;
    else
        return (gcd(b, a % b));
}
 
static int findHcf(int [][]arr, int size)
{
    int ans = arr[0][0];
    for (int i = 1; i < size; i++)
        ans = gcd(ans, arr[i][0]);
 
  
    return (ans);
}
 

static int findLcm(int[][] arr, int size)
{
 
    int ans = arr[0][1];
    for (int i = 1; i < size; i++)
        ans = (((arr[i][1] * ans)) /
            (gcd(arr[i][1], ans)));
 
   
    return (ans);
}
 

public static void main(String[] args)
{
    int size = 4;
    int[][] arr = new int[size][size];
 
  
  
    for (int i = 0; i < size; i++)
        arr[i] = new int[2];
 
    arr[0][0] = 9;
    arr[0][1] = 10;
    arr[1][0] = 12;
    arr[1][1] = 25;
    arr[2][0] = 18;
    arr[2][1] = 35;
    arr[3][0] = 21;
    arr[3][1] = 40;
     
  
    
    int hcf_of_num = findHcf(arr, size);
    
    int lcm_of_deno = findLcm(arr, size);
    
    
    System.out.println("HCF ="+hcf_of_num + ", LCM=" + lcm_of_deno);
    }
}
 