(ns org.deeplearning4j.nn.conf.layers.samediff.AbstractSameDiffLayer$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers.samediff AbstractSameDiffLayer$Builder]))

(defn ->builder
  "Constructor."
  (^AbstractSameDiffLayer$Builder []
    (new AbstractSameDiffLayer$Builder )))

(defn l-1
  "L1 regularization coefficient (weights only). Use l1Bias(double) to configure the l1 regularization
  coefficient for the bias.

  l-1 - `double`

  returns: `T`"
  ([^AbstractSameDiffLayer$Builder this ^Double l-1]
    (-> this (.l1 l-1))))

(defn l-2
  "L2 regularization coefficient (weights only). Use l2Bias(double) to configure the l2 regularization
  coefficient for the bias.

  l-2 - `double`

  returns: `T`"
  ([^AbstractSameDiffLayer$Builder this ^Double l-2]
    (-> this (.l2 l-2))))

(defn l-1-bias
  "L1 regularization coefficient for the bias. Default: 0. See also l1(double)

  l-1-bias - `double`

  returns: `T`"
  ([^AbstractSameDiffLayer$Builder this ^Double l-1-bias]
    (-> this (.l1Bias l-1-bias))))

(defn l-2-bias
  "L2 regularization coefficient for the bias. Default: 0. See also l2(double)

  l-2-bias - `double`

  returns: `T`"
  ([^AbstractSameDiffLayer$Builder this ^Double l-2-bias]
    (-> this (.l2Bias l-2-bias))))

(defn updater
  "Gradient updater. For example, Adam
  or Nesterovs

  updater - Updater to use - `org.nd4j.linalg.learning.config.IUpdater`

  returns: `T`"
  ([^AbstractSameDiffLayer$Builder this ^org.nd4j.linalg.learning.config.IUpdater updater]
    (-> this (.updater updater))))

(defn bias-updater
  "Gradient updater configuration, for the biases only. If not set, biases will use the updater as
  set by updater(IUpdater)

  bias-updater - Updater to use for bias parameters - `org.nd4j.linalg.learning.config.IUpdater`

  returns: `T`"
  ([^AbstractSameDiffLayer$Builder this ^org.nd4j.linalg.learning.config.IUpdater bias-updater]
    (-> this (.biasUpdater bias-updater))))

