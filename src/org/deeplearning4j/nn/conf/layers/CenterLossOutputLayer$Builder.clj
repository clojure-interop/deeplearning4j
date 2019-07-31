(ns org.deeplearning4j.nn.conf.layers.CenterLossOutputLayer$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers CenterLossOutputLayer$Builder]))

(defn ->builder
  "Constructor.

  loss-function - `org.nd4j.linalg.lossfunctions.LossFunctions$LossFunction`"
  (^CenterLossOutputLayer$Builder [^org.nd4j.linalg.lossfunctions.LossFunctions$LossFunction loss-function]
    (new CenterLossOutputLayer$Builder loss-function)))

(defn alpha
  "alpha - `double`

  returns: `org.deeplearning4j.nn.conf.layers.CenterLossOutputLayer$Builder`"
  (^org.deeplearning4j.nn.conf.layers.CenterLossOutputLayer$Builder [^CenterLossOutputLayer$Builder this ^Double alpha]
    (-> this (.alpha alpha))))

(defn lambda
  "lambda - `double`

  returns: `org.deeplearning4j.nn.conf.layers.CenterLossOutputLayer$Builder`"
  (^org.deeplearning4j.nn.conf.layers.CenterLossOutputLayer$Builder [^CenterLossOutputLayer$Builder this ^Double lambda]
    (-> this (.lambda lambda))))

(defn gradient-check
  "is-gradient-check - `boolean`

  returns: `org.deeplearning4j.nn.conf.layers.CenterLossOutputLayer$Builder`"
  (^org.deeplearning4j.nn.conf.layers.CenterLossOutputLayer$Builder [^CenterLossOutputLayer$Builder this ^Boolean is-gradient-check]
    (-> this (.gradientCheck is-gradient-check))))

(defn build
  "returns: `org.deeplearning4j.nn.conf.layers.CenterLossOutputLayer`"
  (^org.deeplearning4j.nn.conf.layers.CenterLossOutputLayer [^CenterLossOutputLayer$Builder this]
    (-> this (.build))))

