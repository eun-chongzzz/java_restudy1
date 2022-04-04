package day6;

interface Predator {
}

class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Tiger extends Animal implements Predator {
}

class Lion extends Animal implements Predator {
}

class ZooKeeper {
    void feed(Predator predator) { 
        System.out.println("feed apple");
    }

    void feed(Lion lion) { 
        System.out.println("feed banana");
    }
}

public class Interface {
    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        zooKeeper.feed(tiger);  
        zooKeeper.feed(lion);  
    }
}