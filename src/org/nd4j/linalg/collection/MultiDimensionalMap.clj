(ns org.nd4j.linalg.collection.MultiDimensionalMap
  "Multiple key map"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.collection MultiDimensionalMap]))

(defn ->multi-dimensional-map
  "Constructor.

  backed-map - `java.util.Map`"
  (^MultiDimensionalMap [^java.util.Map backed-map]
    (new MultiDimensionalMap backed-map)))

(defn *new-thread-safe-tree-backed-map
  "Thread safe sorted map implementation

  returns: `<K,T,V> org.nd4j.linalg.collection.MultiDimensionalMap<K,T,V>`"
  ([]
    (MultiDimensionalMap/newThreadSafeTreeBackedMap )))

(defn *new-thread-safe-hash-backed-map
  "Thread safe hash map implementation

  returns: `<K,T,V> org.nd4j.linalg.collection.MultiDimensionalMap<K,T,V>`"
  ([]
    (MultiDimensionalMap/newThreadSafeHashBackedMap )))

(defn *new-hash-backed-map
  "Thread safe hash map impl

  returns: `<K,T,V> org.nd4j.linalg.collection.MultiDimensionalMap<K,T,V>`"
  ([]
    (MultiDimensionalMap/newHashBackedMap )))

(defn *new-tree-backed-map
  "Tree map implementation

  returns: `<K,T,V> org.nd4j.linalg.collection.MultiDimensionalMap<K,T,V>`"
  ([]
    (MultiDimensionalMap/newTreeBackedMap )))

(defn values
  "Returns a Collection view of the values contained in this map.
  The collection is backed by the map, so changes to the map are
  reflected in the collection, and vice-versa. If the map is
  modified while an iteration over the collection is in progress
  (except through the iterator's own remove operation),
  the results of the iteration are undefined. The collection
  supports element removal, which removes the corresponding
  mapping from the map, via the Iterator.remove,
  Collection.remove, removeAll,
  retainAll and clear operations. It does not
  support the add or addAll operations.

  returns: a collection view of the values contained in this map - `java.util.Collection<V>`"
  (^java.util.Collection [^MultiDimensionalMap this]
    (-> this (.values))))

(defn put-all
  "Copies all of the mappings from the specified map to this map
  (optional operation). The effect of this call is equivalent to that
  of calling Map<>#put(k, v) on this map once
  for each mapping from key k to value v in the
  specified map. The behavior of this operation is undefined if the
  specified map is modified while the operation is in progress.

  m - mappings to be stored in this map - `java.util.Map`

  throws: java.lang.UnsupportedOperationException - if the putAll operationis not supported by this map"
  ([^MultiDimensionalMap this ^java.util.Map m]
    (-> this (.putAll m))))

(defn put
  "Associates the specified value with the specified key in this map
  (optional operation). If the map previously contained a mapping for
  the key, the old value is replaced by the specified value. (A map
  m is said to contain a mapping for a key k if and only
  if m.containsKey(k) would return
  true.)

  key - key with which the specified value is to be associated - `org.nd4j.linalg.primitives.Pair`
  value - value to be associated with the specified key - `V`

  returns: the previous value associated with key, or
  null if there was no mapping for key.
  (A null return can also indicate that the map
  previously associated null with key,
  if the implementation supports null values.) - `V`

  throws: java.lang.UnsupportedOperationException - if the put operationis not supported by this map"
  ([^MultiDimensionalMap this ^org.nd4j.linalg.primitives.Pair key value]
    (-> this (.put key value)))
  ([^MultiDimensionalMap this k t v]
    (-> this (.put k t v))))

(defn entry-set
  "Returns a Set view of the mappings contained in this map.
  The applyTransformToDestination is backed by the map, so changes to the map are
  reflected in the applyTransformToDestination, and vice-versa. If the map is modified
  while an iteration over the applyTransformToDestination is in progress (except through
  the iterator's own remove operation, or through the
  setValue operation on a map entry returned by the
  iterator) the results of the iteration are undefined. The applyTransformToDestination
  supports element removal, which removes the corresponding
  mapping from the map, via the Iterator.remove,
  Set.remove, removeAll, retainAll and
  clear operations. It does not support the
  add or addAll operations.

  returns: a applyTransformToDestination view of the mappings contained in this map - `java.util.Set<org.nd4j.linalg.collection.MultiDimensionalMap$Entry<K,T,V>>`"
  (^java.util.Set [^MultiDimensionalMap this]
    (-> this (.entrySet))))

(defn contains
  "k - `K`
  t - `T`

  returns: `boolean`"
  (^Boolean [^MultiDimensionalMap this k t]
    (-> this (.contains k t))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^MultiDimensionalMap this]
    (-> this (.toString))))

