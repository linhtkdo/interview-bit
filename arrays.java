1.
ArrayList<ArrayList<Integer>> performOps(ArrayList<ArrayList<Integer>> A) 
{
    ArrayList<ArrayList<Integer>> B = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < A.size(); i++) 
        {
            B.add(new ArrayList<Integer>());            // []

            for (int j = 0; j < A.get(i).size(); j++)   // [0, 0, 0, 0]
                B.get(i).add(0);

            for (int j = 0; j < A.get(i).size(); j++)   // B[i][n - 1 - j] = A[i][j]
                B.get(i).set(A.get(i).size() - 1 - j, A.get(i).get(j));
        }
        return B;
}
A : [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12]]
B : [[4 3 2 1 ], [8 7 6 5], [12 11 10 9]]

Try dry running the whole thing. There is no other shortcut.

Try to focus on B[i][n - 1 - j] = A[i][j]
Row remains the same for both. Just the column order is reversed.

2.
The following code is supposed to rotate the array A by B positions.
A : [1 2 3 4 5 6]
B : 1
A : [2 3 4 5 6 1]

public ArrayList<Integer> rotateArray(ArrayList<Integer> A, int B) 
{
	ArrayList<Integer> ret = new ArrayList<Integer>();
	
	for (int i = 0; i < A.size(); i++)          // try to see what happens at the last value of the loop.
		ret.add( A.get((B + i) % A.size()) );   // B can be bigger than the size of the array. What should be the behavior then ?
	
	return ret;
}

3.
ArrayList<Integer> performOps(ArrayList<Integer> A) 
{
    ArrayList<Integer> B = new ArrayList<Integer>();
    for (int i = 0; i < 2 * A.size(); i++) B.add(0);            // [0 .. 0]; n = 8
    for (int i = 0; i < A.size(); i++)      
    {
        B.set(i, A.get(i));                                     // first half: same pos same val
        B.set(i + A.size(), A.get((A.size() - i) % A.size()));  // second half: mod: 0, 3, 2, 1
    }
    return B;
}
A : [5, 10, 2, 1]
B : [5, 10, 2, 1, 5, 1, 2, 10]
