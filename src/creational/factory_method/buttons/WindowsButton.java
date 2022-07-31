package creational.factory_method.buttons;

/**
 * Windows button implementation
 */
public class WindowsButton implements Button{
    @Override
    public void render() {
        System.out.println("Windows Button rendered");
    }

    @Override
    public void onClick() {
        System.out.println("Windows Button clicked!");
    }
}
