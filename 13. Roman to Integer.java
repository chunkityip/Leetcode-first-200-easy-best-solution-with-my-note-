/*13. Roman to Integer

I	1
V	5
X	10
L	50
C	100
D	500
M	1000

VI = 6
IV= 4 (cuase right small than left one which mean 1-5 = 4)
IX = 9 (same as 4, 1-10 =9)

which mean RIGHT SMALL THAN LEFT, -=
	   RIGHT BIGGER THAN LEFT,  +=

1.First, How to put symbol and Value together?
first opition: HashMap(which I first think of)
second opition : switch case 

For HashMap: HashMap <Character, Integer> map = new HashMap<>(); 
*not string, be careful!!!!
map.put('I', 1);
*not add, Hashmap using put. Moreover, char is uisng '', not "", be careful!!!!!

[However, it is slower than second opition]
For switch case:  open a int method call toNumber(char c)
open a integer call res , res =0;
swtich(c){
case 'I' : return 1;
}

2. if (s ==null || s.length() ==0) return false
*length is a method, be careful!!!!!

3. create a integer call length, length = s.length();
4.create a integer call answer , answer = map.get(... 
or toNubmer(s.charAt(length -1)
* answer stall the left valuse

5. for loop, int i = length -2
* start at right value , to able to compare right and left value
6. if(toNumber(... or if(map.get(s.charAt(i)) >= map.get(s.charAt(i+1){
answer += map.get(s.charAt(i)
* if right >= left , sum right and left(answer) together
else{
answer -=map.get(s.charAt(i)}
* if right <= left , sum minus left
}
return answer

*/

class Solution {
    public int romanToInt(String s) {
       HashMap<Character, Integer> map = new HashMap<>();
       map.put('I',1);
       map.put('V',5);
       map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        
        int length = s.length();
        int answer = map.get(s.charAt(length-1));
        for(int i= length-2; i>=0; i--){
            if(map.get(s.charAt(i)) >= map.get(s.charAt(i+1))){
                answer += map.get(s.charAt(i));
            }else{
                answer -= map.get(s.charAt(i));
            }
        }
        return answer;
        }
}
