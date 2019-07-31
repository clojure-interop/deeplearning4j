(ns org.deeplearning4j.nn.conf.layers.samediff.SameDiffLayer
  "A base layer used for implementing Deeplearning4j layers using SameDiff. These layers are not scoring/output layers:
 that is, they should be used as the intermediate layer in a network only.
 To implement an output layer, extend SameDiffOutputLayer instead.
 Note also that if multiple inputs are required, it is possible to implement a vertex instead: SameDiffVertex

 To implement a Deeplearning layer using SameDiff, extend this class.
 There are 4 required methods:
 - defineLayer: Defines the forward pass for the layer
 - defineParameters: Define the layer's parameters in a way suitable for DL4J
 - initializeParameters: if required, set the initial parameter values for the layer
 - getOutputType: determine the type of output/activations for the layer (without actually executing the layer's
 forward pass)

 Furthermore, there are 3 optional methods:
 - setNIn(InputType inputType, boolean override): if implemented, set the number of inputs to the layer during network
 initialization
 - getPreProcessorForInputType: return the preprocessor that should be added (if any), for the given input type
 - applyGlobalConfigToLayer: apply any global configuration options (weight init, activation functions etc) to the
 layer's configuration."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers.samediff SameDiffLayer]))

(defn define-layer
  "Define the layer

  same-diff - SameDiff instance - `org.nd4j.autodiff.samediff.SameDiff`
  layer-input - Input to the layer - `org.nd4j.autodiff.samediff.SDVariable`
  param-table - Parameter table - keys as defined by AbstractSameDiffLayer.defineParameters(SDLayerParams) - `java.util.Map`

  returns: The final layer variable corresponding to the activations/output from the forward pass - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiffLayer this ^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable layer-input ^java.util.Map param-table]
    (-> this (.defineLayer same-diff layer-input param-table))))

(defn instantiate
  "conf - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`
  training-listeners - `java.util.Collection`
  layer-index - `int`
  layer-params-view - `org.nd4j.linalg.api.ndarray.INDArray`
  initialize-params - `boolean`

  returns: `org.deeplearning4j.nn.api.Layer`"
  (^org.deeplearning4j.nn.api.Layer [^SameDiffLayer this ^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf ^java.util.Collection training-listeners ^Integer layer-index ^org.nd4j.linalg.api.ndarray.INDArray layer-params-view ^Boolean initialize-params]
    (-> this (.instantiate conf training-listeners layer-index layer-params-view initialize-params))))

