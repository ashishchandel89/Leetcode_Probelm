class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0)
        return "";

        String ans="";
        String name1=strs[0];

        for(int i=0;i<name1.length();i++){
            char ch=name1.charAt(i);
            for(int j=1;j<strs.length;j++){
                if(i>=strs[j].length() || strs[j].charAt(i)!=ch){
                    return ans;
                }
            }
            ans=ans+ch;
        }
        return ans;
    }
}