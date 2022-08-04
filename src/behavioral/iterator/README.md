# Iterator

Lets you traverse elements of a collection without exposing its underlying representation (list, stack, tree, etc.).

### Applicability

- When your collection has a complex data structure under the hood, but you want to hide its complexity from clients (
  either for convenience or security reasons).
- To reduce duplication of traversal code across your app.
- When you want your code to be able to traverse different data structures or when types of these structures are unknown
  to you beforehand.