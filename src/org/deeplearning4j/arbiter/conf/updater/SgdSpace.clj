(ns org.deeplearning4j.arbiter.conf.updater.SgdSpace
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.conf.updater SgdSpace]))

(defn ->sgd-space
  "Constructor.

  learning-rate - `org.deeplearning4j.arbiter.optimize.api.ParameterSpace`
  learning-rate-schedule - `org.deeplearning4j.arbiter.optimize.api.ParameterSpace`"
  (^SgdSpace [^org.deeplearning4j.arbiter.optimize.api.ParameterSpace learning-rate ^org.deeplearning4j.arbiter.optimize.api.ParameterSpace learning-rate-schedule]
    (new SgdSpace learning-rate learning-rate-schedule))
  (^SgdSpace [^org.deeplearning4j.arbiter.optimize.api.ParameterSpace learning-rate]
    (new SgdSpace learning-rate)))

(defn get-value
  "Description copied from interface: ParameterSpace

  parameter-values - A set of values, each in the range [0,1], of length ParameterSpace.numParameters() - `double[]`

  returns: `org.nd4j.linalg.learning.config.IUpdater`"
  (^org.nd4j.linalg.learning.config.IUpdater [^SgdSpace this parameter-values]
    (-> this (.getValue parameter-values))))

