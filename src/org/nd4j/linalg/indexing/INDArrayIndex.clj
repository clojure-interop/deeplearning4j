(ns org.nd4j.linalg.indexing.INDArrayIndex
  "An index in to a particular dimension.
 This handles traversing indexes along a dimension
 such as particular rows, or intervals."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.indexing INDArrayIndex]))

(defn next
  "Returns the next index

  returns: `long`"
  (^Long [^INDArrayIndex this]
    (-> this (.next))))

(defn offset
  "The start of this index

  returns: `long`"
  (^Long [^INDArrayIndex this]
    (-> this (.offset))))

(defn reverse
  "Reverse the indexes"
  ([^INDArrayIndex this]
    (-> this (.reverse))))

(defn reset
  ""
  ([^INDArrayIndex this]
    (-> this (.reset))))

(defn current
  "Return the current index
  without incrementing the counter

  returns: `long`"
  (^Long [^INDArrayIndex this]
    (-> this (.current))))

(defn has-next?
  "Returns true if there is another element
  in the index to iterate over
  otherwise false

  returns: `boolean`"
  (^Boolean [^INDArrayIndex this]
    (-> this (.hasNext))))

(defn length
  "The total length of this index (end - start)

  returns: `long`"
  (^Long [^INDArrayIndex this]
    (-> this (.length))))

(defn init
  "Init the index wrt
  the dimension and the given nd array

  arr - the array to initialize on - `org.nd4j.linalg.api.ndarray.INDArray`
  begin - the beginning index - `long`
  dimension - the dimension to initialize on - `int`"
  ([^INDArrayIndex this ^org.nd4j.linalg.api.ndarray.INDArray arr ^Long begin ^Integer dimension]
    (-> this (.init arr begin dimension)))
  ([^INDArrayIndex this ^org.nd4j.linalg.api.ndarray.INDArray arr ^Integer dimension]
    (-> this (.init arr dimension))))

(defn interval?
  "Returns true
  if the index is an interval

  returns: `boolean`"
  (^Boolean [^INDArrayIndex this]
    (-> this (.isInterval))))

(defn end
  "The ending for this index

  returns: `long`"
  (^Long [^INDArrayIndex this]
    (-> this (.end))))

(defn stride
  "The stride for the index (most of the time will be 1)

  returns: `long`"
  (^Long [^INDArrayIndex this]
    (-> this (.stride))))

(defn set-interval
  "is-interval - `boolean`"
  ([^INDArrayIndex this ^Boolean is-interval]
    (-> this (.setInterval is-interval))))

