(ns org.deeplearning4j.spark.models.embeddings.glove.cooccurrences.CoOccurrenceCalculator
  "Calculate co occurrences based on tokens"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.models.embeddings.glove.cooccurrences CoOccurrenceCalculator]))

(defn ->co-occurrence-calculator
  "Constructor.

  symmetric - `boolean`
  vocab - `org.apache.spark.broadcast.Broadcast`
  window-size - `int`"
  (^CoOccurrenceCalculator [^Boolean symmetric ^org.apache.spark.broadcast.Broadcast vocab ^Integer window-size]
    (new CoOccurrenceCalculator symmetric vocab window-size)))

(defn call
  "pair - `org.nd4j.linalg.primitives.Pair`

  returns: `org.nd4j.linalg.primitives.CounterMap<java.lang.String,java.lang.String>`

  throws: java.lang.Exception"
  (^org.nd4j.linalg.primitives.CounterMap [^CoOccurrenceCalculator this ^org.nd4j.linalg.primitives.Pair pair]
    (-> this (.call pair))))

