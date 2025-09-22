package java_program;

class petAnimal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class cow extends petAnimal {
    @Override
    void sound() {
        System.out.println("cow mooo");
    }
}

class Cat extends petAnimal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class overriding {
    public static void main(String[] args) {
        petAnimal a;   

        a = new cow();
        a.sound();   

        a = new Cat();
        a.sound();   
    }
}
