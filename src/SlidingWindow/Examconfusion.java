//2024. Maximize the Confusion of an Exam
package SlidingWindow;

public class Examconfusion {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        return Math.max(
                maxConsecutiveChar(answerKey, k, 'T'),
                maxConsecutiveChar(answerKey, k, 'F')
        );
    }

    private int maxConsecutiveChar(String s, int k, char target) {
        int left = 0;
        int maxLen = 0;
        int flipCount = 0;

        for (int right = 0; right < s.length(); right++) {
            if (s.charAt(right) != target) {
                flipCount++;
            }

            while (flipCount > k) {
                if (s.charAt(left) != target) {
                    flipCount--;
                }
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
