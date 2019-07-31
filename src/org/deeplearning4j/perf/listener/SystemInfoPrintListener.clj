(ns org.deeplearning4j.perf.listener.SystemInfoPrintListener
  "Using SystemInfo - it logs a json representation
 of system info using slf4j."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.perf.listener SystemInfoPrintListener]))

(defn ->system-info-print-listener
  "Constructor."
  (^SystemInfoPrintListener []
    (new SystemInfoPrintListener )))

(defn iteration-done
  "Description copied from interface: TrainingListener

  model - the model iterating - `org.deeplearning4j.nn.api.Model`
  iteration - the iteration - `int`
  epoch - `int`"
  ([^SystemInfoPrintListener this ^org.deeplearning4j.nn.api.Model model ^Integer iteration ^Integer epoch]
    (-> this (.iterationDone model iteration epoch))))

(defn on-epoch-start
  "Description copied from interface: TrainingListener

  model - `org.deeplearning4j.nn.api.Model`"
  ([^SystemInfoPrintListener this ^org.deeplearning4j.nn.api.Model model]
    (-> this (.onEpochStart model))))

(defn on-epoch-end
  "Description copied from interface: TrainingListener

  model - `org.deeplearning4j.nn.api.Model`"
  ([^SystemInfoPrintListener this ^org.deeplearning4j.nn.api.Model model]
    (-> this (.onEpochEnd model))))

(defn on-forward-pass
  "Description copied from interface: TrainingListener

  model - Model - `org.deeplearning4j.nn.api.Model`
  activations - Layer activations (including input) - `java.util.List`"
  ([^SystemInfoPrintListener this ^org.deeplearning4j.nn.api.Model model ^java.util.List activations]
    (-> this (.onForwardPass model activations))))

(defn on-gradient-calculation
  "Description copied from interface: TrainingListener

  model - Model - `org.deeplearning4j.nn.api.Model`"
  ([^SystemInfoPrintListener this ^org.deeplearning4j.nn.api.Model model]
    (-> this (.onGradientCalculation model))))

(defn on-backward-pass
  "Description copied from interface: TrainingListener

  model - Model - `org.deeplearning4j.nn.api.Model`"
  ([^SystemInfoPrintListener this ^org.deeplearning4j.nn.api.Model model]
    (-> this (.onBackwardPass model))))

