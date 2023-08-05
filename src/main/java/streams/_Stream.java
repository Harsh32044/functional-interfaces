package streams;

import imperative.Main;

import java.util.HashSet;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class _Stream {
    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("Jones", Gender.MALE),
//                new Person("Jenny", Gender.FEMALE),
//                new Person("Janet", Gender.FEMALE),
                new Person("Kyle", Gender.MALE),
//                new Person("Alexa", Gender.FEMALE),
                new Person("Keith", Gender.MALE)
        );


        people.stream()
                .map(person -> person.name)
                .mapToInt(String::length)
                .forEach(System.out::println);

        System.out.println(people.stream()
                .anyMatch(person -> person.gender.equals(Gender.FEMALE)));

        System.out.println(people.stream()
                .noneMatch(person -> person.gender.equals(Gender.FEMALE)));


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
