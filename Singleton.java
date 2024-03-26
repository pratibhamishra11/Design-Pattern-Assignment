class Singleton {
    private static Singleton instance;

    private Singleton() {
        System.out.println("Singleton is Instantiated.");
    }

    public static Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }

    public static void AMethod() {
        System.out.println("This is a method .");
    }
}

class SingletonExample {
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        Singleton.getInstance().AMethod();
    }
}
