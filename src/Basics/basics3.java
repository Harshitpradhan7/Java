package Basics;

class Person {
    String name = "harry";
    int age ;

    public void speak(String name, int age) {
        System.out.println("My name is " + this.name + ". I am " + this.age + "years old.");
    }

    Person(int age) {
        System.out.println("I am a Constructor.");
        System.out.println("name: "+ this.name);
        System.out.println("age: "+ this.age);
    }
}
public class basics3 {
    public static void main(String[] args) {
        Person p1 = new Person(24);
        Person p2 = new Person(14);
        p2.name = "Jerry";
        p2.age = 25;
        System.out.println(p2.age);
    }
}

//class Male extends Person{
//    boolean gender = true;
//    boolean beard = true;
//    boolean makeup = false;
//
//    public static void traits(){
//        System.out.println("Gender: "+ this.gender);
//    }


