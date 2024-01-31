package nuc.ss.day04;

/**
 * @ClassName Worker
 * @Description TODO
 * @Author 12459
 * @Date 2024/1/25 17:44
 **/
public class Worker extends Person {

    Double salary;

    public Worker(int age, String name, Double salary) {
        super(age, name);
        this.salary = salary;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "salary=" + salary +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
