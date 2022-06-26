package creational.prototype;

public class Mapping implements SolrCore{
    private String name = null;

    @Override
    public Mapping clone() throws CloneNotSupportedException {
        return (Mapping) super.clone();
    }
}
