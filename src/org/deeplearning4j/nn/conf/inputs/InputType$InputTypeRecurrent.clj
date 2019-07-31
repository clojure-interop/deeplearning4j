(ns org.deeplearning4j.nn.conf.inputs.InputType$InputTypeRecurrent
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.inputs InputType$InputTypeRecurrent]))

(defn ->input-type-recurrent
  "Constructor.

  size - `long`"
  (^InputType$InputTypeRecurrent [^Long size]
    (new InputType$InputTypeRecurrent size)))

(defn get-type
  "returns: `org.deeplearning4j.nn.conf.inputs.InputType$Type`"
  (^org.deeplearning4j.nn.conf.inputs.InputType$Type [^InputType$InputTypeRecurrent this]
    (-> this (.getType))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^InputType$InputTypeRecurrent this]
    (-> this (.toString))))

(defn array-elements-per-example
  "returns: `long`"
  (^Long [^InputType$InputTypeRecurrent this]
    (-> this (.arrayElementsPerExample))))

(defn get-shape
  "Description copied from class: InputType

  include-batch-dim - Whether to include minibatch in the return shape array - `boolean`

  returns: int[] - `long[]`"
  ([^InputType$InputTypeRecurrent this ^Boolean include-batch-dim]
    (-> this (.getShape include-batch-dim))))

