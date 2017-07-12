import java.util.*;
class dig
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int k=0;
int[] a=new int[5];
while(n>0)
{int i=0;
 k=n%10;
 a[i]=k;
 n=n/10;
 i++;
 }
 Arrays.sort(a);
 System.out.print(a[0]+""+a[1]);
 }
 }
