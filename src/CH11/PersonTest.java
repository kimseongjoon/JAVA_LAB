package CH11;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Person {
    public String name;
    public int age;

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

//        Class pClass2 = Person.class;
//        System.out.println(pClass2.getName());
//
//        Class pClass3 = Class.forName("CH11.Person");
//        System.out.println(pClass3.getName());

        Constructor[] cons = pClass1.getConstructors();
        for (Constructor con : cons) {
            System.out.println(con);
        }

        System.out.println();

        Field[] fields = pClass1.getFields();
        for (Field f : fields) {
            System.out.println(f);
        }

        System.out.println();

        Method[] methods = pClass1.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
    }
}
