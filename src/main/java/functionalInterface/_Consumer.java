package functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        Customer harsh = new Customer("Harsh", "8808683321");
        Customer maverick = new Customer("Maverick", "8800343923");
        greetCustomer(harsh);

        //Consumer
        greetCustomerConsumer.accept(harsh);
        greetCustomerConsumerV2.accept(maverick, true);
    }

    static Consumer<Customer> greetCustomerConsumer = customer -> System.out.println("Hello " + customer.customerName + ", thanks for registering with " +
            "phone number, now via Consumer Interface: "+customer.customerPhone);

    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = (customer, isNumberHidden) -> System.out.println("Hello " + customer.customerName + ", thanks for registering with " +
            "phone number, now via Consumer Interface: "+ (isNumberHidden ? "**********" : customer.customerPhone));

    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.customerName + ", thanks for registering with phone number: "+customer.customerPhone);
    }

    static class Customer {
        private final String customerName;
        private final String customerPhone;


        public Customer(String customerName, String customerPhone) {
            this.customerName = customerName;
            this.customerPhone = customerPhone;
        }
    }
}
