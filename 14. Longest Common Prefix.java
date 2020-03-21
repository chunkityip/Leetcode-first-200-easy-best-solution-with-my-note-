/*14. Longest Common Prefix
Vertical scanning

1. Create a empty String call lcp, ="";
2.error check, if str have nothing, just return lcp which mean nothing : ""{
}
3. Create a integer call index ,index = 0;
4. for each loop ,create a char call c to first strs value{
5.for loop for checking second strs value{
6. if index >= second strs length or have no same value between first str 
and second str, return lcp which mean nothing}
}
7.lcp = c+ lcp 
8.index ++;
}
return lcp
}}
*/

public String longestCommonPrefix(String[] strs) {
    if (strs == null || strs.length == 0) return "";
    for (int i = 0; i < strs[0].length() ; i++){
        char c = strs[0].charAt(i);
        for (int j = 1; j < strs.length; j ++) {
            if (i == strs[j].length() || strs[j].charAt(i) != c)
                return strs[0].substring(0, i);             
        }
    }
    return strs[0];
}

/*Horizontal scanning

1. error checking
2.Create a string call lcp, lcp = strs[0];
3. for loop, i=1, i <str.length; i++;
4.while str[i].indexOf(lcP) !=0)
*which mean to check if lcp and str[i] having any same value , if yes, sum how many
time, if not, return -1;
5.lep = lep.substring(0, res.length() -1);
6. retunr lcp
*/

public String longestCommonPrefix(String[] strs) {
    if (strs.length == 0) return "";
    String prefix = strs[0];
    for (int i = 1; i < strs.length; i++)
        while (strs[i].indexOf(prefix) != 0) {
            prefix = prefix.substring(0, prefix.length() - 1);
            if (prefix.isEmpty()) return "";
        }        
    return prefix;
}