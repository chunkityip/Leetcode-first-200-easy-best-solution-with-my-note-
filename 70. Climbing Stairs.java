/* Everytime we saw It takes n steps , which mean we can use recursion or dynamic system

1. Recursion
1. if (n<0), return 0   **becuase step 0 have no step to go
2. if (n==0), return 1   step 1 only go 1 step, make sense. The 0 mean n[0] which mean having 1 step 
3.else , return n-1  + n-2   Fibonacci problem 
*/

class Solution{
    public int climbStairs(int n){
        if (n<0){
            return 0;
        }
        if(n==0){
            return 1;
        }else{
            return climbStairs(n-1)+ climbStairs(n-2);
        }
    }
}

/*However, the runtime is O(2^n) and will have runtime error in LeetCode

2. Dynamic Programming(memoized)

1. Create a array call memory, size is [n+1]   **because array n always -1
2. Arrays.fill(memory, -1)  **it meaning putting -1 into memory. If n is 4 , it will be -1, -1 , -1  ,-1 , -1
The reason of putting -1 into memory is once we puting the answer into memory which will not be -1 , we can show it answer
3. return helper(n, memory)  **we are ceating a method call helper, doing  recursion

4. In helper method , if (n<0), return 0  , if (n==0), return 1. Same as recursion
5. if(memory[n]>-1), return memory[n] **once we finish the next step which we already get the answer,
compare the answer is bigger than -1. If yes, return the answer
6. else 
memory [n]- helper(n-1, memory)+ helper(n-2, memory) ** same as Fibonacci problem  in recursion
return memory[n];
*/

class Solution{
    public int climbStairs(int n){
        int [] memory = new int [n+1];
        Arrays.fill(memory,-1);
        return helper(i,memory);
    }
    public int helper(int n, int [] memory){
        if(n<0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        if(memory[n]>-1){
            return memory[n];
        }else{
            memory[n] = helper(n-1, memory) + helper(n-2, memory);
            return memory[n];
        }
    }

/* Dynamic Programiing (bottom up)
1. if (n==1), return 1
2. Create a integer array call dp, dp = [n+1]
3. set dp[0] =1, dp[1]=1 **cauase the first step and second step are 1 only
4. for (int i=2; i<=n; i++) ** looking the following steps
5. dp[i] = dp[i-1] + dp[i-2];  
**Here is the following:
dp[2] = dp[2-1] + dp[2-2] = 1+0  = 1
dp[3] = dp[3-1] + dp[3-2] = 2+1  = 3
dp[4] = dp[4-1] + dp[4-2] = 3+2  = 5
.
.
.

6. and finally return dp[n] * which is 5 

*/
class Solution{
    publit int climbStairs(int n){
        if(n==1){
            return 1;
        }
    int [] dp = new int [n+1];
    dp[0] = 1;
    dp[1] = 1;
    for (int i =2; i<= n; i++ ){
        dp[i] = dp[i - 1] + dp[i -2];
    }
    return dp[n];
}
