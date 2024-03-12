// Removing and pasting all the '0' elements of the array in the end of the array:
import java.util.Scanner;
public class RemoveZero
{
public static void main(String[] args)
{
int i,size,c;
Scanner s=new Scanner(System.in);
System.out.println("Ente the size of the Array:");
size=s.nextInt();
int a[]=new int[size];
for(i=0;i<size;i++)
{
a[i]=s.nextInt();
}
int  j=0;
for(i=0;i<size;i++)
{
if(a[i]!=0 && a[j]==0)
{
c=a[i];
a[i]=a[j];
a[j]=c;
}
if(a[j]!=0)
{
j++;
}
}
System.out.println("The refoem:");
for(i=0;i<size;i++)
{
System.out.print(a[i]+" ");
}

}
}