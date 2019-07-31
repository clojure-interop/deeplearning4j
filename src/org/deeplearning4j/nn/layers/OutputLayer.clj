(ns org.deeplearning4j.nn.layers.OutputLayer
  "Output layer with different objective
 incooccurrences for different objectives.
 This includes classification as well as prediction"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.layers OutputLayer]))

(defn ->output-layer
  "Constructor.

  conf - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`
  input - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^OutputLayer [^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf ^org.nd4j.linalg.api.ndarray.INDArray input]
    (new OutputLayer conf input))
  (^OutputLayer [^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf]
    (new OutputLayer conf)))

