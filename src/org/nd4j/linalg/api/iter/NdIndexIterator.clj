(ns org.nd4j.linalg.api.iter.NdIndexIterator
  "Iterates and returns int arrays
 over a particular shape.
 This iterator starts at zero and increments
 the shape until each item in the \"position\"
 hits the current shape"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.iter NdIndexIterator]))

(defn ->nd-index-iterator
  "Constructor.

  Pass in the shape to iterate over.
  Defaults to c ordering

  order - `char`
  cache - `boolean`
  shape - the shape to iterate over - `long`"
  (^NdIndexIterator [^Character order ^Boolean cache ^Long shape]
    (new NdIndexIterator order cache shape))
  (^NdIndexIterator [^Character order ^Integer shape]
    (new NdIndexIterator order shape))
  (^NdIndexIterator [^Integer shape]
    (new NdIndexIterator shape)))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^NdIndexIterator this]
    (-> this (.hasNext))))

(defn next
  "returns: `long[]`"
  ([^NdIndexIterator this]
    (-> this (.next))))

(defn remove
  ""
  ([^NdIndexIterator this]
    (-> this (.remove))))

