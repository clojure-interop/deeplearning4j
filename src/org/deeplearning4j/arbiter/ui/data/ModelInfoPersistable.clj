(ns org.deeplearning4j.arbiter.ui.data.ModelInfoPersistable
  "A Persistable implemention for model results - i.e., results for
 each model"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.ui.data ModelInfoPersistable]))

(defn ->model-info-persistable
  "Constructor.

  session-id - `java.lang.String`
  worker-id - `java.lang.String`
  time-stamp - `long`"
  (^ModelInfoPersistable [^java.lang.String session-id ^java.lang.String worker-id ^Long time-stamp]
    (new ModelInfoPersistable session-id worker-id time-stamp))
  (^ModelInfoPersistable []
    (new ModelInfoPersistable )))

(defn get-worker-id
  "Description copied from interface: Persistable

  returns: `java.lang.String`"
  (^java.lang.String [^ModelInfoPersistable this]
    (-> this (.getWorkerID))))

