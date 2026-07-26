class Solution {
    public boolean isAnagram(String s, String t) {
       int sl=s.length();
       int tl=t.length();
       if(sl!=tl){
        return false;
       }
       Map<Character, Integer> count=new HashMap<>();
       for(char x:s.toCharArray()){
        count.put(x,count.getOrDefault(x,0)+1);
       }
       for(char x:t.toCharArray()){
        count.put(x,count.getOrDefault(x,0)-1);
       }
       for(int val:count.values()){
        if(val!=0){
            return false;
        }
       }
       return true;

    }
}