import java.util.*;
class subset
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int m=sc.nextInt();
int n=sc.nextInt();
int a[]=new int[m];
int b[]=new int[n];
for(int i=0;i<m;i++)
{
a[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
b[i]=sc.nextInt();
}
for(int i=0;i<a.length;i++)
{
for(int j=0;j<b.length;j++)
{
if(a[i]==b[j]&&a[i+1]==b[j+1])
{
System.out.println("a1 is subset of a2");
}
else
{
System.out.println("a1 is not a subset of a2");
}
}
}
}
}
