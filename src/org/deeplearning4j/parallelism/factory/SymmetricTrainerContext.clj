(ns org.deeplearning4j.parallelism.factory.SymmetricTrainerContext
  "Creates DefaultTrainer
 instances for use with ParallelWrapper"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.parallelism.factory SymmetricTrainerContext]))

(defn ->symmetric-trainer-context
  "Constructor."
  (^SymmetricTrainerContext []
    (new SymmetricTrainerContext )))

(defn init
  "Initialize the context

  model - `org.deeplearning4j.nn.api.Model`
  args - the arguments to initialize with (maybe null) - `java.lang.Object`"
  ([^SymmetricTrainerContext this ^org.deeplearning4j.nn.api.Model model ^java.lang.Object args]
    (-> this (.init model args))))

(defn create
  "Create a Trainer
  based on the given parameters

  uuid - `java.lang.String`
  thread-id - the thread id to use for this worker - `int`
  model - the model to start the trainer with - `org.deeplearning4j.nn.api.Model`
  root-device - the root device id - `int`
  use-mds - whether to use MultiDataSet or DataSetor not - `boolean`
  wrapper - the wrapper instance to use with this trainer (this refernece is neededfor coordination with the ParallelWrapper 's TrainingListener - `org.deeplearning4j.parallelism.ParallelWrapper`
  mode - `org.deeplearning4j.nn.conf.WorkspaceMode`
  averaging-frequency - `int`

  returns: the created training instance - `org.deeplearning4j.parallelism.trainer.Trainer`"
  (^org.deeplearning4j.parallelism.trainer.Trainer [^SymmetricTrainerContext this ^java.lang.String uuid ^Integer thread-id ^org.deeplearning4j.nn.api.Model model ^Integer root-device ^Boolean use-mds ^org.deeplearning4j.parallelism.ParallelWrapper wrapper ^org.deeplearning4j.nn.conf.WorkspaceMode mode ^Integer averaging-frequency]
    (-> this (.create uuid thread-id model root-device use-mds wrapper mode averaging-frequency))))

(defn finalize-round
  "Description copied from interface: TrainerContext

  original-model - `org.deeplearning4j.nn.api.Model`
  models - `org.deeplearning4j.nn.api.Model`"
  ([^SymmetricTrainerContext this ^org.deeplearning4j.nn.api.Model original-model ^org.deeplearning4j.nn.api.Model models]
    (-> this (.finalizeRound original-model models))))

(defn finalize-training
  "Description copied from interface: TrainerContext

  original-model - `org.deeplearning4j.nn.api.Model`
  models - `org.deeplearning4j.nn.api.Model`"
  ([^SymmetricTrainerContext this ^org.deeplearning4j.nn.api.Model original-model ^org.deeplearning4j.nn.api.Model models]
    (-> this (.finalizeTraining original-model models))))

