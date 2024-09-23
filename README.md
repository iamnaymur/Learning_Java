## This is the java documentation created for my own.

### Array and ArrayList :

* Size is not fixed ,
* Resizable,
* array.size() to know the length of the arrayList.
* Arraylist is a container that holds a collection of object, and in Java everything is an object. i.e : String,
  integer .
* Typically, you want your ArrayList to hold a specific type of object (e.g., only String objects). This is where
  generics come in.
  When you write ArrayList<String>, you’re telling Java that this ArrayList should only hold String objects.
  Even though you specify a type, under the hood, ArrayList is still working with Object. The difference is that
  Java
  knows what kind of Object it should expect, so it can enforce type safety and prevent you from accidentally adding
  the
  wrong type of object.

```java
ArrayList<String> arr = new ArrayList<>(); // arr can only hold String objects

ArrayList arr = new ArrayList(); //In this statement, no type is specified within the angle brackets (<>). This means the ArrayList can hold objects of any type (it becomes a raw type), but this practice is discouraged because it can lead to issues with type safety.
```

### Stack and Heap

- **Heap Memory**: Stores objects and instance variables. Managed by the garbage collector. Larger and globally
  accessible. Slower than stack memory.

- **Stack Memory**: Stores method calls, local variables, and references to heap objects. Automatically managed (LIFO).
  Smaller, faster, and method-specific.

### Varargs

**VarArgs in JAVA is the same as the REST PARAMETERS in Javascript.**

Varargs in Java allows you to pass a variable number of arguments to a method. It is defined
using `dataType... parameterName`, and the arguments are treated as an array within the method. This enables flexibility
in method calls without overloading.

### Example:

```java
static void showValues(int... numbers) {
    // Process numbers as an array
}
```

**Key Point**: Varargs must be of the same type and can simplify method calls.

### Iteration VS Recursion
### Iteration:
- **Definition**: A process where a loop repeatedly executes a block of code until a condition is met.
- **Memory**: Uses less memory since it doesn't create new function calls.
- **Efficiency**: Generally faster and more efficient for simple tasks.
- **Example**: Using a `for` loop to calculate a sum.

### Recursion:
- **Definition**: A process where a function calls itself to solve smaller subproblems.
- **Memory**: Uses more memory due to multiple function calls stacked on top of each other.
- **Complexity**: Can be cleaner and easier to understand for complex problems (like tree traversals).
- **Example**: Calculating a factorial by calling the function repeatedly.

