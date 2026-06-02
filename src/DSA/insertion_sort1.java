package DSA;

import java.util.Arrays;

public class insertion_sort1
{
    public void insertion(int[] arr)
    {
        int size = arr.length;
        for(int i = 1; i < size; i++)
        {
            int prev = i - 1;
            int key = arr[i];
            while(prev >= 0 && arr[prev] > key  )
            {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = key;
        }
    }

    public static void main(String[] args)
    {
        int[] arr = {9,2,8,7,4};
        insertion_sort1 obj = new insertion_sort1();
        obj.insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
}
