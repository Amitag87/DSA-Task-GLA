import java.util.*;
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int result=0;
        Arrays.sort(g);
        Arrays.sort(s);
        // int min = Math.min(g.length , s.length);
        int i=g.length - 1;
        int j=s.length - 1;
        while(i>=0 && j>=0){
            if(s[j] >= g[i] ){
                result++;
                j--;
            }
            i--;
        }
        return result;

        // return c;
    }
}