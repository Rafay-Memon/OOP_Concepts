abstract class Rodent {
    public abstract void eat();
    
    public abstract void sleep();
    
    public abstract void move();
}

class Mouse extends Rodent {
    @Override
    public void eat() {
        System.out.println("Mouse is nibbling on cheese.");
    }
    
    @Override
    public void sleep() {
        System.out.println("Mouse is curled up in a nest.");
    }
    
    @Override
    public void move() {
        System.out.println("Mouse is scurrying across the floor.");
    }
}

class Gerbil extends Rodent {
    @Override
    public void eat() {
        System.out.println("Gerbil is munching on seeds.");
    }
    
    @Override
    public void sleep() {
        System.out.println("Gerbil is curled up in a burrow.");
    }
    
    @Override
    public void move() {
        System.out.println("Gerbil is digging tunnels in the sand.");
    }
}

class Hamster extends Rodent {
    @Override
    public void eat() {
        System.out.println("Hamster is gnawing on a carrot.");
    }
    
    @Override
    public void sleep() {
        System.out.println("Hamster is snuggled up in a nest of shavings.");
    }
    
    @Override
    public void move() {
        System.out.println("Hamster is running on a wheel.");
    }
}

public class Main {
    public static void main(String[] args) {
        Rodent[] rodents = new Rodent[3];
        rodents[0] = new Mouse();
        rodents[1] = new Gerbil();
        rodents[2] = new Hamster();
        
        for (Rodent rodent : rodents) {
            rodent.eat();
            rodent.sleep();
            rodent.move();
            System.out.println();
        }
    }
}