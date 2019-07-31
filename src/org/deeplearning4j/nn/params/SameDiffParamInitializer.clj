(ns org.deeplearning4j.nn.params.SameDiffParamInitializer
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.params SameDiffParamInitializer]))

(defn ->same-diff-param-initializer
  "Constructor."
  (^SameDiffParamInitializer []
    (new SameDiffParamInitializer )))

(defn *get-instance
  "returns: `org.deeplearning4j.nn.params.SameDiffParamInitializer`"
  (^org.deeplearning4j.nn.params.SameDiffParamInitializer []
    (SameDiffParamInitializer/getInstance )))

(defn subset-and-reshape
  "params - `java.util.List`
  param-shapes - `java.util.Map`
  view - `org.nd4j.linalg.api.ndarray.INDArray`
  sdl - `org.deeplearning4j.nn.conf.layers.samediff.AbstractSameDiffLayer`
  sdv - `org.deeplearning4j.nn.conf.layers.samediff.SameDiffVertex`

  returns: `java.util.Map<java.lang.String,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^java.util.Map [^SameDiffParamInitializer this ^java.util.List params ^java.util.Map param-shapes ^org.nd4j.linalg.api.ndarray.INDArray view ^org.deeplearning4j.nn.conf.layers.samediff.AbstractSameDiffLayer sdl ^org.deeplearning4j.nn.conf.layers.samediff.SameDiffVertex sdv]
    (-> this (.subsetAndReshape params param-shapes view sdl sdv))))

(defn num-params
  "conf - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`

  returns: `long`"
  (^Long [^SameDiffParamInitializer this ^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf]
    (-> this (.numParams conf))))

(defn bias-param?
  "Description copied from interface: ParamInitializer

  layer - Layer - `org.deeplearning4j.nn.conf.layers.Layer`
  key - Key to check - `java.lang.String`

  returns: True if parameter is a bias - `boolean`"
  (^Boolean [^SameDiffParamInitializer this ^org.deeplearning4j.nn.conf.layers.Layer layer ^java.lang.String key]
    (-> this (.isBiasParam layer key))))

(defn param-keys
  "Description copied from interface: ParamInitializer

  layer - Layer - `org.deeplearning4j.nn.conf.layers.Layer`

  returns: All parameter keys - `java.util.List<java.lang.String>`"
  (^java.util.List [^SameDiffParamInitializer this ^org.deeplearning4j.nn.conf.layers.Layer layer]
    (-> this (.paramKeys layer))))

(defn init
  "Description copied from interface: ParamInitializer

  conf - the configuration - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`
  params-view - a view of the full network (backprop) parameters - `org.nd4j.linalg.api.ndarray.INDArray`
  initialize-params - if true: initialize the parameters according to the configuration. If false: don't modify thevalues in the paramsView array (but do select out the appropriate subset, reshape etc as required) - `boolean`

  returns: Map of parameters keyed by type (view of the 'paramsView' array) - `java.util.Map<java.lang.String,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^java.util.Map [^SameDiffParamInitializer this ^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf ^org.nd4j.linalg.api.ndarray.INDArray params-view ^Boolean initialize-params]
    (-> this (.init conf params-view initialize-params))))

(defn weight-keys
  "Description copied from interface: ParamInitializer

  layer - Layer - `org.deeplearning4j.nn.conf.layers.Layer`

  returns: Weight parameter keys - `java.util.List<java.lang.String>`"
  (^java.util.List [^SameDiffParamInitializer this ^org.deeplearning4j.nn.conf.layers.Layer layer]
    (-> this (.weightKeys layer))))

(defn get-gradients-from-flattened
  "Description copied from interface: ParamInitializer

  conf - Configuration - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`
  gradient-view - The flattened gradients array, as a view of the larger array - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: A map containing an array by parameter type, that is a view of the full network gradients array - `java.util.Map<java.lang.String,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^java.util.Map [^SameDiffParamInitializer this ^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf ^org.nd4j.linalg.api.ndarray.INDArray gradient-view]
    (-> this (.getGradientsFromFlattened conf gradient-view))))

(defn weight-param?
  "Description copied from interface: ParamInitializer

  layer - Layer - `org.deeplearning4j.nn.conf.layers.Layer`
  key - Key to check - `java.lang.String`

  returns: True if parameter is a weight - `boolean`"
  (^Boolean [^SameDiffParamInitializer this ^org.deeplearning4j.nn.conf.layers.Layer layer ^java.lang.String key]
    (-> this (.isWeightParam layer key))))

(defn bias-keys
  "Description copied from interface: ParamInitializer

  layer - Layer - `org.deeplearning4j.nn.conf.layers.Layer`

  returns: Bias parameter keys - `java.util.List<java.lang.String>`"
  (^java.util.List [^SameDiffParamInitializer this ^org.deeplearning4j.nn.conf.layers.Layer layer]
    (-> this (.biasKeys layer))))

