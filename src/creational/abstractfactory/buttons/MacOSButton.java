package creational.abstractfactory.buttons;

/**
 * MacOS variant of a button.
 */
public class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("Created MacOS Button.");
    }
}
