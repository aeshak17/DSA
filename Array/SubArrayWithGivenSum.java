// Assumption, no negative element in array
public class SubArrayWithGivenSum {

    public static void main(String args[])
    {
        int arr[] = { 1, 2, 3, 20, 4, 5,6};
        int target = 27;
        System.out.println(isSubArrayPresent(arr, target));



    }
    static boolean isSubArrayPresent(int arr[], int target)
    {
        int sum=target;
        int curr_sum = 0;
        int starting_point = 0;
        for(int i = 0; i < arr.length; i++)
        {
            curr_sum += arr[i];

            while(target < curr_sum)
            {
                curr_sum -= arr[starting_point];
                starting_point++;
            }

            if(curr_sum == target)
            {
                System.out.println("starting pt = "+starting_point);
               // System.out.println("starting pt = "+starting_point);
                return true;
            }

        }
        return false;
    }
}
