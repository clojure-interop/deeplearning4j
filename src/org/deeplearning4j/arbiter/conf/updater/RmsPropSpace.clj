(ns org.deeplearning4j.arbiter.conf.updater.RmsPropSpace
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.conf.updater RmsPropSpace]))

(defn ->rms-prop-space
  "Constructor.

  learning-rate - `org.deeplearning4j.arbiter.optimize.api.ParameterSpace`
  learning-rate-schedule - `org.deeplearning4j.arbiter.optimize.api.ParameterSpace`"
  (^RmsPropSpace [^org.deeplearning4j.arbiter.optimize.api.ParameterSpace learning-rate ^org.deeplearning4j.arbiter.optimize.api.ParameterSpace learning-rate-schedule]
    (new RmsPropSpace learning-rate learning-rate-schedule))
  (^RmsPropSpace [^org.deeplearning4j.arbiter.optimize.api.ParameterSpace learning-rate]
    (new RmsPropSpace learning-rate)))

(defn get-value
  "Description copied from interface: ParameterSpace

  parameter-values - A set of values, each in the range [0,1], of length ParameterSpace.numParameters() - `double[]`

  returns: `org.nd4j.linalg.learning.config.IUpdater`"
  (^org.nd4j.linalg.learning.config.IUpdater [^RmsPropSpace this parameter-values]
    (-> this (.getValue parameter-values))))

