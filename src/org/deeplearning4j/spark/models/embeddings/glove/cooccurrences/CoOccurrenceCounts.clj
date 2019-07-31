(ns org.deeplearning4j.spark.models.embeddings.glove.cooccurrences.CoOccurrenceCounts
  "Co occurrence count reduction"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.models.embeddings.glove.cooccurrences CoOccurrenceCounts]))

(defn ->co-occurrence-counts
  "Constructor."
  (^CoOccurrenceCounts []
    (new CoOccurrenceCounts )))

(defn call
  "v-1 - `org.nd4j.linalg.primitives.CounterMap`
  v-2 - `org.nd4j.linalg.primitives.CounterMap`

  returns: `org.nd4j.linalg.primitives.CounterMap<java.lang.String,java.lang.String>`

  throws: java.lang.Exception"
  (^org.nd4j.linalg.primitives.CounterMap [^CoOccurrenceCounts this ^org.nd4j.linalg.primitives.CounterMap v-1 ^org.nd4j.linalg.primitives.CounterMap v-2]
    (-> this (.call v-1 v-2))))

