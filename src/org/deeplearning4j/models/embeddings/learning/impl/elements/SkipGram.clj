(ns org.deeplearning4j.models.embeddings.learning.impl.elements.SkipGram
  "Skip-Gram implementation for dl4j SequenceVectors"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.embeddings.learning.impl.elements SkipGram]))

(defn ->skip-gram
  "Constructor.

  Dummy construction is required for reflection"
  (^SkipGram []
    (new SkipGram )))

(defn apply-subsampling
  "sequence - `org.deeplearning4j.models.sequencevectors.sequence.Sequence`
  next-random - `java.util.concurrent.atomic.AtomicLong`

  returns: `org.deeplearning4j.models.sequencevectors.sequence.Sequence<T>`"
  (^org.deeplearning4j.models.sequencevectors.sequence.Sequence [^SkipGram this ^org.deeplearning4j.models.sequencevectors.sequence.Sequence sequence ^java.util.concurrent.atomic.AtomicLong next-random]
    (-> this (.applySubsampling sequence next-random))))

(defn early-termination-hit?
  "SkipGram has no reasons for early termination ever.

  returns: `boolean`"
  (^Boolean [^SkipGram this]
    (-> this (.isEarlyTerminationHit))))

(defn pretrain
  "SkipGram doesn't involves any pretraining

  iterator - `org.deeplearning4j.models.sequencevectors.interfaces.SequenceIterator`"
  ([^SkipGram this ^org.deeplearning4j.models.sequencevectors.interfaces.SequenceIterator iterator]
    (-> this (.pretrain iterator))))

(defn configure
  "SkipGram initialization over given vocabulary and WeightLookupTable

  vocab-cache - `org.deeplearning4j.models.word2vec.wordstore.VocabCache`
  lookup-table - `org.deeplearning4j.models.embeddings.WeightLookupTable`
  configuration - `org.deeplearning4j.models.embeddings.loader.VectorsConfiguration`"
  ([^SkipGram this ^org.deeplearning4j.models.word2vec.wordstore.VocabCache vocab-cache ^org.deeplearning4j.models.embeddings.WeightLookupTable lookup-table ^org.deeplearning4j.models.embeddings.loader.VectorsConfiguration configuration]
    (-> this (.configure vocab-cache lookup-table configuration))))

(defn finish
  ""
  ([^SkipGram this]
    (-> this (.finish))))

(defn get-code-name
  "Returns implementation code name

  returns: `java.lang.String`"
  (^java.lang.String [^SkipGram this]
    (-> this (.getCodeName))))

(defn get-batch
  "returns: `java.util.List<org.nd4j.linalg.api.ops.aggregates.Aggregate>`"
  (^java.util.List [^SkipGram this]
    (-> this (.getBatch))))

(defn iterate-sample
  "w-1 - `T`
  last-word - `T`
  next-random - `java.util.concurrent.atomic.AtomicLong`
  alpha - `double`
  is-inference - `boolean`
  inference-vector - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `double`"
  (^Double [^SkipGram this w-1 last-word ^java.util.concurrent.atomic.AtomicLong next-random ^Double alpha ^Boolean is-inference ^org.nd4j.linalg.api.ndarray.INDArray inference-vector]
    (-> this (.iterateSample w-1 last-word next-random alpha is-inference inference-vector))))

(defn learn-sequence
  "Learns sequence using SkipGram algorithm

  sequence - `org.deeplearning4j.models.sequencevectors.sequence.Sequence`
  next-random - `java.util.concurrent.atomic.AtomicLong`
  learning-rate - `double`

  returns: average score for this sequence - `double`"
  (^Double [^SkipGram this ^org.deeplearning4j.models.sequencevectors.sequence.Sequence sequence ^java.util.concurrent.atomic.AtomicLong next-random ^Double learning-rate]
    (-> this (.learnSequence sequence next-random learning-rate))))

