import java.util.*;
class str
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int s=sc.nextInt();
int v=0;
String s1=String.valueOf(s);
int a[]=new int[s1.length()];
int w=0;
for(String s3:s1.split(""))
{
a[w++]=Integer.valueOf(s3);
}
for(int i=0;i<s1.length();i++)
{
for(int j=i+1;j<s1.length();j++)
{
if(a[i]==a[j]&&v==0)
{
System.out.println("first repeat--->"+a[i]);
v++;
}
}
}
}
}
