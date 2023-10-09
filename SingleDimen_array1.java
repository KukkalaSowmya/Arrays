// Java program to demonstrate one dimensional array in java

public class SingleDimen_array1
  {
   public static void main (String ...v)
    {
      //Declaring and creating an array of length 7
      int arr[] = new int[7];
      
      //declaring and initializing an array. It initializes the length with number of elements i.e., 7
      int arr[] = 1,2,3,4,5,6,7;
      
      //Looking down the array
      for(int i=0; i<arr.length; i++)
        {
          System.out.println(arr[i]);
        }
    }
  }