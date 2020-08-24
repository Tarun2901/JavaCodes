import java.io.*;
import java.util.*;

public class revdisplay{

public static void main(String[] args)
{

Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int[] arr = new int[n];

for(int i =0;i<arr.length;i++)
{
arr[i] = sc.nextInt();
}
display(arr, arr.length-1);
}

public static void display(int arr[], int idx)
{
if(idx<0)
{
return;
}
System.out.println(arr[idx]);
display(arr,idx-1);
}
}
