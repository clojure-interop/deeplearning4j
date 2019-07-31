(ns org.deeplearning4j.nn.modelimport.keras.layers.KerasInput
  "Imports an Input layer from Keras. Used to set InputType of DL4J model."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.modelimport.keras.layers KerasInput]))

(defn ->keras-input
  "Constructor.

  Constructor from layer name and input shape.

  layer-name - layer name - `java.lang.String`
  input-shape - input shape as array - `int[]`
  enforce-training-config - whether to enforce training-related configuration options - `boolean`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^KerasInput [^java.lang.String layer-name input-shape ^Boolean enforce-training-config]
    (new KerasInput layer-name input-shape enforce-training-config))
  (^KerasInput [^java.util.Map layer-config ^Boolean enforce-training-config]
    (new KerasInput layer-config enforce-training-config))
  (^KerasInput [^java.util.Map layer-config]
    (new KerasInput layer-config)))

(defn get-output-type
  "Get layer output type.

  input-type - Array of InputTypes - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: output type as InputType - `org.deeplearning4j.nn.conf.inputs.InputType`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^KerasInput this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getOutputType input-type))))

(defn get-truncated-bptt
  "Returns value of truncated BPTT, if any found.

  returns: value of truncated BPTT - `int`"
  (^Integer [^KerasInput this]
    (-> this (.getTruncatedBptt))))

