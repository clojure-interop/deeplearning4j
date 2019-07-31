(ns org.deeplearning4j.models.sequencevectors.transformers.SequenceTransformer
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.sequencevectors.transformers SequenceTransformer]))

(defn transform-to-sequence
  "This is generic method for transformation data from any format to Sequence of SequenceElement.
  It will be used both in Vocab building, and in training process

  object - - Object to be transformed into Sequence - `V`

  returns: `org.deeplearning4j.models.sequencevectors.sequence.Sequence<T>`"
  (^org.deeplearning4j.models.sequencevectors.sequence.Sequence [^SequenceTransformer this object]
    (-> this (.transformToSequence object))))

(defn reset
  ""
  ([^SequenceTransformer this]
    (-> this (.reset))))

