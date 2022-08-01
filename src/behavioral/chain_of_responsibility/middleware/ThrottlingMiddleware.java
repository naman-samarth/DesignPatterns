package behavioral.chain_of_responsibility.middleware;

/**
 * ConcreteHandler. Checks whether there are too many failed login requests.
 */
public class ThrottlingMiddleware extends Middleware {

    private final int requestsPerMinute;
    private int requests;
    private long currentTime;

    public ThrottlingMiddleware(int requestsPerMinute) {
        this.requestsPerMinute = requestsPerMinute;
        this.currentTime = System.currentTimeMillis();
    }

    /**
     * checkNext() call can be inserted both in the begging of this method and
     * in the end.
     * This gives much more flexibility than a simple loop over all middleware
     * objects. For instance, an element of a chain can change the order of
     * checks by running its check after all other checks.
     */
    @Override
    public boolean check(String email, String password) {
        if (System.currentTimeMillis() > currentTime + 60_000) {
            requests = 0;
            currentTime = System.currentTimeMillis();
        }
        requests++;

        if (requests > requestsPerMinute) {
            System.out.println("Request limit exceeded!");
            Thread.currentThread().interrupt();
        }
        return checkNext(email, password);
    }
}
