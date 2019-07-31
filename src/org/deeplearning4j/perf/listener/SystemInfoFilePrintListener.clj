(ns org.deeplearning4j.perf.listener.SystemInfoFilePrintListener
  "Using SystemInfo - it prints a json representation
 on each callback to the specified file."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.perf.listener SystemInfoFilePrintListener]))

(defn ->system-info-file-print-listener
  "Constructor.

  print-on-epoch-start - `boolean`
  print-on-epoch-end - `boolean`
  print-on-forward-pass - `boolean`
  print-on-backward-pass - `boolean`
  print-on-gradient-calculation - `boolean`
  print-file-target - `java.io.File`"
  (^SystemInfoFilePrintListener [^Boolean print-on-epoch-start ^Boolean print-on-epoch-end ^Boolean print-on-forward-pass ^Boolean print-on-backward-pass ^Boolean print-on-gradient-calculation ^java.io.File print-file-target]
    (new SystemInfoFilePrintListener print-on-epoch-start print-on-epoch-end print-on-forward-pass print-on-backward-pass print-on-gradient-calculation print-file-target)))

(defn iteration-done
  "Description copied from interface: TrainingListener

  model - the model iterating - `org.deeplearning4j.nn.api.Model`
  iteration - the iteration - `int`
  epoch - `int`"
  ([^SystemInfoFilePrintListener this ^org.deeplearning4j.nn.api.Model model ^Integer iteration ^Integer epoch]
    (-> this (.iterationDone model iteration epoch))))

(defn on-epoch-start
  "Description copied from interface: TrainingListener

  model - `org.deeplearning4j.nn.api.Model`"
  ([^SystemInfoFilePrintListener this ^org.deeplearning4j.nn.api.Model model]
    (-> this (.onEpochStart model))))

(defn on-epoch-end
  "Description copied from interface: TrainingListener

  model - `org.deeplearning4j.nn.api.Model`"
  ([^SystemInfoFilePrintListener this ^org.deeplearning4j.nn.api.Model model]
    (-> this (.onEpochEnd model))))

(defn on-forward-pass
  "Description copied from interface: TrainingListener

  model - Model - `org.deeplearning4j.nn.api.Model`
  activations - Layer activations (including input) - `java.util.List`"
  ([^SystemInfoFilePrintListener this ^org.deeplearning4j.nn.api.Model model ^java.util.List activations]
    (-> this (.onForwardPass model activations))))

(defn on-gradient-calculation
  "Description copied from interface: TrainingListener

  model - Model - `org.deeplearning4j.nn.api.Model`"
  ([^SystemInfoFilePrintListener this ^org.deeplearning4j.nn.api.Model model]
    (-> this (.onGradientCalculation model))))

(defn on-backward-pass
  "Description copied from interface: TrainingListener

  model - Model - `org.deeplearning4j.nn.api.Model`"
  ([^SystemInfoFilePrintListener this ^org.deeplearning4j.nn.api.Model model]
    (-> this (.onBackwardPass model))))

