package creational.factory_method.factory;

import creational.factory_method.buttons.Button;

/**
 * Base factory class.
 */
public abstract class Dialog {

    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}
