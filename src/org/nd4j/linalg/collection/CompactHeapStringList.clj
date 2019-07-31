(ns org.nd4j.linalg.collection.CompactHeapStringList
  "A List<String> that stores all contents in a single char[], to avoid the GC load for a large number of String
 objects.

 Some restrictions to be aware of with the current implementation:
 - The list is intended to be write-once (append only), except for clear() operations. That is: new Strings can be added
 at the end, but they cannot be replaced or removed.
 - There is a limit of a maximum of Integer.MAX_VALUE/2 = 1073741823 Strings
 - There is a limit of the maximum total characters of Integer.MAX_VALUE (i.e., 2147483647 chars). This corresponds
 to a maximum of approximately 4GB of Strings."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.collection CompactHeapStringList]))

(defn ->compact-heap-string-list
  "Constructor.

  reallocation-block-size-bytes - Number of bytes by which to increase the char[], when allocating a new storage array - `int`
  int-reallocation-block-size-bytes - Number of bytes by which to increase the int[], when allocating a new storage array - `int`"
  (^CompactHeapStringList [^Integer reallocation-block-size-bytes ^Integer int-reallocation-block-size-bytes]
    (new CompactHeapStringList reallocation-block-size-bytes int-reallocation-block-size-bytes))
  (^CompactHeapStringList []
    (new CompactHeapStringList )))

(def *-default-reallocation-block-size-bytes
  "Static Constant.

  type: int"
  CompactHeapStringList/DEFAULT_REALLOCATION_BLOCK_SIZE_BYTES)

(def *-default-integer-reallocation-block-size-bytes
  "Static Constant.

  type: int"
  CompactHeapStringList/DEFAULT_INTEGER_REALLOCATION_BLOCK_SIZE_BYTES)

(defn add-all
  "index - `int`
  c - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^CompactHeapStringList this ^Integer index ^java.util.Collection c]
    (-> this (.addAll index c)))
  (^Boolean [^CompactHeapStringList this ^java.util.Collection c]
    (-> this (.addAll c))))

(defn contains
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^CompactHeapStringList this ^java.lang.Object o]
    (-> this (.contains o))))

(defn list-iterator
  "index - `int`

  returns: `java.util.ListIterator<java.lang.String>`"
  (^java.util.ListIterator [^CompactHeapStringList this ^Integer index]
    (-> this (.listIterator index)))
  (^java.util.ListIterator [^CompactHeapStringList this]
    (-> this (.listIterator))))

(defn iterator
  "returns: `java.util.Iterator<java.lang.String>`"
  (^java.util.Iterator [^CompactHeapStringList this]
    (-> this (.iterator))))

(defn sub-list
  "from-index - `int`
  to-index - `int`

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^CompactHeapStringList this ^Integer from-index ^Integer to-index]
    (-> this (.subList from-index to-index))))

(defn last-index-of
  "o - `java.lang.Object`

  returns: `int`"
  (^Integer [^CompactHeapStringList this ^java.lang.Object o]
    (-> this (.lastIndexOf o))))

(defn remove
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^CompactHeapStringList this ^java.lang.Object o]
    (-> this (.remove o))))

(defn add
  "index - `int`
  element - `java.lang.String`"
  ([^CompactHeapStringList this ^Integer index ^java.lang.String element]
    (-> this (.add index element)))
  (^Boolean [^CompactHeapStringList this ^java.lang.String s]
    (-> this (.add s))))

(defn set
  "index - `int`
  element - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^CompactHeapStringList this ^Integer index ^java.lang.String element]
    (-> this (.set index element))))

(defn empty?
  "returns: `boolean`"
  (^Boolean [^CompactHeapStringList this]
    (-> this (.isEmpty))))

(defn size
  "returns: `int`"
  (^Integer [^CompactHeapStringList this]
    (-> this (.size))))

(defn retain-all
  "c - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^CompactHeapStringList this ^java.util.Collection c]
    (-> this (.retainAll c))))

(defn clear
  ""
  ([^CompactHeapStringList this]
    (-> this (.clear))))

(defn index-of
  "o - `java.lang.Object`

  returns: `int`"
  (^Integer [^CompactHeapStringList this ^java.lang.Object o]
    (-> this (.indexOf o))))

(defn to-array
  "a - `T[]`

  returns: `<T> T[]`"
  ([^CompactHeapStringList this a]
    (-> this (.toArray a)))
  ([^CompactHeapStringList this]
    (-> this (.toArray))))

(defn remove-all
  "c - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^CompactHeapStringList this ^java.util.Collection c]
    (-> this (.removeAll c))))

(defn get
  "index - `int`

  returns: `java.lang.String`"
  (^java.lang.String [^CompactHeapStringList this ^Integer index]
    (-> this (.get index))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^CompactHeapStringList this ^java.lang.Object o]
    (-> this (.equals o))))

(defn contains-all
  "c - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^CompactHeapStringList this ^java.util.Collection c]
    (-> this (.containsAll c))))

