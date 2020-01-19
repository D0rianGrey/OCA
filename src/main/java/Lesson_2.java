import java.util.ArrayList;
import java.util.List;

public class Lesson_2 {

    public static void main(String[] args) {

        List<Object> list = new ArrayList<Object>();
        list.add(new A());
        list.add(new B());

        A a = new A();
        a.swim();
        B b = new B();
        b.swim();
    }


    interface Swimable {
        void swim();
    }


}


class A implements Lesson_2.Swimable {

    public void swim() {
        System.out.println("Hello from class A");
    }
}

class B implements Lesson_2.Swimable {

    public void swim() {
        System.out.println("Hello from class B");
    }
}

