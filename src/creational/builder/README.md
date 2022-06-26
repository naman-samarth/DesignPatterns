# Builder Pattern
This pattern helps in constructing complex objects in a step-by-step manner & the final step returns the object.

- Objects are having lot many attributes & having separate constructors for invoking these attributes for object creation is really cumbersome.
- StringBuilder & StringBuffer in java uses Builder DP.

### Concepts

- Builder class is a static nested class inside the main object class.
- Builder class must have a public parameterized constructor with all mandatory data members.
- Builder class should have setters for all optional data members & should return Builder object.
- build() method is required which returns the final object to the runner.