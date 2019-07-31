(ns org.deeplearning4j.models.embeddings.learning.impl.sequence.DM
  "DM implementation for DeepLearning4j"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.embeddings.learning.impl.sequence DM]))

(defn ->dm
  "Constructor."
  (^DM []
    (new DM )))

(defn early-termination-hit?
  "returns: `boolean`"
  (^Boolean [^DM this]
    (-> this (.isEarlyTerminationHit))))

(defn dm
  "i - `int`
  sequence - `org.deeplearning4j.models.sequencevectors.sequence.Sequence`
  b - `int`
  next-random - `java.util.concurrent.atomic.AtomicLong`
  alpha - `double`
  labels - `java.util.List`
  is-inference - `boolean`
  inference-vector - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^DM this ^Integer i ^org.deeplearning4j.models.sequencevectors.sequence.Sequence sequence ^Integer b ^java.util.concurrent.atomic.AtomicLong next-random ^Double alpha ^java.util.List labels ^Boolean is-inference ^org.nd4j.linalg.api.ndarray.INDArray inference-vector]
    (-> this (.dm i sequence b next-random alpha labels is-inference inference-vector))))

(defn pretrain
  "iterator - `org.deeplearning4j.models.sequencevectors.interfaces.SequenceIterator`"
  ([^DM this ^org.deeplearning4j.models.sequencevectors.interfaces.SequenceIterator iterator]
    (-> this (.pretrain iterator))))

(defn configure
  "vocab-cache - `org.deeplearning4j.models.word2vec.wordstore.VocabCache`
  lookup-table - `org.deeplearning4j.models.embeddings.WeightLookupTable`
  configuration - `org.deeplearning4j.models.embeddings.loader.VectorsConfiguration`"
  ([^DM this ^org.deeplearning4j.models.word2vec.wordstore.VocabCache vocab-cache ^org.deeplearning4j.models.embeddings.WeightLookupTable lookup-table ^org.deeplearning4j.models.embeddings.loader.VectorsConfiguration configuration]
    (-> this (.configure vocab-cache lookup-table configuration))))

(defn get-elements-learning-algorithm
  "returns: `org.deeplearning4j.models.embeddings.learning.ElementsLearningAlgorithm<T>`"
  (^org.deeplearning4j.models.embeddings.learning.ElementsLearningAlgorithm [^DM this]
    (-> this (.getElementsLearningAlgorithm))))

(defn finish
  ""
  ([^DM this]
    (-> this (.finish))))

(defn infer-sequence
  "This method does training on previously unseen paragraph, and returns inferred vector

  sequence - `org.deeplearning4j.models.sequencevectors.sequence.Sequence`
  nr - `long`
  learning-rate - `double`
  min-learning-rate - `double`
  iterations - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^DM this ^org.deeplearning4j.models.sequencevectors.sequence.Sequence sequence ^Long nr ^Double learning-rate ^Double min-learning-rate ^Integer iterations]
    (-> this (.inferSequence sequence nr learning-rate min-learning-rate iterations))))

(defn get-code-name
  "returns: `java.lang.String`"
  (^java.lang.String [^DM this]
    (-> this (.getCodeName))))

(defn learn-sequence
  "Description copied from interface: SequenceLearningAlgorithm

  sequence - `org.deeplearning4j.models.sequencevectors.sequence.Sequence`
  next-random - `java.util.concurrent.atomic.AtomicLong`
  learning-rate - `double`

  returns: average score for this sequence - `double`"
  (^Double [^DM this ^org.deeplearning4j.models.sequencevectors.sequence.Sequence sequence ^java.util.concurrent.atomic.AtomicLong next-random ^Double learning-rate]
    (-> this (.learnSequence sequence next-random learning-rate))))

