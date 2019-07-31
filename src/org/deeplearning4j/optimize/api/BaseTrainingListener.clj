(ns org.deeplearning4j.optimize.api.BaseTrainingListener
  "A no-op implementation of a TrainingListener to be used as a starting point for custom training callbacks.
 Extend this and selectively override the methods you will actually use."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.optimize.api BaseTrainingListener]))

(defn ->base-training-listener
  "Constructor."
  (^BaseTrainingListener []
    (new BaseTrainingListener )))

(defn on-epoch-start
  "Description copied from interface: TrainingListener

  model - `org.deeplearning4j.nn.api.Model`"
  ([^BaseTrainingListener this ^org.deeplearning4j.nn.api.Model model]
    (-> this (.onEpochStart model))))

(defn on-epoch-end
  "Description copied from interface: TrainingListener

  model - `org.deeplearning4j.nn.api.Model`"
  ([^BaseTrainingListener this ^org.deeplearning4j.nn.api.Model model]
    (-> this (.onEpochEnd model))))

(defn on-forward-pass
  "Description copied from interface: TrainingListener

  model - Model - `org.deeplearning4j.nn.api.Model`
  activations - Layer activations (including input) - `java.util.List`"
  ([^BaseTrainingListener this ^org.deeplearning4j.nn.api.Model model ^java.util.List activations]
    (-> this (.onForwardPass model activations))))

(defn on-gradient-calculation
  "Description copied from interface: TrainingListener

  model - Model - `org.deeplearning4j.nn.api.Model`"
  ([^BaseTrainingListener this ^org.deeplearning4j.nn.api.Model model]
    (-> this (.onGradientCalculation model))))

(defn on-backward-pass
  "Description copied from interface: TrainingListener

  model - Model - `org.deeplearning4j.nn.api.Model`"
  ([^BaseTrainingListener this ^org.deeplearning4j.nn.api.Model model]
    (-> this (.onBackwardPass model))))

(defn iteration-done
  "Description copied from interface: TrainingListener

  model - the model iterating - `org.deeplearning4j.nn.api.Model`
  iteration - the iteration - `int`
  epoch - `int`"
  ([^BaseTrainingListener this ^org.deeplearning4j.nn.api.Model model ^Integer iteration ^Integer epoch]
    (-> this (.iterationDone model iteration epoch))))

