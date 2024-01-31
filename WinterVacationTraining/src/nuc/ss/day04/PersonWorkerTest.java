package nuc.ss.day04;

/**
 * @ClassName PersonWorkerTest
 * @Description TODO
 * @Author 12459
 * @Date 2024/1/25 17:48
 **/
public class PersonWorkerTest {
    public static void main(String[] args) {
        Person person = new Person(18, "Pan");
        Worker worker = new Worker(22, "xiaoPan", 100000.01);

        System.out.println(person.toString());
        System.out.println(worker.toString());

        Person person1 = new Worker(50, "laoPan", 500000.01);
        System.out.println(person1.toString());
    }



}
