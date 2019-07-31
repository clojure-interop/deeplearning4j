(ns org.deeplearning4j.malmo.MalmoObservationSpacePixels
  "Observation space that contains a bitmap of Minecraft pixels"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.malmo MalmoObservationSpacePixels]))

(defn ->malmo-observation-space-pixels
  "Constructor.

  Construct observation space from a bitmap size. Assumes 3 color channels.

  x-size - total x size of bitmap - `int`
  y-size - total y size of bitmap - `int`"
  (^MalmoObservationSpacePixels [^Integer x-size ^Integer y-size]
    (new MalmoObservationSpacePixels x-size y-size)))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^MalmoObservationSpacePixels this]
    (-> this (.getName))))

(defn get-shape
  "returns: `int[]`"
  ([^MalmoObservationSpacePixels this]
    (-> this (.getShape))))

(defn get-low
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^MalmoObservationSpacePixels this]
    (-> this (.getLow))))

(defn get-high
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^MalmoObservationSpacePixels this]
    (-> this (.getHigh))))

(defn get-observation
  "world-state - `com.microsoft.msr.malmo.WorldState`

  returns: `org.deeplearning4j.malmo.MalmoBox`"
  (^org.deeplearning4j.malmo.MalmoBox [^MalmoObservationSpacePixels this ^com.microsoft.msr.malmo.WorldState world-state]
    (-> this (.getObservation world-state))))

