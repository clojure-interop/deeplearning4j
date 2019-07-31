(ns org.deeplearning4j.parallelism.ParallelWrapper$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.parallelism ParallelWrapper$Builder]))

(defn ->builder
  "Constructor.

  Build ParallelWrapper for MultiLayerNetwork

  model - `T`"
  (^ParallelWrapper$Builder [model]
    (new ParallelWrapper$Builder model)))

(defn trainer-factory
  "Specify a TrainerContext
  for the given ParallelWrapper
  instance.
  Defaults to DefaultTrainerContext
  otherwise

  trainer-context - the trainer factory to use - `org.deeplearning4j.parallelism.factory.TrainerContext`

  returns: builder pattern - `org.deeplearning4j.parallelism.ParallelWrapper$Builder`"
  (^org.deeplearning4j.parallelism.ParallelWrapper$Builder [^ParallelWrapper$Builder this ^org.deeplearning4j.parallelism.factory.TrainerContext trainer-context]
    (-> this (.trainerFactory trainer-context))))

(defn averaging-frequency
  "Model averaging frequency.

  freq - number of iterations between averaging - `int`

  returns: `org.deeplearning4j.parallelism.ParallelWrapper$Builder`"
  (^org.deeplearning4j.parallelism.ParallelWrapper$Builder [^ParallelWrapper$Builder this ^Integer freq]
    (-> this (.averagingFrequency freq))))

(defn average-updaters
  "This method enables/disables updaters averaging.
  Default value: TRUE
  PLEASE NOTE: This method is suitable for debugging purposes mostly. So don't change default value, unless you're sure why you need it.
  PLEASE NOTE: This method is suitable for parameters averaging training only. For gradients sharing mechanism it'll be ignored

  really-average - `boolean`

  returns: `org.deeplearning4j.parallelism.ParallelWrapper$Builder`"
  (^org.deeplearning4j.parallelism.ParallelWrapper$Builder [^ParallelWrapper$Builder this ^Boolean really-average]
    (-> this (.averageUpdaters really-average))))

(defn workspace-mode
  "mode - `org.deeplearning4j.nn.conf.WorkspaceMode`

  returns: `org.deeplearning4j.parallelism.ParallelWrapper$Builder`"
  (^org.deeplearning4j.parallelism.ParallelWrapper$Builder [^ParallelWrapper$Builder this ^org.deeplearning4j.nn.conf.WorkspaceMode mode]
    (-> this (.workspaceMode mode))))

(defn trainer-context-args
  "Transer context args are for calling a
  TrainerContext init method
  when ParallelWrapper starts training

  trainer-context-args - the args to use (maybe null) - `java.lang.Object`

  returns: `org.deeplearning4j.parallelism.ParallelWrapper$Builder`"
  (^org.deeplearning4j.parallelism.ParallelWrapper$Builder [^ParallelWrapper$Builder this ^java.lang.Object trainer-context-args]
    (-> this (.trainerContextArgs trainer-context-args))))

(defn prefetch-buffer
  "Size of prefetch buffer that will be used for background data prefetching.
  Usually it's better to keep this value equal to the number of workers.
  Default value: 2

  size - 0 to disable prefetching, any positive number - `int`

  returns: `org.deeplearning4j.parallelism.ParallelWrapper$Builder`"
  (^org.deeplearning4j.parallelism.ParallelWrapper$Builder [^ParallelWrapper$Builder this ^Integer size]
    (-> this (.prefetchBuffer size))))

(defn build
  "This method returns ParallelWrapper instance

  returns: `org.deeplearning4j.parallelism.ParallelWrapper`"
  (^org.deeplearning4j.parallelism.ParallelWrapper [^ParallelWrapper$Builder this]
    (-> this (.build))))

(defn training-mode
  "This method allows you to specify training mode for this instance of PW.
  1) AVERAGING - stands for parameters averaging. Each X epochs weights and updaters state will be averaged across all models
  2) SHARED_GRADIENTS - stands for gradients sharing - more details available here: https://deeplearning4j.org/distributed
  3) CUSTOM - this method allows you to specify custom gradients accumulator, this giving you better control of configuration params for training.

  mode - `org.deeplearning4j.parallelism.ParallelWrapper$TrainingMode`

  returns: `org.deeplearning4j.parallelism.ParallelWrapper$Builder`"
  (^org.deeplearning4j.parallelism.ParallelWrapper$Builder [^ParallelWrapper$Builder this ^org.deeplearning4j.parallelism.ParallelWrapper$TrainingMode mode]
    (-> this (.trainingMode mode))))

(defn gradients-accumulator
  "This method allows you to specify GradientsAccumulator instance to be used in this ParallelWrapper instance
  PLEASE NOTE: This method is applicable only to gradients sharing mechanics. If parameters averaging is used, accumulator will be ignored

  accumulator - `org.deeplearning4j.optimize.solvers.accumulation.GradientsAccumulator`

  returns: `org.deeplearning4j.parallelism.ParallelWrapper$Builder`"
  (^org.deeplearning4j.parallelism.ParallelWrapper$Builder [^ParallelWrapper$Builder this ^org.deeplearning4j.optimize.solvers.accumulation.GradientsAccumulator accumulator]
    (-> this (.gradientsAccumulator accumulator))))

(defn report-score-after-averaging
  "This method enables/disables averaged model score reporting

  really-report - `boolean`

  returns: `org.deeplearning4j.parallelism.ParallelWrapper$Builder`"
  (^org.deeplearning4j.parallelism.ParallelWrapper$Builder [^ParallelWrapper$Builder this ^Boolean really-report]
    (-> this (.reportScoreAfterAveraging really-report))))

(defn workers
  "This method allows to configure number of workers that'll be used for parallel training

  num - `int`

  returns: `org.deeplearning4j.parallelism.ParallelWrapper$Builder`"
  (^org.deeplearning4j.parallelism.ParallelWrapper$Builder [^ParallelWrapper$Builder this ^Integer num]
    (-> this (.workers num))))

