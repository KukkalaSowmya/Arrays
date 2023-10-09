//Java Program to demonstarte for each loop on array

public class Foreachloop
  {
    public static void main(String args[])
    {
      //Declaring an array
      int arr[];
      //Creating an array
      arr=new int[3];

      //Initializing array elements
      arr[0]=10;
      arr[1]=20;
      arr[2]=30;
      for (int var : arr)
        {
          System.out.println(var);
        }
    }
  }