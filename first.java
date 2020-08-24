import java.util.*;
import java.io.*;

public class first
{

public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int[] arr = new int[n];
for(int i=0;i<arr.length;i++)
{
arr[i] = sc.nextInt();
}
int data = sc.nextInt();
int firstoccur = occur(arr,0,data);
System.out.println(firstoccur);
}

public static int occur(int arr[], int idx,int data)

{

if(idx>=arr.length)
{
return -1;
}
if(arr[idx]==data)
{
return idx;
}
else
{
 return occur(arr,idx+1,data);
}
}
}
