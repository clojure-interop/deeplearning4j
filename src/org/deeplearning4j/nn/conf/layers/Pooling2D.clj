(ns org.deeplearning4j.nn.conf.layers.Pooling2D
  "2D Pooling layer.
 Supports the following pooling types: MAX, AVG, SUM, PNORM, NONE"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers Pooling2D]))

(defn ->pooling-2-d
  "Constructor."
  (^Pooling2D []
    (new Pooling2D )))

