public class FactoryB extends Factory{
    @Override
    public Plugin getInstance() {
        return new PluginB();
    }
}
