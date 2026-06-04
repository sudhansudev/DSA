package DSA;
import java.util.Arrays;
public class bubble_sort {
    public void bubble(int[] arr) {
        int size = arr.length;
        boolean isSwap = false;
        // outer loop for number of repetition
        for (int i = 0; i < size - 1; i++){// loop from 0 to 3 indices

            //for(int j = 0 ; j < size - 1 - i; j++)//optimized one , decreases the number of comparision.
            // the comparision will be from o to 3 indices
            for (int j = 0; j < size - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if (!isSwap) {
                break;
            }

        }

    }


    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int size = arr.length;
        bubble_sort obj = new bubble_sort();
        obj.bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
}
