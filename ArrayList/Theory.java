//todo ------------ ARRAY LIST-----------------

//^ Array list
//! Array list is a predifined class present in java.util package
//! introduced from jdk 1.2
//! All the 4 implemenation of the list interface is followed by array list as well.
//! The initial capacity of array list is 10
//! the incremental capacity of array list is (cc*3/2)+1;
//! The undefined data structure of array list is resizable array or growable array
//! Array list implements the follwing interface
//& clonable
//& List
//& Randomaccess
//& serializable

//^ constructors present in the array list
//! Arraylist()
//! ArrayList(int initialCapacity)
//! ArrayList(Collections c)

//^ Internal working of the array list
//! When we create an object of array list, internally an array gets created based on the default initial capacity.
//! when we add an object into the array list, and if it full , then new array gets created based on the incremental capacity
//! And all the old objects from the array get copied into the newly created array.
//! The reference variable pointing towards the old array gets deferenced and points to the newly created array.