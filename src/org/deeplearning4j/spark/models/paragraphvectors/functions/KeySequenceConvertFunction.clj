(ns org.deeplearning4j.spark.models.paragraphvectors.functions.KeySequenceConvertFunction
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.models.paragraphvectors.functions KeySequenceConvertFunction]))

(defn ->key-sequence-convert-function
  "Constructor.

  configuration-broadcast - `org.apache.spark.broadcast.Broadcast`"
  (^KeySequenceConvertFunction [^org.apache.spark.broadcast.Broadcast configuration-broadcast]
    (new KeySequenceConvertFunction configuration-broadcast)))

(defn call
  "pair - `scala.Tuple2`

  returns: `org.deeplearning4j.models.sequencevectors.sequence.Sequence<org.deeplearning4j.models.word2vec.VocabWord>`

  throws: java.lang.Exception"
  (^org.deeplearning4j.models.sequencevectors.sequence.Sequence [^KeySequenceConvertFunction this ^scala.Tuple2 pair]
    (-> this (.call pair))))

