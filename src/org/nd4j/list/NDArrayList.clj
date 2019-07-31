(ns org.nd4j.list.NDArrayList
  "An ArrayList like implementation of List
 using INDArray as the backing data structure"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.list NDArrayList]))

(defn ->nd-array-list
  "Constructor.

  Specify the underlying ndarray for this list.

  container - the underlying array. - `org.nd4j.linalg.api.ndarray.INDArray`
  size - the initial size of the array. This will set list.size()to be equal to the passed in size. - `int`"
  (^NDArrayList [^org.nd4j.linalg.api.ndarray.INDArray container ^Integer size]
    (new NDArrayList container size))
  (^NDArrayList [^Integer size]
    (new NDArrayList size))
  (^NDArrayList []
    (new NDArrayList )))

(defn add-all
  "i - `int`
  collection - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^NDArrayList this ^Integer i ^java.util.Collection collection]
    (-> this (.addAll i collection)))
  (^Boolean [^NDArrayList this ^java.util.Collection collection]
    (-> this (.addAll collection))))

(defn contains
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^NDArrayList this ^java.lang.Object o]
    (-> this (.contains o))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^NDArrayList this]
    (-> this (.toString))))

(defn list-iterator
  "i - `int`

  returns: `java.util.ListIterator<java.lang.Double>`"
  (^java.util.ListIterator [^NDArrayList this ^Integer i]
    (-> this (.listIterator i)))
  (^java.util.ListIterator [^NDArrayList this]
    (-> this (.listIterator))))

(defn iterator
  "returns: `java.util.Iterator<java.lang.Double>`"
  (^java.util.Iterator [^NDArrayList this]
    (-> this (.iterator))))

(defn sub-list
  "i - `int`
  i-1 - `int`

  returns: `java.util.List<java.lang.Double>`"
  (^java.util.List [^NDArrayList this ^Integer i ^Integer i-1]
    (-> this (.subList i i-1))))

(defn last-index-of
  "o - `java.lang.Object`

  returns: `int`"
  (^Integer [^NDArrayList this ^java.lang.Object o]
    (-> this (.lastIndexOf o))))

(defn remove
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^NDArrayList this ^java.lang.Object o]
    (-> this (.remove o))))

(defn add
  "i - `int`
  a-double - `java.lang.Double`"
  ([^NDArrayList this ^Integer i ^java.lang.Double a-double]
    (-> this (.add i a-double)))
  (^Boolean [^NDArrayList this ^java.lang.Double a-double]
    (-> this (.add a-double))))

(defn set
  "i - `int`
  a-double - `java.lang.Double`

  returns: `java.lang.Double`"
  (^java.lang.Double [^NDArrayList this ^Integer i ^java.lang.Double a-double]
    (-> this (.set i a-double))))

(defn empty?
  "returns: `boolean`"
  (^Boolean [^NDArrayList this]
    (-> this (.isEmpty))))

(defn size
  "returns: `int`"
  (^Integer [^NDArrayList this]
    (-> this (.size))))

(defn retain-all
  "collection - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^NDArrayList this ^java.util.Collection collection]
    (-> this (.retainAll collection))))

(defn clear
  ""
  ([^NDArrayList this]
    (-> this (.clear))))

(defn index-of
  "o - `java.lang.Object`

  returns: `int`"
  (^Integer [^NDArrayList this ^java.lang.Object o]
    (-> this (.indexOf o))))

(defn to-array
  "ts - `T[]`

  returns: `<T> T[]`"
  ([^NDArrayList this ts]
    (-> this (.toArray ts)))
  ([^NDArrayList this]
    (-> this (.toArray))))

(defn remove-all
  "collection - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^NDArrayList this ^java.util.Collection collection]
    (-> this (.removeAll collection))))

(defn get
  "i - `int`

  returns: `java.lang.Double`"
  (^java.lang.Double [^NDArrayList this ^Integer i]
    (-> this (.get i))))

(defn array
  "Get a view of the underlying array
  relative to the size of the actual array.
  (Sometimes there are overflows in the internals
  but you want to use the internal INDArray for computing something
  directly, this gives you the relevant subset that reflects the content of the list)

  returns: the view of the underlying ndarray relative to the collection's real size - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^NDArrayList this]
    (-> this (.array))))

(defn contains-all
  "collection - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^NDArrayList this ^java.util.Collection collection]
    (-> this (.containsAll collection))))

