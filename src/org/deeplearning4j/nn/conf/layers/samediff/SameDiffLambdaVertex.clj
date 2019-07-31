(ns org.deeplearning4j.nn.conf.layers.samediff.SameDiffLambdaVertex
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers.samediff SameDiffLambdaVertex]))

(defn ->same-diff-lambda-vertex
  "Constructor."
  (^SameDiffLambdaVertex []
    (new SameDiffLambdaVertex )))

(defn define-vertex
  "Description copied from class: SameDiffVertex

  same-diff - SameDiff instance - `org.nd4j.autodiff.samediff.SameDiff`
  layer-input - Input to the layer - keys as defined by SameDiffVertex.defineParametersAndInputs(SDVertexParams) - `java.util.Map`
  param-table - Parameter table - keys as defined by SameDiffVertex.defineParametersAndInputs(SDVertexParams) - `java.util.Map`

  returns: The final layer variable corresponding to the activations/output from the forward pass - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiffLambdaVertex this ^org.nd4j.autodiff.samediff.SameDiff same-diff ^java.util.Map layer-input ^java.util.Map param-table]
    (-> this (.defineVertex same-diff layer-input param-table)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiffLambdaVertex this ^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.deeplearning4j.nn.conf.layers.samediff.SameDiffLambdaVertex$VertexInputs inputs]
    (-> this (.defineVertex same-diff inputs))))

(defn define-parameters-and-inputs
  "Description copied from class: SameDiffVertex

  params - Object used to set parameters for this layer - `org.deeplearning4j.nn.conf.layers.samediff.SDVertexParams`"
  ([^SameDiffLambdaVertex this ^org.deeplearning4j.nn.conf.layers.samediff.SDVertexParams params]
    (-> this (.defineParametersAndInputs params))))

(defn initialize-parameters
  "Description copied from class: SameDiffVertex

  params - Parameter arrays that may be initialized - `java.util.Map`"
  ([^SameDiffLambdaVertex this ^java.util.Map params]
    (-> this (.initializeParameters params))))

