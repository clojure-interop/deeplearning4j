(ns org.nd4j.storage.CompressedRamStorage
  "AbstractStorage implementation, with Integer as key.
 Primary goal is storage of individual rows/slices in system ram, even if working in GPU environment
 This implementation IS thread-safe, so it can be easily used together with ParallelWrapper"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.storage CompressedRamStorage]))

(defn store
  "Store object into storage

  key - `T`
  object - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^CompressedRamStorage this key ^org.nd4j.linalg.api.ndarray.INDArray object]
    (-> this (.store key object))))

(defn store-if-absent
  "Store object into storage, if it doesn't exist

  key - `T`
  object - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: Returns TRUE if store operation was applied, FALSE otherwise - `boolean`"
  (^Boolean [^CompressedRamStorage this key ^org.nd4j.linalg.api.ndarray.INDArray object]
    (-> this (.storeIfAbsent key object))))

(defn get
  "Get object from the storage, by key

  key - `T`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^CompressedRamStorage this key]
    (-> this (.get key))))

(defn contains-key
  "This method checks, if storage contains specified key

  key - `T`

  returns: `boolean`"
  (^Boolean [^CompressedRamStorage this key]
    (-> this (.containsKey key))))

(defn clear
  "This method purges everything from storage"
  ([^CompressedRamStorage this]
    (-> this (.clear))))

(defn drop
  "This method removes value by specified key

  key - `T`"
  ([^CompressedRamStorage this key]
    (-> this (.drop key))))

(defn size
  "This method returns number of entries available in storage

  returns: `long`"
  (^Long [^CompressedRamStorage this]
    (-> this (.size))))

