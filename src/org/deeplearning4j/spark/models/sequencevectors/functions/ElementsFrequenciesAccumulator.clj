(ns org.deeplearning4j.spark.models.sequencevectors.functions.ElementsFrequenciesAccumulator
  "Accumulator for elements count"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.models.sequencevectors.functions ElementsFrequenciesAccumulator]))

(defn ->elements-frequencies-accumulator
  "Constructor."
  (^ElementsFrequenciesAccumulator []
    (new ElementsFrequenciesAccumulator )))

(defn add-accumulator
  "c-1 - `org.nd4j.linalg.primitives.Counter`
  c-2 - `org.nd4j.linalg.primitives.Counter`

  returns: `org.nd4j.linalg.primitives.Counter<java.lang.Long>`"
  (^org.nd4j.linalg.primitives.Counter [^ElementsFrequenciesAccumulator this ^org.nd4j.linalg.primitives.Counter c-1 ^org.nd4j.linalg.primitives.Counter c-2]
    (-> this (.addAccumulator c-1 c-2))))

(defn add-in-place
  "r-1 - `org.nd4j.linalg.primitives.Counter`
  r-2 - `org.nd4j.linalg.primitives.Counter`

  returns: `org.nd4j.linalg.primitives.Counter<java.lang.Long>`"
  (^org.nd4j.linalg.primitives.Counter [^ElementsFrequenciesAccumulator this ^org.nd4j.linalg.primitives.Counter r-1 ^org.nd4j.linalg.primitives.Counter r-2]
    (-> this (.addInPlace r-1 r-2))))

(defn zero
  "initial-value - `org.nd4j.linalg.primitives.Counter`

  returns: `org.nd4j.linalg.primitives.Counter<java.lang.Long>`"
  (^org.nd4j.linalg.primitives.Counter [^ElementsFrequenciesAccumulator this ^org.nd4j.linalg.primitives.Counter initial-value]
    (-> this (.zero initial-value))))

