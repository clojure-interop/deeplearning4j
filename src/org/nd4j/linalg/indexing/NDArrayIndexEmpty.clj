(ns org.nd4j.linalg.indexing.NDArrayIndexEmpty
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.indexing NDArrayIndexEmpty]))

(defn ->nd-array-index-empty
  "Constructor."
  (^NDArrayIndexEmpty []
    (new NDArrayIndexEmpty )))

(defn next
  "Description copied from interface: INDArrayIndex

  returns: `long`"
  (^Long [^NDArrayIndexEmpty this]
    (-> this (.next))))

(defn offset
  "Description copied from interface: INDArrayIndex

  returns: `long`"
  (^Long [^NDArrayIndexEmpty this]
    (-> this (.offset))))

(defn reverse
  "Description copied from interface: INDArrayIndex"
  ([^NDArrayIndexEmpty this]
    (-> this (.reverse))))

(defn reset
  ""
  ([^NDArrayIndexEmpty this]
    (-> this (.reset))))

(defn current
  "Description copied from interface: INDArrayIndex

  returns: `long`"
  (^Long [^NDArrayIndexEmpty this]
    (-> this (.current))))

(defn has-next?
  "Description copied from interface: INDArrayIndex

  returns: `boolean`"
  (^Boolean [^NDArrayIndexEmpty this]
    (-> this (.hasNext))))

(defn length
  "Description copied from interface: INDArrayIndex

  returns: `long`"
  (^Long [^NDArrayIndexEmpty this]
    (-> this (.length))))

(defn init
  "Description copied from interface: INDArrayIndex

  arr - the array to initialize on - `org.nd4j.linalg.api.ndarray.INDArray`
  begin - the beginning index - `long`
  dimension - the dimension to initialize on - `int`"
  ([^NDArrayIndexEmpty this ^org.nd4j.linalg.api.ndarray.INDArray arr ^Long begin ^Integer dimension]
    (-> this (.init arr begin dimension)))
  ([^NDArrayIndexEmpty this ^org.nd4j.linalg.api.ndarray.INDArray arr ^Integer dimension]
    (-> this (.init arr dimension))))

(defn interval?
  "Description copied from interface: INDArrayIndex

  returns: `boolean`"
  (^Boolean [^NDArrayIndexEmpty this]
    (-> this (.isInterval))))

(defn end
  "Description copied from interface: INDArrayIndex

  returns: `long`"
  (^Long [^NDArrayIndexEmpty this]
    (-> this (.end))))

(defn stride
  "Description copied from interface: INDArrayIndex

  returns: `long`"
  (^Long [^NDArrayIndexEmpty this]
    (-> this (.stride))))

(defn set-interval
  "is-interval - `boolean`"
  ([^NDArrayIndexEmpty this ^Boolean is-interval]
    (-> this (.setInterval is-interval))))

