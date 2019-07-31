(ns org.deeplearning4j.nn.modelimport.keras.utils.KerasInitilizationUtils
  "Utility functionality for Keras weight initializers"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.modelimport.keras.utils KerasInitilizationUtils]))

(defn ->keras-initilization-utils
  "Constructor."
  (^KerasInitilizationUtils []
    (new KerasInitilizationUtils )))

(defn *map-weight-initialization
  "Map Keras to DL4J weight initialization functions.

  keras-init - String containing Keras initialization function name - `java.lang.String`
  conf - `org.deeplearning4j.nn.modelimport.keras.config.KerasLayerConfiguration`
  init-config - `java.util.Map`
  keras-major-version - `int`

  returns: DL4J weight initialization enum - `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.nn.weights.WeightInit,org.deeplearning4j.nn.conf.distribution.Distribution>`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.UnsupportedKerasConfigurationException"
  (^org.nd4j.linalg.primitives.Pair [^java.lang.String keras-init ^org.deeplearning4j.nn.modelimport.keras.config.KerasLayerConfiguration conf ^java.util.Map init-config ^Integer keras-major-version]
    (KerasInitilizationUtils/mapWeightInitialization keras-init conf init-config keras-major-version)))

(defn *get-weight-init-from-config
  "Get weight initialization from Keras layer configuration.

  layer-config - dictionary containing Keras layer configuration - `java.util.Map`
  init-field - `java.lang.String`
  enforce-training-config - whether to enforce loading configuration for further training - `boolean`
  conf - `org.deeplearning4j.nn.modelimport.keras.config.KerasLayerConfiguration`
  keras-major-version - `int`

  returns: Pair of DL4J weight initialization and distribution - `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.nn.weights.WeightInit,org.deeplearning4j.nn.conf.distribution.Distribution>`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^org.nd4j.linalg.primitives.Pair [^java.util.Map layer-config ^java.lang.String init-field ^Boolean enforce-training-config ^org.deeplearning4j.nn.modelimport.keras.config.KerasLayerConfiguration conf ^Integer keras-major-version]
    (KerasInitilizationUtils/getWeightInitFromConfig layer-config init-field enforce-training-config conf keras-major-version)))

