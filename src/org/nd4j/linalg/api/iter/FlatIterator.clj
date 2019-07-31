(ns org.nd4j.linalg.api.iter.FlatIterator
  "Created by agibsonccc on 9/15/15."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.iter FlatIterator]))

(defn ->flat-iterator
  "Constructor.

  shape - `int[]`"
  (^FlatIterator [shape]
    (new FlatIterator shape)))

(defn remove
  ""
  ([^FlatIterator this]
    (-> this (.remove))))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^FlatIterator this]
    (-> this (.hasNext))))

(defn next
  "returns: `int[]`"
  ([^FlatIterator this]
    (-> this (.next))))

