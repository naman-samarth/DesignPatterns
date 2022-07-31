package creational.abstractfactory.buttons;

/**
 * Windows variant of a button.
 */
public class WindowsButton implements Button{

    @Override
    public void paint() {
        System.out.println("Created Windows Button");
    }
}
