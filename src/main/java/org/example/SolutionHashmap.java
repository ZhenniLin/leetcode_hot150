package org.example;


public class SolutionHashmap {

    public boolean ransom(String ransomNote, String magazine) {
        int[] record = new int[26];

        for (char c : magazine.toCharArray()) {
            record[c-'a']++;
        }

        for (char c : ransomNote.toCharArray()) {
            record[c-'a']--;
        }

        for (int i = 0; i < record.length; i++) {
            if (record[i] < 0) {
                return false;
            }
        }

        return true;
    }



//    public static void main(String[] args) {
//        Solution383 solution = new Solution383();
//
//        // test case 1;
//        String ransomNote1 = "aa";
//        String magazine1 = "aab";
//        boolean result1 = solution.ransom(ransomNote1, magazine1);
//        System.out.println("Expected: true, Output: " + result1);
//
//
//    }
}
