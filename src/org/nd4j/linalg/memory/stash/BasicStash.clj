(ns org.nd4j.linalg.memory.stash.BasicStash
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.memory.stash BasicStash]))

(defn check-if-exists
  "key - `T`

  returns: `boolean`"
  (^Boolean [^BasicStash this key]
    (-> this (.checkIfExists key))))

(defn put
  "key - `T`
  object - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^BasicStash this key ^org.nd4j.linalg.api.ndarray.INDArray object]
    (-> this (.put key object))))

(defn get
  "key - `T`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BasicStash this key]
    (-> this (.get key))))

(defn purge
  ""
  ([^BasicStash this]
    (-> this (.purge))))

