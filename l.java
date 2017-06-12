import java.util.*;
class l
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int q=sc.nextInt();
        int r=sc.nextInt();
        if(p>q && p>r)
        {
            System.out.println("p is largest");
        }
        if(q>p && q>r)
        {
            System.out.println("q is largest");
        }
        if(r>p && r>q)
        {
            System.out.println("r is largest");
        }
    }
}
