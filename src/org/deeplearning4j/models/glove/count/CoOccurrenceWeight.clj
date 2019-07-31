(ns org.deeplearning4j.models.glove.count.CoOccurrenceWeight
  "Simple POJO holding pairs of elements and their respective weights, used in GloVe -> CoOccurrence"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.glove.count CoOccurrenceWeight]))

(defn ->co-occurrence-weight
  "Constructor."
  (^CoOccurrenceWeight []
    (new CoOccurrenceWeight )))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^CoOccurrenceWeight this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^CoOccurrenceWeight this]
    (-> this (.hashCode))))

