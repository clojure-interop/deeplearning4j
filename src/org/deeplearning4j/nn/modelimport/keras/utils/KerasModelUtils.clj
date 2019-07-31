(ns org.deeplearning4j.nn.modelimport.keras.utils.KerasModelUtils
  "Utility functionality to import keras models"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.modelimport.keras.utils KerasModelUtils]))

(defn ->keras-model-utils
  "Constructor."
  (^KerasModelUtils []
    (new KerasModelUtils )))

(defn *copy-weights-to-model
  "Helper function to import weights from nested Map into existing model. Depends critically
  on matched layer and parameter names. In general this seems to be straightforward for most
  Keras models and layersOrdered, but there may be edge cases.

  model - DL4J Model interface - `org.deeplearning4j.nn.api.Model`
  keras-layers - `java.util.Map`

  returns: DL4J Model interface - `org.deeplearning4j.nn.api.Model`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^org.deeplearning4j.nn.api.Model [^org.deeplearning4j.nn.api.Model model ^java.util.Map keras-layers]
    (KerasModelUtils/copyWeightsToModel model keras-layers)))

(defn *determine-keras-major-version
  "Determine Keras major version

  model-config - parsed model configuration for keras model - `java.util.Map`
  config - basic model configuration (KerasModelConfiguration) - `org.deeplearning4j.nn.modelimport.keras.config.KerasModelConfiguration`

  returns: Major Keras version (1 or 2) - `int`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^Integer [^java.util.Map model-config ^org.deeplearning4j.nn.modelimport.keras.config.KerasModelConfiguration config]
    (KerasModelUtils/determineKerasMajorVersion model-config config)))

(defn *determine-keras-backend
  "Determine Keras backend

  model-config - parsed model configuration for keras model - `java.util.Map`
  config - basic model configuration (KerasModelConfiguration) - `org.deeplearning4j.nn.modelimport.keras.config.KerasModelConfiguration`

  returns: Keras backend string - `java.lang.String`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^java.lang.String [^java.util.Map model-config ^org.deeplearning4j.nn.modelimport.keras.config.KerasModelConfiguration config]
    (KerasModelUtils/determineKerasBackend model-config config)))

(defn *import-weights
  "Store weights to import with each associated Keras layer.

  weights-archive - Hdf5Archive - `org.deeplearning4j.nn.modelimport.keras.Hdf5Archive`
  weights-root - root of weights in HDF5 archive - `java.lang.String`
  layers - `java.util.Map`
  keras-version - `int`
  backend - `java.lang.String`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras configuration"
  ([^org.deeplearning4j.nn.modelimport.keras.Hdf5Archive weights-archive ^java.lang.String weights-root ^java.util.Map layers ^Integer keras-version ^java.lang.String backend]
    (KerasModelUtils/importWeights weights-archive weights-root layers keras-version backend)))

(defn *parse-model-config
  "Parse Keras model configuration from JSON or YAML string representation

  model-json - JSON string representing model (potentially null) - `java.lang.String`
  model-yaml - YAML string representing model (potentially null) - `java.lang.String`

  returns: Model configuration as Map - `java.util.Map<java.lang.String,java.lang.Object>`

  throws: java.io.IOException - IO exception"
  (^java.util.Map [^java.lang.String model-json ^java.lang.String model-yaml]
    (KerasModelUtils/parseModelConfig model-json model-yaml)))

(defn *parse-json-string
  "Convenience function for parsing JSON strings.

  json - String containing valid JSON - `java.lang.String`

  returns: Nested (key,value) map of arbitrary depth - `java.util.Map<java.lang.String,java.lang.Object>`

  throws: java.io.IOException - IO exception"
  (^java.util.Map [^java.lang.String json]
    (KerasModelUtils/parseJsonString json)))

(defn *parse-yaml-string
  "Convenience function for parsing YAML strings.

  yaml - String containing valid YAML - `java.lang.String`

  returns: Nested (key,value) map of arbitrary depth - `java.util.Map<java.lang.String,java.lang.Object>`

  throws: java.io.IOException - IO exception"
  (^java.util.Map [^java.lang.String yaml]
    (KerasModelUtils/parseYamlString yaml)))

