(ns org.deeplearning4j.models.embeddings.learning.impl.elements.CBOW
  "CBOW implementation for DeepLearning4j"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.embeddings.learning.impl.elements CBOW]))

(defn ->cbow
  "Constructor."
  (^CBOW []
    (new CBOW )))

(defn apply-subsampling
  "sequence - `org.deeplearning4j.models.sequencevectors.sequence.Sequence`
  next-random - `java.util.concurrent.atomic.AtomicLong`

  returns: `org.deeplearning4j.models.sequencevectors.sequence.Sequence<T>`"
  (^org.deeplearning4j.models.sequencevectors.sequence.Sequence [^CBOW this ^org.deeplearning4j.models.sequencevectors.sequence.Sequence sequence ^java.util.concurrent.atomic.AtomicLong next-random]
    (-> this (.applySubsampling sequence next-random))))

(defn early-termination-hit?
  "returns: `boolean`"
  (^Boolean [^CBOW this]
    (-> this (.isEarlyTerminationHit))))

(defn pretrain
  "CBOW doesn't involve any pretraining

  iterator - `org.deeplearning4j.models.sequencevectors.interfaces.SequenceIterator`"
  ([^CBOW this ^org.deeplearning4j.models.sequencevectors.interfaces.SequenceIterator iterator]
    (-> this (.pretrain iterator))))

(defn configure
  "vocab-cache - `org.deeplearning4j.models.word2vec.wordstore.VocabCache`
  lookup-table - `org.deeplearning4j.models.embeddings.WeightLookupTable`
  configuration - `org.deeplearning4j.models.embeddings.loader.VectorsConfiguration`"
  ([^CBOW this ^org.deeplearning4j.models.word2vec.wordstore.VocabCache vocab-cache ^org.deeplearning4j.models.embeddings.WeightLookupTable lookup-table ^org.deeplearning4j.models.embeddings.loader.VectorsConfiguration configuration]
    (-> this (.configure vocab-cache lookup-table configuration))))

(defn finish
  ""
  ([^CBOW this]
    (-> this (.finish))))

(defn get-code-name
  "returns: `java.lang.String`"
  (^java.lang.String [^CBOW this]
    (-> this (.getCodeName))))

(defn get-batch
  "returns: `java.util.List<org.nd4j.linalg.api.ops.aggregates.Aggregate>`"
  (^java.util.List [^CBOW this]
    (-> this (.getBatch))))

(defn iterate-sample
  "current-word - `T`
  window-words - `int[]`
  next-random - `java.util.concurrent.atomic.AtomicLong`
  alpha - `double`
  is-inference - `boolean`
  num-labels - `int`
  train-words - `boolean`
  inference-vector - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^CBOW this current-word window-words ^java.util.concurrent.atomic.AtomicLong next-random ^Double alpha ^Boolean is-inference ^Integer num-labels ^Boolean train-words ^org.nd4j.linalg.api.ndarray.INDArray inference-vector]
    (-> this (.iterateSample current-word window-words next-random alpha is-inference num-labels train-words inference-vector))))

(defn cbow
  "i - `int`
  sentence - `java.util.List`
  b - `int`
  next-random - `java.util.concurrent.atomic.AtomicLong`
  alpha - `double`
  current-window - `int`"
  ([^CBOW this ^Integer i ^java.util.List sentence ^Integer b ^java.util.concurrent.atomic.AtomicLong next-random ^Double alpha ^Integer current-window]
    (-> this (.cbow i sentence b next-random alpha current-window))))

(defn learn-sequence
  "Description copied from interface: ElementsLearningAlgorithm

  sequence - `org.deeplearning4j.models.sequencevectors.sequence.Sequence`
  next-random - `java.util.concurrent.atomic.AtomicLong`
  learning-rate - `double`

  returns: average score for this sequence - `double`"
  (^Double [^CBOW this ^org.deeplearning4j.models.sequencevectors.sequence.Sequence sequence ^java.util.concurrent.atomic.AtomicLong next-random ^Double learning-rate]
    (-> this (.learnSequence sequence next-random learning-rate))))

