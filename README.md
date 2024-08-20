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