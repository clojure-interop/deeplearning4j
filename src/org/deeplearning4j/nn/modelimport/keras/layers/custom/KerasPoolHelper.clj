(ns org.deeplearning4j.nn.modelimport.keras.layers.custom.KerasPoolHelper
  "Custom PoolHelper layer developed for importing GoogLeNet. This layer strips
 the first column and row of the input. See https://gist.github.com/joelouismarino/a2ede9ab3928f999575423b9887abd14."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.modelimport.keras.layers.custom KerasPoolHelper]))

(defn ->keras-pool-helper
  "Constructor.

  Constructor from parsed Keras layer configuration dictionary.

  layer-config - dictionary containing Keras layer configuration - `java.util.Map`
  enforce-training-config - whether to enforce training-related configuration options - `boolean`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^KerasPoolHelper [^java.util.Map layer-config ^Boolean enforce-training-config]
    (new KerasPoolHelper layer-config enforce-training-config))
  (^KerasPoolHelper [^java.util.Map layer-config]
    (new KerasPoolHelper layer-config)))

(defn get-output-type
  "Get layer output type.

  input-type - Array of InputTypes - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: output type as InputType - `org.deeplearning4j.nn.conf.inputs.InputType`"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^KerasPoolHelper this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getOutputType input-type))))

