(ns org.nd4j.list.BaseNDArrayList
  "An ArrayList like implementation of List
 using INDArray as the backing data structure"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.list BaseNDArrayList]))

(defn ->base-nd-array-list
  "Constructor.

  Specify the underlying ndarray for this list.

  container - the underlying array. - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^BaseNDArrayList [^org.nd4j.linalg.api.ndarray.INDArray container]
    (new BaseNDArrayList container))
  (^BaseNDArrayList []
    (new BaseNDArrayList )))

(defn add-all
  "i - `int`
  collection - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^BaseNDArrayList this ^Integer i ^java.util.Collection collection]
    (-> this (.addAll i collection)))
  (^Boolean [^BaseNDArrayList this ^java.util.Collection collection]
    (-> this (.addAll collection))))

(defn contains
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^BaseNDArrayList this ^java.lang.Object o]
    (-> this (.contains o))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BaseNDArrayList this]
    (-> this (.toString))))

(defn list-iterator
  "i - `int`

  returns: `java.util.ListIterator<X>`"
  (^java.util.ListIterator [^BaseNDArrayList this ^Integer i]
    (-> this (.listIterator i)))
  (^java.util.ListIterator [^BaseNDArrayList this]
    (-> this (.listIterator))))

(defn iterator
  "returns: `java.util.Iterator<X>`"
  (^java.util.Iterator [^BaseNDArrayList this]
    (-> this (.iterator))))

(defn last-index-of
  "o - `java.lang.Object`

  returns: `int`"
  (^Integer [^BaseNDArrayList this ^java.lang.Object o]
    (-> this (.lastIndexOf o))))

(defn remove
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^BaseNDArrayList this ^java.lang.Object o]
    (-> this (.remove o))))

(defn add
  "i - `int`
  a-x - `X`"
  ([^BaseNDArrayList this ^Integer i a-x]
    (-> this (.add i a-x)))
  (^Boolean [^BaseNDArrayList this a-x]
    (-> this (.add a-x))))

(defn set
  "i - `int`
  a-x - `X`

  returns: `X`"
  ([^BaseNDArrayList this ^Integer i a-x]
    (-> this (.set i a-x))))

(defn empty?
  "returns: `boolean`"
  (^Boolean [^BaseNDArrayList this]
    (-> this (.isEmpty))))

(defn size
  "returns: `int`"
  (^Integer [^BaseNDArrayList this]
    (-> this (.size))))

(defn retain-all
  "collection - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^BaseNDArrayList this ^java.util.Collection collection]
    (-> this (.retainAll collection))))

(defn clear
  ""
  ([^BaseNDArrayList this]
    (-> this (.clear))))

(defn index-of
  "o - `java.lang.Object`

  returns: `int`"
  (^Integer [^BaseNDArrayList this ^java.lang.Object o]
    (-> this (.indexOf o))))

(defn to-array
  "ts - `T[]`

  returns: `<T> T[]`"
  ([^BaseNDArrayList this ts]
    (-> this (.toArray ts)))
  ([^BaseNDArrayList this]
    (-> this (.toArray))))

(defn remove-all
  "collection - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^BaseNDArrayList this ^java.util.Collection collection]
    (-> this (.removeAll collection))))

(defn get
  "i - `int`

  returns: `X`"
  ([^BaseNDArrayList this ^Integer i]
    (-> this (.get i))))

(defn array
  "Get a view of the underlying array
  relative to the size of the actual array.
  (Sometimes there are overflows in the internals
  but you want to use the internal INDArray for computing something
  directly, this gives you the relevant subset that reflects the content of the list)

  returns: the view of the underlying ndarray relative to the collection's real size - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArrayList this]
    (-> this (.array))))

(defn allocate-with-size
  "Allocates the container and this list with
  the given size

  size - the size to allocate with - `int`"
  ([^BaseNDArrayList this ^Integer size]
    (-> this (.allocateWithSize size))))

(defn contains-all
  "collection - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^BaseNDArrayList this ^java.util.Collection collection]
    (-> this (.containsAll collection))))

