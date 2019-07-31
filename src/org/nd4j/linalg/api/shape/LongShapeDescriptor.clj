(ns org.nd4j.linalg.api.shape.LongShapeDescriptor
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.shape LongShapeDescriptor]))

(defn ->long-shape-descriptor
  "Constructor.

  shape - `long[]`
  stride - `long[]`
  offset - `long`
  ews - `long`
  order - `char`
  extras - `long`"
  (^LongShapeDescriptor [shape stride ^Long offset ^Long ews ^Character order ^Long extras]
    (new LongShapeDescriptor shape stride offset ews order extras)))

(defn *from-shape-descriptor
  "descriptor - `org.nd4j.linalg.api.shape.ShapeDescriptor`

  returns: `org.nd4j.linalg.api.shape.LongShapeDescriptor`"
  (^org.nd4j.linalg.api.shape.LongShapeDescriptor [^org.nd4j.linalg.api.shape.ShapeDescriptor descriptor]
    (LongShapeDescriptor/fromShapeDescriptor descriptor)))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^LongShapeDescriptor this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^LongShapeDescriptor this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^LongShapeDescriptor this]
    (-> this (.toString))))

