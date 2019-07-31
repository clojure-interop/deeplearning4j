(ns org.deeplearning4j.ui.weights.HistogramBin
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.weights HistogramBin]))

(defn ->histogram-bin
  "Constructor.

  Builds histogram bin for specified array

  array - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^HistogramBin [^org.nd4j.linalg.api.ndarray.INDArray array]
    (new HistogramBin array))
  (^HistogramBin []
    (new HistogramBin )))

