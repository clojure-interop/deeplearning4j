(ns org.deeplearning4j.arbiter.conf.updater.AdamSpace
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.conf.updater AdamSpace]))

(defn ->adam-space
  "Constructor.

  learning-rate - `org.deeplearning4j.arbiter.optimize.api.ParameterSpace`
  beta-1 - `org.deeplearning4j.arbiter.optimize.api.ParameterSpace`
  beta-2 - `org.deeplearning4j.arbiter.optimize.api.ParameterSpace`
  epsilon - `org.deeplearning4j.arbiter.optimize.api.ParameterSpace`"
  (^AdamSpace [^org.deeplearning4j.arbiter.optimize.api.ParameterSpace learning-rate ^org.deeplearning4j.arbiter.optimize.api.ParameterSpace beta-1 ^org.deeplearning4j.arbiter.optimize.api.ParameterSpace beta-2 ^org.deeplearning4j.arbiter.optimize.api.ParameterSpace epsilon]
    (new AdamSpace learning-rate beta-1 beta-2 epsilon))
  (^AdamSpace [^org.deeplearning4j.arbiter.optimize.api.ParameterSpace learning-rate]
    (new AdamSpace learning-rate)))

(defn *with-lr
  "lr - `org.deeplearning4j.arbiter.optimize.api.ParameterSpace`

  returns: `org.deeplearning4j.arbiter.conf.updater.AdamSpace`"
  (^org.deeplearning4j.arbiter.conf.updater.AdamSpace [^org.deeplearning4j.arbiter.optimize.api.ParameterSpace lr]
    (AdamSpace/withLR lr)))

(defn *with-lr-schedule
  "lr-schedule - `org.deeplearning4j.arbiter.optimize.api.ParameterSpace`

  returns: `org.deeplearning4j.arbiter.conf.updater.AdamSpace`"
  (^org.deeplearning4j.arbiter.conf.updater.AdamSpace [^org.deeplearning4j.arbiter.optimize.api.ParameterSpace lr-schedule]
    (AdamSpace/withLRSchedule lr-schedule)))

(defn get-value
  "Description copied from interface: ParameterSpace

  parameter-values - A set of values, each in the range [0,1], of length ParameterSpace.numParameters() - `double[]`

  returns: `org.nd4j.linalg.learning.config.IUpdater`"
  (^org.nd4j.linalg.learning.config.IUpdater [^AdamSpace this parameter-values]
    (-> this (.getValue parameter-values))))

