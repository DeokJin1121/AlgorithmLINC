package lambda.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        // Supplier(공급자) : Supplier<T> : T get()
        Supplier<Integer> s = () -> (int)(Math.random() * 100) + 1;

        // Consumer(소비자) : Consumer<T> : void accept(T t)
        Consumer<Integer> c = i -> System.out.print(i + " ");

        // Predicate : predicate<T> : boolean Test(T t)
        Predicate<Integer> p = i -> i % 2 == 0;

        List<Integer> list = new ArrayList<>();
        makeRandomList(s, list);
        printList(c, list);
        printEven(p, c, list);
    }

    private static void printList(Consumer<Integer> c, List<Integer> list) {
        for(Integer i : list) {
            c.accept(i);
        }
        System.out.println();
    }

    private static <T> void printEven(Predicate<T> p, Consumer<T> c, List<T> list) {
        for (T t : list) {
            if(p.test(t)) {
                c.accept(t);
            }
        }
    }

    private static void makeRandomList(Supplier<Integer> s, List<Integer> list) {
        for(int i = 0; i < 10; i++) {
            list.add(s. get());
        }
    }
}
