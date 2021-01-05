public class Main {

    public static void main(String[] args) {
        Composite root = new Composite("root");
        Composite composite1 = new Composite("composite-1");
        Composite composite2 = new Composite("composite-2");
        Composite composite3 = new Composite("composite-3");
        root.AddAll(composite1,composite2);
        composite2.Add(composite3);
        composite1.Add(new Element("element-1"));
        composite1.Add(new Element("element-2"));
        composite1.Add(new Element("element-3"));
        composite2.Add(new Element("element-4"));
        composite2.Add(new Element("element-5"));
        composite3.Add(new Element("element-6"));
        composite3.Add(new Element("element-7"));
        root.Add(new Element("element-8"));
        root.Add(new Element("element-9"));
        root.Operation();
    }
}
