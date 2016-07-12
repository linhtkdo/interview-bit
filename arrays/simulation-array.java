public ArrayList<ArrayList<Integer>> pascalTriangleRows(int a) 
{
    // IN: 5
    // OUT: 
    // [
    //  [1],
    //  [1,1],
    //  [1,2,1],
    //  [1,3,3,1],
    //  [1,4,6,4,1]
    // ]
    
    ArrayList<ArrayList<Integer>> A = new ArrayList();
    
    for (int i=0; i < a; i++)
    {
        A.add(new ArrayList());
        A.get(i).add(1);
        
        for (int j=1; j < i; j++)
        {
            int n = A.get(i-1).get(j) + A.get(i-1).get(j-1);
            A.get(i).add(n);
        }
        
        if (i > 0) A.get(i).add(1);
    }
    
    return A;
}

