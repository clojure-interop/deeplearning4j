(ns org.deeplearning4j.spark.models.sequencevectors.functions.TrainingFunction
  "This is wrapper for SequenceVectors training over given Sequence"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.models.sequencevectors.functions TrainingFunction]))

(defn ->training-function
  "Constructor.

  vocab-cache-broadcast - `org.apache.spark.broadcast.Broadcast`
  vectors-configuration-broadcast - `org.apache.spark.broadcast.Broadcast`
  param-server-configuration-broadcast - `org.apache.spark.broadcast.Broadcast`"
  (^TrainingFunction [^org.apache.spark.broadcast.Broadcast vocab-cache-broadcast ^org.apache.spark.broadcast.Broadcast vectors-configuration-broadcast ^org.apache.spark.broadcast.Broadcast param-server-configuration-broadcast]
    (new TrainingFunction vocab-cache-broadcast vectors-configuration-broadcast param-server-configuration-broadcast)))

(defn call
  "sequence - `org.deeplearning4j.models.sequencevectors.sequence.Sequence`

  throws: java.lang.Exception"
  ([^TrainingFunction this ^org.deeplearning4j.models.sequencevectors.sequence.Sequence sequence]
    (-> this (.call sequence))))

