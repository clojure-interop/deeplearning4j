(ns org.deeplearning4j.nn.transferlearning.TransferLearningHelper
  "This class is intended for use with the transfer learning API.
 Often times transfer learning models have \"frozen\" layers where parameters are held constant during training
 For ease of training and quick turn around times, the dataset to be trained on can be featurized and saved to disk.
 Featurizing in this case refers to conducting a forward pass on the network and saving the activations from the output
 of the frozen layers.
 During training the forward pass and the backward pass through the frozen layers can be skipped entirely and the \"featurized\"
 dataset can be fit with the smaller unfrozen part of the computation graph which allows for quicker iterations.
 The class internally traverses the computation graph/MLN and builds an instance of the computation graph/MLN that is
 equivalent to the unfrozen subset."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.transferlearning TransferLearningHelper]))

(defn ->transfer-learning-helper
  "Constructor.

  Will modify the given comp graph (in place!) to freeze vertices from input to the vertex specified.

  orig - Comp graph - `org.deeplearning4j.nn.graph.ComputationGraph`
  frozen-output-at - vertex to freeze at (hold params constant during training) - `java.lang.String`"
  (^TransferLearningHelper [^org.deeplearning4j.nn.graph.ComputationGraph orig ^java.lang.String frozen-output-at]
    (new TransferLearningHelper orig frozen-output-at))
  (^TransferLearningHelper [^org.deeplearning4j.nn.graph.ComputationGraph orig]
    (new TransferLearningHelper orig)))

(defn error-if-graph-if-mln
  ""
  ([^TransferLearningHelper this]
    (-> this (.errorIfGraphIfMLN))))

(defn unfrozen-graph
  "Returns the unfrozen subset of the original computation graph as a computation graph
  Note that with each call to featurizedFit the parameters to the original computation graph are also updated

  returns: `org.deeplearning4j.nn.graph.ComputationGraph`"
  (^org.deeplearning4j.nn.graph.ComputationGraph [^TransferLearningHelper this]
    (-> this (.unfrozenGraph))))

(defn unfrozen-mln
  "Returns the unfrozen layers of the MultiLayerNetwork as a multilayernetwork
  Note that with each call to featurizedFit the parameters to the original MLN are also updated

  returns: `org.deeplearning4j.nn.multilayer.MultiLayerNetwork`"
  (^org.deeplearning4j.nn.multilayer.MultiLayerNetwork [^TransferLearningHelper this]
    (-> this (.unfrozenMLN))))

(defn output-from-featurized
  "Use to get the output from a featurized input

  input - featurized data - `org.nd4j.linalg.api.ndarray.INDArray[]`

  returns: output - `org.nd4j.linalg.api.ndarray.INDArray[]`"
  ([^TransferLearningHelper this input]
    (-> this (.outputFromFeaturized input))))

(defn featurize
  "During training frozen vertices/layers can be treated as \"featurizing\" the input
  The forward pass through these frozen layer/vertices can be done in advance and the dataset saved to disk to iterate
  quickly on the smaller unfrozen part of the model
  Currently does not support datasets with feature masks

  input - multidataset to feed into the computation graph with frozen layer vertices - `org.nd4j.linalg.dataset.MultiDataSet`

  returns: a multidataset with input features that are the outputs of the frozen layer vertices and the original labels. - `org.nd4j.linalg.dataset.MultiDataSet`"
  (^org.nd4j.linalg.dataset.MultiDataSet [^TransferLearningHelper this ^org.nd4j.linalg.dataset.MultiDataSet input]
    (-> this (.featurize input))))

(defn fit-featurized
  "Fit from a featurized dataset.
  The fit is conducted on an internally instantiated subset model that is representative of the unfrozen part of the original model.
  After each call on fit the parameters for the original model are updated

  iter - `org.nd4j.linalg.dataset.api.iterator.MultiDataSetIterator`"
  ([^TransferLearningHelper this ^org.nd4j.linalg.dataset.api.iterator.MultiDataSetIterator iter]
    (-> this (.fitFeaturized iter))))

