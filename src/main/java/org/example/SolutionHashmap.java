package org.example;
import java.util.*;

public class SolutionHashmap {

    // leetcode 383
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

    // leetcode 205
    public boolean isOmorphic(String s, String t) {
        HashMap<Character, Integer> charIndexS = new HashMap<>();
        HashMap<Character, Integer> charIndexT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (!charIndexS.containsKey(s.charAt(i))) {
                charIndexS.put(s.charAt(i), i);
            }

            if (!charIndexT.containsKey(t.charAt(i))) {
                charIndexT.put(t.charAt(i), i);
            }

            if (!charIndexS.get(s.charAt(i)).equals(charIndexT.get(t.charAt(i)))) {
                return false;
            }
        }

        return true;
    }

    // leetcode 209
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> record = new HashMap();
        String[] newS = s.trim().split("\\s+");
        if (pattern.length() != newS.length) {
            return false;
        }

        for (int i = 0; i < pattern.length(); i++) {

            if(!record.containsKey(pattern.charAt(i))) {
                if (record.containsValue(newS[i])) {
                    return false;
                }
                record.put(pattern.charAt(i), newS[i]);
            }

            if(!record.get(pattern.charAt(i)).equals(newS[i])) {
                return false;
            }
        }

        return true;
    }

    // leetcode 242
    public boolean validAnagram(String s, String t) {
        int[] record = new int[26];

        for (char c : s.toCharArray()) {
            record[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            record[c - 'a']--;
        }

        for (int i : record) {
            if (i != 0) {
                return false;
            }
        }

        return true;
    }

    // leetcode 49
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] words = str.toCharArray();
            Arrays.sort(words);
            String newWords = new String(words);

            if (!map.containsKey(newWords)) {
                map.put(newWords, new ArrayList<>());
            }
            map.get(newWords).add(str);
        }

        return new ArrayList<>(map.values());
    }
    // re-write-1
    public List<List<String>> groupRe(String[] strs){
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] word = str.toCharArray();
            Arrays.sort(word);
            String newWord = new String(word);
            if (!map.containsKey(newWord)) {
                map.put(newWord, new ArrayList<>());
            }
            map.get(newWord).add(str);
        }

        return new ArrayList<>(map.values());

    }

    // leetcode 1
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> record = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (record.containsKey(temp)) {
                result[0] = record.get(temp);
                result[1] = i;
            }
            record.put(nums[i], i);
        }

        return result;
    }

    // leetcode 202
    public boolean happyNumber(int n) {
        Set<Integer> set = new HashSet<>();

        while (n != 1 && !set.contains(n)) {
            set.add(n);
            n = nextNumber(n);
        }
        return n == 1;
    }
    private int nextNumber(int n) {
        int res = 0;
        while (n > 0) {
            int digit = n % 10;
            res += digit * digit;
            n = n / 10;
        }
        return res;
    }

    // leetcode 219
    public boolean containsDuplicateII(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (Math.abs(map.get(nums[i]) - i) <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }

        return false;
    }

    // leetcode 128
    public int longestConsecutiveSequence(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums) {
            set.add(num);
        }

        int longest = 0;
        for(int num : nums) {
            if (!set.contains(num - 1)) {
                int length = 1;
                while(set.contains(num + length)) {
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }

        return longest;
    }


}
