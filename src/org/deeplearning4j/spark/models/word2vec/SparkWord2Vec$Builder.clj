(ns org.deeplearning4j.spark.models.word2vec.SparkWord2Vec$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.models.word2vec SparkWord2Vec$Builder]))

(defn ->builder
  "Constructor.

  ps-configuration - `org.nd4j.parameterserver.distributed.conf.VoidConfiguration`
  configuration - `org.deeplearning4j.models.embeddings.loader.VectorsConfiguration`"
  (^SparkWord2Vec$Builder [^org.nd4j.parameterserver.distributed.conf.VoidConfiguration ps-configuration ^org.deeplearning4j.models.embeddings.loader.VectorsConfiguration configuration]
    (new SparkWord2Vec$Builder ps-configuration configuration))
  (^SparkWord2Vec$Builder [^org.nd4j.parameterserver.distributed.conf.VoidConfiguration ps-configuration]
    (new SparkWord2Vec$Builder ps-configuration))
  (^SparkWord2Vec$Builder []
    (new SparkWord2Vec$Builder )))

(defn negative-sampling
  "samples - `long`

  returns: `org.deeplearning4j.spark.models.word2vec.SparkWord2Vec$Builder`"
  (^org.deeplearning4j.spark.models.word2vec.SparkWord2Vec$Builder [^SparkWord2Vec$Builder this ^Long samples]
    (-> this (.negativeSampling samples))))

(defn set-tokenizer-factory
  "This method defines tokenizer htat will be used for corpus tokenization

  tokenizer-factory - `org.deeplearning4j.text.tokenization.tokenizerfactory.TokenizerFactory`

  returns: `org.deeplearning4j.spark.models.word2vec.SparkWord2Vec$Builder`"
  (^org.deeplearning4j.spark.models.word2vec.SparkWord2Vec$Builder [^SparkWord2Vec$Builder this ^org.deeplearning4j.text.tokenization.tokenizerfactory.TokenizerFactory tokenizer-factory]
    (-> this (.setTokenizerFactory tokenizer-factory))))

(defn set-storage-level
  "level - `org.apache.spark.storage.StorageLevel`

  returns: `org.deeplearning4j.spark.models.word2vec.SparkWord2Vec$Builder`"
  (^org.deeplearning4j.spark.models.word2vec.SparkWord2Vec$Builder [^SparkWord2Vec$Builder this ^org.apache.spark.storage.StorageLevel level]
    (-> this (.setStorageLevel level))))

(defn use-hierarchic-softmax
  "really-use - `boolean`

  returns: `org.deeplearning4j.spark.models.word2vec.SparkWord2Vec$Builder`"
  (^org.deeplearning4j.spark.models.word2vec.SparkWord2Vec$Builder [^SparkWord2Vec$Builder this ^Boolean really-use]
    (-> this (.useHierarchicSoftmax really-use))))

(defn iterations
  "num - `int`

  returns: `org.deeplearning4j.spark.models.word2vec.SparkWord2Vec$Builder`"
  (^org.deeplearning4j.spark.models.word2vec.SparkWord2Vec$Builder [^SparkWord2Vec$Builder this ^Integer num]
    (-> this (.iterations num))))

(defn set-parameter-server-configuration
  "configuration - `org.nd4j.parameterserver.distributed.conf.VoidConfiguration`

  returns: `org.deeplearning4j.spark.models.word2vec.SparkWord2Vec$Builder`"
  (^org.deeplearning4j.spark.models.word2vec.SparkWord2Vec$Builder [^SparkWord2Vec$Builder this ^org.nd4j.parameterserver.distributed.conf.VoidConfiguration configuration]
    (-> this (.setParameterServerConfiguration configuration))))

(defn set-learning-rate
  "lr - `double`

  returns: `org.deeplearning4j.spark.models.word2vec.SparkWord2Vec$Builder`"
  (^org.deeplearning4j.spark.models.word2vec.SparkWord2Vec$Builder [^SparkWord2Vec$Builder this ^Double lr]
    (-> this (.setLearningRate lr))))

