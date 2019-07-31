(ns org.nd4j.list.matrix.MatrixBaseNDArrayList
  "An ArrayList like implementation of List
 using INDArray as the backing data structure.
 Creates an internal container of ndarray lists with a matrix shape."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.list.matrix MatrixBaseNDArrayList]))

(defn ->matrix-base-nd-array-list
  "Constructor."
  (^MatrixBaseNDArrayList []
    (new MatrixBaseNDArrayList )))

(defn add-all
  "i - `int`
  collection - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^MatrixBaseNDArrayList this ^Integer i ^java.util.Collection collection]
    (-> this (.addAll i collection)))
  (^Boolean [^MatrixBaseNDArrayList this ^java.util.Collection collection]
    (-> this (.addAll collection))))

(defn get-entry
  "Get entry i,j in the matrix

  i - the row - `int`
  j - the column - `int`

  returns: the entry at i,j if it exists - `java.lang.Number`"
  (^java.lang.Number [^MatrixBaseNDArrayList this ^Integer i ^Integer j]
    (-> this (.getEntry i j))))

(defn contains
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^MatrixBaseNDArrayList this ^java.lang.Object o]
    (-> this (.contains o))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^MatrixBaseNDArrayList this]
    (-> this (.toString))))

(defn list-iterator
  "i - `int`

  returns: `java.util.ListIterator<X>`"
  (^java.util.ListIterator [^MatrixBaseNDArrayList this ^Integer i]
    (-> this (.listIterator i)))
  (^java.util.ListIterator [^MatrixBaseNDArrayList this]
    (-> this (.listIterator))))

(defn iterator
  "returns: `java.util.Iterator<X>`"
  (^java.util.Iterator [^MatrixBaseNDArrayList this]
    (-> this (.iterator))))

(defn last-index-of
  "o - `java.lang.Object`

  returns: `int`"
  (^Integer [^MatrixBaseNDArrayList this ^java.lang.Object o]
    (-> this (.lastIndexOf o))))

(defn remove
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^MatrixBaseNDArrayList this ^java.lang.Object o]
    (-> this (.remove o))))

(defn add
  "i - `int`
  a-x - `X`"
  ([^MatrixBaseNDArrayList this ^Integer i a-x]
    (-> this (.add i a-x)))
  (^Boolean [^MatrixBaseNDArrayList this a-x]
    (-> this (.add a-x))))

(defn set
  "i - `int`
  a-x - `X`

  returns: `X`"
  ([^MatrixBaseNDArrayList this ^Integer i a-x]
    (-> this (.set i a-x))))

(defn empty?
  "returns: `boolean`"
  (^Boolean [^MatrixBaseNDArrayList this]
    (-> this (.isEmpty))))

(defn size
  "returns: `int`"
  (^Integer [^MatrixBaseNDArrayList this]
    (-> this (.size))))

(defn retain-all
  "collection - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^MatrixBaseNDArrayList this ^java.util.Collection collection]
    (-> this (.retainAll collection))))

(defn clear
  ""
  ([^MatrixBaseNDArrayList this]
    (-> this (.clear))))

(defn index-of
  "o - `java.lang.Object`

  returns: `int`"
  (^Integer [^MatrixBaseNDArrayList this ^java.lang.Object o]
    (-> this (.indexOf o))))

(defn to-array
  "ts - `T[]`

  returns: `<T> T[]`"
  ([^MatrixBaseNDArrayList this ts]
    (-> this (.toArray ts)))
  ([^MatrixBaseNDArrayList this]
    (-> this (.toArray))))

(defn remove-all
  "collection - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^MatrixBaseNDArrayList this ^java.util.Collection collection]
    (-> this (.removeAll collection))))

(defn get
  "i - `int`

  returns: `X`"
  ([^MatrixBaseNDArrayList this ^Integer i]
    (-> this (.get i))))

(defn array
  "Get a view of the underlying array
  relative to the size of the actual array.
  (Sometimes there are overflows in the internals
  but you want to use the internal INDArray for computing something
  directly, this gives you the relevant subset that reflects the content of the list)

  returns: the view of the underlying ndarray relative to the collection's real size - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^MatrixBaseNDArrayList this]
    (-> this (.array))))

(defn contains-all
  "collection - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^MatrixBaseNDArrayList this ^java.util.Collection collection]
    (-> this (.containsAll collection))))

