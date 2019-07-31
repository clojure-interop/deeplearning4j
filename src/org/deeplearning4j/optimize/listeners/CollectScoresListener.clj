(ns org.deeplearning4j.optimize.listeners.CollectScoresListener
  "A simple listener that collects scores to a list every N iterations. Can also optionally log the score."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.optimize.listeners CollectScoresListener]))

(defn ->collect-scores-listener
  "Constructor.

  frequency - `int`
  log-score - `boolean`"
  (^CollectScoresListener [^Integer frequency ^Boolean log-score]
    (new CollectScoresListener frequency log-score))
  (^CollectScoresListener [^Integer frequency]
    (new CollectScoresListener frequency)))

(defn iteration-done
  "Description copied from interface: TrainingListener

  model - the model iterating - `org.deeplearning4j.nn.api.Model`
  iteration - the iteration - `int`
  epoch - `int`"
  ([^CollectScoresListener this ^org.deeplearning4j.nn.api.Model model ^Integer iteration ^Integer epoch]
    (-> this (.iterationDone model iteration epoch))))

