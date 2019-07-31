(ns org.deeplearning4j.arbiter.listener.DL4JArbiterStatusReportingListener
  "A simple DL4J Iteration listener that calls Arbiter's status listeners"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.listener DL4JArbiterStatusReportingListener]))

(defn ->dl-4-j-arbiter-status-reporting-listener
  "Constructor."
  (^DL4JArbiterStatusReportingListener []
    (new DL4JArbiterStatusReportingListener )))

(defn iteration-done
  "Description copied from interface: TrainingListener

  model - the model iterating - `org.deeplearning4j.nn.api.Model`
  iteration - the iteration - `int`
  epoch - `int`"
  ([^DL4JArbiterStatusReportingListener this ^org.deeplearning4j.nn.api.Model model ^Integer iteration ^Integer epoch]
    (-> this (.iterationDone model iteration epoch))))

