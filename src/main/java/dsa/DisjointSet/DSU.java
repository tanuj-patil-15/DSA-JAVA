package dsa.disjointset;

public class DSU{
    int [] rank;
    int [] parent;
    int n;
    public DSU(int n){
        rank = new int[n];
        parent = new int[n];
        this.n = n;
        for (int i = 0; i < n; i++) {
            // Initially, all elements have parent as themselves.
            parent[i] = i;
        }
    }

    // this method updates and returns the parent of the element.
    // suppose index is the element and value is the parent ele-par
    // 0-0 , 1-0, 2-1
    // find(2) will change the parent of 2 from 1 to 0 and return 0.
    // resulting in 0-0, 1-0, 2-0
    // this makes the height/size of set from 3 to 2. Also know as path compression
    public int find(int i){
        int root = parent[i];
        if(parent[root] != root){
            return parent[i] = find(root);
        }
        return root;
    }

    // this function will unite both sets such that the bigger set will be parent of smaller
    public void union (int x, int y)
    {
        int xRoot = find(x);
        int yRoot = find(y);

        if(xRoot == yRoot)
            return;

        if(rank[xRoot] < rank[yRoot])
            parent[xRoot] = yRoot;

        if(rank[xRoot] > rank[yRoot])
            parent[yRoot] = xRoot;

        if(rank[xRoot] == rank[yRoot])
            parent[yRoot] = xRoot;
            rank[xRoot] += 1;
    }


    public static void main(String[] args) {
        int n = 7;
        DSU dsu = new DSU(n);

        dsu.union(0,1);
        dsu.union(1,2);
        dsu.union(2,3);

        dsu.union(4,5);
        dsu.union(5,6);

//        dsu.union(2,5); // yes if uncommented // no if commented

        if (dsu.find(4) == dsu.find(0))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

}