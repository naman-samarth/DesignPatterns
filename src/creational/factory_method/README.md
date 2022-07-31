# Factory Pattern

Provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.

### Applicability

- when you don't know beforehand the exact types and dependencies of the objects your code should work with.
- when you want to provide users of your library or framework with a away to extend its internal components.
- when you want to save system resources by reusing existing objects instead of rebuilding them each time.