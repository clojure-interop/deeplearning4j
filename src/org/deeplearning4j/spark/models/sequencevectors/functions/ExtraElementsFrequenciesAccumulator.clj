(ns org.deeplearning4j.spark.models.sequencevectors.functions.ExtraElementsFrequenciesAccumulator
  "Accumulator for elements count"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.models.sequencevectors.functions ExtraElementsFrequenciesAccumulator]))

(defn ->extra-elements-frequencies-accumulator
  "Constructor."
  (^ExtraElementsFrequenciesAccumulator []
    (new ExtraElementsFrequenciesAccumulator )))

(defn add-accumulator
  "c-1 - `org.deeplearning4j.spark.models.sequencevectors.primitives.ExtraCounter`
  c-2 - `org.deeplearning4j.spark.models.sequencevectors.primitives.ExtraCounter`

  returns: `org.deeplearning4j.spark.models.sequencevectors.primitives.ExtraCounter<java.lang.Long>`"
  (^org.deeplearning4j.spark.models.sequencevectors.primitives.ExtraCounter [^ExtraElementsFrequenciesAccumulator this ^org.deeplearning4j.spark.models.sequencevectors.primitives.ExtraCounter c-1 ^org.deeplearning4j.spark.models.sequencevectors.primitives.ExtraCounter c-2]
    (-> this (.addAccumulator c-1 c-2))))

(defn add-in-place
  "r-1 - `org.deeplearning4j.spark.models.sequencevectors.primitives.ExtraCounter`
  r-2 - `org.deeplearning4j.spark.models.sequencevectors.primitives.ExtraCounter`

  returns: `org.deeplearning4j.spark.models.sequencevectors.primitives.ExtraCounter<java.lang.Long>`"
  (^org.deeplearning4j.spark.models.sequencevectors.primitives.ExtraCounter [^ExtraElementsFrequenciesAccumulator this ^org.deeplearning4j.spark.models.sequencevectors.primitives.ExtraCounter r-1 ^org.deeplearning4j.spark.models.sequencevectors.primitives.ExtraCounter r-2]
    (-> this (.addInPlace r-1 r-2))))

(defn zero
  "initial-value - `org.deeplearning4j.spark.models.sequencevectors.primitives.ExtraCounter`

  returns: `org.deeplearning4j.spark.models.sequencevectors.primitives.ExtraCounter<java.lang.Long>`"
  (^org.deeplearning4j.spark.models.sequencevectors.primitives.ExtraCounter [^ExtraElementsFrequenciesAccumulator this ^org.deeplearning4j.spark.models.sequencevectors.primitives.ExtraCounter initial-value]
    (-> this (.zero initial-value))))

