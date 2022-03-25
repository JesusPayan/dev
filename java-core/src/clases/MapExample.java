package clases;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<Integer,String> personMap = new HashMap<>();
        for (int i = 0; i < 30 ; i++) {
            Person person = new Person();
            person.setId((int) (Math.random()*10+1));
            person.setName("Person");
            personMap.put(person.getId(), person.getName());
        }
        System.out.println(personMap.isEmpty());
    }

}
