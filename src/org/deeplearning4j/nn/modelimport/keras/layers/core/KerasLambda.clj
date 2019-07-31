(ns org.deeplearning4j.nn.modelimport.keras.layers.core.KerasLambda
  "Wraps a DL4J SameDiffLambda into a KerasLayer"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.modelimport.keras.layers.core KerasLambda]))

(defn ->keras-lambda
  "Constructor.

  Constructor from parsed Keras layer configuration dictionary.

  layer-config - dictionary containing Keras layer configuration - `java.util.Map`
  enforce-training-config - whether to enforce training-related configuration options - `boolean`
  same-diff-layer - `org.deeplearning4j.nn.conf.layers.samediff.SameDiffLayer`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^KerasLambda [^java.util.Map layer-config ^Boolean enforce-training-config ^org.deeplearning4j.nn.conf.layers.samediff.SameDiffLayer same-diff-layer]
    (new KerasLambda layer-config enforce-training-config same-diff-layer))
  (^KerasLambda [^java.util.Map layer-config ^org.deeplearning4j.nn.conf.layers.samediff.SameDiffLayer same-diff-layer]
    (new KerasLambda layer-config same-diff-layer)))

(defn get-output-type
  "Get layer output type.

  input-type - Array of InputTypes - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: output type as InputType - `org.deeplearning4j.nn.conf.inputs.InputType`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^KerasLambda this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getOutputType input-type))))

(defn get-same-diff-layer
  "Get DL4J SameDiffLayer.

  returns: SameDiffLayer - `org.deeplearning4j.nn.conf.layers.samediff.SameDiffLayer`"
  (^org.deeplearning4j.nn.conf.layers.samediff.SameDiffLayer [^KerasLambda this]
    (-> this (.getSameDiffLayer))))

