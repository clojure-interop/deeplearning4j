(ns org.deeplearning4j.nn.modelimport.keras.utils.KerasModelBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.modelimport.keras.utils KerasModelBuilder]))

(defn ->keras-model-builder
  "Constructor.

  KerasModelBuilder constructed from a model configuration.

  config - KerasModelConfiguration - `org.deeplearning4j.nn.modelimport.keras.config.KerasModelConfiguration`"
  (^KerasModelBuilder [^org.deeplearning4j.nn.modelimport.keras.config.KerasModelConfiguration config]
    (new KerasModelBuilder config)))

(defn model-yaml-input-stream
  "Set model architecture from input stream of model YAML.

  model-yaml-input-stream - Input stream of model YAML - `java.io.InputStream`

  returns: Model builder - `org.deeplearning4j.nn.modelimport.keras.utils.KerasModelBuilder`

  throws: java.io.IOException - I/O exception"
  (^org.deeplearning4j.nn.modelimport.keras.utils.KerasModelBuilder [^KerasModelBuilder this ^java.io.InputStream model-yaml-input-stream]
    (-> this (.modelYamlInputStream model-yaml-input-stream))))

(defn training-json
  "Provide training configuration as JSON string

  training-json - Training JSON string - `java.lang.String`

  returns: Model builder - `org.deeplearning4j.nn.modelimport.keras.utils.KerasModelBuilder`"
  (^org.deeplearning4j.nn.modelimport.keras.utils.KerasModelBuilder [^KerasModelBuilder this ^java.lang.String training-json]
    (-> this (.trainingJson training-json))))

(defn enforce-training-config
  "Determine whether to enforce loading a training configuration or not.

  enforce-training-config - boolean, read training config or not - `boolean`

  returns: Model builder - `org.deeplearning4j.nn.modelimport.keras.utils.KerasModelBuilder`"
  (^org.deeplearning4j.nn.modelimport.keras.utils.KerasModelBuilder [^KerasModelBuilder this ^Boolean enforce-training-config]
    (-> this (.enforceTrainingConfig enforce-training-config))))

(defn model-json-filename
  "Set model architecture from file name pointing to model JSON string.

  model-json-filename - Name of file containing model JSON string - `java.lang.String`

  returns: Model Builder - `org.deeplearning4j.nn.modelimport.keras.utils.KerasModelBuilder`

  throws: java.io.IOException - I/O Exception"
  (^org.deeplearning4j.nn.modelimport.keras.utils.KerasModelBuilder [^KerasModelBuilder this ^java.lang.String model-json-filename]
    (-> this (.modelJsonFilename model-json-filename))))

(defn model-yaml-filename
  "Set model architecture from file name pointing to model YAML string.

  model-yaml-filename - Name of file containing model YAML string - `java.lang.String`

  returns: Model Builder - `org.deeplearning4j.nn.modelimport.keras.utils.KerasModelBuilder`

  throws: java.io.IOException - I/O Exception"
  (^org.deeplearning4j.nn.modelimport.keras.utils.KerasModelBuilder [^KerasModelBuilder this ^java.lang.String model-yaml-filename]
    (-> this (.modelYamlFilename model-yaml-filename))))

(defn training-yaml-input-stream
  "Provide training configuration as file input stream from YAML

  training-yaml-input-stream - Input stream of training YAML string - `java.io.InputStream`

  returns: Model builder - `org.deeplearning4j.nn.modelimport.keras.utils.KerasModelBuilder`

  throws: java.io.IOException"
  (^org.deeplearning4j.nn.modelimport.keras.utils.KerasModelBuilder [^KerasModelBuilder this ^java.io.InputStream training-yaml-input-stream]
    (-> this (.trainingYamlInputStream training-yaml-input-stream))))

(defn model-hdf-5-filename
  "Set full model HDF5 (architecture, weights and training configuration) by providing the HDF5 filename.

  model-hdf-5-filename - File name of HDF5 file containing full model - `java.lang.String`

  returns: Model builder - `org.deeplearning4j.nn.modelimport.keras.utils.KerasModelBuilder`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.UnsupportedKerasConfigurationException - Unsupported configuration"
  (^org.deeplearning4j.nn.modelimport.keras.utils.KerasModelBuilder [^KerasModelBuilder this ^java.lang.String model-hdf-5-filename]
    (-> this (.modelHdf5Filename model-hdf-5-filename))))

(defn weights-hdf-5-filename-no-root
  "Set weights of the model by providing the file name of the corresponding weights HDF5 file.
  The root of the HDF5 group containing weights won't be set by this method.

  weights-hdf-5-filename - File name of weights HDF5 - `java.lang.String`

  returns: Model builder - `org.deeplearning4j.nn.modelimport.keras.utils.KerasModelBuilder`

  throws: java.io.IOException"
  (^org.deeplearning4j.nn.modelimport.keras.utils.KerasModelBuilder [^KerasModelBuilder this ^java.lang.String weights-hdf-5-filename]
    (-> this (.weightsHdf5FilenameNoRoot weights-hdf-5-filename))))

