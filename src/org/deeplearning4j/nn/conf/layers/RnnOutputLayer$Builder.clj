(ns org.deeplearning4j.nn.conf.layers.RnnOutputLayer$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers RnnOutputLayer$Builder]))

(defn ->builder
  "Constructor.

  loss-function - `org.nd4j.linalg.lossfunctions.LossFunctions$LossFunction`"
  (^RnnOutputLayer$Builder [^org.nd4j.linalg.lossfunctions.LossFunctions$LossFunction loss-function]
    (new RnnOutputLayer$Builder loss-function))
  (^RnnOutputLayer$Builder []
    (new RnnOutputLayer$Builder )))

(defn build
  "returns: `org.deeplearning4j.nn.conf.layers.RnnOutputLayer`"
  (^org.deeplearning4j.nn.conf.layers.RnnOutputLayer [^RnnOutputLayer$Builder this]
    (-> this (.build))))

