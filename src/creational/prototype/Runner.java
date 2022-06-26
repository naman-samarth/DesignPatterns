package creational.prototype;

public class Runner {
    public static void main(String[] args) {
        try {
            String mappingCore1 = CoreDirectory.getInstance(CoreDirectory.CoreName.MAPPING).toString();
            String intentCore1 = CoreDirectory.getInstance(CoreDirectory.CoreName.INTENT).toString();
            String mappingCore2 = CoreDirectory.getInstance(CoreDirectory.CoreName.MAPPING).toString();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
