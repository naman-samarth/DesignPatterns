# Factory Pattern

Native approach for object creation is usage of constructors, but factory pattern provides alternative way for this.

- Used when for a superclass -> multiple sub-classes are there and based on some business logic, one of the sub-class is returned.
- This pattern takes out the responsibility of instantiation from the client program to the factory class.
- Used when the exact types and dependencies of the objects your code should work with is not known beforehand.
- Factory pattern makes our code more robust, less coupled and easy to extend

### Concepts:

- Factory class for creation of object of desired type based on the business logic.

Real-life example is a Logistic App, initially, a single transport mechanism was of land so Trucks were used & all logistics function were dependent on Truck class but later on while addition of sea & air transport, this poses problems in scaling the app.