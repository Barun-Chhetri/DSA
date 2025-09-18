package bitmanupultion;

public class TenthBit {
    public static void main(String[] args) {
        long result = tenthBit(10244);
        System.out.println("Tenth bit: " + result);
    }

    public static long tenthBit(long n) {
        n = n >> 9;
        n = n & 1;
        return n;
    }
}
