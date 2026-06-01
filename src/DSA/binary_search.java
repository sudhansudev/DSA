package DSA;

public class binary_search
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5};
        int size = arr.length;
        int target = 50;
        int start = 0;
        int end = size - 1;
        int ans = -1;


        while(start <= end)
        {
            int mid = ( start + end ) / 2;
            if (arr[mid] == target)
            {
                ans = mid;
                break;
            }
            else if(arr[mid] < target)
            {
                start = mid + 1;
            }
            else
            {
                end = mid - 1;
            }
        }
        System.out.println(ans);
    }
}
