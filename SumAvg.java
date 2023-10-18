public class SumAvg {
  public static void main (String[] args){
    int[] numbers = {2,-4,5,7,-5,-7,8,9,-4,-2};
    int sum = 0;
    Double average;
    for (int number: numbers) {
      sum += number;
    }
    int arrayLength = numbers.length;
    average = ((double)sum / (double)arrayLength);
    System.out.println("Sum: " + sum);
    System.out.println("Average: " + average);
  }
} 