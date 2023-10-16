public class Transpose2
  {
  public static void main(String[] args)
    {
    int numbers[][] = 
      {
        {10,20,30},
        {40,50,60},
        {70,80,90}
      };
    System.out.println("Matix without Transpose: ");
    for (int i=0; i<3; i++)
      {
      for(int j=0; j<3; j++)
        {
          System.out.println(numbers[i][j]+ " ");
        }
        System.out.println();
      }
    System.out.println("Matix with Transpose: ");
    for(int i=0; i<3; i++)
      {
        for(int j=0; j<3; j++)
          {
            System.out.println(numbers[j][i]+" ");
          }
      }
        System.out.println();
  }
}