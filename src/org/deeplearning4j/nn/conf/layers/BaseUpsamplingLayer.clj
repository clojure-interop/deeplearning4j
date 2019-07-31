(ns org.deeplearning4j.nn.conf.layers.BaseUpsamplingLayer
  "Upsampling base layer"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers BaseUpsamplingLayer]))

(defn clone
  "returns: `org.deeplearning4j.nn.conf.layers.BaseUpsamplingLayer`"
  (^org.deeplearning4j.nn.conf.layers.BaseUpsamplingLayer [^BaseUpsamplingLayer this]
    (-> this (.clone))))

(defn initializer
  "returns: The parameter initializer for this model - `org.deeplearning4j.nn.api.ParamInitializer`"
  (^org.deeplearning4j.nn.api.ParamInitializer [^BaseUpsamplingLayer this]
    (-> this (.initializer))))

(defn set-n-in
  "Description copied from class: Layer

  input-type - Input type for this layer - `org.deeplearning4j.nn.conf.inputs.InputType`
  override - If false: only set the nIn value if it's not already set. If true: set it regardless of whether it'salready set or not. - `boolean`"
  ([^BaseUpsamplingLayer this ^org.deeplearning4j.nn.conf.inputs.InputType input-type ^Boolean override]
    (-> this (.setNIn input-type override))))

(defn get-pre-processor-for-input-type
  "Description copied from class: Layer

  input-type - InputType to this layer - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: Null if no preprocessor is required, otherwise the type of preprocessor necessary for this layer/input combination - `org.deeplearning4j.nn.conf.InputPreProcessor`"
  (^org.deeplearning4j.nn.conf.InputPreProcessor [^BaseUpsamplingLayer this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getPreProcessorForInputType input-type))))

(defn get-l-1-by-param
  "Description copied from class: Layer

  param-name - Parameter name - `java.lang.String`

  returns: L1 value for that parameter - `double`"
  (^Double [^BaseUpsamplingLayer this ^java.lang.String param-name]
    (-> this (.getL1ByParam param-name))))

(defn get-l-2-by-param
  "Description copied from class: Layer

  param-name - Parameter name - `java.lang.String`

  returns: L2 value for that parameter - `double`"
  (^Double [^BaseUpsamplingLayer this ^java.lang.String param-name]
    (-> this (.getL2ByParam param-name))))

(defn pretrain-param?
  "Description copied from class: Layer

  param-name - Parameter name/key - `java.lang.String`

  returns: True if the parameter is for layerwise pretraining only, false otherwise - `boolean`"
  (^Boolean [^BaseUpsamplingLayer this ^java.lang.String param-name]
    (-> this (.isPretrainParam param-name))))

