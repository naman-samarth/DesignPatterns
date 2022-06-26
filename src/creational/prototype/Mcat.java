package creational.prototype;

public class Mcat implements SolrCore{
    private String name = null;
    @Override
    public Mcat clone() throws CloneNotSupportedException {
        return (Mcat) super.clone();
    }
}
