
    public class JaggedArray5 {
    public static void main(String args[]) {

        int arr[][]= {
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };
        for(int i=0;i<arr.length;i++) {
            int sum;
            sum=1;
            for(int j=0;j<arr[i].length;j++) {
                sum=sum*arr[i][j];
            }
            System.out.println(sum);
        }
    }
}
