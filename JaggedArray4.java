public class JaggedArray4 {
  public static void main(String args[]) {
    int mul=1,i,j;
    int array [] []={
      {1,2,3},
      {4,5,6},
      {7,8,9}
    };
    for(i=0; i<array.length; i++)
    {
      for(j=0; j<array.length; j++)
      {
        if(j<array[i].length-1)
          System.out.print(array[i][j] + "*");
        mul=mul*array[i][j];
      }
      System.out.println(array[i][array[i].length-1]+"="+mul);
      }
  }
}