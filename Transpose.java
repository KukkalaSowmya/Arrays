public class Transpose {
  public static void main(String[] args){
    int elements[][] = //[i][j]
      {
        {1,2,3},
        {4,5,6},
        {7,8,9}
      };
    int Transpose[][] = new int[3][3];//[j][i]
    for(int i=0; i<3; i++)
      {
        for (int j=0; j<3; j++)
          {
            System.out.print(without Transpose [i][j]+" "); 
            Transpose[j][i]=elements[j][i];
          }
      }
    for(int i=0; i<3; i++);
    {
    for(int j=0; j<3; j++);
      {
    System.out.println(with Transpose[j][i]+" ");
      }
    }
    System.out.println();  
  }
}