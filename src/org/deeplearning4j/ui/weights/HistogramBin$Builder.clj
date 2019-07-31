(ns org.deeplearning4j.ui.weights.HistogramBin$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.weights HistogramBin$Builder]))

(defn ->builder
  "Constructor.

  Build Histogram Builder instance for specified array

  array - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^HistogramBin$Builder [^org.nd4j.linalg.api.ndarray.INDArray array]
    (new HistogramBin$Builder array)))

(defn set-rounding
  "Sets number of numbers behind decimal part

  rounds - `int`

  returns: `org.deeplearning4j.ui.weights.HistogramBin$Builder`"
  (^org.deeplearning4j.ui.weights.HistogramBin$Builder [^HistogramBin$Builder this ^Integer rounds]
    (-> this (.setRounding rounds))))

(defn set-bin-count
  "Specifies number of bins for output histogram

  bins - `int`

  returns: `org.deeplearning4j.ui.weights.HistogramBin$Builder`"
  (^org.deeplearning4j.ui.weights.HistogramBin$Builder [^HistogramBin$Builder this ^Integer bins]
    (-> this (.setBinCount bins))))

(defn build
  "Returns ready-to-use Histogram instance

  returns: `org.deeplearning4j.ui.weights.HistogramBin`"
  (^org.deeplearning4j.ui.weights.HistogramBin [^HistogramBin$Builder this]
    (-> this (.build))))

