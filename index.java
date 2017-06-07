import java.util.Scanner;
class index
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int[] a=new int[n];
int flag=0;
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
for(int i=0;i<n;i++)
{
if(i==a[i])
{
System.out.println(i);
flag=1;
}
}
if(flag==0)
{
System.out.println("none is equal to index");
}}}
