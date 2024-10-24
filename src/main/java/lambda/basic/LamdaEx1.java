package lambda.basic;

public class LamdaEx1 {
    Object obj = new Object() {
        int max(int a, int b) {
            return a > b ? a : b;
        }
    };
}
