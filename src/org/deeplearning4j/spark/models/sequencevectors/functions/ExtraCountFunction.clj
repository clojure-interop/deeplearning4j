(ns org.deeplearning4j.spark.models.sequencevectors.functions.ExtraCountFunction
  "This accumulator function does count individual elements, using provided Accumulator"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.models.sequencevectors.functions ExtraCountFunction]))

(defn ->extra-count-function
  "Constructor.

  accumulator - `org.apache.spark.Accumulator`
  fetch-labels - `boolean`"
  (^ExtraCountFunction [^org.apache.spark.Accumulator accumulator ^Boolean fetch-labels]
    (new ExtraCountFunction accumulator fetch-labels)))

(defn call
  "sequence - `org.deeplearning4j.models.sequencevectors.sequence.Sequence`

  returns: `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.models.sequencevectors.sequence.Sequence<T>,java.lang.Long>`

  throws: java.lang.Exception"
  (^org.nd4j.linalg.primitives.Pair [^ExtraCountFunction this ^org.deeplearning4j.models.sequencevectors.sequence.Sequence sequence]
    (-> this (.call sequence))))

