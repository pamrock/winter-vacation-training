package nuc.ss.day08;

/**
 * @ClassName GetClassTest
 * @Description TODO
 * @Author 12459
 * @Date 2024/1/31 11:37
 **/
public class GetClassTest {

    public static void main(String[] args) throws ClassNotFoundException {
        Class personClass = Person.class;
        System.out.println(personClass);

        Person p = new Person();
        Class personClass2 = p.getClass();
        System.out.println(personClass2);
        System.out.println(personClass == personClass2);

        Class c3= Class.forName("nuc.ss.day08.Person");
        System.out.println(c3);
        System.out.println(personClass == c3);
    }
}
