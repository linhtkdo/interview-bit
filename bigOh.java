1. 
int count = 0;
for (int i = N; i > 0; i /= 2) 
    for (int j = 0; j < i; j++) 
        count += 1;
O(N)
In the first iteration, the j loop runs N times.
In the second iteration, the j loop runs N / 2 times.
In the ith iteration, the j loop runs N / 2^i times.
So, the total number of runs of loop = N + N / 2 + N / 4 + … 1
= N * ( 1 + 1/2 + 1/4 + 1/8 + … ) < 2 * N

2.
Which of the following is not O(n^2)?  

 (15^10) * n + 12099
 n^1.98
 n^3 / (sqrt(n))
 (2^20) * n

(Which function grows faster than O(n^2) ?)  n^3 / (sqrt(n))


