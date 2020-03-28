/* 155. Min Stack 

Using stack function in java 
Here is the following step: 

add 3 into stack
|   |    |   |
|   |    |   |
|_3_|    |_3_|
stack  minStack

add 5 into stack ， 5 bigger than the top of minStack, not adding to minStack
|   |    |   |
| 5 |    |   |
|_3_|    |_3_|
stack  minStack

add 2 into stack ，keep the 2 to minStack because 3 > 2 
| 2 |    |   |
| 5 |    | 2 |
|_3_|    |_3_|
stack  minStack

out the 2 
|   |    |   |
| 5 |    |   |
|_3_|    |_3_|
stack  minStack

out the 5
|   |    |   |
|   |    |   |
|_3_|    |_3_|
stack  minStack

out the 3 
|   |    |   |
|   |    |   |
|_ _|    |_ _|
stack  minStack
*/
class MinStack {
    /** initialize your data structure here. */
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if (!minStack.isEmpty()) {
            int top = minStack.peek();
            // this is what I am talking about, 3 > 2 
            if (x <= top) {
                minStack.push(x);
            }
        }else{
            minStack.push(x);
        }
    }

    public void pop() {
        int pop = stack.pop();
        int top = minStack.peek();
        if (pop == top) {
            minStack.pop();
        }

    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}

/* What about only using 1 stack ? 
add 3 
|   |   min = 3
|   |     
|_3_|    
stack   

add 5 
|   |   min = 3
| 5 |     
|_3_|    
stack  


add 2
first add min (3) again , then add 2 and min become 2
| 2 |   min = 2
| 3 |  
| 5 |     
|_3_|    
stack  

add 6 
| 6 |  min = 2
| 2 |   
| 3 |  
| 5 |     
|_3_|    
stack  

get 6 out
| 2 |   min = 2
| 3 |  
| 5 |     
|_3_|    
stack  

get 2 out, then  min become 3
|   |  min = 3   
| 5 |   
|_3_|    
stack
*/
class MinStack {
    int min = Integer.MAX_VALUE;
    Stack<Integer> stack = new Stack<Integer>();
    public void push(int x) {
        if(x <= min){     
            stack.push(min);
            min=x;
        }
        stack.push(x);
    }

    public void pop() {
        if(stack.pop() == min) {
            min=stack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }
}

// What about not using Stack function in java? 

class MinStack {
    Stack<int[]> st = new Stack<int[]>();
    public MinStack() {
        int min; 
        Stack<Node> st;
    }
    
    public void push(int x) {
        int min = Math.min(x, getMin());
        st.push(new int[] {x, min});
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        return st.peek()[0];
    }
    
    public int getMin() {
        if (st.isEmpty()) {
            return Integer.MAX_VALUE;
        }
        return st.peek()[1];
    }
}
