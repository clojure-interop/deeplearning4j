(ns org.deeplearning4j.spark.text.functions.UpdateWordFreqAccumulatorFunction
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.text.functions UpdateWordFreqAccumulatorFunction]))

(defn ->update-word-freq-accumulator-function
  "Constructor.

  stop-words - `org.apache.spark.broadcast.Broadcast`
  word-freq-acc - `org.apache.spark.Accumulator`"
  (^UpdateWordFreqAccumulatorFunction [^org.apache.spark.broadcast.Broadcast stop-words ^org.apache.spark.Accumulator word-freq-acc]
    (new UpdateWordFreqAccumulatorFunction stop-words word-freq-acc)))

(defn call
  "lst-of-words - `java.util.List`

  returns: `org.nd4j.linalg.primitives.Pair<java.util.List<java.lang.String>,java.util.concurrent.atomic.AtomicLong>`

  throws: java.lang.Exception"
  (^org.nd4j.linalg.primitives.Pair [^UpdateWordFreqAccumulatorFunction this ^java.util.List lst-of-words]
    (-> this (.call lst-of-words))))

