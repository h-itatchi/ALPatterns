public class Main {

    public static void main(String[] args) {
        // Factory
        Factory factoryA = new FactoryA();
        Factory factoryB = new FactoryB();
        // Plugin
        Plugin pluginA = factoryA.getInstance();
        Plugin pluginB = factoryB.getInstance();
        // Operation
        pluginA.operation();
        pluginB.operation();

    }
}
