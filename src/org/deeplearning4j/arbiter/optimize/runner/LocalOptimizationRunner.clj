(ns org.deeplearning4j.arbiter.optimize.runner.LocalOptimizationRunner
  "LocalOptimizationRunner: execute hyperparameter optimization
 locally (on current machine, in current JVM)."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.optimize.runner LocalOptimizationRunner]))

(defn ->local-optimization-runner
  "Constructor.

  max-concurrent-tasks - `int`
  config - `org.deeplearning4j.arbiter.optimize.config.OptimizationConfiguration`
  task-creator - `org.deeplearning4j.arbiter.optimize.api.TaskCreator`"
  (^LocalOptimizationRunner [^Integer max-concurrent-tasks ^org.deeplearning4j.arbiter.optimize.config.OptimizationConfiguration config ^org.deeplearning4j.arbiter.optimize.api.TaskCreator task-creator]
    (new LocalOptimizationRunner max-concurrent-tasks config task-creator))
  (^LocalOptimizationRunner [^org.deeplearning4j.arbiter.optimize.config.OptimizationConfiguration config ^org.deeplearning4j.arbiter.optimize.api.TaskCreator task-creator]
    (new LocalOptimizationRunner config task-creator))
  (^LocalOptimizationRunner [^org.deeplearning4j.arbiter.optimize.config.OptimizationConfiguration config]
    (new LocalOptimizationRunner config)))

(def *-default-max-concurrent-tasks
  "Static Constant.

  type: int"
  LocalOptimizationRunner/DEFAULT_MAX_CONCURRENT_TASKS)

(defn shutdown
  "await-termination - If true: await completion of currently scheduled tasks. If false: shutdown immediately,cancelling any currently executing tasks - `boolean`"
  ([^LocalOptimizationRunner this ^Boolean await-termination]
    (-> this (.shutdown await-termination))))

