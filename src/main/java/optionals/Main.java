package optionals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        String email = "hsrivastav45@gmail.com";
        Optional.ofNullable(null)
                .ifPresentOrElse(emailID -> System.out.println("Sending emails to " + emailID),
                        () -> {
                            System.out.println("Cannot Send Email as Email Not Present");
                        });

//        System.out.println(value);
    }
}
