(ns org.deeplearning4j.spark.models.embeddings.word2vec.Word2VecSetup
  "Deprecated."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.models.embeddings.word2vec Word2VecSetup]))

(defn ->word-2-vec-setup
  "Constructor.

  Deprecated.

  param - `org.apache.spark.broadcast.Broadcast`"
  (^Word2VecSetup [^org.apache.spark.broadcast.Broadcast param]
    (new Word2VecSetup param)))

(defn call
  "Deprecated.

  list-long-tuple-2 - `scala.Tuple2`

  returns: `org.deeplearning4j.spark.models.embeddings.word2vec.Word2VecFuncCall`

  throws: java.lang.Exception"
  (^org.deeplearning4j.spark.models.embeddings.word2vec.Word2VecFuncCall [^Word2VecSetup this ^scala.Tuple2 list-long-tuple-2]
    (-> this (.call list-long-tuple-2))))

