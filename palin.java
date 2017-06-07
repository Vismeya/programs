import java.util.*;
class palin
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int s=0,v,temp;
temp=n;
while(n>0)
{
v=n%10;
s=(s*10)+v;
n=n/10;
}
if(temp==s)
System.out.println("palindrome");
else
System.out.println("not a palindrome");
}
}
