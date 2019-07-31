(ns org.deeplearning4j.nn.conf.layers.NoParamLayer
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers NoParamLayer]))

(defn initializer
  "returns: The parameter initializer for this model - `org.deeplearning4j.nn.api.ParamInitializer`"
  (^org.deeplearning4j.nn.api.ParamInitializer [^NoParamLayer this]
    (-> this (.initializer))))

(defn set-n-in
  "Description copied from class: Layer

  input-type - Input type for this layer - `org.deeplearning4j.nn.conf.inputs.InputType`
  override - If false: only set the nIn value if it's not already set. If true: set it regardless of whether it'salready set or not. - `boolean`"
  ([^NoParamLayer this ^org.deeplearning4j.nn.conf.inputs.InputType input-type ^Boolean override]
    (-> this (.setNIn input-type override))))

(defn get-l-1-by-param
  "Description copied from class: Layer

  param-name - Parameter name - `java.lang.String`

  returns: L1 value for that parameter - `double`"
  (^Double [^NoParamLayer this ^java.lang.String param-name]
    (-> this (.getL1ByParam param-name))))

(defn get-l-2-by-param
  "Description copied from class: Layer

  param-name - Parameter name - `java.lang.String`

  returns: L2 value for that parameter - `double`"
  (^Double [^NoParamLayer this ^java.lang.String param-name]
    (-> this (.getL2ByParam param-name))))

(defn get-gradient-normalization
  "returns: The gradient normalization configuration - `org.deeplearning4j.nn.conf.GradientNormalization`"
  (^org.deeplearning4j.nn.conf.GradientNormalization [^NoParamLayer this]
    (-> this (.getGradientNormalization))))

(defn get-gradient-normalization-threshold
  "returns: The gradient normalization threshold - `double`"
  (^Double [^NoParamLayer this]
    (-> this (.getGradientNormalizationThreshold))))

(defn pretrain-param?
  "Description copied from class: Layer

  param-name - Parameter name/key - `java.lang.String`

  returns: True if the parameter is for layerwise pretraining only, false otherwise - `boolean`"
  (^Boolean [^NoParamLayer this ^java.lang.String param-name]
    (-> this (.isPretrainParam param-name))))

(defn pretrain?
  "returns: True if the layer is set up for layerwise pretraining - `boolean`"
  (^Boolean [^NoParamLayer this]
    (-> this (.isPretrain))))

