package creational.abstractfactory;

import creational.abstractfactory.factories.GUIFactory;
import creational.abstractfactory.factories.MacOSFactory;
import creational.abstractfactory.factories.WindowsFactory;

public class Driver {

    private static Application configureApp() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if(osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }


    public static void main(String[] args){
        Application app = configureApp();
        app.paint();
    }
}
