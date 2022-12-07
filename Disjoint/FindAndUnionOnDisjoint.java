public class FindAndUnionOnDisjoint {
    static int parent[];
    public static void main(String args[])
    {
        int n = 5;
        parent = new int[n];
        initialize();

        union(0, 2);
        union(0,4);
    }
    static void initialize()
    {
        for(int i=0; i< parent.length; i++)
        {
            parent[i] = i;
            System.out.println(parent[i]);
        }
    }

    static int find(int x)
    {
        if(parent[x] == x)
            return x;
        else
            return find(parent[x]);
    }
    static void union(int x, int y)
    {
        int x_rep = find(x);
        int y_rep = find(y);

        if(x_rep == y_rep)
            return;

        parent[y_rep] = x_rep;
    }
}
