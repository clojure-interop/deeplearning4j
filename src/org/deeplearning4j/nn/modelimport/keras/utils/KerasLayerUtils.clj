(ns org.deeplearning4j.nn.modelimport.keras.utils.KerasLayerUtils
  "Utility functionality to import keras models"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.modelimport.keras.utils KerasLayerUtils]))

(defn ->keras-layer-utils
  "Constructor."
  (^KerasLayerUtils []
    (new KerasLayerUtils )))

(defn *get-dropout-from-config
  "Get dropout from Keras layer configuration.

  layer-config - dictionary containing Keras layer configuration - `java.util.Map`
  conf - `org.deeplearning4j.nn.modelimport.keras.config.KerasLayerConfiguration`

  returns: get dropout value from Keras config - `double`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^Double [^java.util.Map layer-config ^org.deeplearning4j.nn.modelimport.keras.config.KerasLayerConfiguration conf]
    (KerasLayerUtils/getDropoutFromConfig layer-config conf)))

(defn *get-has-bias-from-config?
  "Determine if layer should be instantiated with bias

  layer-config - dictionary containing Keras layer configuration - `java.util.Map`
  conf - `org.deeplearning4j.nn.modelimport.keras.config.KerasLayerConfiguration`

  returns: whether layer has a bias term - `boolean`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^Boolean [^java.util.Map layer-config ^org.deeplearning4j.nn.modelimport.keras.config.KerasLayerConfiguration conf]
    (KerasLayerUtils/getHasBiasFromConfig layer-config conf)))

(defn *get-time-distributed-layer-config
  "Extract inner layer config from TimeDistributed configuration and merge
  it into the outer config.

  layer-config - dictionary containing Keras TimeDistributed configuration - `java.util.Map`
  conf - `org.deeplearning4j.nn.modelimport.keras.config.KerasLayerConfiguration`

  returns: Time distributed layer config - `java.util.Map<java.lang.String,java.lang.Object>`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^java.util.Map [^java.util.Map layer-config ^org.deeplearning4j.nn.modelimport.keras.config.KerasLayerConfiguration conf]
    (KerasLayerUtils/getTimeDistributedLayerConfig layer-config conf)))

(defn *get-zero-masking-from-config?
  "Get zero masking flag

  layer-config - dictionary containing Keras layer configuration - `java.util.Map`
  conf - `org.deeplearning4j.nn.modelimport.keras.config.KerasLayerConfiguration`

  returns: if masking zeros or not - `boolean`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras configuration"
  (^Boolean [^java.util.Map layer-config ^org.deeplearning4j.nn.modelimport.keras.config.KerasLayerConfiguration conf]
    (KerasLayerUtils/getZeroMaskingFromConfig layer-config conf)))

(defn *get-inner-layer-config-from-config
  "Get inner layer config from Keras layer configuration.

  layer-config - dictionary containing Keras layer configuration - `java.util.Map`
  conf - `org.deeplearning4j.nn.modelimport.keras.config.KerasLayerConfiguration`

  returns: Inner layer config for a nested Keras layer configuration - `java.util.Map<java.lang.String,java.lang.Object>`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^java.util.Map [^java.util.Map layer-config ^org.deeplearning4j.nn.modelimport.keras.config.KerasLayerConfiguration conf]
    (KerasLayerUtils/getInnerLayerConfigFromConfig layer-config conf)))

(defn *get-layer-name-from-config
  "Get layer name from Keras layer configuration.

  layer-config - dictionary containing Keras layer configuration - `java.util.Map`
  conf - `org.deeplearning4j.nn.modelimport.keras.config.KerasLayerConfiguration`

  returns: Keras layer name - `java.lang.String`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^java.lang.String [^java.util.Map layer-config ^org.deeplearning4j.nn.modelimport.keras.config.KerasLayerConfiguration conf]
    (KerasLayerUtils/getLayerNameFromConfig layer-config conf)))

(defn *remove-default-weights
  "Remove weights from config after weight setting.

  weights - layer weights - `java.util.Map`
  conf - Keras layer configuration - `org.deeplearning4j.nn.modelimport.keras.config.KerasLayerConfiguration`"
  ([^java.util.Map weights ^org.deeplearning4j.nn.modelimport.keras.config.KerasLayerConfiguration conf]
    (KerasLayerUtils/removeDefaultWeights weights conf)))

(defn *get-input-shape-from-config
  "Get Keras input shape from Keras layer configuration.

  layer-config - dictionary containing Keras layer configuration - `java.util.Map`
  conf - `org.deeplearning4j.nn.modelimport.keras.config.KerasLayerConfiguration`

  returns: input shape array - `int[]`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException"
  ([^java.util.Map layer-config ^org.deeplearning4j.nn.modelimport.keras.config.KerasLayerConfiguration conf]
    (KerasLayerUtils/getInputShapeFromConfig layer-config conf)))

