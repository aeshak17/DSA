public class NumberOfIslands {
    public static void main(String args[])
    {
        int arr[][] = {{1, 1, 1, 1}, {1, 0, 0, 1}, {1, 0, 0, 0}};

        //System.out.println(arr.length);
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                //System.out.println("arr["+i+"]["+j+"] = "+arr[i][j]);
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        numberOfIslands(arr);

    }

    static void numberOfIslands(int arr[][])
    {

    }
}
