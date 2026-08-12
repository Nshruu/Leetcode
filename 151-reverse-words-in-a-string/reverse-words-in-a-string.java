class Solution {
    public String reverseWords(String s) {
        StringBuilder nn=new StringBuilder();
        String [] word=s.trim().split("\\s+");
        for(int i = word.length - 1; i >= 0; i--){
            nn.append(word[i]);

            if (i != 0) {
                nn.append(" ");
            }
        }
        return nn.toString();
    }
}