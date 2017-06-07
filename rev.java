import java.util.Scanner;
class rev
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String ss=s.nextLine();
String str[]=ss.split(" ");
for(int i=str.length-1;i>=0;i--)
{
System.out.print(str[i]+" ");
}
}
}
