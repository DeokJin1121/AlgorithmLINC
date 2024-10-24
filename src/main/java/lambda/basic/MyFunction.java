package lambda.basic;

@FunctionalInterface
public interface MyFunction {
    // 1. 상수
    // 2. 추상 메서드
    // 3. default 함수
    int A = 3; // public static final 생략 가능
    int max(int a, int b);  // 추상 메서드, public abstract 생략 가능
//    int add(int a, int b);    // 이 코드는 함수형 인터페이스가 아님

    public default void teat() {
        System.out.println("될까?");
    }
}