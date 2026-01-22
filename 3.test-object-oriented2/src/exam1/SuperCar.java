package exam1;
public class SuperCar extends Car{


    @Override
    public void run() {
        System.out.println(name + "が高速で走ります！");
    }
}
