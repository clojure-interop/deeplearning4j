(ns org.deeplearning4j.optimize.listeners.ScoreIterationListener
  "Score iteration listener"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.optimize.listeners ScoreIterationListener]))

(defn ->score-iteration-listener
  "Constructor.

  Default constructor printing every 10 iterations"
  (^ScoreIterationListener []
    (new ScoreIterationListener ))
  (^ScoreIterationListener [^Integer print-iterations]
    (new ScoreIterationListener print-iterations)))

(defn iteration-done
  "Description copied from interface: TrainingListener

  model - the model iterating - `org.deeplearning4j.nn.api.Model`
  iteration - the iteration - `int`
  epoch - `int`"
  ([^ScoreIterationListener this ^org.deeplearning4j.nn.api.Model model ^Integer iteration ^Integer epoch]
    (-> this (.iterationDone model iteration epoch))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ScoreIterationListener this]
    (-> this (.toString))))

