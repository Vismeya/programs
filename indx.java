import java.util.*;
class indx
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s1=sc.nextLine();
arr(s1);
}
static void arr(String s)
{
String s2=s;
int[] v=new int[s2.length()];
int x=0;
for(String s3:s2.split(""))
{
v[x++]=Integer.valueOf(s1);
}      
Arrays.sort(v);
for(int i=0;i<v.length;i++)
{
System.out.print(v[i]);
}
for(int i=0;i<v.length;i++)
{
if(i==v[i])
System.out.println(v[i]+" ");
}
}
}
