(ns org.deeplearning4j.nn.conf.layers.samediff.SameDiffLambdaLayer
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers.samediff SameDiffLambdaLayer]))

(defn ->same-diff-lambda-layer
  "Constructor."
  (^SameDiffLambdaLayer []
    (new SameDiffLambdaLayer )))

(defn define-layer
  "Description copied from class: SameDiffLayer

  same-diff - SameDiff instance - `org.nd4j.autodiff.samediff.SameDiff`
  layer-input - Input to the layer - `org.nd4j.autodiff.samediff.SDVariable`
  param-table - Parameter table - keys as defined by AbstractSameDiffLayer.defineParameters(SDLayerParams) - `java.util.Map`

  returns: The final layer variable corresponding to the activations/output from the forward pass - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiffLambdaLayer this ^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable layer-input ^java.util.Map param-table]
    (-> this (.defineLayer same-diff layer-input param-table)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiffLambdaLayer this ^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable layer-input]
    (-> this (.defineLayer same-diff layer-input))))

(defn get-output-type
  "Description copied from class: Layer

  layer-index - Index of the layer - `int`
  input-type - Type of input for the layer - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: Type of output from the layer - `org.deeplearning4j.nn.conf.inputs.InputType`"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^SameDiffLambdaLayer this ^Integer layer-index ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getOutputType layer-index input-type))))

(defn define-parameters
  "Description copied from class: AbstractSameDiffLayer

  params - Object used to set parameters for this layer - `org.deeplearning4j.nn.conf.layers.samediff.SDLayerParams`"
  ([^SameDiffLambdaLayer this ^org.deeplearning4j.nn.conf.layers.samediff.SDLayerParams params]
    (-> this (.defineParameters params))))

(defn initialize-parameters
  "Description copied from class: AbstractSameDiffLayer

  params - Parameter arrays that may be initialized - `java.util.Map`"
  ([^SameDiffLambdaLayer this ^java.util.Map params]
    (-> this (.initializeParameters params))))

