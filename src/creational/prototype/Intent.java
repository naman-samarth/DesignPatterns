package creational.prototype;

public class Intent implements SolrCore{
    private String name = null;

    @Override
    public Intent clone() throws CloneNotSupportedException {
        return (Intent) super.clone();
    }
}
