public class SubMatrix {
  public static void main(String[] args) {
    int A[][] =
      {{10,20,30},
       {5,10,15},
       {0,5,7}
      };
    int B[][] =
      {
        {1,2,3},
        {5,0,7},
        {10,2,4}
      };
    int C[][] = new int[3][3];
    {
    for(int i=0; i<3; i++)
      {
        for(int j=0; j<3; j++)
          C[i][j] = A[i][j]-B[i][j];
        System.out.println(C[i][j]+ " ");
      }
    }
    System.out.println();
  }

}