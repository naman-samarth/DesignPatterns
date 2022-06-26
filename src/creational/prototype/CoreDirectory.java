package creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class CoreDirectory {
    public static final class CoreName {
        public static final String INTENT = "intent";
        public static final String MCAT = "mcat";
        public static final String MAPPING = "mapping";
    }

    private static final Map<String, SolrCore> cores = new HashMap<>();

    static {
        cores.put(CoreName.INTENT, new Intent());
        cores.put(CoreName.MCAT, new Mcat());
        cores.put(CoreName.MAPPING, new Mapping());
    }

    public static SolrCore getInstance(final String s) throws CloneNotSupportedException {
        return cores.get(s).clone();
    }
}
