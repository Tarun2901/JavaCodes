import java.io.*;
import java.util.*;

public class PrintDec{

public static void main(String[] args)
{
Scanner scn = new Scanner(System.in);
int n = scn.nextInt();
printdec(n);
}

public static void printdec(int n)
{if(n==0)
{
return;
}
System.out.println(n);
printdec(n-1);

}
}
