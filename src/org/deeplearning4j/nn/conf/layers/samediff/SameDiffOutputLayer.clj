(ns org.deeplearning4j.nn.conf.layers.samediff.SameDiffOutputLayer
  "A base layer used for implementing Deeplearning4j Output layers using SameDiff. These layers are scoring/output layers:
 they should only be used as the final layer a network. For general/intermediate
 To implement a Deeplearinng layer using SameDiff, extend this class.
 There are 5 required methods:
 - defineLayer: Defines the forward pass for the layer
 - defineParameters: Define the layer's parameters in a way suitable for DL4J
 - initializeParameters: if required, set the initial parameter values for the layer
 - getOutputType: determine the type of output/activations for the layer (without actually executing the layer's
 forward pass)
 - activationsVertexName(): see activationsVertexName() for details

 Furthermore, there are 3 optional methods:
 - setNIn(InputType inputType, boolean override): if implemented, set the number of inputs to the layer during network
 initialization
 - getPreProcessorForInputType: return the preprocessor that should be added (if any), for the given input type
 - applyGlobalConfigToLayer: apply any global configuration options (weight init, activation functions etc) to the
 layer's configuration.
 - labelsRequired: see labelsRequired() for details"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers.samediff SameDiffOutputLayer]))

(defn define-layer
  "Define the output layer

  same-diff - SameDiff instance - `org.nd4j.autodiff.samediff.SameDiff`
  layer-input - Input to the layer - `org.nd4j.autodiff.samediff.SDVariable`
  labels - Labels variable (or null if labelsRequired() returns false - `org.nd4j.autodiff.samediff.SDVariable`
  param-table - Parameter table - keys as defined by AbstractSameDiffLayer.defineParameters(SDLayerParams) - `java.util.Map`

  returns: The final layer variable corresponding to the score/loss during forward pass. This must be a single scalar value. - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiffOutputLayer this ^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable layer-input ^org.nd4j.autodiff.samediff.SDVariable labels ^java.util.Map param-table]
    (-> this (.defineLayer same-diff layer-input labels param-table))))

(defn activations-vertex-name
  "Output layers should terminate in a single scalar value (i.e., a score) - however, sometimes the output activations
  (such as softmax probabilities) need to be returned. When this is the case, we need to know the name of the
  SDVariable that corresponds to these.
  If the final network activations are just the input to the layer, simply return \"input\"

  returns: The name of the activations to return when performing forward pass - `java.lang.String`"
  (^java.lang.String [^SameDiffOutputLayer this]
    (-> this (.activationsVertexName))))

(defn labels-required
  "Whether labels are required for calculating the score. Defaults to true - however, if the score
  can be calculated without labels (for example, in some output layers used for unsupervised learning)
  this can be set to false.

  returns: True if labels are required to calculate the score/output, false otherwise. - `boolean`"
  (^Boolean [^SameDiffOutputLayer this]
    (-> this (.labelsRequired))))

(defn instantiate
  "conf - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`
  training-listeners - `java.util.Collection`
  layer-index - `int`
  layer-params-view - `org.nd4j.linalg.api.ndarray.INDArray`
  initialize-params - `boolean`

  returns: `org.deeplearning4j.nn.api.Layer`"
  (^org.deeplearning4j.nn.api.Layer [^SameDiffOutputLayer this ^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf ^java.util.Collection training-listeners ^Integer layer-index ^org.nd4j.linalg.api.ndarray.INDArray layer-params-view ^Boolean initialize-params]
    (-> this (.instantiate conf training-listeners layer-index layer-params-view initialize-params))))

