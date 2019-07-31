(ns org.deeplearning4j.nn.conf.inputs.InputType$InputTypeConvolutional
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.inputs InputType$InputTypeConvolutional]))

(defn ->input-type-convolutional
  "Constructor."
  (^InputType$InputTypeConvolutional []
    (new InputType$InputTypeConvolutional )))

(defn get-depth
  "Deprecated.

  returns: number of channels, i.e. depth for 2D convolutions - `long`"
  (^Long [^InputType$InputTypeConvolutional this]
    (-> this (.getDepth))))

(defn set-depth
  "Deprecated.

  depth - `long`"
  ([^InputType$InputTypeConvolutional this ^Long depth]
    (-> this (.setDepth depth))))

(defn get-type
  "returns: `org.deeplearning4j.nn.conf.inputs.InputType$Type`"
  (^org.deeplearning4j.nn.conf.inputs.InputType$Type [^InputType$InputTypeConvolutional this]
    (-> this (.getType))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^InputType$InputTypeConvolutional this]
    (-> this (.toString))))

(defn array-elements-per-example
  "returns: `long`"
  (^Long [^InputType$InputTypeConvolutional this]
    (-> this (.arrayElementsPerExample))))

(defn get-shape
  "Description copied from class: InputType

  include-batch-dim - Whether to include minibatch in the return shape array - `boolean`

  returns: int[] - `long[]`"
  ([^InputType$InputTypeConvolutional this ^Boolean include-batch-dim]
    (-> this (.getShape include-batch-dim))))

