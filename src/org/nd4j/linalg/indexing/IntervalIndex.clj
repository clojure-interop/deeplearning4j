(ns org.nd4j.linalg.indexing.IntervalIndex
  "And indexing representing
 an interval"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.indexing IntervalIndex]))

(defn ->interval-index
  "Constructor.

  inclusive - whether to include the last number - `boolean`
  stride - the stride for the interval - `long`"
  (^IntervalIndex [^Boolean inclusive ^Long stride]
    (new IntervalIndex inclusive stride)))

(defn next
  "Description copied from interface: INDArrayIndex

  returns: `long`"
  (^Long [^IntervalIndex this]
    (-> this (.next))))

(defn offset
  "Description copied from interface: INDArrayIndex

  returns: `long`"
  (^Long [^IntervalIndex this]
    (-> this (.offset))))

(defn reverse
  "Description copied from interface: INDArrayIndex"
  ([^IntervalIndex this]
    (-> this (.reverse))))

(defn reset
  ""
  ([^IntervalIndex this]
    (-> this (.reset))))

(defn current
  "Description copied from interface: INDArrayIndex

  returns: `long`"
  (^Long [^IntervalIndex this]
    (-> this (.current))))

(defn has-next?
  "Description copied from interface: INDArrayIndex

  returns: `boolean`"
  (^Boolean [^IntervalIndex this]
    (-> this (.hasNext))))

(defn length
  "Description copied from interface: INDArrayIndex

  returns: `long`"
  (^Long [^IntervalIndex this]
    (-> this (.length))))

(defn init
  "Description copied from interface: INDArrayIndex

  arr - the array to initialize on - `org.nd4j.linalg.api.ndarray.INDArray`
  begin - the beginning index - `long`
  dimension - the dimension to initialize on - `int`"
  ([^IntervalIndex this ^org.nd4j.linalg.api.ndarray.INDArray arr ^Long begin ^Integer dimension]
    (-> this (.init arr begin dimension)))
  ([^IntervalIndex this ^org.nd4j.linalg.api.ndarray.INDArray arr ^Integer dimension]
    (-> this (.init arr dimension))))

(defn interval?
  "Description copied from interface: INDArrayIndex

  returns: `boolean`"
  (^Boolean [^IntervalIndex this]
    (-> this (.isInterval))))

(defn hash-code
  "returns: `int`"
  (^Integer [^IntervalIndex this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^IntervalIndex this ^java.lang.Object o]
    (-> this (.equals o))))

(defn end
  "Description copied from interface: INDArrayIndex

  returns: `long`"
  (^Long [^IntervalIndex this]
    (-> this (.end))))

(defn stride
  "Description copied from interface: INDArrayIndex

  returns: `long`"
  (^Long [^IntervalIndex this]
    (-> this (.stride))))

(defn set-interval
  "is-interval - `boolean`"
  ([^IntervalIndex this ^Boolean is-interval]
    (-> this (.setInterval is-interval))))

