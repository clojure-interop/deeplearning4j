(ns org.deeplearning4j.spark.models.sequencevectors.learning.elements.BaseSparkLearningAlgorithm
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.models.sequencevectors.learning.elements BaseSparkLearningAlgorithm]))

(defn *apply-subsampling
  "sequence - `org.deeplearning4j.models.sequencevectors.sequence.Sequence`
  next-random - `java.util.concurrent.atomic.AtomicLong`
  total-elements-count - `long`
  prob - `double`

  returns: `org.deeplearning4j.models.sequencevectors.sequence.Sequence<org.deeplearning4j.models.sequencevectors.sequence.ShallowSequenceElement>`"
  (^org.deeplearning4j.models.sequencevectors.sequence.Sequence [^org.deeplearning4j.models.sequencevectors.sequence.Sequence sequence ^java.util.concurrent.atomic.AtomicLong next-random ^Long total-elements-count ^Double prob]
    (BaseSparkLearningAlgorithm/applySubsampling sequence next-random total-elements-count prob)))

(defn learn-sequence
  "Description copied from interface: ElementsLearningAlgorithm

  sequence - `org.deeplearning4j.models.sequencevectors.sequence.Sequence`
  next-random - `java.util.concurrent.atomic.AtomicLong`
  learning-rate - `double`

  returns: average score for this sequence - `double`"
  (^Double [^BaseSparkLearningAlgorithm this ^org.deeplearning4j.models.sequencevectors.sequence.Sequence sequence ^java.util.concurrent.atomic.AtomicLong next-random ^Double learning-rate]
    (-> this (.learnSequence sequence next-random learning-rate))))

(defn configure
  "vocab-cache - `org.deeplearning4j.models.word2vec.wordstore.VocabCache`
  lookup-table - `org.deeplearning4j.models.embeddings.WeightLookupTable`
  configuration - `org.deeplearning4j.models.embeddings.loader.VectorsConfiguration`"
  ([^BaseSparkLearningAlgorithm this ^org.deeplearning4j.models.word2vec.wordstore.VocabCache vocab-cache ^org.deeplearning4j.models.embeddings.WeightLookupTable lookup-table ^org.deeplearning4j.models.embeddings.loader.VectorsConfiguration configuration]
    (-> this (.configure vocab-cache lookup-table configuration))))

(defn pretrain
  "iterator - `org.deeplearning4j.models.sequencevectors.interfaces.SequenceIterator`"
  ([^BaseSparkLearningAlgorithm this ^org.deeplearning4j.models.sequencevectors.interfaces.SequenceIterator iterator]
    (-> this (.pretrain iterator))))

(defn early-termination-hit?
  "returns: `boolean`"
  (^Boolean [^BaseSparkLearningAlgorithm this]
    (-> this (.isEarlyTerminationHit))))

(defn finish
  ""
  ([^BaseSparkLearningAlgorithm this]
    (-> this (.finish))))

