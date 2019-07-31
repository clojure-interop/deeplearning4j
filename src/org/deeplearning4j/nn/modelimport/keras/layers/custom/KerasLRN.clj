(ns org.deeplearning4j.nn.modelimport.keras.layers.custom.KerasLRN
  "Keras does not have an official LRN layer. Instead, the Keras community has
 developed helpers to help address this issue. This custom layer was built specifically
 to allow import of GoogLeNet https://gist.github.com/joelouismarino/a2ede9ab3928f999575423b9887abd14."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.modelimport.keras.layers.custom KerasLRN]))

(defn ->keras-lrn
  "Constructor.

  Constructor from parsed Keras layer configuration dictionary.

  layer-config - dictionary containing Keras layer configuration - `java.util.Map`
  enforce-training-config - whether to enforce training-related configuration options - `boolean`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^KerasLRN [^java.util.Map layer-config ^Boolean enforce-training-config]
    (new KerasLRN layer-config enforce-training-config))
  (^KerasLRN [^java.util.Map layer-config]
    (new KerasLRN layer-config)))

(defn get-local-response-normalization
  "Get DL4J LRN.

  returns: LocalResponseNormalization - `org.deeplearning4j.nn.conf.layers.LocalResponseNormalization`"
  (^org.deeplearning4j.nn.conf.layers.LocalResponseNormalization [^KerasLRN this]
    (-> this (.getLocalResponseNormalization))))

(defn get-output-type
  "Get layer output type.

  input-type - Array of InputTypes - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: output type as InputType - `org.deeplearning4j.nn.conf.inputs.InputType`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^KerasLRN this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getOutputType input-type))))

