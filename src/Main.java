import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[5]
        ;
        //for (int i = 0; i < 5; i++) {
        //    arr[i] = i;
       // }
       // System.out.println(Arrays.toString(arr));

        int j = 0;

        while (j <5){
            arr[j] = j++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
