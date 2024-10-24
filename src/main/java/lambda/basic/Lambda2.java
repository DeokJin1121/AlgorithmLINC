package lambda.basic;

public class Lambda2 {
    public static void main(String[] args) {
        MyFunction mf = new MyFunction() {
            @Override
            public int max(int a, int b) {
                return a > b ? a : b;
            }
        };

        int result = mf.max(10, 20);
        System.out.println(result);

        MyFunction mf2 = (a, b) -> a > b ? a : b;
        result = mf2.max(11, 12);
        System.out.println(result);
    }
}
