package org.example;

import java.util.*;
import java.util.stream.Collectors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            integers.add(random.nextInt(10,1000));
        }
        List<Integer> integerList = integers.stream().filter(n -> n>500).toList();
        long a = integers.stream().filter(n-> n % 2 != 0).count();
        System.out.println(a);


        List<String> strings = new ArrayList<>();

        List<Character> chars = new ArrayList<>();
        for (char j = 'a'; j <= 'z'; j++) {
            chars.add(j);
        }

        for (int i = 0; i < 5; i++) {
            List<Character> characters = new ArrayList<>();
            for (int j = 0; j < 5; j++) {
                int randomIndex = random.nextInt(chars.size());
                characters.add(chars.get(randomIndex));
            }
            String text = characters.stream().map(String::valueOf).collect(Collectors.joining());
            strings.add(text);
        }

        List<String> stringList = new ArrayList<>();

        for (int i = 0; i < strings.size(); i++) {
            char [] chars1 = strings.get(i).toCharArray();
            List<Character> characters = new ArrayList<>();
            for (int j = chars1.length-2; j >=0 ; j--) {
                characters.add(chars1[j]);
            }
            String s = strings.get(i) + characters.stream().map(String :: valueOf).collect(Collectors.joining());
            stringList.add(s);
        }



        System.out.println(strings);
        System.out.println(stringList);

        List<Employee>employees = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Employee employee = new Employee(UUID.randomUUID(), random.nextInt(10,60),
                    new Telephone(random.nextLong(996500000000L,996700000000L), i % 2 != 0? PhoneType.mobile:PhoneType.stationary ));
            employees.add(employee);
        }
        Employee employee = employees.stream()
                .filter(n -> n.getTelephone().getPhoneType() == PhoneType.stationary)
                .max(Comparator.comparingInt(Employee::getAge))
                .orElse(null);


        System.out.println(employees);
        System.out.println(employee);

    }
}