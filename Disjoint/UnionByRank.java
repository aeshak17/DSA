package Disjoint;

public class UnionByRank {
    static int parent[];
    static int rank[];


    static void initialize()
    {
        for(int i=0; i<parent.length;i++)
        {
            parent[i]= i;
            rank[i] = 0;

        }
    }

    static int find(int x)
    {
        if(parent[x] == x)
            return x;
        else
            return find(parent[x]);
    }

    static void unionByRank(int x, int y)
    {
        int x_rep = find(x);
        int y_rep = find(y);

        if(x_rep == y_rep)
            return;

        if(rank[x_rep]<rank[y_rep])
            parent[x_rep] = y_rep;
        else if(rank[x_rep]>rank[y_rep])
            parent[y_rep] = x_rep;
        else
        {
            parent[y_rep] = x_rep;
            rank[x_rep]++;
        }

    }

    public static void main(String args[])
    {
        int n=5;
        parent = new int[5];
        rank = new int[5];
        initialize();

        unionByRank(3,4);
        unionByRank(2,3);
        unionByRank(1,2);
        unionByRank(0,1);


        System.out.println(parent[3]);
        System.out.println(rank[3]);
        System.out.println("$$$$$$$$$$$$$$");
        for(int i=0; i< rank.length; i++)
        {
            System.out.print(" "+parent[i]);
           // System.out.print("Rank= "+rank[i]);
        }
        System.out.println("$$$$$$$$$$$$$$");
        for(int i=0; i< rank.length; i++)
        {
           // System.out.print(" "+parent[i]);
            System.out.print("Rank= "+rank[i]);
        }

    }
}
