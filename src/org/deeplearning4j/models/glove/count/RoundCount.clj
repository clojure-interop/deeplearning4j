(ns org.deeplearning4j.models.glove.count.RoundCount
  "Simple circular counter, that circulates within 0...Limit, both inclusive"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.glove.count RoundCount]))

(defn ->round-count
  "Constructor.

  Creates new RoundCount instance.

  lower - - Minimum value for this counter. Inclusive - `int`
  top - - Maximum value for this counter. Inclusive. - `int`"
  (^RoundCount [^Integer lower ^Integer top]
    (new RoundCount lower top))
  (^RoundCount [^Integer limit]
    (new RoundCount limit)))

(defn previous
  "returns: `int`"
  (^Integer [^RoundCount this]
    (-> this (.previous))))

(defn get
  "returns: `int`"
  (^Integer [^RoundCount this]
    (-> this (.get))))

(defn tick
  ""
  ([^RoundCount this]
    (-> this (.tick))))

