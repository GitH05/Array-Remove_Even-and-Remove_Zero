import java.util.Scanner;
public class RemoveEven
{
public static void main(String[] args)
{
int i,size,j=0;
int oddcount=0;
Scanner s=new Scanner(System.in);
System.out.print("Enter the size of the array:");
size=s.nextInt();
System.out.print("Only "+size+" elements are allow:");
int arr[]=new int[size];
for(i=0;i<size;i++)
{
arr[i]=s.nextInt();
}
System.out.print("The elements are:");
for(i=0;i<size;i++)
{
System.out.print(arr[i]+" ");
}
System.out.print("\nAfter removing the even  elements:");
System.out.print("\n");
int odd[] =new int[size];
System.out.print("The remaining odd elements are:");

//to removeeven elements from the array:
for (i=0;i<size;i++)
{
if(arr[i]%2 != 0)	//to find odd elements   and (for even arr[i]%2==0):
{
//oddcount++;
//int odd[]=new int[oddcount];
odd[j]=arr[i];
System.out.print(odd[j]+" ");
}
}

}

}