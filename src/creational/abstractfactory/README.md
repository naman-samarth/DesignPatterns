# Abstract Factory Pattern

This is another layer of abstraction over the Factory pattern.

- AbstractFactory returns the Factory of classes, each of these factory will return one of the sub-classes.
- This is basically Factory pattern applied over the Factory pattern implementation.

Real life example is: Honda builds SportsCar & LuxuryCar for 2 locations: USA & India. Based on location, Cars specification varies for all 2 subclasses of car like steering wheel side. Here AbstractFactory comes to our rescue.