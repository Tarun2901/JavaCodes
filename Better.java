import java.util.*;
import java.io.*;

public class Better{

public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int x = sc.nextInt();
int n = sc.nextInt();
int c = power(x,n);
System.out.println(c);
}

public static int power(int x, int n)
{

if(n==0)
{
return 1;
}
int xnpb2 = power(x,n/2);
int xn = xnpb2*xnpb2;
if(n%2==1)
{
xn = xn*x;
}
return xn; 
}
}
