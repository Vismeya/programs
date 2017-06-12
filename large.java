import java.util.Scanner;

class large
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int num, i, temp, max;
num = data.nextInt();
max = data.nextInt();
for (i=1; i < num; i++) 
{
 temp = data.nextInt();
 if(temp < max)
continue;
else
max = temp;
}
System.out.println("Largest Number is "+max);
}
}
