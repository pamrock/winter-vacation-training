package nuc.ss.day03;

/**
 * @ClassName Vehicle
 * @Description TODO
 * @Author 12459
 * @Date 2024/1/24 16:22
 **/
public class Vehicle {

    double speed;
    String type;

    public Vehicle(){}

    public Vehicle(double speed) {
        this.speed = speed;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void move(){

    }

    public void speedUp(double s){
        this.speed += s;
    }

    public void speedDown(double s){
        this.speed -= s;
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.setSpeed(80.0);
        System.out.println("小车速度为: " + v.speed + "km/h");
        v.speedUp(12.6);
        System.out.println("小车加速后速度为: " + v.speed + "km/h");
    }

}
