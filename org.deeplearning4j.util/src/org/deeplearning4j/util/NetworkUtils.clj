(ns org.deeplearning4j.util.NetworkUtils
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.util NetworkUtils]))

(defn *to-computation-graph
  "Convert a MultiLayerNetwork to a ComputationGraph

  net - `org.deeplearning4j.nn.multilayer.MultiLayerNetwork`

  returns: ComputationGraph equivalent to this network (including parameters and updater state) - `org.deeplearning4j.nn.graph.ComputationGraph`"
  (^org.deeplearning4j.nn.graph.ComputationGraph [^org.deeplearning4j.nn.multilayer.MultiLayerNetwork net]
    (NetworkUtils/toComputationGraph net)))

(defn *set-learning-rate
  "Set the learning rate for a single layer in the network to the specified value. Note that if any learning rate
  schedules are currently present, these will be removed in favor of the new (fixed) learning rate.

  Note: This method not free from a performance point of view: a proper learning rate schedule
  should be used in preference to calling this method at every iteration. Note also that
  setLearningRate(MultiLayerNetwork, double) should also be used in preference, when all layers need to be set to a new LR

  net - `org.deeplearning4j.nn.multilayer.MultiLayerNetwork`
  layer-number - Number of the layer to set the LR for - `int`
  new-lr - New learning rate for a single layers - `double`"
  ([^org.deeplearning4j.nn.multilayer.MultiLayerNetwork net ^Integer layer-number ^Double new-lr]
    (NetworkUtils/setLearningRate net layer-number new-lr))
  ([^org.deeplearning4j.nn.multilayer.MultiLayerNetwork net ^Double new-lr]
    (NetworkUtils/setLearningRate net new-lr)))

(defn *get-learning-rate
  "Get the current learning rate, for the specified layer, fromthe network.
  Note: If the layer has no learning rate (no parameters, or an updater without a learning rate) then null is returned

  net - Network - `org.deeplearning4j.nn.multilayer.MultiLayerNetwork`
  layer-number - Layer number to get the learning rate for - `int`

  returns: Learning rate for the specified layer, or null - `java.lang.Double`"
  (^java.lang.Double [^org.deeplearning4j.nn.multilayer.MultiLayerNetwork net ^Integer layer-number]
    (NetworkUtils/getLearningRate net layer-number)))

(defn *output
  "Currently supports MultiLayerNetwork and ComputationGraph models.
  Pull requests to support additional org.deeplearning4j models are welcome.

  model - Model to use - `org.deeplearning4j.nn.api.Model`
  input - Inputs to the model - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: output Outputs of the model - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.deeplearning4j.nn.api.Model model ^org.nd4j.linalg.api.ndarray.INDArray input]
    (NetworkUtils/output model input)))

