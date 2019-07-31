(ns org.deeplearning4j.nn.conf.layers.samediff.SameDiffLayerUtils
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers.samediff SameDiffLayerUtils]))

(defn *from-i-activation
  "a - `org.nd4j.linalg.activations.IActivation`

  returns: `org.nd4j.linalg.activations.Activation`"
  (^org.nd4j.linalg.activations.Activation [^org.nd4j.linalg.activations.IActivation a]
    (SameDiffLayerUtils/fromIActivation a)))

