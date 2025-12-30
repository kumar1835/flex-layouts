import java.util.*;
public class Gcd {
    static Scanner sc=new Scanner(System.in)
    ;
    public static void main(String[] args)
    {
        int n=sc.nextInt();
        int m=sc.nextInt();
       //System.out.print(gg(n,m));
       //System.out.println(g2(n,m));
       System.out.println(g3(n,m));

    }  
    public static int gg(int n,int m)
    {
        int temp;
        if(n>m)
            temp=m;
        else
            temp=n;

        for(int i=temp;temp>=1;i--)
        {
            if(n%i==0 && m%i==0)
                return i;
        }
        return 0;

    
    }  
    public static int g2(int a,int b)
    {
        while(a!=b)
        {
            if(a>b)
                a=a-b;
            else
                b=b-a;
        }
        return b;
    }
    public static int g3(int a,int b)
    {
        while(a!=0 && b!=0)
        {
            if(a>b)
                a=a%b;
            else
                b=b%a;
        }
        if(a==0)
            return b;
        else 
            return a;
    }
}
