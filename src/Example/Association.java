package Example;
//关联关系 样例
//一般用成员变量实现
public class Association {
    //成员变量实现 关联
    Car2 mycar = new Car2();
    public void drive(){
        mycar.run();
    }
    //实用方法参数实现
    public void drive(Car2 car){
        car.run();
    }

    public static void main(String... args ){
        Association as = new Association();
        as.drive();
        Car2 car2 = new Car2();
        as.drive(car2);
    }
}

class Car2{
    public  void run(){
        System.out.println("Car.run()");
    }
}
