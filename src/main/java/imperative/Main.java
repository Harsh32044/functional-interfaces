package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("Harsh", Gender.MALE),
                new Person("Jenny", Gender.FEMALE),
                new Person("Janet", Gender.FEMALE),
                new Person("Kyle", Gender.MALE),
                new Person("Alexa", Gender.FEMALE),
                new Person("Keith", Gender.MALE)
        );

        System.out.println("======== Imperative Approach ==========");

        List<Person> females = new ArrayList<>();

        for (Person person : people) {
            if (person.gender.equals(Gender.FEMALE)) {
                females.add(person);
            }
        }

        females.forEach(System.out::println);

        System.out.println("======= Declarative approach =========");

        Predicate<Person> personPredicate = person -> person.gender.equals(Gender.FEMALE);
        Predicate<Integer> checkForEven = number -> number % 2 == 0;
        System.out.println(checkForEven.test(10));
        List<Person> femalesUsingStreams = people.stream().filter(personPredicate).toList();
        femalesUsingStreams.forEach(System.out::println);

        System.out.println("======= Declarative approach without creating a separate list =========");
        //Also, if you just want to print the females and not store it somewhere,
        people.stream().filter(person -> person.gender.equals(Gender.FEMALE)).forEach(System.out::println);
    }

    static class Person {
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE,
        FEMALE
    }


}
