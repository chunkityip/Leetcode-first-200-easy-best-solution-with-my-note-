/*7. reverse integer

Stack? FIFO (no, not the most efficient)
Should I think about 32 bit? index_MAXVALUE, index_MIN_VALUE , 2^31-1 , -2^31
puch     x
peek     x
pop      x
(Should do the math instead using the help of stack/array)

1.Create a empty integer call answer , to backward the x 
2.Create a integer call pop: x(123) % 10; =3 (3 will be the one we want to remove it)
3.While x !=0
take away 3 from 123 : x = x/10; = 12.3(cause we are using int, so will be 12)
*Cause we are print 321 (not the array 3,2,1) which mean 300 + 20 + 1 


Answer will be  answer *10 + pop ( first step : 0 * 10 + 3 =3)
		          (second step: 3 * 10 + 2 =32)
		          (third step: 32 * 10 + 1 = 321)

Now we need to think about the 32 bit problem -2^31 , 2^31-1
if (answer > Integer.MAX_VALUE /10   or  
(answer == Integer.MAX_VALUE /10 && pop>7))
return 0

*Integer.MAX_VALUE = 2147483647
*Integer.MIN_VALUE = -2147483648

[Why answer > Integer.MAX_VALUE /10? becuase 32 bits is Integer.MAX_VALUE /10 is 2,147,483,640. If the while loop 
keep looping which will bigger than  2,147,483,640 (answer *10), it will over 32 bits]
[answer == Integer.MAX_VALUE /10 && pop>7? because Integer.MIN_VALUE /10 is 2147483640 + 7 , if pop bigger than
7, it will over 32 bits.]

if(answer > Integer.MIN_VALUE /10 or (answer == Integer.MIN_VALUE /10 && pop <-8))
return 0

*/
class Solution {
    public int reverse(int x) {
        int answer =0;
        while(x!=0){
            int pop = x %10;
            x/=10;
        if(answer > Integer.MAX_VALUE/10 || (answer== Integer.MAX_VALUE/10 && pop >7)){
            return 0;
        }
        if(answer < Integer.MIN_VALUE/10 || (answer == Integer.MIN_VALUE /10 && pop <-8)){
            return 0;
        }
        answer = answer*10 + pop;
    }
        return answer;
}
}