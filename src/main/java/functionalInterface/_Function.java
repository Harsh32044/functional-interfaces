package functionalInterface;

import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int incr = incrementBy1(0);
        System.out.println(incr);

        int incr2 = incrementBy1Function.apply(12);
        System.out.println(incr2);

        int multiply = multiply10.apply(incr2);
        System.out.println(multiply);

        int incrAndMult = incrementBy1AndThenX10.apply(90);
        System.out.println(incrAndMult);

    }
    static Function<Integer, Integer> incrementBy1Function = number -> number + 1;

    static Function<Integer, Integer> multiply10 = number -> number * 10;

    static Function<Integer, Integer> incrementBy1AndThenX10 = incrementBy1Function.andThen(multiply10);

    static int incrementBy1(int number) {
        return number + 1;
    }
}
