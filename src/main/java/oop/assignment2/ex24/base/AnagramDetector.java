package oop.assignment2.ex24.base;

public class AnagramDetector {
    public boolean isAnagram(String word1, String word2){
        if(word1.length() != word2.length()) return false;

        int [] freq = new int[26];

        for(int i = 0 ; i < word1.length(); i++){
            freq[word1.charAt(i)-'a']++;
            freq[word2.charAt(i)-'a']--;
        }
        for(int x : freq){
            if(x != 0) return false;
        }
        return true;
    }
}
