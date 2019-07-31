(ns org.deeplearning4j.spark.models.sequencevectors.functions.VocabRddFunctionFlat
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.models.sequencevectors.functions VocabRddFunctionFlat]))

(defn ->vocab-rdd-function-flat
  "Constructor.

  vectors-configuration-broadcast - `org.apache.spark.broadcast.Broadcast`
  param-server-configuration-broadcast - `org.apache.spark.broadcast.Broadcast`"
  (^VocabRddFunctionFlat [^org.apache.spark.broadcast.Broadcast vectors-configuration-broadcast ^org.apache.spark.broadcast.Broadcast param-server-configuration-broadcast]
    (new VocabRddFunctionFlat vectors-configuration-broadcast param-server-configuration-broadcast)))

