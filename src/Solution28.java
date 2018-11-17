class Solution28{
    public int strStr(String haystack, String needle) {
        if(needle == null || needle.length() == 0)
            return 0;
        
        int index = -1;
        
        for(int j =0; j< haystack.length(); j++){

            if(needle.charAt(0) == haystack.charAt(j)){
                if(needle.length() + j > haystack.length()){
                     break;
                }
                   
                if(needle.equals(haystack.substring(j, needle.length()+j))){
                    index = j;
                    break;
                }
            }
       }

        return index;                  
    }
    
}