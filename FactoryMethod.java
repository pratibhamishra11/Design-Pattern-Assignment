interface Product {
    void display();
}

class ConcreteProductA implements Product {
    @Override
    public void display() {
        System.out.println("This is the Product A .");
    }
}

class ConcreteProductB implements Product {
    @Override
    public void display() {
        System.out.println("This is the Product B .");
    }
}

interface Factory {
    Product factoryMethod();
}

class ConcreteFactoryA implements Factory {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductA();
    }
}

class ConcreteFactoryB implements Factory {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductB();
    }
}

public class FactoryMethod {
    public static void main(String[] args) {
        Factory factoryA = new ConcreteFactoryA();
        Product productA = factoryA.factoryMethod();
        productA.display();

        Factory factoryB = new ConcreteFactoryB();
        Product productB = factoryB.factoryMethod();
        productB.display();
    }
}
