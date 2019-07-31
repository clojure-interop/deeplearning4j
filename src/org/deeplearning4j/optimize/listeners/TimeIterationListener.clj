(ns org.deeplearning4j.optimize.listeners.TimeIterationListener
  "Time Iteration Listener.
 This listener displays into INFO logs the remaining time in minutes and the date of the end of the process."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.optimize.listeners TimeIterationListener]))

(defn ->time-iteration-listener
  "Constructor.

  Constructor

  iteration-count - The global number of iteration of the process - `int`"
  (^TimeIterationListener [^Integer iteration-count]
    (new TimeIterationListener iteration-count)))

(defn iteration-done
  "Description copied from interface: TrainingListener

  model - the model iterating - `org.deeplearning4j.nn.api.Model`
  iteration - the iteration - `int`
  epoch - `int`"
  ([^TimeIterationListener this ^org.deeplearning4j.nn.api.Model model ^Integer iteration ^Integer epoch]
    (-> this (.iterationDone model iteration epoch))))

