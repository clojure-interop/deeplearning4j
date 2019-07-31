(ns org.deeplearning4j.spark.datavec.RDDMiniBatches$MiniBatchFunction
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.datavec RDDMiniBatches$MiniBatchFunction]))

(defn ->mini-batch-function
  "Constructor.

  batch-size - `int`"
  (^RDDMiniBatches$MiniBatchFunction [^Integer batch-size]
    (new RDDMiniBatches$MiniBatchFunction batch-size)))

