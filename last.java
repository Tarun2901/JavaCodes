import java.util.*;
import java.io.*;

public class last{

public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int[] arr= new int[n];
for(int i=0;i<arr.length;i++)
{
arr[i] = sc.nextInt();
}
int data = sc.nextInt();
int pos = lastpos(arr,n-1,data);
System.out.println(pos);
}

public static int lastpos(int arr[], int idx, int data)
{
if(idx<0)
{
return -1;
}
if(arr[idx] == data)
{
return idx;
}
else
{
return lastpos(arr,idx-1,data);
}
}
}
