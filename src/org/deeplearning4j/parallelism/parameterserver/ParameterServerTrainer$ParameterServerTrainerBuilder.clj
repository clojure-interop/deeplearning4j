(ns org.deeplearning4j.parallelism.parameterserver.ParameterServerTrainer$ParameterServerTrainerBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.parallelism.parameterserver ParameterServerTrainer$ParameterServerTrainerBuilder]))

(defn ->parameter-server-trainer-builder
  "Constructor."
  (^ParameterServerTrainer$ParameterServerTrainerBuilder []
    (new ParameterServerTrainer$ParameterServerTrainerBuilder )))

(defn running
  "running - `java.util.concurrent.atomic.AtomicInteger`

  returns: `org.deeplearning4j.parallelism.parameterserver.ParameterServerTrainer$ParameterServerTrainerBuilder`"
  (^org.deeplearning4j.parallelism.parameterserver.ParameterServerTrainer$ParameterServerTrainerBuilder [^ParameterServerTrainer$ParameterServerTrainerBuilder this ^java.util.concurrent.atomic.AtomicInteger running]
    (-> this (.running running))))

(defn averaging-frequency
  "frequency - `int`

  returns: `org.deeplearning4j.parallelism.parameterserver.ParameterServerTrainer$ParameterServerTrainerBuilder`"
  (^org.deeplearning4j.parallelism.parameterserver.ParameterServerTrainer$ParameterServerTrainerBuilder [^ParameterServerTrainer$ParameterServerTrainerBuilder this ^Integer frequency]
    (-> this (.averagingFrequency frequency))))

(defn should-stop
  "should-stop - `java.util.concurrent.atomic.AtomicBoolean`

  returns: `org.deeplearning4j.parallelism.parameterserver.ParameterServerTrainer$ParameterServerTrainerBuilder`"
  (^org.deeplearning4j.parallelism.parameterserver.ParameterServerTrainer$ParameterServerTrainerBuilder [^ParameterServerTrainer$ParameterServerTrainerBuilder this ^java.util.concurrent.atomic.AtomicBoolean should-stop]
    (-> this (.shouldStop should-stop))))

(defn thread-id
  "thread-id - `int`

  returns: `org.deeplearning4j.parallelism.parameterserver.ParameterServerTrainer$ParameterServerTrainerBuilder`"
  (^org.deeplearning4j.parallelism.parameterserver.ParameterServerTrainer$ParameterServerTrainerBuilder [^ParameterServerTrainer$ParameterServerTrainerBuilder this ^Integer thread-id]
    (-> this (.threadId thread-id))))

(defn queue
  "queue - `java.util.concurrent.LinkedBlockingQueue`

  returns: `org.deeplearning4j.parallelism.parameterserver.ParameterServerTrainer$ParameterServerTrainerBuilder`"
  (^org.deeplearning4j.parallelism.parameterserver.ParameterServerTrainer$ParameterServerTrainerBuilder [^ParameterServerTrainer$ParameterServerTrainerBuilder this ^java.util.concurrent.LinkedBlockingQueue queue]
    (-> this (.queue queue))))

(defn on-root-model
  "on-root-model - `boolean`

  returns: `org.deeplearning4j.parallelism.parameterserver.ParameterServerTrainer$ParameterServerTrainerBuilder`"
  (^org.deeplearning4j.parallelism.parameterserver.ParameterServerTrainer$ParameterServerTrainerBuilder [^ParameterServerTrainer$ParameterServerTrainerBuilder this ^Boolean on-root-model]
    (-> this (.onRootModel on-root-model))))

(defn queue-mds
  "queue-mds - `java.util.concurrent.LinkedBlockingQueue`

  returns: `org.deeplearning4j.parallelism.parameterserver.ParameterServerTrainer$ParameterServerTrainerBuilder`"
  (^org.deeplearning4j.parallelism.parameterserver.ParameterServerTrainer$ParameterServerTrainerBuilder [^ParameterServerTrainer$ParameterServerTrainerBuilder this ^java.util.concurrent.LinkedBlockingQueue queue-mds]
    (-> this (.queueMDS queue-mds))))

(defn parallel-wrapper
  "parallel-wrapper - `org.deeplearning4j.parallelism.ParallelWrapper`

  returns: `org.deeplearning4j.parallelism.parameterserver.ParameterServerTrainer$ParameterServerTrainerBuilder`"
  (^org.deeplearning4j.parallelism.parameterserver.ParameterServerTrainer$ParameterServerTrainerBuilder [^ParameterServerTrainer$ParameterServerTrainerBuilder this ^org.deeplearning4j.parallelism.ParallelWrapper parallel-wrapper]
    (-> this (.parallelWrapper parallel-wrapper))))

(defn original-model
  "original-model - `org.deeplearning4j.nn.api.Model`

  returns: `org.deeplearning4j.parallelism.parameterserver.ParameterServerTrainer$ParameterServerTrainerBuilder`"
  (^org.deeplearning4j.parallelism.parameterserver.ParameterServerTrainer$ParameterServerTrainerBuilder [^ParameterServerTrainer$ParameterServerTrainerBuilder this ^org.deeplearning4j.nn.api.Model original-model]
    (-> this (.originalModel original-model))))

(defn thrown-exception
  "thrown-exception - `java.lang.Exception`

  returns: `org.deeplearning4j.parallelism.parameterserver.ParameterServerTrainer$ParameterServerTrainerBuilder`"
  (^org.deeplearning4j.parallelism.parameterserver.ParameterServerTrainer$ParameterServerTrainerBuilder [^ParameterServerTrainer$ParameterServerTrainerBuilder this ^java.lang.Exception thrown-exception]
    (-> this (.thrownException thrown-exception))))

(defn should-update
  "should-update - `java.util.concurrent.atomic.AtomicBoolean`

  returns: `org.deeplearning4j.parallelism.parameterserver.ParameterServerTrainer$ParameterServerTrainerBuilder`"
  (^org.deeplearning4j.parallelism.parameterserver.ParameterServerTrainer$ParameterServerTrainerBuilder [^ParameterServerTrainer$ParameterServerTrainerBuilder this ^java.util.concurrent.atomic.AtomicBoolean should-update]
    (-> this (.shouldUpdate should-update))))

(defn use-mds
  "use-mds - `boolean`

  returns: `org.deeplearning4j.parallelism.parameterserver.ParameterServerTrainer$ParameterServerTrainerBuilder`"
  (^org.deeplearning4j.parallelism.parameterserver.ParameterServerTrainer$ParameterServerTrainerBuilder [^ParameterServerTrainer$ParameterServerTrainerBuilder this ^Boolean use-mds]
    (-> this (.useMDS use-mds))))

(defn replicated-model
  "replicated-model - `org.deeplearning4j.nn.api.Model`

  returns: `org.deeplearning4j.parallelism.parameterserver.ParameterServerTrainer$ParameterServerTrainerBuilder`"
  (^org.deeplearning4j.parallelism.parameterserver.ParameterServerTrainer$ParameterServerTrainerBuilder [^ParameterServerTrainer$ParameterServerTrainerBuilder this ^org.deeplearning4j.nn.api.Model replicated-model]
    (-> this (.replicatedModel replicated-model))))

