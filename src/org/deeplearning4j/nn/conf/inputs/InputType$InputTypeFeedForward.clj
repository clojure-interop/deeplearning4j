(ns org.deeplearning4j.nn.conf.inputs.InputType$InputTypeFeedForward
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.inputs InputType$InputTypeFeedForward]))

(defn ->input-type-feed-forward
  "Constructor."
  (^InputType$InputTypeFeedForward []
    (new InputType$InputTypeFeedForward )))

(defn get-type
  "returns: `org.deeplearning4j.nn.conf.inputs.InputType$Type`"
  (^org.deeplearning4j.nn.conf.inputs.InputType$Type [^InputType$InputTypeFeedForward this]
    (-> this (.getType))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^InputType$InputTypeFeedForward this]
    (-> this (.toString))))

(defn array-elements-per-example
  "returns: `long`"
  (^Long [^InputType$InputTypeFeedForward this]
    (-> this (.arrayElementsPerExample))))

(defn get-shape
  "Description copied from class: InputType

  include-batch-dim - Whether to include minibatch in the return shape array - `boolean`

  returns: int[] - `long[]`"
  ([^InputType$InputTypeFeedForward this ^Boolean include-batch-dim]
    (-> this (.getShape include-batch-dim))))

