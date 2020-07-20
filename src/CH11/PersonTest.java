package CH11;

class Person {
    private String name;
    private int age;

    // 생성자 2개, 1.기본, 2.name초기화
    public Person() {
    }

    public Person(String name) {
        this.name = name;
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
}
public class PersonTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Person();
        Class pClass1 = person.getClass();
        System.out.println(pClass1.getName());


        Class pClass2 = Person.class;
        System.out.println(pClass2.getName());


        Class pClass3 = Class.forName("CH11.Person");
        System.out.println(pClass3.getName());
    }
}
