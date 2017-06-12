import java.util.*;
class fibonacci
 {
  public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
 int[] f1 = new int[n];
 f1[0] = 0;
 f1[1] = 1;
 for(int i=2; i < n; i++)
{
 f1[i] = f1[i-1] + f1[i-2];
 }
  for(int i=0; i< n; i++)
{
 System.out.print(f1[i] + " ");
 }
}
}

         
         
        
