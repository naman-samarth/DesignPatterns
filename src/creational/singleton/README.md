# Singleton Pattern

This pattern puts restrictions on the instantiation of classes & ensures that only 1 instance of the class is available in the JVM at any point of time.

- Used for logging, thread pools, driver objects and caching.
- Used in core java classes like java.lang.RunTime etc.

### Concepts:

- Private constructor for restricting the object creation from outside class.
- The only single instance of the class is a private static variable.
- Public static method for exposing this only single instance to the outside world.