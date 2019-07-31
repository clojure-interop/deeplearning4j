(ns org.deeplearning4j.nn.conf.layers.samediff.SameDiffLayer$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers.samediff SameDiffLayer$Builder]))

(defn ->builder
  "Constructor."
  (^SameDiffLayer$Builder []
    (new SameDiffLayer$Builder )))

(defn weight-init
  "weight-init - Weight initialization to use for the layer - `org.deeplearning4j.nn.weights.WeightInit`

  returns: `T`"
  ([^SameDiffLayer$Builder this ^org.deeplearning4j.nn.weights.WeightInit weight-init]
    (-> this (.weightInit weight-init))))

