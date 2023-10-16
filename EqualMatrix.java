public class EqualMatrix{
  public static void main(String[] args){
    int A[][] =
      {
        {2,3},
        {1,0}
      };
    int B[][] =
      {
        {2,3},
        {1,0}
      };
    for(int i=0; i<2; i++)
        {
      for(int j=0; j<2; j++)
        {
        if(A[i][j]==B[i][j])
          System.out.println("A and B are equal");
        }
        }
  }
}