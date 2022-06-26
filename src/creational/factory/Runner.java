package creational.factory;

public class Runner {

    public static void main(String[] args) {
        ButtonFactory buttonFactory = new ButtonFactory();
        Button button = buttonFactory.getButton();
        button.render();
    }
}
