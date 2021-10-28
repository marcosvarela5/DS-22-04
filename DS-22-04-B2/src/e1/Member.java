package e1;

public class Member implements Reward {
    public String name;
    public String surname;
    public int age;
    public int horrocrux;

    Member(String name, String surname, int age, int horrocrux){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.horrocrux = horrocrux;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
