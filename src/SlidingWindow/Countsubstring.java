package SlidingWindow;

public class Countsubstring {
    public static int countKConstraintSubstrings(String s, int k) {

        int n =  s.length();

        int count = 0;

        for (int i = 0; i < n; i++) {
            int zerocount = 0;
            int onescount = 0;

            for (int j = i; j < n; j++) {

                if (s.charAt(j) == '0') {
                    zerocount++;
                } else {
                    onescount++;
                }

                if(zerocount <= k || onescount <= k ) {
                    count++;
                }
            }
        }
        return count++;
    }
}