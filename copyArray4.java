import java.util.Array;
class CopyArray4 {
  public static void main (String[] args) {
    int[] n1 = {2,3,12,42,-7,-5};
    int[] n3 = new int[5];
    //creating n2 array of having length of n1 array
    int[] n2 = new int[n1.length];
    //coping entire n1 array to n2
    System.arraycopy(n1,0,n2,0,n1.length);
    System.out.println("n2 = " + Array.toString(n2));
    //copying elements from index2 on n1 array
    //copying element to index 1 of n3 array
    //2 elements will be copied
    System.arraycopy(n1,2,n3,1,2);
    System.out.println("n3 = " + Arrays.toString(n3));
  }
}