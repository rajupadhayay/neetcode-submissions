class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        List<Character> s1 = new ArrayList<>();
        List<Character> t1 = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            s1.add(s.charAt(i));
        }
         for(int i=0;i<s.length();i++){
            t1.add(t.charAt(i));
        }

         for(int i=0;i<s.length();i++){
           if(t1.contains(s1.get(i))){
            t1.remove(s1.get(i));
           }
           if(i==s.length()-1&&t1.isEmpty()){
            return true;
           }
        }
        return false;
    }
}
