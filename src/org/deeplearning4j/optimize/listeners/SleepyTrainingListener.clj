(ns org.deeplearning4j.optimize.listeners.SleepyTrainingListener
  "This TrainingListener implementation provides a way to \"sleep\" during specific Neural Network training phases.
 Suitable for debugging/testing purposes.
 PLEASE NOTE: All timers treat time values as milliseconds.
 PLEASE NOTE: Do not use it in production environment."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.optimize.listeners SleepyTrainingListener]))

(defn ->sleepy-training-listener
  "Constructor."
  (^SleepyTrainingListener []
    (new SleepyTrainingListener )))

(defn on-epoch-start
  "Description copied from interface: TrainingListener

  model - `org.deeplearning4j.nn.api.Model`"
  ([^SleepyTrainingListener this ^org.deeplearning4j.nn.api.Model model]
    (-> this (.onEpochStart model))))

(defn on-epoch-end
  "Description copied from interface: TrainingListener

  model - `org.deeplearning4j.nn.api.Model`"
  ([^SleepyTrainingListener this ^org.deeplearning4j.nn.api.Model model]
    (-> this (.onEpochEnd model))))

(defn on-forward-pass
  "Description copied from interface: TrainingListener

  model - Model - `org.deeplearning4j.nn.api.Model`
  activations - Layer activations (including input) - `java.util.List`"
  ([^SleepyTrainingListener this ^org.deeplearning4j.nn.api.Model model ^java.util.List activations]
    (-> this (.onForwardPass model activations))))

(defn iteration-done
  "Description copied from interface: TrainingListener

  model - the model iterating - `org.deeplearning4j.nn.api.Model`
  iteration - the iteration - `int`
  epoch - `int`"
  ([^SleepyTrainingListener this ^org.deeplearning4j.nn.api.Model model ^Integer iteration ^Integer epoch]
    (-> this (.iterationDone model iteration epoch))))

(defn on-backward-pass
  "Description copied from interface: TrainingListener

  model - Model - `org.deeplearning4j.nn.api.Model`"
  ([^SleepyTrainingListener this ^org.deeplearning4j.nn.api.Model model]
    (-> this (.onBackwardPass model))))

(defn on-gradient-calculation
  "Description copied from interface: TrainingListener

  model - Model - `org.deeplearning4j.nn.api.Model`"
  ([^SleepyTrainingListener this ^org.deeplearning4j.nn.api.Model model]
    (-> this (.onGradientCalculation model))))

