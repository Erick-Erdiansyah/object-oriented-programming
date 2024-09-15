class car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return "Car -> startEngine()";
    }

    public String accelerate() {
        return "Car -> accelerate()";
    }

    public String brake() {
        return "Car -> brake()";
    }

}

class Mitsubishi extends car{
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine(){
        return "Mitsubishi -> startEngine()";
    }

    @Override
    public String accelerate(){
        return "Mitsubishi -> accelerate()";
    }

    @Override
    public String brake(){
        return "Mitsubishi -> brake()";
    }
}

class Ford extends car{
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine(){
        return "Ford -> startEngine()";
    }

    @Override
    public String accelerate(){
        return "Ford -> accelerate()";
    }

    @Override
    public String brake(){
        return "Ford -> brake()";
    }

}

public class percobaan_3 {
    public static void main(String[] args) {
        car car = new car(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRW 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Ford ford = new Ford(6, "Ford Falcon");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());
    }
}
