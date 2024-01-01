class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int n = g.length;
        int m = s.length;
        int count = 0;
        int i=0;
        int j = 0;
        
        while(i<n && j<m){
                if(s[j] >= g[i]){
                    count++;
                    i++;
                }
            j++;
        }
        return count;
    }
}