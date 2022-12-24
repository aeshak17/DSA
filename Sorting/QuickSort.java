package Sorting;

public class QuickSort {
    public static void main(String args[])
    {
        int arr[] = { 5, 2, 3};
        quickSort(arr, 0, arr.length - 1);
        System.out.println("sorted array")
        ;
        for(int i : arr)
        {
            System.out.print(i+" ");
        }


    }

    static void quickSort(int arr[], int low, int high)
    {
        if(low < high)
        {
            int pivot_index = partition(arr,  low,  high);
            quickSort(arr, low, pivot_index-1);
            quickSort(arr, pivot_index + 1, high);

        }
    }

    static int partition(int arr[], int low, int high)
    {
      int pivot = arr[high];
      int i= low-1;

      for(int j= low; j<high; j++)
      {
          if(arr[j] < pivot)
          {
              i++;

              int temp = arr[i];
              arr[i] = arr[j];
              arr[j] = temp;
              System.out.println(i+" element is "+ arr[i]);
          }
      }

      i++;

      int temp = arr[i];
      arr[i] = pivot;
      arr[high] = temp;

      return i;
    }
}
