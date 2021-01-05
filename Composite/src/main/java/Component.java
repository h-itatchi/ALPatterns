import java.util.ArrayList;

public abstract class Component {

    protected String name;
    protected int level;

    public Component(String name) {
        this.name = name;
    }

    abstract void Operation();
}
