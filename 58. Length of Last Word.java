/*Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word (last word means the last appearing word if we loop from left to right) in the string.

If the last word does not exist, return 0.

Note: A word is defined as a maximal substring consisting of non-space characters only.

Example:

Input: "Hello World"
Output: 5

This question basically asking to look the ward backword, which mean i--
Each word may or may not have space 
If it found the space, count how many word 

1.Create a integer call count, set as 0 * is to count how many Word
2.Create a integer call index, s.length () -1 * looking for s length 
3.*What about the at the end of word have space? Like "Hello World "?
We need to remove it!
while(true){  //will alaway running
    if(index < 0 || s.charAt(index)) != " "){//if there have no space at the end, break
        break;
    } 
    index -- ;    //if we found the space, move to last world which mean rmove the sapce 
}

4. for (int i= index; i>=0; i--){
    if (s.charAt(i)== ' '){  // if it found the sapce , break the loop, and count
        break;
    }
    count++; 
}

*/
class Solivtion (){
    public int lengthOfLastWord(String s) {
        int count =0;
        int index = s.length() -1;
        while(true){
            if ( index < 0 || s.charAt(index) != ' '){
                break;
            }
            index;
        }
        for(int i= index; i>=0; i--){
            if(s.charAt(i)== ' '){
                break;
            }
            count++;
        }
        return count;
    }