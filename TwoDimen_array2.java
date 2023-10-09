//Java program to demonstrate two dimensional array 

public class TwoDimen_array2
  {
    public static void main (String...x)
    {
      //Declaring a two dimensional with 3 columns and initializing it
      //Default value of each element is zero until it is initialized
      //int numbers[][] = new int[3][3];

      int numbers[][] = {{1,2,3},{4,5,6},{7,8,9}};

      //Looping down the array to print the values.
      //Row loop runs till less than array.length
      for(int i=0; i<numbers.length;i++) 
        {
          //Column loop runs till less than each row length
        for(int j=0; j<numbers[i].length;j++)  
          {
            System.out.print(numbers[i][j]+" ");
          }
          //New line after each row to show output in a  in a matrix format
          System.out.println();
        }
    }
  }