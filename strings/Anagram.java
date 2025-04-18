
package strings;
public class Anagram {
   
        public static boolean isAnagram(String s, String t) {
                    if (s.length() != t.length()) return false;
                    
                    int[] freq = new int[26]; // 26 letters in lowercase English
            
                    for (int i = 0; i < s.length(); i++) {
                        freq[s.charAt(i) - 'a']++;  // Increase count for s
                        freq[t.charAt(i) - 'a']--;  // Decrease count for t
                    }
            
                    for (int count : freq) {
                        if (count != 0) return false; // If counts mismatch, not an anagram
                    }
            
                    return true;
                }
        
        
                public static void main(String[] args) {
                   boolean flag =isAnagram("listen", "silent");
                   if (flag){
                    System.out.println(" Anagram");
                   }
                   else{
                    System.out.println("not Anagram");
                   }
           
        }
    }

