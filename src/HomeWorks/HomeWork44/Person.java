package HomeWorks.HomeWork44;

public class Person{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int compareTo(Person person){
        return this.age - person.age;
    }

   
}


