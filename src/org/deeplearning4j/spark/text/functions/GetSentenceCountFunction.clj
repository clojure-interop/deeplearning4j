(ns org.deeplearning4j.spark.text.functions.GetSentenceCountFunction
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.text.functions GetSentenceCountFunction]))

(defn ->get-sentence-count-function
  "Constructor."
  (^GetSentenceCountFunction []
    (new GetSentenceCountFunction )))

(defn call
  "pair - `org.nd4j.linalg.primitives.Pair`

  returns: `java.util.concurrent.atomic.AtomicLong`

  throws: java.lang.Exception"
  (^java.util.concurrent.atomic.AtomicLong [^GetSentenceCountFunction this ^org.nd4j.linalg.primitives.Pair pair]
    (-> this (.call pair))))

