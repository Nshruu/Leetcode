class Solution {
    public int romanToInt(String s) {
        int ans=0;
        for(char ch:s.toCharArray()){
            if(ch=='I'){
                ans+=1;
            }else if(ch=='X'){
                ans+=10;
            }else if(ch=='V'){
                ans+=5;
            }else if(ch=='L'){
                ans+=50;
            }else if(ch=='C'){
                ans+=100;
            }else if(ch=='D'){
                ans+=500;
            }else if(ch=='M'){
                ans+=1000;
            }
            
        }
        if (s.contains("IV")) ans -= 2;
        if (s.contains("IX")) ans -= 2;
        if (s.contains("XL")) ans -= 20;
        if (s.contains("XC")) ans -= 20;
        if (s.contains("CD")) ans -= 200;
        if (s.contains("CM")) ans -= 200;
        return ans;
    }
}