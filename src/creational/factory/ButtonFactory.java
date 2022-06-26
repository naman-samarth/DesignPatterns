package creational.factory;

public class ButtonFactory {

    public Button getButton() {
        if (System.getProperty("usage.property").equals("browser"))
            return new HtmlButton();
        else
            return new WindowsButton();
    }
}
