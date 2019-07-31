(ns org.nd4j.linalg.memory.stash.Stash
  "This interface describe short-living storage, with pre-defined life time."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.memory.stash Stash]))

(defn check-if-exists
  "key - `T`

  returns: `boolean`"
  (^Boolean [^Stash this key]
    (-> this (.checkIfExists key))))

(defn put
  "key - `T`
  object - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^Stash this key ^org.nd4j.linalg.api.ndarray.INDArray object]
    (-> this (.put key object))))

(defn get
  "key - `T`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^Stash this key]
    (-> this (.get key))))

(defn purge
  ""
  ([^Stash this]
    (-> this (.purge))))

