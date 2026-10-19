class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];

        for(String s : strs){
            prefix = compare(prefix, s);
        }

        return prefix;
    }

    public String compare(String s, String t){
        int length = Math.min(s.length(), t.length());
        StringBuilder answer = new StringBuilder();

        for(int i = 0; i < length; i++){
            if(s.charAt(i) != t.charAt(i)) break;
            answer.append(s.charAt(i));
        }

        return answer.toString();
    }
}