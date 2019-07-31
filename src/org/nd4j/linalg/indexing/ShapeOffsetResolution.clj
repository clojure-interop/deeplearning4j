(ns org.nd4j.linalg.indexing.ShapeOffsetResolution
  "Sets up the strides, shape
 , and offsets
 for an indexing operation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.indexing ShapeOffsetResolution]))

(defn ->shape-offset-resolution
  "Constructor.

  Specify the array to use for resolution

  arr - the array to usefor resolution - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^ShapeOffsetResolution [^org.nd4j.linalg.api.ndarray.INDArray arr]
    (new ShapeOffsetResolution arr)))

(defn try-short-circuit
  "indexes - `org.nd4j.linalg.indexing.INDArrayIndex`

  returns: `boolean`"
  (^Boolean [^ShapeOffsetResolution this ^org.nd4j.linalg.indexing.INDArrayIndex indexes]
    (-> this (.tryShortCircuit indexes))))

(defn exec
  "Based on the passed in array
  compute the shape,offsets, and strides
  for the given indexes

  indexes - the indexesto compute this based on - `org.nd4j.linalg.indexing.INDArrayIndex`"
  ([^ShapeOffsetResolution this ^org.nd4j.linalg.indexing.INDArrayIndex indexes]
    (-> this (.exec indexes))))

(defn resolve-fixed-dimensions-coo
  "indexes - `org.nd4j.linalg.indexing.INDArrayIndex`"
  ([^ShapeOffsetResolution this ^org.nd4j.linalg.indexing.INDArrayIndex indexes]
    (-> this (.resolveFixedDimensionsCOO indexes))))

(defn resolve-sparse-offsets-coo
  ""
  ([^ShapeOffsetResolution this]
    (-> this (.resolveSparseOffsetsCOO))))

