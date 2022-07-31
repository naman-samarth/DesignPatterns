package creational.abstractfactory.checkboxes;

/**
 * Windows variant of a checkbox.
 */
public class WindowsCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("Created a Windows Checkbox");
    }
}
