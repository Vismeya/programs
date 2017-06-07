import java.util.*;
class reverse
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int rev=0,v;
while(a!=0)
{
v=a%10;
rev=(rev*10)+v;
a=a/10;
}
System.out.println(rev);
}
}
