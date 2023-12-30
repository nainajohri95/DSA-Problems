class Solution {
    public boolean makeEqual(String[] words) {
        int n = words.length;
        Map<Character, Integer> map = new HashMap<>();

        for(String word: words){
            for(char ch: word.toCharArray()){
                map.put(ch, map.getOrDefault(ch,0)+1);
            }
        }
        for(int value: map.values()){
            if(value%n != 0){
                return false;
            }
        }
        return true;
    }
}

//map.getOrDefault(ch,0)+1) means ch agar phele se nhi h map m to frequeny is 0 otherwise it will be +1