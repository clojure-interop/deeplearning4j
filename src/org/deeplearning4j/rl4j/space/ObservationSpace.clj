(ns org.deeplearning4j.rl4j.space.ObservationSpace
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.rl4j.space ObservationSpace]))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^ObservationSpace this]
    (-> this (.getName))))

(defn get-shape
  "returns: `int[]`"
  ([^ObservationSpace this]
    (-> this (.getShape))))

(defn get-low
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^ObservationSpace this]
    (-> this (.getLow))))

(defn get-high
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^ObservationSpace this]
    (-> this (.getHigh))))

