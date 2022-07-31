package creational.factory_method.factory;

import creational.factory_method.buttons.Button;
import creational.factory_method.buttons.HtmlButton;

/**
 * HTML dialog will produce HTML buttons.
 */
public class HtmlDialog extends Dialog{
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
