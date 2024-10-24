package sum;

public class MyCalc {
    public static int[] calcCume(int[] freq) {
        int[] CUME = new int[freq.length];

        CUME[0] = freq[0];

        for (int i = 1; i < freq.length; i++) {
            CUME[i] = CUME[i-1] + freq[i];
        }
        return CUME;
    }
}