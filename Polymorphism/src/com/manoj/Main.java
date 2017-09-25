package com.manoj;

class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
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
        return "Car => startEngine()";
    }

    public String accelerate() {
        return "Car => accelerate()";
    }

    public String brake() {
        return "Car => brake()";
    }

}

class Mitsubushi extends Car {
    public Mitsubushi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mitsubhushi => startEngine()";
    }

    @Override
    public String accelerate() {
        return "Mitsubhushi => accelerate()";
    }

    @Override
    public String brake() {
        return "Mitsubhushi => brake()";
    }
}

class Jeep extends Car {
    public Jeep(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Jeep => startEngine()";
    }

    @Override
    public String accelerate() {
        return "Jeep => accelerate()";
    }

    @Override
    public String brake() {
        return "Jeep => brake()";
    }
}

class Porsche extends Car {
    public Porsche(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Porsche => startEngine()";
    }

    @Override
    public String accelerate() {
        return "Porsche => accelerate()";
    }

    @Override
    public String brake() {
        return "Porsche => brake()";
    }
}


public class Main {

    public static void main(String[] args) {
        Car car = new Car(8, "Car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitsubushi mitsubushi = new Mitsubushi(6, "Lancer");
        System.out.println(mitsubushi.startEngine());
        System.out.println(mitsubushi.accelerate());
        System.out.println(mitsubushi.brake());

        Jeep jeep = new Jeep(8, "Compass");
        System.out.println(jeep.startEngine());
        System.out.println(jeep.accelerate());
        System.out.println(jeep.brake());

        Porsche porsche = new Porsche(6, "Carrera GT");
        System.out.println(porsche.startEngine());
        System.out.println(porsche.accelerate());
        System.out.println(porsche.brake());

    }
}
