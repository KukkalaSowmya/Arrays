public class CopyArray{
  public static void main(String[] args) {
    int[] numbers = {1,-2,3,-4,5,6,-7,-8,9};
  int[] positiveNumbers = numbers; //copy the array
    for(int number: positiveNumbers) {
      System.out.print(number + " , ");
    }
  }
}