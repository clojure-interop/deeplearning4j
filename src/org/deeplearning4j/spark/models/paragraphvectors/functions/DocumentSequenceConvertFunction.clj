(ns org.deeplearning4j.spark.models.paragraphvectors.functions.DocumentSequenceConvertFunction
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.models.paragraphvectors.functions DocumentSequenceConvertFunction]))

(defn ->document-sequence-convert-function
  "Constructor.

  configuration-broadcast - `org.apache.spark.broadcast.Broadcast`"
  (^DocumentSequenceConvertFunction [^org.apache.spark.broadcast.Broadcast configuration-broadcast]
    (new DocumentSequenceConvertFunction configuration-broadcast)))

(defn call
  "document - `org.deeplearning4j.text.documentiterator.LabelledDocument`

  returns: `org.deeplearning4j.models.sequencevectors.sequence.Sequence<org.deeplearning4j.models.word2vec.VocabWord>`

  throws: java.lang.Exception"
  (^org.deeplearning4j.models.sequencevectors.sequence.Sequence [^DocumentSequenceConvertFunction this ^org.deeplearning4j.text.documentiterator.LabelledDocument document]
    (-> this (.call document))))

