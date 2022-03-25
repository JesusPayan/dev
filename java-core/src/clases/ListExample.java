package clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListExample {

    public static void main(String[] args) {
        List<Person> personList = new ArrayList();
        Person person ;
        int nPerson;
        String name;
        Integer age;
        String adress;
        Scanner input = new Scanner(System.in);

        System.out.print("How many Persons do you want to create: ");
        nPerson =  input.nextInt();
        for (int i = 0; i < nPerson; i++) {
            person = new Person();
            person.setId(i);
            person.setName("Person "+i);
            person.setAdress("adress"+i);
            person.setAge(10+i);
            personList.add(person);
        }
        //personList.forEach(person1 -> System.out.println("Name: " + person1.getName()+ " Age: " + person1.getAge()));
        personList.stream().forEach(person1 -> System.out.println(person1.getId()+"\n"+person1.getName()+"\n"+person1.getAge()));
    }


}
