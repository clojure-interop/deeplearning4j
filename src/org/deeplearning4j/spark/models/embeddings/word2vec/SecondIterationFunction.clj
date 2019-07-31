(ns org.deeplearning4j.spark.models.embeddings.word2vec.SecondIterationFunction
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.models.embeddings.word2vec SecondIterationFunction]))

(defn ->second-iteration-function
  "Constructor.

  word-2vec-var-map-broadcast - `org.apache.spark.broadcast.Broadcast`
  exp-table-broadcast - `org.apache.spark.broadcast.Broadcast`
  vocab-cache-broadcast - `org.apache.spark.broadcast.Broadcast`"
  (^SecondIterationFunction [^org.apache.spark.broadcast.Broadcast word-2vec-var-map-broadcast ^org.apache.spark.broadcast.Broadcast exp-table-broadcast ^org.apache.spark.broadcast.Broadcast vocab-cache-broadcast]
    (new SecondIterationFunction word-2vec-var-map-broadcast exp-table-broadcast vocab-cache-broadcast)))

