(ns org.deeplearning4j.models.sequencevectors.transformers.impl.SentenceTransformer
  "This simple class is responsible for conversion lines of text to Sequences of SequenceElements to fit them into SequenceVectors model"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.sequencevectors.transformers.impl SentenceTransformer]))

(defn transform-to-sequence
  "Description copied from interface: SequenceTransformer

  object - - Object to be transformed into Sequence - `java.lang.String`

  returns: `org.deeplearning4j.models.sequencevectors.sequence.Sequence<org.deeplearning4j.models.word2vec.VocabWord>`"
  (^org.deeplearning4j.models.sequencevectors.sequence.Sequence [^SentenceTransformer this ^java.lang.String object]
    (-> this (.transformToSequence object))))

(defn iterator
  "returns: `java.util.Iterator<org.deeplearning4j.models.sequencevectors.sequence.Sequence<org.deeplearning4j.models.word2vec.VocabWord>>`"
  (^java.util.Iterator [^SentenceTransformer this]
    (-> this (.iterator))))

(defn reset
  ""
  ([^SentenceTransformer this]
    (-> this (.reset))))

