(ns org.nd4j.linalg.indexing.NewAxis
  "New axis index.
 Specified for wanting a new dimension
 in an ndarray"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.indexing NewAxis]))

(defn ->new-axis
  "Constructor."
  (^NewAxis []
    (new NewAxis )))

(defn next
  "Description copied from interface: INDArrayIndex

  returns: `long`"
  (^Long [^NewAxis this]
    (-> this (.next))))

(defn offset
  "Description copied from interface: INDArrayIndex

  returns: `long`"
  (^Long [^NewAxis this]
    (-> this (.offset))))

(defn reverse
  "Description copied from interface: INDArrayIndex"
  ([^NewAxis this]
    (-> this (.reverse))))

(defn reset
  ""
  ([^NewAxis this]
    (-> this (.reset))))

(defn current
  "Description copied from interface: INDArrayIndex

  returns: `long`"
  (^Long [^NewAxis this]
    (-> this (.current))))

(defn has-next?
  "Description copied from interface: INDArrayIndex

  returns: `boolean`"
  (^Boolean [^NewAxis this]
    (-> this (.hasNext))))

(defn length
  "Description copied from interface: INDArrayIndex

  returns: `long`"
  (^Long [^NewAxis this]
    (-> this (.length))))

(defn init
  "Description copied from interface: INDArrayIndex

  arr - the array to initialize on - `org.nd4j.linalg.api.ndarray.INDArray`
  begin - the beginning index - `long`
  dimension - the dimension to initialize on - `int`"
  ([^NewAxis this ^org.nd4j.linalg.api.ndarray.INDArray arr ^Long begin ^Integer dimension]
    (-> this (.init arr begin dimension)))
  ([^NewAxis this ^org.nd4j.linalg.api.ndarray.INDArray arr ^Integer dimension]
    (-> this (.init arr dimension))))

(defn interval?
  "Description copied from interface: INDArrayIndex

  returns: `boolean`"
  (^Boolean [^NewAxis this]
    (-> this (.isInterval))))

(defn end
  "Description copied from interface: INDArrayIndex

  returns: `long`"
  (^Long [^NewAxis this]
    (-> this (.end))))

(defn stride
  "Description copied from interface: INDArrayIndex

  returns: `long`"
  (^Long [^NewAxis this]
    (-> this (.stride))))

(defn set-interval
  "is-interval - `boolean`"
  ([^NewAxis this ^Boolean is-interval]
    (-> this (.setInterval is-interval))))

