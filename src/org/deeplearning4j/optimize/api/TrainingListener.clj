(ns org.deeplearning4j.optimize.api.TrainingListener
  "A listener interface for training DL4J models.
 The methods here will be called at various points during training, and only during training.
 Note that users can extend BaseTrainingListener and selectively override the required methods,
 instead of implementing TrainingListener directly and having a number of no-op methods."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.optimize.api TrainingListener]))

(defn iteration-done
  "Event listener for each iteration. Called once, after each parameter update has ocurred while training the network

  model - the model iterating - `org.deeplearning4j.nn.api.Model`
  iteration - the iteration - `int`
  epoch - `int`"
  ([^TrainingListener this ^org.deeplearning4j.nn.api.Model model ^Integer iteration ^Integer epoch]
    (-> this (.iterationDone model iteration epoch))))

(defn on-epoch-start
  "Called once at the start of each epoch, when using methods such as MultiLayerNetwork.fit(DataSetIterator),
  ComputationGraph.fit(DataSetIterator) or ComputationGraph.fit(MultiDataSetIterator)

  model - `org.deeplearning4j.nn.api.Model`"
  ([^TrainingListener this ^org.deeplearning4j.nn.api.Model model]
    (-> this (.onEpochStart model))))

(defn on-epoch-end
  "Called once at the end of each epoch, when using methods such as MultiLayerNetwork.fit(DataSetIterator),
  ComputationGraph.fit(DataSetIterator) or ComputationGraph.fit(MultiDataSetIterator)

  model - `org.deeplearning4j.nn.api.Model`"
  ([^TrainingListener this ^org.deeplearning4j.nn.api.Model model]
    (-> this (.onEpochEnd model))))

(defn on-forward-pass
  "Called once per iteration (forward pass) for activations (usually for a MultiLayerNetwork),
  only at training time

  model - Model - `org.deeplearning4j.nn.api.Model`
  activations - Layer activations (including input) - `java.util.List`"
  ([^TrainingListener this ^org.deeplearning4j.nn.api.Model model ^java.util.List activations]
    (-> this (.onForwardPass model activations))))

(defn on-gradient-calculation
  "Called once per iteration (backward pass) before the gradients are updated
  Gradients are available via Model.gradient().
  Note that gradients will likely be updated in-place - thus they should be copied or processed synchronously
  in this method.

  For updates (gradients post learning rate/momentum/rmsprop etc) see onBackwardPass(Model)

  model - Model - `org.deeplearning4j.nn.api.Model`"
  ([^TrainingListener this ^org.deeplearning4j.nn.api.Model model]
    (-> this (.onGradientCalculation model))))

(defn on-backward-pass
  "Called once per iteration (backward pass) after gradients have been calculated, and updated
  Gradients are available via Model.gradient().

  Unlike onGradientCalculation(Model) the gradients at this point will be post-update, rather than
  raw (pre-update) gradients at that method call.

  model - Model - `org.deeplearning4j.nn.api.Model`"
  ([^TrainingListener this ^org.deeplearning4j.nn.api.Model model]
    (-> this (.onBackwardPass model))))

