class Solution {
    public boolean rotateString(String s, String goal) {
      if(s.length()!=goal.length()){
        return false;
      }
       String f=s+s;
       if(f.contains(goal)){
        return true;
       } else{
        return false;
       }
    }
}