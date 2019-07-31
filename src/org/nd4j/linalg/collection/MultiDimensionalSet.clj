(ns org.nd4j.linalg.collection.MultiDimensionalSet
  "Created by agibsonccc on 4/29/14."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.collection MultiDimensionalSet]))

(defn ->multi-dimensional-set
  "Constructor.

  backed-set - `java.util.Set`"
  (^MultiDimensionalSet [^java.util.Set backed-set]
    (new MultiDimensionalSet backed-set)))

(defn *hash-set
  "returns: `<K,V> org.nd4j.linalg.collection.MultiDimensionalSet<K,V>`"
  ([]
    (MultiDimensionalSet/hashSet )))

(defn *tree-set
  "returns: `<K,V> org.nd4j.linalg.collection.MultiDimensionalSet<K,V>`"
  ([]
    (MultiDimensionalSet/treeSet )))

(defn *concurrent-skip-list-set
  "returns: `<K,V> org.nd4j.linalg.collection.MultiDimensionalSet<K,V>`"
  ([]
    (MultiDimensionalSet/concurrentSkipListSet )))

(defn add-all
  "Adds all of the elements in the specified collection to this applyTransformToDestination if
  they're not already present (optional operation). If the specified
  collection is also a applyTransformToDestination, the addAll operation effectively
  modifies this applyTransformToDestination so that its value is the union of the two
  sets. The behavior of this operation is undefined if the specified
  collection is modified while the operation is in progress.

  c - collection containing elements to be added to this applyTransformToDestination - `java.util.Collection`

  returns: true if this applyTransformToDestination changed as a result of the call - `boolean`

  throws: java.lang.UnsupportedOperationException - if the addAll operationis not supported by this applyTransformToDestination"
  (^Boolean [^MultiDimensionalSet this ^java.util.Collection c]
    (-> this (.addAll c))))

(defn contains
  "Returns true if this applyTransformToDestination contains the specified element.
  More formally, returns true if and only if this applyTransformToDestination
  contains an element e such that
  (o==null ? e==null : o.equals(e)).

  o - element whose presence in this applyTransformToDestination is to be tested - `java.lang.Object`

  returns: true if this applyTransformToDestination contains the specified element - `boolean`

  throws: java.lang.ClassCastException - if the type of the specified elementis incompatible with this applyTransformToDestination(optional)"
  (^Boolean [^MultiDimensionalSet this ^java.lang.Object o]
    (-> this (.contains o)))
  (^Boolean [^MultiDimensionalSet this k v]
    (-> this (.contains k v))))

(defn iterator
  "Returns an iterator over the elements in this applyTransformToDestination. The elements are
  returned in no particular order (unless this applyTransformToDestination is an instance of some
  class that provides a guarantee).

  returns: an iterator over the elements in this applyTransformToDestination - `java.util.Iterator<org.nd4j.linalg.primitives.Pair<K,V>>`"
  (^java.util.Iterator [^MultiDimensionalSet this]
    (-> this (.iterator))))

(defn remove
  "Removes the specified element from this applyTransformToDestination if it is present
  (optional operation). More formally, removes an element e
  such that
  (o==null ? e==null : o.equals(e)), if
  this applyTransformToDestination contains such an element. Returns true if this applyTransformToDestination
  contained the element (or equivalently, if this applyTransformToDestination changed as a
  result of the call). (This applyTransformToDestination will not contain the element once the
  call returns.)

  o - object to be removed from this applyTransformToDestination, if present - `java.lang.Object`

  returns: true if this applyTransformToDestination contained the specified element - `boolean`

  throws: java.lang.ClassCastException - if the type of the specified elementis incompatible with this applyTransformToDestination(optional)"
  (^Boolean [^MultiDimensionalSet this ^java.lang.Object o]
    (-> this (.remove o))))

(defn add
  "Adds the specified element to this applyTransformToDestination if it is not already present
  (optional operation). More formally, adds the specified element
  e to this applyTransformToDestination if the applyTransformToDestination contains no element e2
  such that
  (e==null ? e2==null : e.equals(e2)).
  If this applyTransformToDestination already contains the element, the call leaves the applyTransformToDestination
  unchanged and returns false. In combination with the
  restriction on constructors, this ensures that sets never contain
  duplicate elements.

  The stipulation above does not imply that sets must accept all
  elements; sets may refuse to add any particular element, including
  null, and throw an exception, as described in the
  specification for Collection.add.
  Individual applyTransformToDestination implementations should clearly document any
  restrictions on the elements that they may contain.

  kv-pair - element to be added to this applyTransformToDestination - `org.nd4j.linalg.primitives.Pair`

  returns: true if this applyTransformToDestination did not already contain the specified
  element - `boolean`

  throws: java.lang.UnsupportedOperationException - if the add operationis not supported by this applyTransformToDestination"
  (^Boolean [^MultiDimensionalSet this ^org.nd4j.linalg.primitives.Pair kv-pair]
    (-> this (.add kv-pair)))
  ([^MultiDimensionalSet this k v]
    (-> this (.add k v))))

