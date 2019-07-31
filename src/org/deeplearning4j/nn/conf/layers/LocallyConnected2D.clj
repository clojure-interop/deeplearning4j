(ns org.deeplearning4j.nn.conf.layers.LocallyConnected2D
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers LocallyConnected2D]))

(defn compute-output-size
  ""
  ([^LocallyConnected2D this]
    (-> this (.computeOutputSize))))

(defn get-output-type
  "Description copied from class: Layer

  layer-index - Index of the layer - `int`
  input-type - Type of input for the layer - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: Type of output from the layer - `org.deeplearning4j.nn.conf.inputs.InputType`"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^LocallyConnected2D this ^Integer layer-index ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getOutputType layer-index input-type))))

(defn set-n-in
  "Description copied from class: Layer

  input-type - Input type for this layer - `org.deeplearning4j.nn.conf.inputs.InputType`
  override - If false: only set the nIn value if it's not already set. If true: set it regardless of whether it'salready set or not. - `boolean`"
  ([^LocallyConnected2D this ^org.deeplearning4j.nn.conf.inputs.InputType input-type ^Boolean override]
    (-> this (.setNIn input-type override))))

(defn get-pre-processor-for-input-type
  "Description copied from class: Layer

  input-type - InputType to this layer - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: Null if no preprocessor is required, otherwise the type of preprocessor necessary for this layer/input combination - `org.deeplearning4j.nn.conf.InputPreProcessor`"
  (^org.deeplearning4j.nn.conf.InputPreProcessor [^LocallyConnected2D this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getPreProcessorForInputType input-type))))

(defn define-parameters
  "Description copied from class: AbstractSameDiffLayer

  params - Object used to set parameters for this layer - `org.deeplearning4j.nn.conf.layers.samediff.SDLayerParams`"
  ([^LocallyConnected2D this ^org.deeplearning4j.nn.conf.layers.samediff.SDLayerParams params]
    (-> this (.defineParameters params))))

(defn initialize-parameters
  "Description copied from class: AbstractSameDiffLayer

  params - Parameter arrays that may be initialized - `java.util.Map`"
  ([^LocallyConnected2D this ^java.util.Map params]
    (-> this (.initializeParameters params))))

(defn define-layer
  "Description copied from class: SameDiffLayer

  same-diff - SameDiff instance - `org.nd4j.autodiff.samediff.SameDiff`
  layer-input - Input to the layer - `org.nd4j.autodiff.samediff.SDVariable`
  param-table - Parameter table - keys as defined by AbstractSameDiffLayer.defineParameters(SDLayerParams) - `java.util.Map`

  returns: The final layer variable corresponding to the activations/output from the forward pass - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^LocallyConnected2D this ^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable layer-input ^java.util.Map param-table]
    (-> this (.defineLayer same-diff layer-input param-table))))

(defn apply-global-config-to-layer
  "global-config - `org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder`"
  ([^LocallyConnected2D this ^org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder global-config]
    (-> this (.applyGlobalConfigToLayer global-config))))

