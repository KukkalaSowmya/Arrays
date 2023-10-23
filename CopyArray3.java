import java.util.Arrays;
class CopyArray3{
  public static void main(String[] args) {
    int[] source = {2,3,4,12,-4,-5,-2};
    //copying entire source array to destination 
    int[] destination1 = Arrays.copyOfRange(source,0,source.length);
    System.out.println("destination1 = " + Arrays.toString(destination1));
    //coping from index 2 to 5 (5 is not included)
    int[] destination2 = Arrays.copyOfRange(source,2,5);
    System.out.println("destination2 = " + Arrays.toString(destination2));
  }
}