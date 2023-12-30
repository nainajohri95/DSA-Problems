class Solution {
public:
    int check(string s, char ch) {
        int n = s.size();
        int count = 0;  // Initialize count to 0.
        for (int i = 0; i < n; i++) {
            if (s[i] != ch) {
                count++;
            }
            // For making alternating
            if (ch == '1') ch = '0';
            else ch = '1';
        }
        return count;
    }

    int minOperations(string s) {
        return min(check(s, '1'), check(s, '0'));
    }
};
