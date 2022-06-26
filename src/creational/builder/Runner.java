package creational.builder;

public class Runner {
    public static void main(String[] args) {
        Mobile mobile1 = new Mobile.MobileBuilder("4 GB", "6 inch")
                .setCamera("12px")
                .setIs4GEnabled(true)
                .build();

        Mobile mobile2 = new Mobile.MobileBuilder("2 GB", "4.2 inch")
                .setIs4GEnabled(false)
                .build();
    }
}
