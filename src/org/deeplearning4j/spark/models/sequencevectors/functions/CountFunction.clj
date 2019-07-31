(ns org.deeplearning4j.spark.models.sequencevectors.functions.CountFunction
  "This accumulator function does count individual elements, using provided Accumulator"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.models.sequencevectors.functions CountFunction]))

(defn ->count-function
  "Constructor.

  vectors-configuration-broadcast - `org.apache.spark.broadcast.Broadcast`
  void-configuration-broadcast - `org.apache.spark.broadcast.Broadcast`
  accumulator - `org.apache.spark.Accumulator`
  fetch-labels - `boolean`"
  (^CountFunction [^org.apache.spark.broadcast.Broadcast vectors-configuration-broadcast ^org.apache.spark.broadcast.Broadcast void-configuration-broadcast ^org.apache.spark.Accumulator accumulator ^Boolean fetch-labels]
    (new CountFunction vectors-configuration-broadcast void-configuration-broadcast accumulator fetch-labels)))

(defn call
  "sequence - `org.deeplearning4j.models.sequencevectors.sequence.Sequence`

  returns: `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.models.sequencevectors.sequence.Sequence<T>,java.lang.Long>`

  throws: java.lang.Exception"
  (^org.nd4j.linalg.primitives.Pair [^CountFunction this ^org.deeplearning4j.models.sequencevectors.sequence.Sequence sequence]
    (-> this (.call sequence))))

