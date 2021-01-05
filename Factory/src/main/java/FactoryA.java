public class FactoryA extends Factory{
    @Override
    public Plugin getInstance() {
        return new PluginA();
    }
}
