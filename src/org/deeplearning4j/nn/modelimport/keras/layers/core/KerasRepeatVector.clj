(ns org.deeplearning4j.nn.modelimport.keras.layers.core.KerasRepeatVector
  "Imports a Keras RepeatVector layer"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.modelimport.keras.layers.core KerasRepeatVector]))

(defn ->keras-repeat-vector
  "Constructor.

  Constructor from parsed Keras layer configuration dictionary.

  layer-config - dictionary containing Keras layer configuration - `java.util.Map`
  enforce-training-config - whether to enforce training-related configuration options - `boolean`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^KerasRepeatVector [^java.util.Map layer-config ^Boolean enforce-training-config]
    (new KerasRepeatVector layer-config enforce-training-config))
  (^KerasRepeatVector [^java.util.Map layer-config]
    (new KerasRepeatVector layer-config)))

(defn get-output-type
  "Get layer output type.

  input-type - Array of InputTypes - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: output type as InputType - `org.deeplearning4j.nn.conf.inputs.InputType`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^KerasRepeatVector this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getOutputType input-type))))

(defn get-repeat-vector-layer
  "Get DL4J RepeatVector.

  returns: RepeatVector - `org.deeplearning4j.nn.conf.layers.misc.RepeatVector`"
  (^org.deeplearning4j.nn.conf.layers.misc.RepeatVector [^KerasRepeatVector this]
    (-> this (.getRepeatVectorLayer))))

