package functionalInterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println(isPhoneNumberValid("8855960748"));

        System.out.println("Is phone number valid? " + phoneNumValidPredicate.and(phoneNumContains3Predicate).test("9978445732"));
        System.out.println("Is phone number valid and contains a 3? " + phoneNumValidPredicate.and(phoneNumContains3Predicate).test("9978445702"));
        System.out.println("Is phone number valid and contains a 3? " + phoneNumValidPredicate.or(phoneNumContains3Predicate).test("9978445702"));
    }

    static Predicate<String> phoneNumValidPredicate = number -> number.matches("^[6-9][0-9]{9}");
    static Predicate<String> phoneNumContains3Predicate = number -> number.contains("3");
    static boolean isPhoneNumberValid(String phone) {
        return phone.matches("^[6-9][0-9]{9}$");
    }
}
