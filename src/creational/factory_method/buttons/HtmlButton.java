package creational.factory_method.buttons;

/**
 * HTML button implementation.
 */
public class HtmlButton implements Button{

    @Override
    public void render() {
        System.out.println("HTML button rendered");
    }

    @Override
    public void onClick() {
        System.out.println("HTML button clicked!");
    }
}
