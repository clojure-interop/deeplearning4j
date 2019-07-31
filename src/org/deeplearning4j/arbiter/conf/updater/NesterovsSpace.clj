(ns org.deeplearning4j.arbiter.conf.updater.NesterovsSpace
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.conf.updater NesterovsSpace]))

(defn ->nesterovs-space
  "Constructor.

  learning-rate - `org.deeplearning4j.arbiter.optimize.api.ParameterSpace`
  learning-rate-schedule - `org.deeplearning4j.arbiter.optimize.api.ParameterSpace`
  momentum - `org.deeplearning4j.arbiter.optimize.api.ParameterSpace`
  momentum-schedule - `org.deeplearning4j.arbiter.optimize.api.ParameterSpace`"
  (^NesterovsSpace [^org.deeplearning4j.arbiter.optimize.api.ParameterSpace learning-rate ^org.deeplearning4j.arbiter.optimize.api.ParameterSpace learning-rate-schedule ^org.deeplearning4j.arbiter.optimize.api.ParameterSpace momentum ^org.deeplearning4j.arbiter.optimize.api.ParameterSpace momentum-schedule]
    (new NesterovsSpace learning-rate learning-rate-schedule momentum momentum-schedule))
  (^NesterovsSpace [^org.deeplearning4j.arbiter.optimize.api.ParameterSpace learning-rate ^org.deeplearning4j.arbiter.optimize.api.ParameterSpace momentum]
    (new NesterovsSpace learning-rate momentum))
  (^NesterovsSpace [^org.deeplearning4j.arbiter.optimize.api.ParameterSpace learning-rate]
    (new NesterovsSpace learning-rate)))

(defn *with-lr
  "lr - `org.deeplearning4j.arbiter.optimize.api.ParameterSpace`
  momentum - `double`

  returns: `org.deeplearning4j.arbiter.conf.updater.NesterovsSpace`"
  (^org.deeplearning4j.arbiter.conf.updater.NesterovsSpace [^org.deeplearning4j.arbiter.optimize.api.ParameterSpace lr ^Double momentum]
    (NesterovsSpace/withLR lr momentum))
  (^org.deeplearning4j.arbiter.conf.updater.NesterovsSpace [^org.deeplearning4j.arbiter.optimize.api.ParameterSpace lr]
    (NesterovsSpace/withLR lr)))

(defn *with-lr-schedule
  "lr-schedule - `org.deeplearning4j.arbiter.optimize.api.ParameterSpace`
  momentum - `double`

  returns: `org.deeplearning4j.arbiter.conf.updater.NesterovsSpace`"
  (^org.deeplearning4j.arbiter.conf.updater.NesterovsSpace [^org.deeplearning4j.arbiter.optimize.api.ParameterSpace lr-schedule ^Double momentum]
    (NesterovsSpace/withLRSchedule lr-schedule momentum))
  (^org.deeplearning4j.arbiter.conf.updater.NesterovsSpace [^org.deeplearning4j.arbiter.optimize.api.ParameterSpace lr-schedule]
    (NesterovsSpace/withLRSchedule lr-schedule)))

(defn get-value
  "Description copied from interface: ParameterSpace

  parameter-values - A set of values, each in the range [0,1], of length ParameterSpace.numParameters() - `double[]`

  returns: `org.nd4j.linalg.learning.config.IUpdater`"
  (^org.nd4j.linalg.learning.config.IUpdater [^NesterovsSpace this parameter-values]
    (-> this (.getValue parameter-values))))

