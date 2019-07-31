(ns org.deeplearning4j.nn.conf.layers.Pooling1D
  "1D Pooling layer.
 Supports the following pooling types: MAX, AVG, SUM, PNORM, NONE"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers Pooling1D]))

(defn ->pooling-1-d
  "Constructor."
  (^Pooling1D []
    (new Pooling1D )))

