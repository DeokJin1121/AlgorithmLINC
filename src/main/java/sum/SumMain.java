package sum;
public class SumMain {
    public static void main(String[] args) {
        MyCalc cumeSum = new MyCalc();

        int [] FREQ = {1, 0, 7, 5, 4, 3};

        for (int i = 0; i<FREQ.length; i++) {
            System.out.printf("%3d", FREQ[i]);
        }

        System.out.println();

        int [] CUME = MyCalc.calcCume(FREQ);
        // calcCume()


        for (int i = 0; i<CUME.length; i++) {
            System.out.printf("%3d", CUME[i]);
        }
    }
}