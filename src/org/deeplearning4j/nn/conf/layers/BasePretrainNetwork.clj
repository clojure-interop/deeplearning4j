(ns org.deeplearning4j.nn.conf.layers.BasePretrainNetwork
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers BasePretrainNetwork]))

(defn ->base-pretrain-network
  "Constructor.

  builder - `org.deeplearning4j.nn.conf.layers.BasePretrainNetwork$Builder`"
  (^BasePretrainNetwork [^org.deeplearning4j.nn.conf.layers.BasePretrainNetwork$Builder builder]
    (new BasePretrainNetwork builder)))

(defn get-l-1-by-param
  "Description copied from class: Layer

  param-name - Parameter name - `java.lang.String`

  returns: L1 value for that parameter - `double`"
  (^Double [^BasePretrainNetwork this ^java.lang.String param-name]
    (-> this (.getL1ByParam param-name))))

(defn get-l-2-by-param
  "Description copied from class: Layer

  param-name - Parameter name - `java.lang.String`

  returns: L2 value for that parameter - `double`"
  (^Double [^BasePretrainNetwork this ^java.lang.String param-name]
    (-> this (.getL2ByParam param-name))))

(defn pretrain-param?
  "Description copied from class: Layer

  param-name - Parameter name/key - `java.lang.String`

  returns: True if the parameter is for layerwise pretraining only, false otherwise - `boolean`"
  (^Boolean [^BasePretrainNetwork this ^java.lang.String param-name]
    (-> this (.isPretrainParam param-name))))

(defn pretrain?
  "returns: True if the layer is set up for layerwise pretraining - `boolean`"
  (^Boolean [^BasePretrainNetwork this]
    (-> this (.isPretrain))))

(defn set-pretrain
  "pretrain - Whether the layer is currently undergoing layerwise unsupervised training, or multi-layer backprop - `boolean`"
  ([^BasePretrainNetwork this ^Boolean pretrain]
    (-> this (.setPretrain pretrain))))

