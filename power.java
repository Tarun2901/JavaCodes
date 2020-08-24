import java.io.*;
import java.util.*;

public class power{

public static void main(String[] args)

{

Scanner sc = new Scanner(System.in);
int x = sc.nextInt();
int n = sc.nextInt();
int c = exp(x,n);
System.out.println(c);
}

public static int exp(int x,int n)
{
if(x==0)
{
return 0;
}
if(x==1||n==0)
{
return 1;
}

return x*exp(x,n-1);


}






}