(defn empty?
  "Returns true if this applyTransformToDestination contains no elements.

  returns: true if this applyTransformToDestination contains no elements - `boolean`"
  (^Boolean [^MultiDimensionalSet this]
    (-> this (.isEmpty))))

(defn size
  "Returns the number of elements in this applyTransformToDestination (its cardinality). If this
  applyTransformToDestination contains more than Integer.MAX_VALUE elements, returns
  Integer.MAX_VALUE.

  returns: the number of elements in this applyTransformToDestination (its cardinality) - `int`"
  (^Integer [^MultiDimensionalSet this]
    (-> this (.size))))

(defn retain-all
  "Retains only the elements in this applyTransformToDestination that are contained in the
  specified collection (optional operation). In other words, removes
  from this applyTransformToDestination all of its elements that are not contained in the
  specified collection. If the specified collection is also a applyTransformToDestination, this
  operation effectively modifies this applyTransformToDestination so that its value is the
  intersection of the two sets.

  c - collection containing elements to be retained in this applyTransformToDestination - `java.util.Collection`

  returns: true if this applyTransformToDestination changed as a result of the call - `boolean`

  throws: java.lang.UnsupportedOperationException - if the retainAll operationis not supported by this applyTransformToDestination"
  (^Boolean [^MultiDimensionalSet this ^java.util.Collection c]
    (-> this (.retainAll c))))

(defn clear
  "Removes all of the elements from this applyTransformToDestination (optional operation).
  The applyTransformToDestination will be empty after this call returns.

  throws: java.lang.UnsupportedOperationException - if the clear methodis not supported by this applyTransformToDestination"
  ([^MultiDimensionalSet this]
    (-> this (.clear))))

(defn to-array
  "Returns an array containing all of the elements in this applyTransformToDestination; the
  runtime type of the returned array is that of the specified array.
  If the applyTransformToDestination fits in the specified array, it is returned therein.
  Otherwise, a new array is allocated with the runtime type of the
  specified array and the size of this applyTransformToDestination.

  If this applyTransformToDestination fits in the specified array with room to spare
  (i.e., the array has more elements than this applyTransformToDestination), the element in
  the array immediately following the end of the applyTransformToDestination is applyTransformToDestination to
  null. (This is useful in determining the length of this
  applyTransformToDestination only if the caller knows that this applyTransformToDestination does not contain
  any null elements.)

  If this applyTransformToDestination makes any guarantees as to what order its elements
  are returned by its iterator, this method must return the elements
  in the same order.

  Like the toArray() method, this method acts as bridge between
  array-based and collection-based APIs. Further, this method allows
  precise control over the runtime type of the output array, and may,
  under certain circumstances, be used to save allocation costs.

  Suppose x is a applyTransformToDestination known to contain only strings.
  The following code can be used to dump the applyTransformToDestination into a newly allocated
  array of String:



       String[] y = x.toArray(new String[0]);
  Note that toArray(new Object[0]) is identical in function to
  toArray().

  a - the array into which the elements of this applyTransformToDestination are to bestored, if it is big enough; otherwise, a new array of the sameruntime type is allocated for this purpose. - `T[]`

  returns: an array containing all the elements in this applyTransformToDestination - `<T> T[]`

  throws: java.lang.ArrayStoreException - if the runtime type of the specified arrayis not a supertype of the runtime type of every element in thisapplyTransformToDestination"
  ([^MultiDimensionalSet this a]
    (-> this (.toArray a)))
  ([^MultiDimensionalSet this]
    (-> this (.toArray))))

(defn remove-all
  "Removes from this applyTransformToDestination all of its elements that are contained in the
  specified collection (optional operation). If the specified
  collection is also a applyTransformToDestination, this operation effectively modifies this
  applyTransformToDestination so that its value is the asymmetric applyTransformToDestination difference of
  the two sets.

  c - collection containing elements to be removed from this applyTransformToDestination - `java.util.Collection`

  returns: true if this applyTransformToDestination changed as a result of the call - `boolean`

  throws: java.lang.UnsupportedOperationException - if the removeAll operationis not supported by this applyTransformToDestination"
  (^Boolean [^MultiDimensionalSet this ^java.util.Collection c]
    (-> this (.removeAll c))))

(defn contains-all
  "Returns true if this applyTransformToDestination contains all of the elements of the
  specified collection. If the specified collection is also a applyTransformToDestination, this
  method returns true if it is a subset of this applyTransformToDestination.

  c - collection to be checked for containment in this applyTransformToDestination - `java.util.Collection`

  returns: true if this applyTransformToDestination contains all of the elements of the
  specified collection - `boolean`

  throws: java.lang.ClassCastException - if the types of one or more elementsin the specified collection are incompatible with thisapplyTransformToDestination(optional)"
  (^Boolean [^MultiDimensionalSet this ^java.util.Collection c]
    (-> this (.containsAll c))))

