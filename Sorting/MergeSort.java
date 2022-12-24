package Sorting;

public class MergeSort {
    public static void main(String args[])
    {
        int arr[] = {1,4,2,77,3,10,9, 5};
        divide(arr, 0, arr.length-1);
        for (int j : arr) {
            System.out.print(j + " ");
        }

    }

    static void divide(int arr[], int si, int ei)
    {
        if(si>=ei)
        {
            return;
        }
        int mid = si + (ei-si)/2;
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conquer(arr, si, mid, ei);

    }



//    static void divide(int arr[], int si, int ei)
//    {
//        if(si>=ei)
//        {
//            return;
//        }
//        int mid = si + (ei-si)/2;
//        divide(arr, si, mid);
//        divide(arr, mid+1, ei);
//        conquer(arr, si, mid, ei);
//    }


    static void conquer(int arr[], int si, int mid, int ei)
    {
        int mergeArr[] = new int[ei-si+1];
        int idx1 = si;
        int idx2 = mid+1;
        int i=0;

        while(idx1<= mid && idx2 <=ei)
        {
            if(arr[idx1] <= arr[idx2])
            {
                mergeArr[i++] = arr[idx1++];
            }
            else
            {
                mergeArr[i++] = arr[idx2++];
            }
        }

        while(idx1 <=mid)
        {
            mergeArr[i++] = arr[idx1++];
        }

        while(idx2<= ei)
        {
            mergeArr[i++] = arr[idx2++];
        }

        for(int x=0, j=si; x<mergeArr.length; x++, j++)
        {
            arr[j] = mergeArr[x];
        }
    }

//    static void conquer(int arr[], int si, int mid, int ei )
//    {
//        int mergeArr[] = new int[ei-si+1];
//
//        int idx1 = si;
//        int idx2 = mid+1;
//        int i =0;
//
//        while(idx1 <= mid && idx2 <=ei)
//        {
//            if((arr[idx1] <= arr[idx2]))
//            {
//                mergeArr[i++] = arr[idx1++];
//            }
//            else
//            {
//                mergeArr[i++] = arr[idx2++];
//            }
//
//        }
//
//        while(idx1<=mid)
//        {
//            mergeArr[i++] = arr[idx1++];
//        }
//        while(idx2<=ei)
//        {
//            mergeArr[i++] = arr[idx2++];
//        }
//
//        for(int x=0, j=si; x<mergeArr.length; x++, j++)
//        {
//          //  System.out.println(mergeArr[j]);
//            arr[j] =mergeArr[x];
//        }
//
//
//    }
}
