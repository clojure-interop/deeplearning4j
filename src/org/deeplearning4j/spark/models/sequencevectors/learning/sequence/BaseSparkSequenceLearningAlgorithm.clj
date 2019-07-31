(ns org.deeplearning4j.spark.models.sequencevectors.learning.sequence.BaseSparkSequenceLearningAlgorithm
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.models.sequencevectors.learning.sequence BaseSparkSequenceLearningAlgorithm]))

(defn ->base-spark-sequence-learning-algorithm
  "Constructor."
  (^BaseSparkSequenceLearningAlgorithm []
    (new BaseSparkSequenceLearningAlgorithm )))

(defn configure
  "vocab-cache - `org.deeplearning4j.models.word2vec.wordstore.VocabCache`
  lookup-table - `org.deeplearning4j.models.embeddings.WeightLookupTable`
  configuration - `org.deeplearning4j.models.embeddings.loader.VectorsConfiguration`"
  ([^BaseSparkSequenceLearningAlgorithm this ^org.deeplearning4j.models.word2vec.wordstore.VocabCache vocab-cache ^org.deeplearning4j.models.embeddings.WeightLookupTable lookup-table ^org.deeplearning4j.models.embeddings.loader.VectorsConfiguration configuration]
    (-> this (.configure vocab-cache lookup-table configuration))))

(defn pretrain
  "iterator - `org.deeplearning4j.models.sequencevectors.interfaces.SequenceIterator`"
  ([^BaseSparkSequenceLearningAlgorithm this ^org.deeplearning4j.models.sequencevectors.interfaces.SequenceIterator iterator]
    (-> this (.pretrain iterator))))

(defn early-termination-hit?
  "returns: `boolean`"
  (^Boolean [^BaseSparkSequenceLearningAlgorithm this]
    (-> this (.isEarlyTerminationHit))))

(defn infer-sequence
  "Description copied from interface: SequenceLearningAlgorithm

  sequence - `org.deeplearning4j.models.sequencevectors.sequence.Sequence`
  next-random - `long`
  learning-rate - `double`
  min-learning-rate - `double`
  iterations - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparkSequenceLearningAlgorithm this ^org.deeplearning4j.models.sequencevectors.sequence.Sequence sequence ^Long next-random ^Double learning-rate ^Double min-learning-rate ^Integer iterations]
    (-> this (.inferSequence sequence next-random learning-rate min-learning-rate iterations))))

(defn get-elements-learning-algorithm
  "returns: `org.deeplearning4j.models.embeddings.learning.ElementsLearningAlgorithm<org.deeplearning4j.models.sequencevectors.sequence.ShallowSequenceElement>`"
  (^org.deeplearning4j.models.embeddings.learning.ElementsLearningAlgorithm [^BaseSparkSequenceLearningAlgorithm this]
    (-> this (.getElementsLearningAlgorithm))))

(defn finish
  ""
  ([^BaseSparkSequenceLearningAlgorithm this]
    (-> this (.finish))))

