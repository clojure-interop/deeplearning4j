(ns org.deeplearning4j.arbiter.ui.data.ModelInfoPersistable$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.ui.data ModelInfoPersistable$Builder]))

(defn ->builder
  "Constructor."
  (^ModelInfoPersistable$Builder []
    (new ModelInfoPersistable$Builder )))

(defn exception-stack-trace
  "exception-stack-trace - `java.lang.String`

  returns: `org.deeplearning4j.arbiter.ui.data.ModelInfoPersistable$Builder`"
  (^org.deeplearning4j.arbiter.ui.data.ModelInfoPersistable$Builder [^ModelInfoPersistable$Builder this ^java.lang.String exception-stack-trace]
    (-> this (.exceptionStackTrace exception-stack-trace))))

(defn model-config-json
  "model-config-json - `java.lang.String`

  returns: `org.deeplearning4j.arbiter.ui.data.ModelInfoPersistable$Builder`"
  (^org.deeplearning4j.arbiter.ui.data.ModelInfoPersistable$Builder [^ModelInfoPersistable$Builder this ^java.lang.String model-config-json]
    (-> this (.modelConfigJson model-config-json))))

(defn score
  "score - `java.lang.Double`

  returns: `org.deeplearning4j.arbiter.ui.data.ModelInfoPersistable$Builder`"
  (^org.deeplearning4j.arbiter.ui.data.ModelInfoPersistable$Builder [^ModelInfoPersistable$Builder this ^java.lang.Double score]
    (-> this (.score score))))

(defn param-space-values
  "param-space-values - `double[]`

  returns: `org.deeplearning4j.arbiter.ui.data.ModelInfoPersistable$Builder`"
  (^org.deeplearning4j.arbiter.ui.data.ModelInfoPersistable$Builder [^ModelInfoPersistable$Builder this param-space-values]
    (-> this (.paramSpaceValues param-space-values))))

(defn num-layers
  "num-layers - `int`

  returns: `org.deeplearning4j.arbiter.ui.data.ModelInfoPersistable$Builder`"
  (^org.deeplearning4j.arbiter.ui.data.ModelInfoPersistable$Builder [^ModelInfoPersistable$Builder this ^Integer num-layers]
    (-> this (.numLayers num-layers))))

(defn score-vs-iter
  "iter - `int[]`
  score-vs-iter - `float[]`

  returns: `org.deeplearning4j.arbiter.ui.data.ModelInfoPersistable$Builder`"
  (^org.deeplearning4j.arbiter.ui.data.ModelInfoPersistable$Builder [^ModelInfoPersistable$Builder this iter score-vs-iter]
    (-> this (.scoreVsIter iter score-vs-iter))))

(defn status
  "status - `org.deeplearning4j.arbiter.optimize.runner.CandidateStatus`

  returns: `org.deeplearning4j.arbiter.ui.data.ModelInfoPersistable$Builder`"
  (^org.deeplearning4j.arbiter.ui.data.ModelInfoPersistable$Builder [^ModelInfoPersistable$Builder this ^org.deeplearning4j.arbiter.optimize.runner.CandidateStatus status]
    (-> this (.status status))))

(defn build
  "returns: `org.deeplearning4j.arbiter.ui.data.ModelInfoPersistable`"
  (^org.deeplearning4j.arbiter.ui.data.ModelInfoPersistable [^ModelInfoPersistable$Builder this]
    (-> this (.build))))

(defn num-parameters
  "num-parameters - `long`

  returns: `org.deeplearning4j.arbiter.ui.data.ModelInfoPersistable$Builder`"
  (^org.deeplearning4j.arbiter.ui.data.ModelInfoPersistable$Builder [^ModelInfoPersistable$Builder this ^Long num-parameters]
    (-> this (.numParameters num-parameters))))

(defn last-update-time
  "last-update-time - `long`

  returns: `org.deeplearning4j.arbiter.ui.data.ModelInfoPersistable$Builder`"
  (^org.deeplearning4j.arbiter.ui.data.ModelInfoPersistable$Builder [^ModelInfoPersistable$Builder this ^Long last-update-time]
    (-> this (.lastUpdateTime last-update-time))))

(defn total-num-updates
  "total-num-updates - `int`

  returns: `org.deeplearning4j.arbiter.ui.data.ModelInfoPersistable$Builder`"
  (^org.deeplearning4j.arbiter.ui.data.ModelInfoPersistable$Builder [^ModelInfoPersistable$Builder this ^Integer total-num-updates]
    (-> this (.totalNumUpdates total-num-updates))))

(defn worker-id
  "worker-id - `java.lang.String`

  returns: `org.deeplearning4j.arbiter.ui.data.ModelInfoPersistable$Builder`"
  (^org.deeplearning4j.arbiter.ui.data.ModelInfoPersistable$Builder [^ModelInfoPersistable$Builder this ^java.lang.String worker-id]
    (-> this (.workerId worker-id))))

(defn model-idx
  "idx - `java.lang.Integer`

  returns: `org.deeplearning4j.arbiter.ui.data.ModelInfoPersistable$Builder`"
  (^org.deeplearning4j.arbiter.ui.data.ModelInfoPersistable$Builder [^ModelInfoPersistable$Builder this ^java.lang.Integer idx]
    (-> this (.modelIdx idx))))

