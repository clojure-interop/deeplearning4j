(ns org.deeplearning4j.nn.conf.inputs.InputType$InputTypeConvolutional3D
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.inputs InputType$InputTypeConvolutional3D]))

(defn ->input-type-convolutional-3-d
  "Constructor."
  (^InputType$InputTypeConvolutional3D []
    (new InputType$InputTypeConvolutional3D )))

(defn get-type
  "returns: `org.deeplearning4j.nn.conf.inputs.InputType$Type`"
  (^org.deeplearning4j.nn.conf.inputs.InputType$Type [^InputType$InputTypeConvolutional3D this]
    (-> this (.getType))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^InputType$InputTypeConvolutional3D this]
    (-> this (.toString))))

(defn array-elements-per-example
  "returns: `long`"
  (^Long [^InputType$InputTypeConvolutional3D this]
    (-> this (.arrayElementsPerExample))))

(defn get-shape
  "Description copied from class: InputType

  include-batch-dim - Whether to include minibatch in the return shape array - `boolean`

  returns: int[] - `long[]`"
  ([^InputType$InputTypeConvolutional3D this ^Boolean include-batch-dim]
    (-> this (.getShape include-batch-dim))))

