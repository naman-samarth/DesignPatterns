package creational.builder;

public class Mobile {
    private String RAM;
    private String Size;
    private String Camera;
    boolean is4GEnabled;

    // GETTERS for private members

    private Mobile(MobileBuilder builder) {
        this.RAM = builder.RAM;
        this.Size = builder.Size;
        this.Camera = builder.Camera;
        this.is4GEnabled = builder.is4GEnabled;
    }

    public static class MobileBuilder {
        private String RAM;
        private String Size;
        private String Camera;
        boolean is4GEnabled;

        public MobileBuilder(String RAM, String size) {
            this.RAM = RAM;
            this.Size = size;
        }

        public MobileBuilder setCamera(String Camera) {
            this.Camera = Camera;
            return this;
        }

        public MobileBuilder setIs4GEnabled(boolean is4GEnabled) {
            this.is4GEnabled = is4GEnabled;
            return this;
        }

        public Mobile build() {
            return new Mobile(this);
        }
    }
}
