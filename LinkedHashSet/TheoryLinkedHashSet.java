// todo : ----------LINKED HASHSET----------------

//^ linked hash set is a predefined class present in java.util package
//^ it is introduced from jdk 1.2.
//^ Both the linkedHashSet and HashSet are similar the main differance is hashSet does not maintain the insertion order , where the LinkedHashSet maintains the insertion order.
//? Internally equals() and HashCode() methods is overriden in all the implementation classes of set interface(HashSet, LinkedHashSet, TreeSet). Threfore set does not allow dublication.

//^ Key features
//! Linked hash set maintains the insertion order
//! does not allow dublicate elements
//! it allows only one null value
//! Performance is slightly slower than HashSet because it need to maintain the linked list.
//! It is not thread safe : not syncronized.

//^ Methods in LinkedHashSet
//! add()
//! remove()
//! contains()
//! clear()
//! size()