(defn *get-dim-order-from-config
  "Get Keras (backend) dimension order from Keras layer configuration.

  layer-config - dictionary containing Keras layer configuration - `java.util.Map`
  conf - `org.deeplearning4j.nn.modelimport.keras.config.KerasLayerConfiguration`

  returns: Dimension order - `org.deeplearning4j.nn.modelimport.keras.KerasLayer$DimOrder`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException"
  (^org.deeplearning4j.nn.modelimport.keras.KerasLayer$DimOrder [^java.util.Map layer-config ^org.deeplearning4j.nn.modelimport.keras.config.KerasLayerConfiguration conf]
    (KerasLayerUtils/getDimOrderFromConfig layer-config conf)))

(defn *get-inbound-layer-names-from-config
  "Get list of inbound layers from Keras layer configuration.

  layer-config - dictionary containing Keras layer configuration - `java.util.Map`
  conf - `org.deeplearning4j.nn.modelimport.keras.config.KerasLayerConfiguration`

  returns: List of inbound layer names - `java.util.List<java.lang.String>`"
  (^java.util.List [^java.util.Map layer-config ^org.deeplearning4j.nn.modelimport.keras.config.KerasLayerConfiguration conf]
    (KerasLayerUtils/getInboundLayerNamesFromConfig layer-config conf)))

(defn *get-bias-l-1-regularization-from-config
  "Get L1 bias regularization (if any) from Keras bias regularization configuration.

  layer-config - dictionary containing Keras layer configuration - `java.util.Map`
  enforce-training-config - `boolean`
  conf - `org.deeplearning4j.nn.modelimport.keras.config.KerasLayerConfiguration`

  returns: L1 regularization strength (0.0 if none) - `double`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.UnsupportedKerasConfigurationException"
  (^Double [^java.util.Map layer-config ^Boolean enforce-training-config ^org.deeplearning4j.nn.modelimport.keras.config.KerasLayerConfiguration conf]
    (KerasLayerUtils/getBiasL1RegularizationFromConfig layer-config enforce-training-config conf)))

(defn *get-class-name-from-config
  "Get Keras layer class name from Keras layer configuration.

  layer-config - dictionary containing Keras layer configuration - `java.util.Map`
  conf - `org.deeplearning4j.nn.modelimport.keras.config.KerasLayerConfiguration`

  returns: Keras layer class name - `java.lang.String`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^java.lang.String [^java.util.Map layer-config ^org.deeplearning4j.nn.modelimport.keras.config.KerasLayerConfiguration conf]
    (KerasLayerUtils/getClassNameFromConfig layer-config conf)))

(defn *get-keras-layer-from-config
  "Build KerasLayer from a Keras layer configuration. Building layer with
  enforceTrainingConfig=true will throw exceptions for unsupported Keras
  options related to training (e.g., unknown regularizers). Otherwise
  we only generate warnings.

  layer-config - map containing Keras layer properties - `java.util.Map`
  enforce-training-config - whether to enforce training-only configurations - `boolean`
  conf - `org.deeplearning4j.nn.modelimport.keras.config.KerasLayerConfiguration`
  custom-layers - `java.util.Map`
  lambda-layers - `java.util.Map`
  previous-layers - `java.util.Map`

  returns: KerasLayer - `org.deeplearning4j.nn.modelimport.keras.KerasLayer`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException"
  (^org.deeplearning4j.nn.modelimport.keras.KerasLayer [^java.util.Map layer-config ^Boolean enforce-training-config ^org.deeplearning4j.nn.modelimport.keras.config.KerasLayerConfiguration conf ^java.util.Map custom-layers ^java.util.Map lambda-layers ^java.util.Map previous-layers]
    (KerasLayerUtils/getKerasLayerFromConfig layer-config enforce-training-config conf custom-layers lambda-layers previous-layers))
  (^org.deeplearning4j.nn.modelimport.keras.KerasLayer [^java.util.Map layer-config ^org.deeplearning4j.nn.modelimport.keras.config.KerasLayerConfiguration conf ^java.util.Map custom-layers ^java.util.Map lambda-layers ^java.util.Map previous-layers]
    (KerasLayerUtils/getKerasLayerFromConfig layer-config conf custom-layers lambda-layers previous-layers)))

(defn *get-n-out-from-config
  "Get number of outputs from Keras layer configuration.

  layer-config - dictionary containing Keras layer configuration - `java.util.Map`
  conf - `org.deeplearning4j.nn.modelimport.keras.config.KerasLayerConfiguration`

  returns: Number of output neurons of the Keras layer - `int`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^Integer [^java.util.Map layer-config ^org.deeplearning4j.nn.modelimport.keras.config.KerasLayerConfiguration conf]
    (KerasLayerUtils/getNOutFromConfig layer-config conf)))

(defn *check-for-unsupported-configurations
  "Checks whether layer config contains unsupported options.

  layer-config - dictionary containing Keras layer configuration - `java.util.Map`
  enforce-training-config - whether to use Keras training configuration - `boolean`
  conf - `org.deeplearning4j.nn.modelimport.keras.config.KerasLayerConfiguration`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  ([^java.util.Map layer-config ^Boolean enforce-training-config ^org.deeplearning4j.nn.modelimport.keras.config.KerasLayerConfiguration conf]
    (KerasLayerUtils/checkForUnsupportedConfigurations layer-config enforce-training-config conf)))

