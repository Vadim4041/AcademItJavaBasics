package Classwork7;

public class Main {
    public static void main(String[] args) {
        //Контакт1:
        Contact contact1 = new Contact("имя1", 22, "32342342");
        contact1.print();

        System.out.println(contact1.getAge());
        System.out.println(contact1.getName());
        System.out.println(contact1.getTelephoneNumber());

        System.out.println();

        contact1.setAge(40);
        contact1.setName("Имя2");
        contact1.setTelephoneNumber("78889992212");

        contact1.print();

        System.out.println(contact1.getAge());
        System.out.println(contact1.getName());
        System.out.println(contact1.getTelephoneNumber());

        //Контакт2:
        Contact contact2 = new Contact("12553", 20, "15757858");

        contact2.print();

        contact2.setAge(47);
        contact2.setName("Имя3");
        contact2.setTelephoneNumber("73889992232");

        contact2.print();
    }
}
