import java.util.ArrayList;

public class Composite extends Component {

    protected ArrayList<Component> children = new java.util.ArrayList();

    public Composite(String name) {
        super(name);
    }

    @Override
    void Operation() {
        String tab = "";
        for (int i = 0; i < level; i++) {
            tab += "  ";
        }
        tab+="|--";
        System.out.println(tab + "Composite : (" + name + ")");

        children.forEach(c->{
            c.Operation();
        });
    }

    public void Add(Component component) {
        component.level = this.level + 1;
        children.add(component);
    }

    public void AddAll(Component ... components) {
        for(Component c:components){
            Add(c);
        }
    }

    public void Remove(Component component) {
        children.remove(component);
    }

    public Component GetChild(int index) {
        return children.get(index);
    }
}
