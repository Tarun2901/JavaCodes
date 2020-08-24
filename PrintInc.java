import java.io.*;
import java.util.*;

public class PrintInc {

public static void main(String[] args)
{
Scanner scn = new Scanner(System.in);
int n = scn.nextInt();
printinc(n);
}


public static void printinc(int n)
{
if(n==0)
{
return;
}
printinc(n-1);
System.out.println(n);


}






}
