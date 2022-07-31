package creational.abstractfactory.checkboxes;

/**
 * MacOS variant of a checkbox.
 */
public class MacOSCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Created a MacOS Checkbox");
    }
}
