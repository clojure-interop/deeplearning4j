(ns org.deeplearning4j.arbiter.ui.data.GlobalConfigPersistable
  "A Persistable implemention for global settings"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.ui.data GlobalConfigPersistable]))

(defn ->global-config-persistable
  "Constructor.

  session-id - `java.lang.String`
  timestamp - `long`"
  (^GlobalConfigPersistable [^java.lang.String session-id ^Long timestamp]
    (new GlobalConfigPersistable session-id timestamp))
  (^GlobalConfigPersistable [^org.deeplearning4j.arbiter.ui.data.GlobalConfigPersistable$Builder builder]
    (new GlobalConfigPersistable builder))
  (^GlobalConfigPersistable []
    (new GlobalConfigPersistable )))

(def *-global-worker-id
  "Static Constant.

  type: java.lang.String"
  GlobalConfigPersistable/GLOBAL_WORKER_ID)

(defn get-type-id
  "Description copied from interface: Persistable

  returns: `java.lang.String`"
  (^java.lang.String [^GlobalConfigPersistable this]
    (-> this (.getTypeID))))

(defn get-worker-id
  "Description copied from interface: Persistable

  returns: `java.lang.String`"
  (^java.lang.String [^GlobalConfigPersistable this]
    (-> this (.getWorkerID))))

(defn get-optimization-configuration
  "returns: `org.deeplearning4j.arbiter.optimize.config.OptimizationConfiguration`"
  (^org.deeplearning4j.arbiter.optimize.config.OptimizationConfiguration [^GlobalConfigPersistable this]
    (-> this (.getOptimizationConfiguration))))

(defn get-candidates-queued
  "returns: `int`"
  (^Integer [^GlobalConfigPersistable this]
    (-> this (.getCandidatesQueued))))

(defn get-candidates-completed
  "returns: `int`"
  (^Integer [^GlobalConfigPersistable this]
    (-> this (.getCandidatesCompleted))))

(defn get-candidates-failed
  "returns: `int`"
  (^Integer [^GlobalConfigPersistable this]
    (-> this (.getCandidatesFailed))))

(defn get-candidates-total
  "returns: `int`"
  (^Integer [^GlobalConfigPersistable this]
    (-> this (.getCandidatesTotal))))

