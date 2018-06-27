package Example;

public class Dependency {
    //形参发生依赖
    public void dirve(Car car){
        car.run();
    }
    //局部变量发生依赖
    public void drive2(){
        Car car = new Car();
        car.run();
    }
    //静态变量发生依赖
    public void drive3(){
        Car.run();
    }

    public static void main(String... args){
        Dependency dependency = new Dependency();
        dependency.drive2();
        dependency.drive3();
        Car car = new Car();
        dependency.dirve(car);
    }
}

class Car{
    public static void run(){
        System.out.println("Car.run() ");
    }
}