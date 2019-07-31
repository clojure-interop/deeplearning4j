(ns org.nd4j.linalg.indexing.SpecifiedIndex
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.indexing SpecifiedIndex]))

(defn ->specified-index
  "Constructor.

  indexes - `int`"
  (^SpecifiedIndex [^Integer indexes]
    (new SpecifiedIndex indexes)))

(defn *iterate
  "Iterate over a cross product of the
  coordinates

  indexes - the coordinates to iterate over.Each element of the array should be of opType SpecifiedIndexotherwise it will end up throwing an exception - `org.nd4j.linalg.indexing.INDArrayIndex`

  returns: the generator for iterating over all the combinations of the specified indexes. - `net.ericaro.neoitertools.Generator<java.util.List<java.util.List<java.lang.Long>>>`"
  (^net.ericaro.neoitertools.Generator [^org.nd4j.linalg.indexing.INDArrayIndex indexes]
    (SpecifiedIndex/iterate indexes)))

(defn *iterate-over-sparse
  "Iterate over a cross product of the
  coordinates

  indexes - the coordinates to iterate over.Each element of the array should be of opType SpecifiedIndexotherwise it will end up throwing an exception - `org.nd4j.linalg.indexing.INDArrayIndex`

  returns: the generator for iterating over all the combinations of the specified indexes. - `net.ericaro.neoitertools.Generator<java.util.List<java.util.List<java.lang.Long>>>`"
  (^net.ericaro.neoitertools.Generator [^org.nd4j.linalg.indexing.INDArrayIndex indexes]
    (SpecifiedIndex/iterateOverSparse indexes)))

(defn next
  "Description copied from interface: INDArrayIndex

  returns: `long`"
  (^Long [^SpecifiedIndex this]
    (-> this (.next))))

(defn offset
  "Description copied from interface: INDArrayIndex

  returns: `long`"
  (^Long [^SpecifiedIndex this]
    (-> this (.offset))))

(defn reverse
  "Description copied from interface: INDArrayIndex"
  ([^SpecifiedIndex this]
    (-> this (.reverse))))

(defn reset
  ""
  ([^SpecifiedIndex this]
    (-> this (.reset))))

(defn current
  "Description copied from interface: INDArrayIndex

  returns: `long`"
  (^Long [^SpecifiedIndex this]
    (-> this (.current))))

(defn has-next?
  "Description copied from interface: INDArrayIndex

  returns: `boolean`"
  (^Boolean [^SpecifiedIndex this]
    (-> this (.hasNext))))

(defn length
  "Description copied from interface: INDArrayIndex

  returns: `long`"
  (^Long [^SpecifiedIndex this]
    (-> this (.length))))

(defn sparse-generator
  "returns: `net.ericaro.neoitertools.Generator<java.util.List<java.lang.Long>>`"
  (^net.ericaro.neoitertools.Generator [^SpecifiedIndex this]
    (-> this (.sparseGenerator))))

(defn init
  "Description copied from interface: INDArrayIndex

  arr - the array to initialize on - `org.nd4j.linalg.api.ndarray.INDArray`
  begin - the beginning index - `long`
  dimension - the dimension to initialize on - `int`"
  ([^SpecifiedIndex this ^org.nd4j.linalg.api.ndarray.INDArray arr ^Long begin ^Integer dimension]
    (-> this (.init arr begin dimension)))
  ([^SpecifiedIndex this ^org.nd4j.linalg.api.ndarray.INDArray arr ^Integer dimension]
    (-> this (.init arr dimension))))

(defn interval?
  "Description copied from interface: INDArrayIndex

  returns: `boolean`"
  (^Boolean [^SpecifiedIndex this]
    (-> this (.isInterval))))

(defn generator
  "returns: `net.ericaro.neoitertools.Generator<java.util.List<java.lang.Long>>`"
  (^net.ericaro.neoitertools.Generator [^SpecifiedIndex this]
    (-> this (.generator))))

(defn next-sparse
  "Return the next index with its position in the indexes array

  returns: `long[]`"
  ([^SpecifiedIndex this]
    (-> this (.nextSparse))))

(defn end
  "Description copied from interface: INDArrayIndex

  returns: `long`"
  (^Long [^SpecifiedIndex this]
    (-> this (.end))))

(defn stride
  "Description copied from interface: INDArrayIndex

  returns: `long`"
  (^Long [^SpecifiedIndex this]
    (-> this (.stride))))

(defn set-interval
  "is-interval - `boolean`"
  ([^SpecifiedIndex this ^Boolean is-interval]
    (-> this (.setInterval is-interval))))

