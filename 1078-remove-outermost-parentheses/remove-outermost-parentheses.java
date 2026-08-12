class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sc=new StringBuilder();
        int level=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
            if(level>0){
                sc.append(s.charAt(i));
                }
                level++;
            }else{
                level--;
                if(level>0){
                sc.append(s.charAt(i));}
                
            }}
            return sc.toString();
                  
    }
}