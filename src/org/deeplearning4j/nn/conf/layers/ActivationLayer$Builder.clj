(ns org.deeplearning4j.nn.conf.layers.ActivationLayer$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers ActivationLayer$Builder]))

(defn ->builder
  "Constructor."
  (^ActivationLayer$Builder []
    (new ActivationLayer$Builder )))

(defn activation
  "activation-function - `org.nd4j.linalg.activations.IActivation`

  returns: `org.deeplearning4j.nn.conf.layers.ActivationLayer$Builder`"
  (^org.deeplearning4j.nn.conf.layers.ActivationLayer$Builder [^ActivationLayer$Builder this ^org.nd4j.linalg.activations.IActivation activation-function]
    (-> this (.activation activation-function))))

(defn build
  "returns: `org.deeplearning4j.nn.conf.layers.ActivationLayer`"
  (^org.deeplearning4j.nn.conf.layers.ActivationLayer [^ActivationLayer$Builder this]
    (-> this (.build))))

