(ns org.deeplearning4j.arbiter.ui.data.GlobalConfigPersistable$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.ui.data GlobalConfigPersistable$Builder]))

(defn ->builder
  "Constructor."
  (^GlobalConfigPersistable$Builder []
    (new GlobalConfigPersistable$Builder )))

(defn optimization-config-json
  "optimization-config-json - `java.lang.String`

  returns: `org.deeplearning4j.arbiter.ui.data.GlobalConfigPersistable$Builder`"
  (^org.deeplearning4j.arbiter.ui.data.GlobalConfigPersistable$Builder [^GlobalConfigPersistable$Builder this ^java.lang.String optimization-config-json]
    (-> this (.optimizationConfigJson optimization-config-json))))

(defn candidate-counts
  "queued - `int`
  completed - `int`
  failed - `int`
  total - `int`

  returns: `org.deeplearning4j.arbiter.ui.data.GlobalConfigPersistable$Builder`"
  (^org.deeplearning4j.arbiter.ui.data.GlobalConfigPersistable$Builder [^GlobalConfigPersistable$Builder this ^Integer queued ^Integer completed ^Integer failed ^Integer total]
    (-> this (.candidateCounts queued completed failed total))))

(defn optimization-runner
  "optimization-runner - `java.lang.String`

  returns: `org.deeplearning4j.arbiter.ui.data.GlobalConfigPersistable$Builder`"
  (^org.deeplearning4j.arbiter.ui.data.GlobalConfigPersistable$Builder [^GlobalConfigPersistable$Builder this ^java.lang.String optimization-runner]
    (-> this (.optimizationRunner optimization-runner))))

(defn build
  "returns: `org.deeplearning4j.arbiter.ui.data.GlobalConfigPersistable`"
  (^org.deeplearning4j.arbiter.ui.data.GlobalConfigPersistable [^GlobalConfigPersistable$Builder this]
    (-> this (.build))))

