package SlidingWindow;

import java.util.Set;

public class NumberOfVowels {

    public static int maxVowels(String s, int k) {
        Set<Character> vowel = Set.of('a','e','i','o','u');
        int count = 0;
        for (int i = 0; i < k; i++) {
            if (vowel.contains(s.charAt(i)))
                count++;
        }
        int maxcnt = count;
        for (int i = k; i < s.length(); i++) {
            if (vowel.contains(s.charAt(i))) count++;
            if (vowel.contains(s.charAt(i - k))) count--;
            maxcnt = Math.max(maxcnt, count);
        }
        return maxcnt;
    }
    public static void runTestCase(String s, int k, int expected) {
        int result = maxVowels(s, k);
        System.out.println("Input: \"" + s + "\", k = " + k);
        System.out.println("Expected: " + expected + ", Got: " + result);
        System.out.println(result == expected ? "✅ Passed\n" : "❌ Failed\n");
    }

    // 👇 Main method to run multiple test cases
    public static void main(String[] args) {
        runTestCase("abciiidef", 3, 3);
        runTestCase("aeiou", 2, 2);
        runTestCase("leetcode", 3, 2);
        runTestCase("rhythms", 4, 0);
        runTestCase("tryhard", 4, 1);
    }
}
