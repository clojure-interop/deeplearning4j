(ns org.deeplearning4j.spark.models.sequencevectors.SparkSequenceVectors$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.models.sequencevectors SparkSequenceVectors$Builder]))

(defn ->builder
  "Constructor.

  ps-configuration - `org.nd4j.parameterserver.distributed.conf.VoidConfiguration`
  w-2v-configuration - `org.deeplearning4j.models.embeddings.loader.VectorsConfiguration`"
  (^SparkSequenceVectors$Builder [^org.nd4j.parameterserver.distributed.conf.VoidConfiguration ps-configuration ^org.deeplearning4j.models.embeddings.loader.VectorsConfiguration w-2v-configuration]
    (new SparkSequenceVectors$Builder ps-configuration w-2v-configuration))
  (^SparkSequenceVectors$Builder [^org.nd4j.parameterserver.distributed.conf.VoidConfiguration ps-configuration]
    (new SparkSequenceVectors$Builder ps-configuration))
  (^SparkSequenceVectors$Builder []
    (new SparkSequenceVectors$Builder )))

(defn negative-sampling
  "samples - `long`

  returns: `org.deeplearning4j.spark.models.sequencevectors.SparkSequenceVectors$Builder<T>`"
  (^org.deeplearning4j.spark.models.sequencevectors.SparkSequenceVectors$Builder [^SparkSequenceVectors$Builder this ^Long samples]
    (-> this (.negativeSampling samples))))

(defn set-storage-level
  "level - `org.apache.spark.storage.StorageLevel`

  returns: `org.deeplearning4j.spark.models.sequencevectors.SparkSequenceVectors$Builder<T>`"
  (^org.deeplearning4j.spark.models.sequencevectors.SparkSequenceVectors$Builder [^SparkSequenceVectors$Builder this ^org.apache.spark.storage.StorageLevel level]
    (-> this (.setStorageLevel level))))

(defn use-hierarchic-softmax
  "really-use - `boolean`

  returns: `org.deeplearning4j.spark.models.sequencevectors.SparkSequenceVectors$Builder<T>`"
  (^org.deeplearning4j.spark.models.sequencevectors.SparkSequenceVectors$Builder [^SparkSequenceVectors$Builder this ^Boolean really-use]
    (-> this (.useHierarchicSoftmax really-use))))

(defn iterations
  "num - `int`

  returns: `org.deeplearning4j.spark.models.sequencevectors.SparkSequenceVectors$Builder<T>`"
  (^org.deeplearning4j.spark.models.sequencevectors.SparkSequenceVectors$Builder [^SparkSequenceVectors$Builder this ^Integer num]
    (-> this (.iterations num))))

(defn set-parameter-server-configuration
  "configuration - `org.nd4j.parameterserver.distributed.conf.VoidConfiguration`

  returns: `org.deeplearning4j.spark.models.sequencevectors.SparkSequenceVectors$Builder<T>`"
  (^org.deeplearning4j.spark.models.sequencevectors.SparkSequenceVectors$Builder [^SparkSequenceVectors$Builder this ^org.nd4j.parameterserver.distributed.conf.VoidConfiguration configuration]
    (-> this (.setParameterServerConfiguration configuration))))

(defn set-learning-rate
  "lr - `double`

  returns: `org.deeplearning4j.spark.models.sequencevectors.SparkSequenceVectors$Builder<T>`"
  (^org.deeplearning4j.spark.models.sequencevectors.SparkSequenceVectors$Builder [^SparkSequenceVectors$Builder this ^Double lr]
    (-> this (.setLearningRate lr))))

(defn set-elements-learning-algorithm
  "ela - `org.deeplearning4j.spark.models.sequencevectors.learning.SparkElementsLearningAlgorithm`

  returns: `org.deeplearning4j.spark.models.sequencevectors.SparkSequenceVectors$Builder<T>`"
  (^org.deeplearning4j.spark.models.sequencevectors.SparkSequenceVectors$Builder [^SparkSequenceVectors$Builder this ^org.deeplearning4j.spark.models.sequencevectors.learning.SparkElementsLearningAlgorithm ela]
    (-> this (.setElementsLearningAlgorithm ela))))

(defn build
  "returns: `org.deeplearning4j.spark.models.sequencevectors.SparkSequenceVectors<T>`"
  (^org.deeplearning4j.spark.models.sequencevectors.SparkSequenceVectors [^SparkSequenceVectors$Builder this]
    (-> this (.build))))

(defn set-model-exporter
  "model-exporter - `org.deeplearning4j.spark.models.sequencevectors.export.SparkModelExporter`

  returns: `org.deeplearning4j.spark.models.sequencevectors.SparkSequenceVectors$Builder<T>`"
  (^org.deeplearning4j.spark.models.sequencevectors.SparkSequenceVectors$Builder [^SparkSequenceVectors$Builder this ^org.deeplearning4j.spark.models.sequencevectors.export.SparkModelExporter model-exporter]
    (-> this (.setModelExporter model-exporter))))

(defn subsampling
  "rate - `double`

  returns: `org.deeplearning4j.spark.models.sequencevectors.SparkSequenceVectors$Builder<T>`"
  (^org.deeplearning4j.spark.models.sequencevectors.SparkSequenceVectors$Builder [^SparkSequenceVectors$Builder this ^Double rate]
    (-> this (.subsampling rate))))

(defn min-word-frequency
  "num - `int`

  returns: `org.deeplearning4j.spark.models.sequencevectors.SparkSequenceVectors$Builder<T>`"
  (^org.deeplearning4j.spark.models.sequencevectors.SparkSequenceVectors$Builder [^SparkSequenceVectors$Builder this ^Integer num]
    (-> this (.minWordFrequency num))))

(defn set-sequence-learning-algorithm
  "sla - `org.deeplearning4j.spark.models.sequencevectors.learning.SparkSequenceLearningAlgorithm`

  returns: `org.deeplearning4j.spark.models.sequencevectors.SparkSequenceVectors$Builder<T>`"
  (^org.deeplearning4j.spark.models.sequencevectors.SparkSequenceVectors$Builder [^SparkSequenceVectors$Builder this ^org.deeplearning4j.spark.models.sequencevectors.learning.SparkSequenceLearningAlgorithm sla]
    (-> this (.setSequenceLearningAlgorithm sla))))

(defn layer-size
  "layer-size - `int`

  returns: `org.deeplearning4j.spark.models.sequencevectors.SparkSequenceVectors$Builder<T>`"
  (^org.deeplearning4j.spark.models.sequencevectors.SparkSequenceVectors$Builder [^SparkSequenceVectors$Builder this ^Integer layer-size]
    (-> this (.layerSize layer-size))))

(defn workers
  "num - `int`

  returns: `org.deeplearning4j.spark.models.sequencevectors.SparkSequenceVectors$Builder<T>`"
  (^org.deeplearning4j.spark.models.sequencevectors.SparkSequenceVectors$Builder [^SparkSequenceVectors$Builder this ^Integer num]
    (-> this (.workers num))))

(defn epochs
  "num - `int`

  returns: `org.deeplearning4j.spark.models.sequencevectors.SparkSequenceVectors$Builder<T>`"
  (^org.deeplearning4j.spark.models.sequencevectors.SparkSequenceVectors$Builder [^SparkSequenceVectors$Builder this ^Integer num]
    (-> this (.epochs num))))

