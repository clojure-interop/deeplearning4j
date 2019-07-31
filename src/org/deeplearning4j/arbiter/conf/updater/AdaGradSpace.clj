(ns org.deeplearning4j.arbiter.conf.updater.AdaGradSpace
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.conf.updater AdaGradSpace]))

(defn ->ada-grad-space
  "Constructor.

  learning-rate - `org.deeplearning4j.arbiter.optimize.api.ParameterSpace`"
  (^AdaGradSpace [^org.deeplearning4j.arbiter.optimize.api.ParameterSpace learning-rate]
    (new AdaGradSpace learning-rate)))

(defn *with-lr
  "lr - `org.deeplearning4j.arbiter.optimize.api.ParameterSpace`

  returns: `org.deeplearning4j.arbiter.conf.updater.AdaGradSpace`"
  (^org.deeplearning4j.arbiter.conf.updater.AdaGradSpace [^org.deeplearning4j.arbiter.optimize.api.ParameterSpace lr]
    (AdaGradSpace/withLR lr)))

(defn *with-lr-schedule
  "lr-schedule - `org.deeplearning4j.arbiter.optimize.api.ParameterSpace`

  returns: `org.deeplearning4j.arbiter.conf.updater.AdaGradSpace`"
  (^org.deeplearning4j.arbiter.conf.updater.AdaGradSpace [^org.deeplearning4j.arbiter.optimize.api.ParameterSpace lr-schedule]
    (AdaGradSpace/withLRSchedule lr-schedule)))

(defn get-value
  "Description copied from interface: ParameterSpace

  parameter-values - A set of values, each in the range [0,1], of length ParameterSpace.numParameters() - `double[]`

  returns: `org.nd4j.linalg.learning.config.IUpdater`"
  (^org.nd4j.linalg.learning.config.IUpdater [^AdaGradSpace this parameter-values]
    (-> this (.getValue parameter-values))))

