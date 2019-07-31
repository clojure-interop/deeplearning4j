(ns org.nd4j.linalg.executors.ExecutorServiceProvider
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.executors ExecutorServiceProvider]))

(defn ->executor-service-provider
  "Constructor."
  (^ExecutorServiceProvider []
    (new ExecutorServiceProvider )))

(def *-exec-threads
  "Static Constant.

  type: java.lang.String"
  ExecutorServiceProvider/EXEC_THREADS)

(def *-enabled
  "Static Constant.

  type: java.lang.String"
  ExecutorServiceProvider/ENABLED)

(defn *get-executor-service
  "returns: `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService []
    (ExecutorServiceProvider/getExecutorService )))

(defn *get-fork-join-pool
  "returns: `java.util.concurrent.ForkJoinPool`"
  (^java.util.concurrent.ForkJoinPool []
    (ExecutorServiceProvider/getForkJoinPool )))

