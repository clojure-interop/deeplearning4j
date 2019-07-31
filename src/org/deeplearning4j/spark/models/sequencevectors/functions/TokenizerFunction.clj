(ns org.deeplearning4j.spark.models.sequencevectors.functions.TokenizerFunction
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.models.sequencevectors.functions TokenizerFunction]))

(defn ->tokenizer-function
  "Constructor.

  configuration-broadcast - `org.apache.spark.broadcast.Broadcast`"
  (^TokenizerFunction [^org.apache.spark.broadcast.Broadcast configuration-broadcast]
    (new TokenizerFunction configuration-broadcast)))

(defn call
  "s - `java.lang.String`

  returns: `org.deeplearning4j.models.sequencevectors.sequence.Sequence<org.deeplearning4j.models.word2vec.VocabWord>`

  throws: java.lang.Exception"
  (^org.deeplearning4j.models.sequencevectors.sequence.Sequence [^TokenizerFunction this ^java.lang.String s]
    (-> this (.call s))))

