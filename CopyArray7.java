import java .util.Arrays;
class CopyArray7 {
  public static void main(String[] args) {
    int[][] source = {
      {1,2,3,4},
      {5,6},
      {0,2,43,-4,5}
    };
    int[][] destination = new int[source.length][];
    for (int i = 0; i < source.length; ++i) {
      //allocating space for each row of destination array
      destination[i] = new int[source[i].length];
      for(int j = 0; j < destination[i].length; ++j) {
        destination[i][j] = source[i][j];
      }
    }
   //displaying destination array
    System.out.println(Arrays.deepToString(destination));
    }
  }
