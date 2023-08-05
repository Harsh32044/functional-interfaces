package functionalInterface;

import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getDBConnectionURL());

        System.out.println(dbConnSupplier.get());

    }

    static Supplier<String> dbConnSupplier = () -> "jdbc://localhost:8080 via Supplier";

    static String getDBConnectionURL() {
        return "jdbc://localhost:8080";
    }
}
