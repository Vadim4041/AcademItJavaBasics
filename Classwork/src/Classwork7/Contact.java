package Classwork7;

public class Contact {
    private String name;
    private int age;
    private String telephoneNumber;

    public Contact(String name, int age, String telephoneNumber) {
        this.name = name;
        this.age = age;
        this.telephoneNumber = telephoneNumber;
    }

    public void print() {
        System.out.println("Имя: " + name + " Возраст: " + age + " Телефон: " + telephoneNumber);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }
}
