package exam1;
public class Car {
    
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void putOnGas() {
        System.out.println(name + "に給油します");
    }

    
    public void run() {
        System.out.println("ブーン!車が走ります");
    }
}
