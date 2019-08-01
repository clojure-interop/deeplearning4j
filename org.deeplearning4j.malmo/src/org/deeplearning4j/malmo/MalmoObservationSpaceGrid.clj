(ns org.deeplearning4j.malmo.MalmoObservationSpaceGrid
  "Observation space that contains a grid of Minecraft blocks"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.malmo MalmoObservationSpaceGrid]))

(defn ->malmo-observation-space-grid
  "Constructor.

  Construct observation space from a array of blocks policy should distinguish between.

  name - Name given to Grid element in mission specification - `java.lang.String`
  x-size - total x size of grid - `int`
  y-size - total y size of grid - `int`
  z-size - total z size of grid - `int`
  blocks - Array of block names to distinguish between. Supports combination of individual strings and/or arrays of strings to map multiple block types to a single observation value. If not specified, it will dynamically map block names to integers - however, because these will be mapped as they are seen, different missions may have different mappings! - `java.lang.Object`"
  (^MalmoObservationSpaceGrid [^java.lang.String name ^Integer x-size ^Integer y-size ^Integer z-size ^java.lang.Object blocks]
    (new MalmoObservationSpaceGrid name x-size y-size z-size blocks)))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^MalmoObservationSpaceGrid this]
    (-> this (.getName))))

(defn get-shape
  "returns: `int[]`"
  ([^MalmoObservationSpaceGrid this]
    (-> this (.getShape))))

(defn get-low
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^MalmoObservationSpaceGrid this]
    (-> this (.getLow))))

(defn get-high
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^MalmoObservationSpaceGrid this]
    (-> this (.getHigh))))

(defn get-observation
  "world-state - `com.microsoft.msr.malmo.WorldState`

  returns: `org.deeplearning4j.malmo.MalmoBox`"
  (^org.deeplearning4j.malmo.MalmoBox [^MalmoObservationSpaceGrid this ^com.microsoft.msr.malmo.WorldState world-state]
    (-> this (.getObservation world-state))))

