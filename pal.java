import java.util.*;
class pal
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int s=0,sum=0,v,k,temp;
while(n!=0)
{
k=n%10;
sum=sum+k;
n=n/10;
}
System.out.println("sum is:" +sum);
temp=sum;
while(sum>0)
{
v=sum%10;
s=(s*10)+v;
sum=sum/10;
}
if(temp==s)
System.out.println("palindrome");
else
System.out.println("not a palindrome");
}
}
