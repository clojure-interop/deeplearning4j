(ns org.deeplearning4j.models.embeddings.learning.impl.sequence.DBOW
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.embeddings.learning.impl.sequence DBOW]))

(defn ->dbow
  "Constructor."
  (^DBOW []
    (new DBOW )))

(defn get-elements-learning-algorithm
  "returns: `org.deeplearning4j.models.embeddings.learning.ElementsLearningAlgorithm<T>`"
  (^org.deeplearning4j.models.embeddings.learning.ElementsLearningAlgorithm [^DBOW this]
    (-> this (.getElementsLearningAlgorithm))))

(defn get-code-name
  "returns: `java.lang.String`"
  (^java.lang.String [^DBOW this]
    (-> this (.getCodeName))))

(defn configure
  "vocab-cache - `org.deeplearning4j.models.word2vec.wordstore.VocabCache`
  lookup-table - `org.deeplearning4j.models.embeddings.WeightLookupTable`
  configuration - `org.deeplearning4j.models.embeddings.loader.VectorsConfiguration`"
  ([^DBOW this ^org.deeplearning4j.models.word2vec.wordstore.VocabCache vocab-cache ^org.deeplearning4j.models.embeddings.WeightLookupTable lookup-table ^org.deeplearning4j.models.embeddings.loader.VectorsConfiguration configuration]
    (-> this (.configure vocab-cache lookup-table configuration))))

(defn pretrain
  "DBOW doesn't involves any pretraining

  iterator - `org.deeplearning4j.models.sequencevectors.interfaces.SequenceIterator`"
  ([^DBOW this ^org.deeplearning4j.models.sequencevectors.interfaces.SequenceIterator iterator]
    (-> this (.pretrain iterator))))

(defn learn-sequence
  "Description copied from interface: SequenceLearningAlgorithm

  sequence - `org.deeplearning4j.models.sequencevectors.sequence.Sequence`
  next-random - `java.util.concurrent.atomic.AtomicLong`
  learning-rate - `double`

  returns: average score for this sequence - `double`"
  (^Double [^DBOW this ^org.deeplearning4j.models.sequencevectors.sequence.Sequence sequence ^java.util.concurrent.atomic.AtomicLong next-random ^Double learning-rate]
    (-> this (.learnSequence sequence next-random learning-rate))))

(defn early-termination-hit?
  "DBOW has no reasons for early termination

  returns: `boolean`"
  (^Boolean [^DBOW this]
    (-> this (.isEarlyTerminationHit))))

(defn infer-sequence
  "This method does training on previously unseen paragraph, and returns inferred vector

  sequence - `org.deeplearning4j.models.sequencevectors.sequence.Sequence`
  next-random - `long`
  learning-rate - `double`
  min-learning-rate - `double`
  iterations - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^DBOW this ^org.deeplearning4j.models.sequencevectors.sequence.Sequence sequence ^Long next-random ^Double learning-rate ^Double min-learning-rate ^Integer iterations]
    (-> this (.inferSequence sequence next-random learning-rate min-learning-rate iterations))))

(defn finish
  ""
  ([^DBOW this]
    (-> this (.finish))))

