package clases;

public class Person {
    private Integer Id;
    private String name;
    private String lastName;
    private String adress;
    private Integer age;
public Person(){

}
    public Person(Integer id, String name, String lastName, String adress, Integer age) {
        Id = id;
        this.name = name;
        this.lastName = lastName;
        this.adress = adress;
        this.age = age;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
