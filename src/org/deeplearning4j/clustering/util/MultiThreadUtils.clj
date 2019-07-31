(ns org.deeplearning4j.clustering.util.MultiThreadUtils
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.clustering.util MultiThreadUtils]))

(defn *new-executor-service
  "returns: `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService []
    (MultiThreadUtils/newExecutorService )))

(defn *parallel-tasks
  "tasks - `java.util.List`
  executor-service - `java.util.concurrent.ExecutorService`"
  ([^java.util.List tasks ^java.util.concurrent.ExecutorService executor-service]
    (MultiThreadUtils/parallelTasks tasks executor-service)))

