package DSA;

public class linear_search
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        int target = 5;
        boolean found = false;
        for(int i = 0; i < n; i++)
        {

            if(arr[i] == target)
            {
                System.out.println("element found at index : " + i +" !");
                found = true;
                break;
            }

        }
        if(!found)
        {
            System.out.println("element not found.");
        }

    }
}
