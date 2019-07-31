(ns org.deeplearning4j.parallelism.trainer.SymmetricTrainer
  "This trainer implementation does parallel training via gradients broadcasts.
 After each iteration, gradients from this trainer will be propagated & applied to all other trainers"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.parallelism.trainer SymmetricTrainer]))

(defn ->symmetric-trainer
  "Constructor.

  original-model - `org.deeplearning4j.nn.api.Model`
  uuid - `java.lang.String`
  thread-idx - `int`
  mode - `org.deeplearning4j.nn.conf.WorkspaceMode`
  wrapper - `org.deeplearning4j.parallelism.ParallelWrapper`
  use-mds - `boolean`"
  (^SymmetricTrainer [^org.deeplearning4j.nn.api.Model original-model ^java.lang.String uuid ^Integer thread-idx ^org.deeplearning4j.nn.conf.WorkspaceMode mode ^org.deeplearning4j.parallelism.ParallelWrapper wrapper ^Boolean use-mds]
    (new SymmetricTrainer original-model uuid thread-idx mode wrapper use-mds)))

(defn enqueue-gradient
  "Deprecated.

  gradient - `org.deeplearning4j.optimize.listeners.SharedGradient`"
  ([^SymmetricTrainer this ^org.deeplearning4j.optimize.listeners.SharedGradient gradient]
    (-> this (.enqueueGradient gradient))))

(defn averaging-required
  "Description copied from interface: Trainer

  returns: `boolean`"
  (^Boolean [^SymmetricTrainer this]
    (-> this (.averagingRequired))))