(defn set-elements-learning-algorithm
  "ela - `org.deeplearning4j.spark.models.sequencevectors.learning.SparkElementsLearningAlgorithm`

  returns: `org.deeplearning4j.spark.models.word2vec.SparkWord2Vec$Builder`"
  (^org.deeplearning4j.spark.models.word2vec.SparkWord2Vec$Builder [^SparkWord2Vec$Builder this ^org.deeplearning4j.spark.models.sequencevectors.learning.SparkElementsLearningAlgorithm ela]
    (-> this (.setElementsLearningAlgorithm ela))))

(defn build
  "This method returns you SparkWord2Vec instance ready for training

  returns: `org.deeplearning4j.spark.models.word2vec.SparkWord2Vec`"
  (^org.deeplearning4j.spark.models.word2vec.SparkWord2Vec [^SparkWord2Vec$Builder this]
    (-> this (.build))))

(defn set-model-exporter
  "This method defines the way model will be exported after training is finished

  exporter - `org.deeplearning4j.spark.models.sequencevectors.export.SparkModelExporter`

  returns: `org.deeplearning4j.spark.models.word2vec.SparkWord2Vec$Builder`"
  (^org.deeplearning4j.spark.models.word2vec.SparkWord2Vec$Builder [^SparkWord2Vec$Builder this ^org.deeplearning4j.spark.models.sequencevectors.export.SparkModelExporter exporter]
    (-> this (.setModelExporter exporter))))

(defn subsampling
  "rate - `double`

  returns: `org.deeplearning4j.spark.models.word2vec.SparkWord2Vec$Builder`"
  (^org.deeplearning4j.spark.models.word2vec.SparkWord2Vec$Builder [^SparkWord2Vec$Builder this ^Double rate]
    (-> this (.subsampling rate))))

(defn min-word-frequency
  "num - `int`

  returns: `org.deeplearning4j.spark.models.word2vec.SparkWord2Vec$Builder`"
  (^org.deeplearning4j.spark.models.word2vec.SparkWord2Vec$Builder [^SparkWord2Vec$Builder this ^Integer num]
    (-> this (.minWordFrequency num))))

(defn set-sequence-learning-algorithm
  "sla - `org.deeplearning4j.spark.models.sequencevectors.learning.SparkSequenceLearningAlgorithm`

  returns: `org.deeplearning4j.spark.models.word2vec.SparkWord2Vec$Builder`"
  (^org.deeplearning4j.spark.models.word2vec.SparkWord2Vec$Builder [^SparkWord2Vec$Builder this ^org.deeplearning4j.spark.models.sequencevectors.learning.SparkSequenceLearningAlgorithm sla]
    (-> this (.setSequenceLearningAlgorithm sla))))

(defn set-learning-algorithm
  "This method defines the learning algorithm that will be used during training

  ela - `org.deeplearning4j.spark.models.sequencevectors.learning.SparkElementsLearningAlgorithm`

  returns: `org.deeplearning4j.spark.models.word2vec.SparkWord2Vec$Builder`"
  (^org.deeplearning4j.spark.models.word2vec.SparkWord2Vec$Builder [^SparkWord2Vec$Builder this ^org.deeplearning4j.spark.models.sequencevectors.learning.SparkElementsLearningAlgorithm ela]
    (-> this (.setLearningAlgorithm ela))))

(defn layer-size
  "layer-size - `int`

  returns: `org.deeplearning4j.spark.models.word2vec.SparkWord2Vec$Builder`"
  (^org.deeplearning4j.spark.models.word2vec.SparkWord2Vec$Builder [^SparkWord2Vec$Builder this ^Integer layer-size]
    (-> this (.layerSize layer-size))))

(defn workers
  "num-workers - `int`

  returns: `org.deeplearning4j.spark.models.word2vec.SparkWord2Vec$Builder`"
  (^org.deeplearning4j.spark.models.word2vec.SparkWord2Vec$Builder [^SparkWord2Vec$Builder this ^Integer num-workers]
    (-> this (.workers num-workers))))

(defn epochs
  "num-epochs - `int`

  returns: `org.deeplearning4j.spark.models.word2vec.SparkWord2Vec$Builder`"
  (^org.deeplearning4j.spark.models.word2vec.SparkWord2Vec$Builder [^SparkWord2Vec$Builder this ^Integer num-epochs]
    (-> this (.epochs num-epochs))))

