(ns org.deeplearning4j.nn.modelimport.keras.KerasSequentialModel
  "Build DL4J MultiLayerNetwork model from Keras Sequential
 model configuration."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.modelimport.keras KerasSequentialModel]))

(defn ->keras-sequential-model
  "Constructor.

  (Not recommended) Constructor for Sequential model from model configuration
  (JSON or YAML), training configuration (JSON), weights, and \"training mode\"
  boolean indicator. When built in training mode, certain unsupported configurations
  (e.g., unknown regularizers) will throw Exceptions. When enforceTrainingConfig=false, these
  will generate warnings but will be otherwise ignored.

  model-json - model configuration JSON string - `java.lang.String`
  model-yaml - model configuration YAML string - `java.lang.String`
  weights-archive - `org.deeplearning4j.nn.modelimport.keras.Hdf5Archive`
  weights-root - `java.lang.String`
  training-json - training configuration JSON string - `java.lang.String`
  training-archive - `org.deeplearning4j.nn.modelimport.keras.Hdf5Archive`
  enforce-training-config - `boolean`
  input-shape - `int[]`

  throws: java.io.IOException - I/O exception"
  (^KerasSequentialModel [^java.lang.String model-json ^java.lang.String model-yaml ^org.deeplearning4j.nn.modelimport.keras.Hdf5Archive weights-archive ^java.lang.String weights-root ^java.lang.String training-json ^org.deeplearning4j.nn.modelimport.keras.Hdf5Archive training-archive ^Boolean enforce-training-config input-shape]
    (new KerasSequentialModel model-json model-yaml weights-archive weights-root training-json training-archive enforce-training-config input-shape))
  (^KerasSequentialModel [^org.deeplearning4j.nn.modelimport.keras.utils.KerasModelBuilder model-builder]
    (new KerasSequentialModel model-builder))
  (^KerasSequentialModel []
    (new KerasSequentialModel )))

(defn get-multi-layer-configuration
  "Configure a MultiLayerConfiguration from this Keras Sequential model configuration.

  returns: MultiLayerConfiguration - `org.deeplearning4j.nn.conf.MultiLayerConfiguration`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException"
  (^org.deeplearning4j.nn.conf.MultiLayerConfiguration [^KerasSequentialModel this]
    (-> this (.getMultiLayerConfiguration))))

(defn get-multi-layer-network
  "Build a MultiLayerNetwork from this Keras Sequential model configuration and import weights.

  import-weights - `boolean`

  returns: MultiLayerNetwork - `org.deeplearning4j.nn.multilayer.MultiLayerNetwork`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException"
  (^org.deeplearning4j.nn.multilayer.MultiLayerNetwork [^KerasSequentialModel this ^Boolean import-weights]
    (-> this (.getMultiLayerNetwork import-weights)))
  (^org.deeplearning4j.nn.multilayer.MultiLayerNetwork [^KerasSequentialModel this]
    (-> this (.getMultiLayerNetwork))))

