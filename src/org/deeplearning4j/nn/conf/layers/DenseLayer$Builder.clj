(ns org.deeplearning4j.nn.conf.layers.DenseLayer$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers DenseLayer$Builder]))

(defn ->builder
  "Constructor."
  (^DenseLayer$Builder []
    (new DenseLayer$Builder )))

(defn has-bias
  "If true (default): include bias parameters in the model. False: no bias.

  has-bias - If true: include bias parameters in this model - `boolean`

  returns: `org.deeplearning4j.nn.conf.layers.DenseLayer$Builder`"
  (^org.deeplearning4j.nn.conf.layers.DenseLayer$Builder [^DenseLayer$Builder this ^Boolean has-bias]
    (-> this (.hasBias has-bias))))

(defn build
  "returns: `org.deeplearning4j.nn.conf.layers.DenseLayer`"
  (^org.deeplearning4j.nn.conf.layers.DenseLayer [^DenseLayer$Builder this]
    (-> this (.build))))

