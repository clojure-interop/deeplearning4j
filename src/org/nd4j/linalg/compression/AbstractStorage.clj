(ns org.nd4j.linalg.compression.AbstractStorage
  "This interface describes basic Key-Value storage, where Key is any object, and Value is INDArray located \"somewhere else\""
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.compression AbstractStorage]))

(defn store
  "Store object into storage

  key - `T`
  object - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^AbstractStorage this key ^org.nd4j.linalg.api.ndarray.INDArray object]
    (-> this (.store key object))))

(defn store-if-absent
  "Store object into storage, if it doesn't exist

  key - `T`
  object - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `boolean`"
  (^Boolean [^AbstractStorage this key ^org.nd4j.linalg.api.ndarray.INDArray object]
    (-> this (.storeIfAbsent key object))))

(defn get
  "Get object from the storage, by key

  key - `T`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^AbstractStorage this key]
    (-> this (.get key))))

(defn contains-key
  "This method checks, if storage contains specified key

  key - `T`

  returns: `boolean`"
  (^Boolean [^AbstractStorage this key]
    (-> this (.containsKey key))))

(defn clear
  "This method purges everything from storage"
  ([^AbstractStorage this]
    (-> this (.clear))))

(defn drop
  "This method removes value by specified key

  key - `T`"
  ([^AbstractStorage this key]
    (-> this (.drop key))))

(defn size
  "This method returns number of entries available in storage

  returns: `long`"
  (^Long [^AbstractStorage this]
    (-> this (.size))))

