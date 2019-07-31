(ns org.deeplearning4j.arbiter.layers.AutoEncoderLayerSpace
  "Layer space for autoencoder layers"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.layers AutoEncoderLayerSpace]))

(defn get-value
  "Description copied from interface: ParameterSpace

  values - A set of values, each in the range [0,1], of length ParameterSpace.numParameters() - `double[]`

  returns: `org.deeplearning4j.nn.conf.layers.AutoEncoder`"
  (^org.deeplearning4j.nn.conf.layers.AutoEncoder [^AutoEncoderLayerSpace this values]
    (-> this (.getValue values))))

(defn to-string
  "delim - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^AutoEncoderLayerSpace this ^java.lang.String delim]
    (-> this (.toString delim)))
  (^java.lang.String [^AutoEncoderLayerSpace this]
    (-> this (.toString))))

