class CopyArray2{
  public static void main(String[] args) {
    int [] numbers = {1,2,3,4,5,6,7,8};
    int [] positiveNumbers = numbers; //copying arrays
    //change value of first array
    numbers[0] = -1;
    //printing the second array
    for(int number: positiveNumbers) {
      System.out.print(number + ",");
    }
  }
}