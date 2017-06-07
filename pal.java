import java.util.*;
class pal
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int s=0,sum=0,v,k;
while(n!=0)
{
k=n%10;
sum=sum+k;
n=n/10;
}
while(sum>0)
{
v=sum%10;
s=(s*10)+v;
sum=sum/10;
}
if(n==s)
{
System.out.println("palindrome");
}
else
{
System.out.println("not a palindrome");
}
}
}
