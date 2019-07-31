(ns org.deeplearning4j.nn.modelimport.keras.KerasModelImport
  "Reads stored Keras configurations and weights from one of two archives:
 either as
 - a single HDF5 file storing model and training JSON configurations and weights
 - separate text file storing model JSON configuration and HDF5 file storing weights."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.modelimport.keras KerasModelImport]))

(defn ->keras-model-import
  "Constructor."
  (^KerasModelImport []
    (new KerasModelImport )))

(defn *import-keras-model-and-weights
  "Load Keras (Functional API) Model saved using model.save_model(...).

  model-hdf-5-filename - path to HDF5 archive storing Keras Model - `java.lang.String`
  input-shape - optional input shape for models that come without such (e.g. notop = false models) - `int[]`
  enforce-training-config - whether to enforce training configuration options - `boolean`

  returns: ComputationGraph - `org.deeplearning4j.nn.graph.ComputationGraph`

  throws: java.io.IOException - IO exception"
  (^org.deeplearning4j.nn.graph.ComputationGraph [^java.lang.String model-hdf-5-filename input-shape ^Boolean enforce-training-config]
    (KerasModelImport/importKerasModelAndWeights model-hdf-5-filename input-shape enforce-training-config))
  (^org.deeplearning4j.nn.graph.ComputationGraph [^java.io.InputStream model-hdf-5-stream ^Boolean enforce-training-config]
    (KerasModelImport/importKerasModelAndWeights model-hdf-5-stream enforce-training-config))
  (^org.deeplearning4j.nn.graph.ComputationGraph [^java.io.InputStream model-hdf-5-stream]
    (KerasModelImport/importKerasModelAndWeights model-hdf-5-stream)))

(defn *import-keras-sequential-model-and-weights
  "Load Keras Sequential model saved using model.save_model(...).

  model-hdf-5-filename - path to HDF5 archive storing Keras Sequential model - `java.lang.String`
  input-shape - optional input shape for models that come without such (e.g. notop = false models) - `int[]`
  enforce-training-config - whether to enforce training configuration options - `boolean`

  returns: MultiLayerNetwork - `org.deeplearning4j.nn.multilayer.MultiLayerNetwork`

  throws: java.io.IOException - IO exception"
  (^org.deeplearning4j.nn.multilayer.MultiLayerNetwork [^java.lang.String model-hdf-5-filename input-shape ^Boolean enforce-training-config]
    (KerasModelImport/importKerasSequentialModelAndWeights model-hdf-5-filename input-shape enforce-training-config))
  (^org.deeplearning4j.nn.multilayer.MultiLayerNetwork [^java.io.InputStream model-hdf-5-stream ^Boolean enforce-training-config]
    (KerasModelImport/importKerasSequentialModelAndWeights model-hdf-5-stream enforce-training-config))
  (^org.deeplearning4j.nn.multilayer.MultiLayerNetwork [^java.io.InputStream model-hdf-5-stream]
    (KerasModelImport/importKerasSequentialModelAndWeights model-hdf-5-stream)))

(defn *import-keras-model-configuration
  "Load Keras (Functional API) Model for which the configuration was saved
  separately using calls to model.to_json() and model.save_weights(...).

  model-json-filename - path to JSON file storing Keras Model configuration - `java.lang.String`
  enforce-training-config - whether to enforce training configuration options - `boolean`

  returns: ComputationGraph - `org.deeplearning4j.nn.conf.ComputationGraphConfiguration`

  throws: java.io.IOException - IO exception"
  (^org.deeplearning4j.nn.conf.ComputationGraphConfiguration [^java.lang.String model-json-filename ^Boolean enforce-training-config]
    (KerasModelImport/importKerasModelConfiguration model-json-filename enforce-training-config))
  (^org.deeplearning4j.nn.conf.ComputationGraphConfiguration [^java.lang.String model-json-filename]
    (KerasModelImport/importKerasModelConfiguration model-json-filename)))

(defn *import-keras-sequential-configuration
  "Load Keras Sequential model for which the configuration was saved
  separately using calls to model.to_json() and model.save_weights(...).

  model-json-filename - path to JSON file storing Keras Sequential model configuration - `java.lang.String`
  enforce-training-config - whether to enforce training configuration options - `boolean`

  returns: MultiLayerNetwork - `org.deeplearning4j.nn.conf.MultiLayerConfiguration`

  throws: java.io.IOException - IO exception"
  (^org.deeplearning4j.nn.conf.MultiLayerConfiguration [^java.lang.String model-json-filename ^Boolean enforce-training-config]
    (KerasModelImport/importKerasSequentialConfiguration model-json-filename enforce-training-config))
  (^org.deeplearning4j.nn.conf.MultiLayerConfiguration [^java.lang.String model-json-filename]
    (KerasModelImport/importKerasSequentialConfiguration model-json-filename)))

