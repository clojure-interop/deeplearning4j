(ns org.deeplearning4j.models.embeddings.learning.ElementsLearningAlgorithm
  "Implementations of this interface should contain element-related learning algorithms. Like skip-gram, cbow or glove"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.embeddings.learning ElementsLearningAlgorithm]))

(defn get-code-name
  "returns: `java.lang.String`"
  (^java.lang.String [^ElementsLearningAlgorithm this]
    (-> this (.getCodeName))))

(defn configure
  "vocab-cache - `org.deeplearning4j.models.word2vec.wordstore.VocabCache`
  lookup-table - `org.deeplearning4j.models.embeddings.WeightLookupTable`
  configuration - `org.deeplearning4j.models.embeddings.loader.VectorsConfiguration`"
  ([^ElementsLearningAlgorithm this ^org.deeplearning4j.models.word2vec.wordstore.VocabCache vocab-cache ^org.deeplearning4j.models.embeddings.WeightLookupTable lookup-table ^org.deeplearning4j.models.embeddings.loader.VectorsConfiguration configuration]
    (-> this (.configure vocab-cache lookup-table configuration))))

(defn pretrain
  "iterator - `org.deeplearning4j.models.sequencevectors.interfaces.SequenceIterator`"
  ([^ElementsLearningAlgorithm this ^org.deeplearning4j.models.sequencevectors.interfaces.SequenceIterator iterator]
    (-> this (.pretrain iterator))))

(defn learn-sequence
  "This method does training over the sequence of elements passed into it

  sequence - `org.deeplearning4j.models.sequencevectors.sequence.Sequence`
  next-random - `java.util.concurrent.atomic.AtomicLong`
  learning-rate - `double`

  returns: average score for this sequence - `double`"
  (^Double [^ElementsLearningAlgorithm this ^org.deeplearning4j.models.sequencevectors.sequence.Sequence sequence ^java.util.concurrent.atomic.AtomicLong next-random ^Double learning-rate]
    (-> this (.learnSequence sequence next-random learning-rate))))

(defn early-termination-hit?
  "returns: `boolean`"
  (^Boolean [^ElementsLearningAlgorithm this]
    (-> this (.isEarlyTerminationHit))))

(defn finish
  ""
  ([^ElementsLearningAlgorithm this]
    (-> this (.finish))))

