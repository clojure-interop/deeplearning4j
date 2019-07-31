(ns org.deeplearning4j.models.sequencevectors.SequenceVectors
  "SequenceVectors implements abstract features extraction for Sequences and SequenceElements, using SkipGram, CBOW or DBOW (for Sequence features extraction)."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.sequencevectors SequenceVectors]))

(defn ->sequence-vectors
  "Constructor."
  (^SequenceVectors []
    (new SequenceVectors )))

(defn get-unk
  "returns: `java.lang.String`"
  (^java.lang.String [^SequenceVectors this]
    (-> this (.getUNK))))

(defn set-unk
  "unk - `java.lang.String`"
  ([^SequenceVectors this ^java.lang.String unk]
    (-> this (.setUNK unk))))

(defn get-elements-score
  "returns: `double`"
  (^Double [^SequenceVectors this]
    (-> this (.getElementsScore))))

(defn get-sequences-score
  "returns: `double`"
  (^Double [^SequenceVectors this]
    (-> this (.getSequencesScore))))

(defn get-word-vector-matrix
  "Description copied from interface: WordVectors

  word - the word to get the matrix for - `java.lang.String`

  returns: the ndarray for this word - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^SequenceVectors this ^java.lang.String word]
    (-> this (.getWordVectorMatrix word))))

(defn build-vocab
  "Builds vocabulary from provided SequenceIterator instance"
  ([^SequenceVectors this]
    (-> this (.buildVocab))))

(defn fit
  "Starts training over"
  ([^SequenceVectors this]
    (-> this (.fit))))

