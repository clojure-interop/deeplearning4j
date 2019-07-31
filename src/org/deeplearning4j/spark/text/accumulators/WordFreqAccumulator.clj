(ns org.deeplearning4j.spark.text.accumulators.WordFreqAccumulator
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.text.accumulators WordFreqAccumulator]))

(defn ->word-freq-accumulator
  "Constructor."
  (^WordFreqAccumulator []
    (new WordFreqAccumulator )))

(defn add-in-place
  "c-1 - `org.nd4j.linalg.primitives.Counter`
  c-2 - `org.nd4j.linalg.primitives.Counter`

  returns: `org.nd4j.linalg.primitives.Counter<java.lang.String>`"
  (^org.nd4j.linalg.primitives.Counter [^WordFreqAccumulator this ^org.nd4j.linalg.primitives.Counter c-1 ^org.nd4j.linalg.primitives.Counter c-2]
    (-> this (.addInPlace c-1 c-2))))

(defn zero
  "initial-counter - `org.nd4j.linalg.primitives.Counter`

  returns: `org.nd4j.linalg.primitives.Counter<java.lang.String>`"
  (^org.nd4j.linalg.primitives.Counter [^WordFreqAccumulator this ^org.nd4j.linalg.primitives.Counter initial-counter]
    (-> this (.zero initial-counter))))

(defn add-accumulator
  "c-1 - `org.nd4j.linalg.primitives.Counter`
  c-2 - `org.nd4j.linalg.primitives.Counter`

  returns: `org.nd4j.linalg.primitives.Counter<java.lang.String>`"
  (^org.nd4j.linalg.primitives.Counter [^WordFreqAccumulator this ^org.nd4j.linalg.primitives.Counter c-1 ^org.nd4j.linalg.primitives.Counter c-2]
    (-> this (.addAccumulator c-1 c-2))))

