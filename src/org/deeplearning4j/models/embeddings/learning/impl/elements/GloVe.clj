(ns org.deeplearning4j.models.embeddings.learning.impl.elements.GloVe
  "GloVe LearningAlgorithm implementation for SequenceVectors"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.embeddings.learning.impl.elements GloVe]))

(defn ->glo-ve
  "Constructor."
  (^GloVe []
    (new GloVe )))

(defn get-code-name
  "returns: `java.lang.String`"
  (^java.lang.String [^GloVe this]
    (-> this (.getCodeName))))

(defn finish
  ""
  ([^GloVe this]
    (-> this (.finish))))

(defn configure
  "vocab-cache - `org.deeplearning4j.models.word2vec.wordstore.VocabCache`
  lookup-table - `org.deeplearning4j.models.embeddings.WeightLookupTable`
  configuration - `org.deeplearning4j.models.embeddings.loader.VectorsConfiguration`"
  ([^GloVe this ^org.deeplearning4j.models.word2vec.wordstore.VocabCache vocab-cache ^org.deeplearning4j.models.embeddings.WeightLookupTable lookup-table ^org.deeplearning4j.models.embeddings.loader.VectorsConfiguration configuration]
    (-> this (.configure vocab-cache lookup-table configuration))))

(defn pretrain
  "pretrain is used to build CoOccurrence matrix for GloVe algorithm

  iterator - `org.deeplearning4j.models.sequencevectors.interfaces.SequenceIterator`"
  ([^GloVe this ^org.deeplearning4j.models.sequencevectors.interfaces.SequenceIterator iterator]
    (-> this (.pretrain iterator))))

(defn learn-sequence
  "Learns sequence using GloVe algorithm

  sequence - `org.deeplearning4j.models.sequencevectors.sequence.Sequence`
  next-random - `java.util.concurrent.atomic.AtomicLong`
  learning-rate - `double`

  returns: average score for this sequence - `double`"
  (^Double [^GloVe this ^org.deeplearning4j.models.sequencevectors.sequence.Sequence sequence ^java.util.concurrent.atomic.AtomicLong next-random ^Double learning-rate]
    (-> this (.learnSequence sequence next-random learning-rate))))

(defn early-termination-hit?
  "Since GloVe is learning representations using elements CoOccurences, all training is done in GloVe class internally, so only first thread will execute learning process,
  and the rest of parent threads will just exit learning process

  returns: True, if training should stop, False otherwise. - `boolean`"
  (^Boolean [^GloVe this]
    (-> this (.isEarlyTerminationHit))))

