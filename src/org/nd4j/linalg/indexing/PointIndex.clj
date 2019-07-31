(ns org.nd4j.linalg.indexing.PointIndex
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.indexing PointIndex]))

(defn ->point-index
  "Constructor.

  point - `long`"
  (^PointIndex [^Long point]
    (new PointIndex point)))

(defn next
  "Description copied from interface: INDArrayIndex

  returns: `long`"
  (^Long [^PointIndex this]
    (-> this (.next))))

(defn offset
  "Description copied from interface: INDArrayIndex

  returns: `long`"
  (^Long [^PointIndex this]
    (-> this (.offset))))

(defn reverse
  "Description copied from interface: INDArrayIndex"
  ([^PointIndex this]
    (-> this (.reverse))))

(defn reset
  ""
  ([^PointIndex this]
    (-> this (.reset))))

(defn current
  "Description copied from interface: INDArrayIndex

  returns: `long`"
  (^Long [^PointIndex this]
    (-> this (.current))))

(defn has-next?
  "Description copied from interface: INDArrayIndex

  returns: `boolean`"
  (^Boolean [^PointIndex this]
    (-> this (.hasNext))))

(defn length
  "Description copied from interface: INDArrayIndex

  returns: `long`"
  (^Long [^PointIndex this]
    (-> this (.length))))

(defn init
  "Description copied from interface: INDArrayIndex

  arr - the array to initialize on - `org.nd4j.linalg.api.ndarray.INDArray`
  begin - the beginning index - `long`
  dimension - the dimension to initialize on - `int`"
  ([^PointIndex this ^org.nd4j.linalg.api.ndarray.INDArray arr ^Long begin ^Integer dimension]
    (-> this (.init arr begin dimension)))
  ([^PointIndex this ^org.nd4j.linalg.api.ndarray.INDArray arr ^Integer dimension]
    (-> this (.init arr dimension))))

(defn interval?
  "Description copied from interface: INDArrayIndex

  returns: `boolean`"
  (^Boolean [^PointIndex this]
    (-> this (.isInterval))))

(defn hash-code
  "returns: `int`"
  (^Integer [^PointIndex this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^PointIndex this ^java.lang.Object o]
    (-> this (.equals o))))

(defn end
  "Description copied from interface: INDArrayIndex

  returns: `long`"
  (^Long [^PointIndex this]
    (-> this (.end))))

(defn stride
  "Description copied from interface: INDArrayIndex

  returns: `long`"
  (^Long [^PointIndex this]
    (-> this (.stride))))

(defn set-interval
  "is-interval - `boolean`"
  ([^PointIndex this ^Boolean is-interval]
    (-> this (.setInterval is-interval))))

