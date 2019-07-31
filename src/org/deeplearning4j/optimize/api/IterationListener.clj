(ns org.deeplearning4j.optimize.api.IterationListener
  "Deprecated.
 Use TrainingListener instead"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.optimize.api IterationListener]))

(defn ->iteration-listener
  "Constructor.

  Deprecated."
  (^IterationListener []
    (new IterationListener )))

(defn iteration-done
  "Deprecated.

  model - the model iterating - `org.deeplearning4j.nn.api.Model`
  iteration - the iteration - `int`
  epoch - `int`"
  ([^IterationListener this ^org.deeplearning4j.nn.api.Model model ^Integer iteration ^Integer epoch]
    (-> this (.iterationDone model iteration epoch))))

