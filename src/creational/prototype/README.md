# Prototype Pattern

Prototype is a template of the actual object to be constructed later. In java, Prototyping means cloning or replicating an object.

- Whether deep copy or shallow copy, depends totally on the business needs.
- Useful when large number of instances of classes are required, which are all nearly same.
- This DP also supplements cases when we require exact copies of existing objects but don’t want to be dependent on their classes.

If the cost of object creation is large & creation process is resource-intensive, we use cloning.

### Issues with normal approach 

If we have to exactly copy an existing object natively, we create a new object of the same class, traverse all fields of existing object & copy values to the new object. Here, catch is that maybe some fields are private & couldn’t be accessed/copied.

### Concepts

- An interface/class implementing Cloneable having abstract clone() method declared.
- Prototype registry for holding the prominent prototypes available to us.
- Separate Prototype models which inherits the base interface & implements clone() method in them.