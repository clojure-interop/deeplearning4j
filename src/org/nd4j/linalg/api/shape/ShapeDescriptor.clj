(ns org.nd4j.linalg.api.shape.ShapeDescriptor
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.shape ShapeDescriptor]))

(defn ->shape-descriptor
  "Constructor.

  shape - `int[]`
  stride - `int[]`
  offset - `long`
  ews - `int`
  order - `char`
  extras - `long`"
  (^ShapeDescriptor [shape stride ^Long offset ^Integer ews ^Character order ^Long extras]
    (new ShapeDescriptor shape stride offset ews order extras)))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ShapeDescriptor this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ShapeDescriptor this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ShapeDescriptor this]
    (-> this (.toString))))

