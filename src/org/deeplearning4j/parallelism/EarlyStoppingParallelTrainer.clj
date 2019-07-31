(ns org.deeplearning4j.parallelism.EarlyStoppingParallelTrainer
  "Conduct parallel early stopping training with ParallelWrapper under the hood.
 Can be used to train a MultiLayerNetwork or a ComputationGraph via early stopping."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.parallelism EarlyStoppingParallelTrainer]))

(defn ->early-stopping-parallel-trainer
  "Constructor.

  early-stopping-configuration - `org.deeplearning4j.earlystopping.EarlyStoppingConfiguration`
  model - `T`
  train - `org.nd4j.linalg.dataset.api.iterator.DataSetIterator`
  train-multi - `org.nd4j.linalg.dataset.api.iterator.MultiDataSetIterator`
  listener - `org.deeplearning4j.earlystopping.listener.EarlyStoppingListener`
  workers - `int`
  prefetch-buffer - `int`
  averaging-frequency - `int`
  report-score-after-averaging - `boolean`
  use-legacy-averaging - `boolean`"
  (^EarlyStoppingParallelTrainer [^org.deeplearning4j.earlystopping.EarlyStoppingConfiguration early-stopping-configuration model ^org.nd4j.linalg.dataset.api.iterator.DataSetIterator train ^org.nd4j.linalg.dataset.api.iterator.MultiDataSetIterator train-multi ^org.deeplearning4j.earlystopping.listener.EarlyStoppingListener listener ^Integer workers ^Integer prefetch-buffer ^Integer averaging-frequency ^Boolean report-score-after-averaging ^Boolean use-legacy-averaging]
    (new EarlyStoppingParallelTrainer early-stopping-configuration model train train-multi listener workers prefetch-buffer averaging-frequency report-score-after-averaging use-legacy-averaging))
  (^EarlyStoppingParallelTrainer [^org.deeplearning4j.earlystopping.EarlyStoppingConfiguration early-stopping-configuration model ^org.nd4j.linalg.dataset.api.iterator.DataSetIterator train ^org.nd4j.linalg.dataset.api.iterator.MultiDataSetIterator train-multi ^org.deeplearning4j.earlystopping.listener.EarlyStoppingListener listener ^Integer workers ^Integer prefetch-buffer ^Integer averaging-frequency]
    (new EarlyStoppingParallelTrainer early-stopping-configuration model train train-multi listener workers prefetch-buffer averaging-frequency))
  (^EarlyStoppingParallelTrainer [^org.deeplearning4j.earlystopping.EarlyStoppingConfiguration early-stopping-configuration model ^org.nd4j.linalg.dataset.api.iterator.DataSetIterator train ^org.nd4j.linalg.dataset.api.iterator.MultiDataSetIterator train-multi ^Integer workers ^Integer prefetch-buffer ^Integer averaging-frequency]
    (new EarlyStoppingParallelTrainer early-stopping-configuration model train train-multi workers prefetch-buffer averaging-frequency)))

(defn fit
  "Description copied from interface: IEarlyStoppingTrainer

  returns: `org.deeplearning4j.earlystopping.EarlyStoppingResult<T>`"
  (^org.deeplearning4j.earlystopping.EarlyStoppingResult [^EarlyStoppingParallelTrainer this]
    (-> this (.fit))))

(defn set-latest-score
  "latest-score - `double`"
  ([^EarlyStoppingParallelTrainer this ^Double latest-score]
    (-> this (.setLatestScore latest-score))))

(defn increment-iteration
  ""
  ([^EarlyStoppingParallelTrainer this]
    (-> this (.incrementIteration))))

(defn set-termination
  "terminate - `boolean`"
  ([^EarlyStoppingParallelTrainer this ^Boolean terminate]
    (-> this (.setTermination terminate))))

(defn get-termination?
  "returns: `boolean`"
  (^Boolean [^EarlyStoppingParallelTrainer this]
    (-> this (.getTermination))))

(defn set-listener
  "Description copied from interface: IEarlyStoppingTrainer

  listener - `org.deeplearning4j.earlystopping.listener.EarlyStoppingListener`"
  ([^EarlyStoppingParallelTrainer this ^org.deeplearning4j.earlystopping.listener.EarlyStoppingListener listener]
    (-> this (.setListener listener))))

