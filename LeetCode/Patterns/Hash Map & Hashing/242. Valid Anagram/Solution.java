class Solution {
    public boolean isAnagram(String s, String t) {
        char ch1[]=t.toCharArray();
        Arrays.sort(ch1);
        String t2=new String(ch1);
        char ch2[]=s.toCharArray();
        Arrays.sort(ch2);
        String s2=new String(ch2);
        return s2.equals(t2);
    }
}