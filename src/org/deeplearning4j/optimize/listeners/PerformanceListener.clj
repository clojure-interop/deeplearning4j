(ns org.deeplearning4j.optimize.listeners.PerformanceListener
  "Simple IterationListener that tracks time spend on training per iteration."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.optimize.listeners PerformanceListener]))

(defn ->performance-listener
  "Constructor.

  frequency - `int`
  report-score - `boolean`"
  (^PerformanceListener [^Integer frequency ^Boolean report-score]
    (new PerformanceListener frequency report-score))
  (^PerformanceListener [^Integer frequency]
    (new PerformanceListener frequency)))

(defn iteration-done
  "Description copied from interface: TrainingListener

  model - the model iterating - `org.deeplearning4j.nn.api.Model`
  iteration - the iteration - `int`
  epoch - `int`"
  ([^PerformanceListener this ^org.deeplearning4j.nn.api.Model model ^Integer iteration ^Integer epoch]
    (-> this (.iterationDone model iteration epoch))))