(defn contains-value
  "Returns true if this map maps one or more keys to the
  specified value. More formally, returns true if and only if
  this map contains at least one mapping to a value v such that
  (value==null ? v==null : value.equals(v)). This operation
  will probably require time linear in the map size for most
  implementations of the Map interface.

  value - value whose presence in this map is to be tested - `java.lang.Object`

  returns: true if this map maps one or more keys to the
  specified value - `boolean`

  throws: java.lang.ClassCastException - if the value is of an inappropriate type forthis map(optional)"
  (^Boolean [^MultiDimensionalMap this ^java.lang.Object value]
    (-> this (.containsValue value))))

(defn remove
  "Removes the mapping for a key from this map if it is present
  (optional operation). More formally, if this map contains a mapping
  from key k to value v such that
  (key==null ? k==null : key.equals(k)), that mapping
  is removed. (The map can contain at most one such mapping.)

  Returns the value to which this map previously associated the key,
  or null if the map contained no mapping for the key.

  If this map permits null values, then a return value of
  null does not necessarily indicate that the map
  contained no mapping for the key; it's also possible that the map
  explicitly mapped the key to null.

  The map will not contain a mapping for the specified key once the
  call returns.

  key - key whose mapping is to be removed from the map - `java.lang.Object`

  returns: the previous value associated with key, or
  null if there was no mapping for key. - `V`

  throws: java.lang.UnsupportedOperationException - if the remove operationis not supported by this map"
  ([^MultiDimensionalMap this ^java.lang.Object key]
    (-> this (.remove key))))

(defn key-set
  "Returns a Set view of the keys contained in this map.
  The applyTransformToDestination is backed by the map, so changes to the map are
  reflected in the applyTransformToDestination, and vice-versa. If the map is modified
  while an iteration over the applyTransformToDestination is in progress (except through
  the iterator's own remove operation), the results of
  the iteration are undefined. The applyTransformToDestination supports element removal,
  which removes the corresponding mapping from the map, via the
  Iterator.remove, Set.remove,
  removeAll, retainAll, and clear
  operations. It does not support the add or addAll
  operations.

  returns: a applyTransformToDestination view of the keys contained in this map - `java.util.Set<org.nd4j.linalg.primitives.Pair<K,T>>`"
  (^java.util.Set [^MultiDimensionalMap this]
    (-> this (.keySet))))

(defn hash-code
  "returns: `int`"
  (^Integer [^MultiDimensionalMap this]
    (-> this (.hashCode))))

(defn empty?
  "Returns true if this map contains no key-value mappings.

  returns: true if this map contains no key-value mappings - `boolean`"
  (^Boolean [^MultiDimensionalMap this]
    (-> this (.isEmpty))))

(defn size
  "Returns the number of key-value mappings in this map. If the
  map contains more than Integer.MAX_VALUE elements, returns
  Integer.MAX_VALUE.

  returns: the number of key-value mappings in this map - `int`"
  (^Integer [^MultiDimensionalMap this]
    (-> this (.size))))

(defn clear
  "Removes all of the mappings from this map (optional operation).
  The map will be empty after this call returns.

  throws: java.lang.UnsupportedOperationException - if the clear operationis not supported by this map"
  ([^MultiDimensionalMap this]
    (-> this (.clear))))

(defn contains-key
  "Returns true if this map contains a mapping for the specified
  key. More formally, returns true if and only if
  this map contains a mapping for a key k such that
  (key==null ? k==null : key.equals(k)). (There can be
  at most one such mapping.)

  key - key whose presence in this map is to be tested - `java.lang.Object`

  returns: true if this map contains a mapping for the specified
  key - `boolean`

  throws: java.lang.ClassCastException - if the key is of an inappropriate type forthis map(optional)"
  (^Boolean [^MultiDimensionalMap this ^java.lang.Object key]
    (-> this (.containsKey key))))

(defn get
  "Returns the value to which the specified key is mapped,
  or null if this map contains no mapping for the key.

  More formally, if this map contains a mapping from a key
  k to a value v such that (key==null ? k==null :
  key.equals(k)), then this method returns v; otherwise
  it returns null. (There can be at most one such mapping.)

  If this map permits null values, then a return value of
  null does not necessarily indicate that the map
  contains no mapping for the key; it's also possible that the map
  explicitly maps the key to null. The containsKey operation may be used to distinguish these two cases.

  key - the key whose associated value is to be returned - `java.lang.Object`

  returns: the value to which the specified key is mapped, or
  null if this map contains no mapping for the key - `V`

  throws: java.lang.ClassCastException - if the key is of an inappropriate type forthis map(optional)"
  ([^MultiDimensionalMap this ^java.lang.Object key]
    (-> this (.get key)))
  ([^MultiDimensionalMap this k t]
    (-> this (.get k t))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^MultiDimensionalMap this ^java.lang.Object o]
    (-> this (.equals o))))

