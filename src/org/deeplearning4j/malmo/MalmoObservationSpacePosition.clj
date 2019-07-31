(ns org.deeplearning4j.malmo.MalmoObservationSpacePosition
  "Basic observation space that contains just the X,Y,Z location triplet, plus Yaw and Pitch"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.malmo MalmoObservationSpacePosition]))

(defn ->malmo-observation-space-position
  "Constructor."
  (^MalmoObservationSpacePosition []
    (new MalmoObservationSpacePosition )))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^MalmoObservationSpacePosition this]
    (-> this (.getName))))

(defn get-shape
  "returns: `int[]`"
  ([^MalmoObservationSpacePosition this]
    (-> this (.getShape))))

(defn get-low
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^MalmoObservationSpacePosition this]
    (-> this (.getLow))))

(defn get-high
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^MalmoObservationSpacePosition this]
    (-> this (.getHigh))))

(defn get-observation
  "world-state - `com.microsoft.msr.malmo.WorldState`

  returns: `org.deeplearning4j.malmo.MalmoBox`"
  (^org.deeplearning4j.malmo.MalmoBox [^MalmoObservationSpacePosition this ^com.microsoft.msr.malmo.WorldState world-state]
    (-> this (.getObservation world-state))))

