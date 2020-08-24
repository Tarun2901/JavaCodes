import java.util.*;
import java.io.*;

public class display
{

public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();

int[] arr = new int[n];
for(int i = 0;i<arr.length;i++)
arr[i] = sc.nextInt();
displayarr(arr,0);
}

public static void displayarr(int[] arr, int idx)
{
if(idx>=arr.length)
{
return;
}
System.out.println(arr[idx]);
displayarr(arr,idx+1);

}
}
