/* 168. Excel Sheet Column Title 

This question is asking about how 10 bits change to 26 bits
It can be done by divid by 26 
10 bit:0-9
16bit: 0-9a-f


sb.insert(0, (char) ('A' + c - 1));
n /= 26;

sb.insert(0, (char) ('A' + c - 1)) is meaning to make character change to integer 
If c is 3 , then 'A' + c -1 will make A ASCII code to 65
65+c -1 = 65 + 3 - 1 = 67. C ASCII is 67

There is the problem ,since the question start at 1 but bit start at 0
The solution is when lopp found out 26, remove 1 
*/

class Solution{
    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
        int c = n % 26;
        if(c == 0){
            c = 26;
            n -= 1;
        }
        sb.insert(0, (char) ('A' + c - 1));
        n /= 26;
    }
    return sb.toString();
}
}