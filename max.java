import java.io.*;
import java.util.*;

public class max {

public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int[] arr = new int[n];
for(int i = 0;i<arr.length;i++)
{
arr[i] = sc.nextInt();
}
int m = maxelement(arr,0);
System.out.println(m);
}

public static int maxelement(int arr[], int idx)
{
if(idx>=arr.length)
{
return 0;
}
else
{
int tempmax = maxelement(arr,idx+1);
if(arr[idx]>tempmax)
{
return arr[idx];
}
else
{
return tempmax;
}

}

}
}
