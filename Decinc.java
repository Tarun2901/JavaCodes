import java.io.*;
import java.util.*;

public class Decinc {

public static void main(String[] args)
{

Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
decinc(n);

}

public static void decinc(int n)
{
if(n==0)
{
return;
}
System.out.println(n);
decinc(n-1);
System.out.println(n);
}
}
