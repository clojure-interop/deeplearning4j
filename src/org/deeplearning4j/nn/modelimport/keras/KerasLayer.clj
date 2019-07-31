(ns org.deeplearning4j.nn.modelimport.keras.KerasLayer
  "Build Layer from Keras layer configuration."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.modelimport.keras KerasLayer]))

(defn *register-lambda-layer
  "Register a lambda layer

  lambda-layer-name - name of the lambda layer in the serialized Keras model - `java.lang.String`
  same-diff-lambda-layer - SameDiffLambdaLayer instance to map to Keras Lambda layer - `org.deeplearning4j.nn.conf.layers.samediff.SameDiffLambdaLayer`"
  ([^java.lang.String lambda-layer-name ^org.deeplearning4j.nn.conf.layers.samediff.SameDiffLambdaLayer same-diff-lambda-layer]
    (KerasLayer/registerLambdaLayer lambda-layer-name same-diff-lambda-layer)))

(defn *clear-lambda-layers
  "Clear all lambda layers"
  ([]
    (KerasLayer/clearLambdaLayers )))

(defn *register-custom-layer
  "Register a custom layer

  layer-name - name of custom layer class - `java.lang.String`
  config-class - class of custom layer - `java.lang.Class`"
  ([^java.lang.String layer-name ^java.lang.Class config-class]
    (KerasLayer/registerCustomLayer layer-name config-class)))

(defn *clear-custom-layers
  "Clear all custom layers"
  ([]
    (KerasLayer/clearCustomLayers )))

(defn get-vertex
  "Gets corresponding DL4J Vertex, if any.

  returns: DL4J Vertex - `org.deeplearning4j.nn.conf.graph.GraphVertex`"
  (^org.deeplearning4j.nn.conf.graph.GraphVertex [^KerasLayer this]
    (-> this (.getVertex))))

(defn get-input-shape
  "Get layer input shape.

  returns: input shape - `int[]`"
  ([^KerasLayer this]
    (-> this (.getInputShape))))

(defn set-inbound-layer-names
  "Set list of inbound layers.

  inbound-layer-names - list of inbound layer naems - `java.util.List`"
  ([^KerasLayer this ^java.util.List inbound-layer-names]
    (-> this (.setInboundLayerNames inbound-layer-names))))

(defn get-class-name
  "Get Keras layer class name.

  returns: Keras layer class name - `java.lang.String`"
  (^java.lang.String [^KerasLayer this]
    (-> this (.getClassName))))

(defn layer?
  "Whether this Keras layer maps to a DL4J Layer.

  returns: true or false - `boolean`"
  (^Boolean [^KerasLayer this]
    (-> this (.isLayer))))

(defn copy-weights-to-layer
  "Copy Keras layer weights to DL4J Layer.

  layer - DL4J layer - `org.deeplearning4j.nn.api.Layer`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras configuration"
  ([^KerasLayer this ^org.deeplearning4j.nn.api.Layer layer]
    (-> this (.copyWeightsToLayer layer))))

(defn get-num-params
  "Returns number of trainable parameters in layer.

  returns: number of trainable parameters - `int`"
  (^Integer [^KerasLayer this]
    (-> this (.getNumParams))))

(defn get-layer
  "Gets corresponding DL4J Layer, if any.

  returns: DL4J Layer - `org.deeplearning4j.nn.conf.layers.Layer`"
  (^org.deeplearning4j.nn.conf.layers.Layer [^KerasLayer this]
    (-> this (.getLayer))))

(defn get-layer-name
  "Get Keras layer name.

  returns: layer name - `java.lang.String`"
  (^java.lang.String [^KerasLayer this]
    (-> this (.getLayerName))))

(defn set-weights
  "Set weights for Keras layer.

  weights - Map of named NDArrays - `java.util.Map`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException"
  ([^KerasLayer this ^java.util.Map weights]
    (-> this (.setWeights weights))))

(defn get-output-type
  "Get layer output type.

  input-type - Array of InputTypes - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: output type as InputType - `org.deeplearning4j.nn.conf.inputs.InputType`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras configuration"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^KerasLayer this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getOutputType input-type))))

(defn get-weights
  "returns: `java.util.Map<java.lang.String,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^java.util.Map [^KerasLayer this]
    (-> this (.getWeights))))

(defn get-inbound-layer-names
  "Get list of inbound layers.

  returns: list of inbound layer names - `java.util.List<java.lang.String>`"
  (^java.util.List [^KerasLayer this]
    (-> this (.getInboundLayerNames))))

(defn vertex?
  "Whether this Keras layer maps to a DL4J Vertex.

  returns: true or false - `boolean`"
  (^Boolean [^KerasLayer this]
    (-> this (.isVertex))))

(defn get-keras-major-version
  "Get Keras major version of this layer.

  returns: Keras version as integer - `java.lang.Integer`"
  (^java.lang.Integer [^KerasLayer this]
    (-> this (.getKerasMajorVersion))))

(defn get-input-preprocessor
  "Gets appropriate DL4J InputPreProcessor for given InputTypes.

  input-type - Array of InputTypes - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: DL4J InputPreProcessor - `org.deeplearning4j.nn.conf.InputPreProcessor`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras configuration"
  (^org.deeplearning4j.nn.conf.InputPreProcessor [^KerasLayer this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getInputPreprocessor input-type))))

(defn uses-regularization
  "Indicates whether layer uses regularization.

  returns: boolean - `boolean`"
  (^Boolean [^KerasLayer this]
    (-> this (.usesRegularization))))

(defn valid-inbound-layer?
  "Indicates whether this layer a valid inbound layer. Currently, only
  (known) DL4J Layers and inputs are valid inbound layers. \"Preprocessor\"
  layers (reshaping, merging, etc.) are replaced by their own inbound layers.

  returns: boolean indicating whether layer is valid inbound layer - `boolean`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException"
  (^Boolean [^KerasLayer this]
    (-> this (.isValidInboundLayer))))

(defn input-pre-processor?
  "Whether this Keras layer maps to a DL4J InputPreProcessor.

  returns: true or false - `boolean`"
  (^Boolean [^KerasLayer this]
    (-> this (.isInputPreProcessor))))

