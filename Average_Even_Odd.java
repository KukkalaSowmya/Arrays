import java.util.Scanner;
public class Average_Even_Odd
{
public static void main(String[] args)
{
int n, sumEven = 0, sumOdd = 0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of elements in array: ");
n = s.nextInt();
int[] a = new int[n];
System.out.println("Enter the elements of the array: ");
for(int i = 0; i<=n; i++)
{

for(int i = 0; i<n; i++)
{
if(a[i]%2 == 0)
{
sumEven = sumEven+a[i];
}
else
{
sumOdd = sumOdd+a[i];
}
}
System.out.println("Sum of Even Numbers");
System.out.println("Sum of Odd Numbers");
}
}