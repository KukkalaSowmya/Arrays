//WAP to accept integers values from user and print on console screen

import java.util.Scanner;
public class program3
{
public static void main(String ...args)
{
Scanner sc = new Scanner(System.in);
//declaration of array
int array[] = new int[10];
//accept integer values
for(int i=0; i<array.length; i++)
System.out.println("Enter "+(array.length)+" values");
{
int val = sc.nextInt();
array[i] = val;
array[i] = sc.nextInt();
}
System.out.println("You Entered");
  for(int i=0;i<array.length;i++) 
}
}