(ns org.deeplearning4j.optimize.listeners.ComposableIterationListener
  "A group of listeners"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.optimize.listeners ComposableIterationListener]))

(defn ->composable-iteration-listener
  "Constructor.

  training-listener - `org.deeplearning4j.optimize.api.TrainingListener`"
  (^ComposableIterationListener [^org.deeplearning4j.optimize.api.TrainingListener training-listener]
    (new ComposableIterationListener training-listener)))

(defn iteration-done
  "Description copied from interface: TrainingListener

  model - the model iterating - `org.deeplearning4j.nn.api.Model`
  iteration - the iteration - `int`
  epoch - `int`"
  ([^ComposableIterationListener this ^org.deeplearning4j.nn.api.Model model ^Integer iteration ^Integer epoch]
    (-> this (.iterationDone model iteration epoch))))