(defn training-yaml
  "Provide training configuration as YAML string

  training-yaml - Training YAML string - `java.lang.String`

  returns: Model builder - `org.deeplearning4j.nn.modelimport.keras.utils.KerasModelBuilder`"
  (^org.deeplearning4j.nn.modelimport.keras.utils.KerasModelBuilder [^KerasModelBuilder this ^java.lang.String training-yaml]
    (-> this (.trainingYaml training-yaml))))

(defn build-sequential
  "Build a KerasSequentialModel (corresponding to MultiLayerNetwork) from this model builder.

  returns: KerasSequentialModel - `org.deeplearning4j.nn.modelimport.keras.KerasSequentialModel`

  throws: java.io.IOException - I/O exception"
  (^org.deeplearning4j.nn.modelimport.keras.KerasSequentialModel [^KerasModelBuilder this]
    (-> this (.buildSequential))))

(defn training-json-input-stream
  "Provide training configuration as file input stream from JSON

  training-json-input-stream - Input stream of training JSON string - `java.io.InputStream`

  returns: Model builder - `org.deeplearning4j.nn.modelimport.keras.utils.KerasModelBuilder`

  throws: java.io.IOException"
  (^org.deeplearning4j.nn.modelimport.keras.utils.KerasModelBuilder [^KerasModelBuilder this ^java.io.InputStream training-json-input-stream]
    (-> this (.trainingJsonInputStream training-json-input-stream))))

(defn input-shape
  "Provide input shape for Keras models that have been compiled without one. DL4J
  needs this shape information on import to infer shapes of later layers and do
  shape validation.

  input-shape - Input shape as int array - `int[]`

  returns: Model Builder - `org.deeplearning4j.nn.modelimport.keras.utils.KerasModelBuilder`"
  (^org.deeplearning4j.nn.modelimport.keras.utils.KerasModelBuilder [^KerasModelBuilder this input-shape]
    (-> this (.inputShape input-shape))))

(defn close
  "Close all HDF5 archives for this model builder."
  ([^KerasModelBuilder this]
    (-> this (.close))))

(defn model-json-input-stream
  "Set model architecture from input stream of model JSON.

  model-json-input-stream - Input stream of model JSON - `java.io.InputStream`

  returns: Model builder - `org.deeplearning4j.nn.modelimport.keras.utils.KerasModelBuilder`

  throws: java.io.IOException - I/O exception"
  (^org.deeplearning4j.nn.modelimport.keras.utils.KerasModelBuilder [^KerasModelBuilder this ^java.io.InputStream model-json-input-stream]
    (-> this (.modelJsonInputStream model-json-input-stream))))

(defn dim-order
  "Manually set dim order for Keras model, i.e. either TENSORFLOW (channels last)
  or THEANO (channels first).
  Dim ordering will be automatically inferred from your model file, so don't
  tamper with this option unless you're sure what you're doing. Explicitly
  setting dim ordering can be useful for very old Keras models (before version 1.2),
  for which inference can be difficult.

  dim-order - Ordering of dimensions (channels first vs. last) - `org.deeplearning4j.nn.modelimport.keras.KerasLayer$DimOrder`

  returns: Model builder - `org.deeplearning4j.nn.modelimport.keras.utils.KerasModelBuilder`"
  (^org.deeplearning4j.nn.modelimport.keras.utils.KerasModelBuilder [^KerasModelBuilder this ^org.deeplearning4j.nn.modelimport.keras.KerasLayer$DimOrder dim-order]
    (-> this (.dimOrder dim-order))))

(defn weights-hdf-5-filename
  "Set weights of the model by providing the file name of the corresponding weights HDF5 file.
  The root of the HDF5 group containing weights will be read and set from the configuration of this
  model builder instance.

  weights-hdf-5-filename - File name of weights HDF5 - `java.lang.String`

  returns: Model builder - `org.deeplearning4j.nn.modelimport.keras.utils.KerasModelBuilder`

  throws: java.io.IOException"
  (^org.deeplearning4j.nn.modelimport.keras.utils.KerasModelBuilder [^KerasModelBuilder this ^java.lang.String weights-hdf-5-filename]
    (-> this (.weightsHdf5Filename weights-hdf-5-filename))))

(defn model-json
  "Set model architecture from model JSON string.

  model-json - model as JSON string. - `java.lang.String`

  returns: Model Builder - `org.deeplearning4j.nn.modelimport.keras.utils.KerasModelBuilder`"
  (^org.deeplearning4j.nn.modelimport.keras.utils.KerasModelBuilder [^KerasModelBuilder this ^java.lang.String model-json]
    (-> this (.modelJson model-json))))

(defn build-model
  "Build a KerasModel (corresponding to ComputationGraph) from this model builder.

  returns: KerasModel - `org.deeplearning4j.nn.modelimport.keras.KerasModel`

  throws: java.io.IOException - I/O exception"
  (^org.deeplearning4j.nn.modelimport.keras.KerasModel [^KerasModelBuilder this]
    (-> this (.buildModel))))

(defn model-yaml
  "Set model architecture from model YAML string.

  model-yaml - model as YAML string. - `java.lang.String`

  returns: Model Builder - `org.deeplearning4j.nn.modelimport.keras.utils.KerasModelBuilder`"
  (^org.deeplearning4j.nn.modelimport.keras.utils.KerasModelBuilder [^KerasModelBuilder this ^java.lang.String model-yaml]
    (-> this (.modelYaml model-yaml))))

