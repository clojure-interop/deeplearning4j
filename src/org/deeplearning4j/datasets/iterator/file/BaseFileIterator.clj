(ns org.deeplearning4j.datasets.iterator.file.BaseFileIterator
  "Base class for loading DataSet objects from file"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.datasets.iterator.file BaseFileIterator]))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^BaseFileIterator this]
    (-> this (.hasNext))))

(defn next
  "returns: `T`"
  ([^BaseFileIterator this]
    (-> this (.next))))

(defn remove
  ""
  ([^BaseFileIterator this]
    (-> this (.remove))))

(defn reset
  ""
  ([^BaseFileIterator this]
    (-> this (.reset))))

(defn reset-supported
  "returns: `boolean`"
  (^Boolean [^BaseFileIterator this]
    (-> this (.resetSupported))))

(defn async-supported
  "returns: `boolean`"
  (^Boolean [^BaseFileIterator this]
    (-> this (.asyncSupported))))

