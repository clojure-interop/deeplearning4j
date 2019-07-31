(ns org.deeplearning4j.nn.conf.inputs.InputType$InputTypeConvolutionalFlat
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.inputs InputType$InputTypeConvolutionalFlat]))

(defn ->input-type-convolutional-flat
  "Constructor."
  (^InputType$InputTypeConvolutionalFlat []
    (new InputType$InputTypeConvolutionalFlat )))

(defn get-type
  "returns: `org.deeplearning4j.nn.conf.inputs.InputType$Type`"
  (^org.deeplearning4j.nn.conf.inputs.InputType$Type [^InputType$InputTypeConvolutionalFlat this]
    (-> this (.getType))))

(defn get-flattened-size
  "returns: `long`"
  (^Long [^InputType$InputTypeConvolutionalFlat this]
    (-> this (.getFlattenedSize))))

(defn get-unflattened-type
  "returns: `org.deeplearning4j.nn.conf.inputs.InputType`"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^InputType$InputTypeConvolutionalFlat this]
    (-> this (.getUnflattenedType))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^InputType$InputTypeConvolutionalFlat this]
    (-> this (.toString))))

(defn array-elements-per-example
  "returns: `long`"
  (^Long [^InputType$InputTypeConvolutionalFlat this]
    (-> this (.arrayElementsPerExample))))

(defn get-shape
  "Description copied from class: InputType

  include-batch-dim - Whether to include minibatch in the return shape array - `boolean`

  returns: int[] - `long[]`"
  ([^InputType$InputTypeConvolutionalFlat this ^Boolean include-batch-dim]
    (-> this (.getShape include-batch-dim))))

