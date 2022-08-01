# Bridge Pattern
Lets you split a large class or a set of closely related classes into two separate hierarchies—abstraction and implementation—which can be developed independently of each other.

### Applicability
- when you want to divide and organize a monolithic class that has several variants of some functionality (for example, if the class can work with various database servers).
- when you need to extend a class in several orthogonal (independent) dimensions.
- if you need to be able to switch implementations at runtime.
