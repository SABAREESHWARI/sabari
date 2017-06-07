class unique
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int[] a=new int[];
int n=s.nextInt[];
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
for(int j=0;i<n;i++)
{
for(int k=j+1;k<n;k++)
{
if(a[j]==a[k])
{
flag=1;
}
}
if(flag==0)
{
System.out.println(a[j]);
}
}
}
