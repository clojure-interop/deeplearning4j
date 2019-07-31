(ns org.deeplearning4j.arbiter.conf.updater.AdaMaxSpace
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.conf.updater AdaMaxSpace]))

(defn ->ada-max-space
  "Constructor.

  learning-rate - `org.deeplearning4j.arbiter.optimize.api.ParameterSpace`
  learning-rate-schedule - `org.deeplearning4j.arbiter.optimize.api.ParameterSpace`
  beta-1 - `org.deeplearning4j.arbiter.optimize.api.ParameterSpace`
  beta-2 - `org.deeplearning4j.arbiter.optimize.api.ParameterSpace`
  epsilon - `org.deeplearning4j.arbiter.optimize.api.ParameterSpace`"
  (^AdaMaxSpace [^org.deeplearning4j.arbiter.optimize.api.ParameterSpace learning-rate ^org.deeplearning4j.arbiter.optimize.api.ParameterSpace learning-rate-schedule ^org.deeplearning4j.arbiter.optimize.api.ParameterSpace beta-1 ^org.deeplearning4j.arbiter.optimize.api.ParameterSpace beta-2 ^org.deeplearning4j.arbiter.optimize.api.ParameterSpace epsilon]
    (new AdaMaxSpace learning-rate learning-rate-schedule beta-1 beta-2 epsilon))
  (^AdaMaxSpace [^org.deeplearning4j.arbiter.optimize.api.ParameterSpace learning-rate ^org.deeplearning4j.arbiter.optimize.api.ParameterSpace beta-1 ^org.deeplearning4j.arbiter.optimize.api.ParameterSpace beta-2 ^org.deeplearning4j.arbiter.optimize.api.ParameterSpace epsilon]
    (new AdaMaxSpace learning-rate beta-1 beta-2 epsilon))
  (^AdaMaxSpace [^org.deeplearning4j.arbiter.optimize.api.ParameterSpace learning-rate]
    (new AdaMaxSpace learning-rate)))

(defn *with-lr
  "lr - `org.deeplearning4j.arbiter.optimize.api.ParameterSpace`

  returns: `org.deeplearning4j.arbiter.conf.updater.AdaMaxSpace`"
  (^org.deeplearning4j.arbiter.conf.updater.AdaMaxSpace [^org.deeplearning4j.arbiter.optimize.api.ParameterSpace lr]
    (AdaMaxSpace/withLR lr)))

(defn *with-lr-schedule
  "lr-schedule - `org.deeplearning4j.arbiter.optimize.api.ParameterSpace`

  returns: `org.deeplearning4j.arbiter.conf.updater.AdaMaxSpace`"
  (^org.deeplearning4j.arbiter.conf.updater.AdaMaxSpace [^org.deeplearning4j.arbiter.optimize.api.ParameterSpace lr-schedule]
    (AdaMaxSpace/withLRSchedule lr-schedule)))

(defn get-value
  "Description copied from interface: ParameterSpace

  parameter-values - A set of values, each in the range [0,1], of length ParameterSpace.numParameters() - `double[]`

  returns: `org.nd4j.linalg.learning.config.IUpdater`"
  (^org.nd4j.linalg.learning.config.IUpdater [^AdaMaxSpace this parameter-values]
    (-> this (.getValue parameter-values))))

