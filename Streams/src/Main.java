import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> someBingoNumbers = Arrays.asList(
                "N40", "N36",
                "B40", "B12", "B6",
                "G53", "G49", "G60", "G50", "g64",
                "I26", "I17", "I29",
                "O71"
        );

//        List<String> gnumbers = new ArrayList<>();
//        someBingoNumbers.forEach(number -> {
//            if (number.toUpperCase().startsWith("G")) {
//                gnumbers.add(number);
//            }
//        });
//        gnumbers.sort((String s1, String s2) -> s1.compareTo(s2));
//        gnumbers.forEach((String s) -> System.out.println(s));

        someBingoNumbers.stream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("G"))
                .sorted()
                .forEach(System.out::println);

        Stream<String> ioNumberStream = Stream.of("I26", "I17", "I29", "O71");
        Stream<String> inNumberStream = Stream.of("N40", "N36", "I26", "I17", "I29", "O71");
        Stream<String> concatStream = Stream.concat(ioNumberStream, inNumberStream);
        System.out.println("-------------------------------");
        System.out.println(concatStream.distinct().peek(System.out::println).count());

        Employee john = new Employee("John Doe", 30);
        Employee jane = new Employee("Jane Deer", 25);
        Employee jack = new Employee("Jack Hill", 40);
        Employee snow = new Employee("Snow White", 22);

        Department hr = new Department("Human Resources");
        hr.addEmployee(jane);
        hr.addEmployee(jack);
        hr.addEmployee(snow);

        Department accounting = new Department("Accounting");
        accounting.addEmployee(john);

        List<Department> departments = new ArrayList<>();
        departments.add(hr);
        departments.add(accounting);

        departments.stream().flatMap(department -> department.getEmployees().stream())
                .forEach(System.out::println);
    }
}
