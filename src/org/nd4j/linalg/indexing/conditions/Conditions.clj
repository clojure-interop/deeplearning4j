(ns org.nd4j.linalg.indexing.conditions.Conditions
  "Static class for conditions"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.indexing.conditions Conditions]))

(defn ->conditions
  "Constructor."
  (^Conditions []
    (new Conditions )))

(defn *abs-greater-than
  "value - `java.lang.Number`

  returns: `org.nd4j.linalg.indexing.conditions.Condition`"
  (^org.nd4j.linalg.indexing.conditions.Condition [^java.lang.Number value]
    (Conditions/absGreaterThan value)))

(defn *is-nan
  "returns: `org.nd4j.linalg.indexing.conditions.Condition`"
  (^org.nd4j.linalg.indexing.conditions.Condition []
    (Conditions/isNan )))

(defn *greater-than
  "value - `java.lang.Number`

  returns: `org.nd4j.linalg.indexing.conditions.Condition`"
  (^org.nd4j.linalg.indexing.conditions.Condition [^java.lang.Number value]
    (Conditions/greaterThan value)))

(defn *eps-equals
  "value - `java.lang.Number`
  epsilon - `java.lang.Number`

  returns: `org.nd4j.linalg.indexing.conditions.Condition`"
  (^org.nd4j.linalg.indexing.conditions.Condition [^java.lang.Number value ^java.lang.Number epsilon]
    (Conditions/epsEquals value epsilon))
  (^org.nd4j.linalg.indexing.conditions.Condition [^java.lang.Number value]
    (Conditions/epsEquals value)))

(defn *eps-not-equals
  "value - `java.lang.Number`

  returns: `org.nd4j.linalg.indexing.conditions.Condition`"
  (^org.nd4j.linalg.indexing.conditions.Condition [^java.lang.Number value]
    (Conditions/epsNotEquals value)))

(defn *is-infinite
  "returns: `org.nd4j.linalg.indexing.conditions.Condition`"
  (^org.nd4j.linalg.indexing.conditions.Condition []
    (Conditions/isInfinite )))

(defn *abs-less-than
  "value - `java.lang.Number`

  returns: `org.nd4j.linalg.indexing.conditions.Condition`"
  (^org.nd4j.linalg.indexing.conditions.Condition [^java.lang.Number value]
    (Conditions/absLessThan value)))

(defn *less-than
  "value - `java.lang.Number`

  returns: `org.nd4j.linalg.indexing.conditions.Condition`"
  (^org.nd4j.linalg.indexing.conditions.Condition [^java.lang.Number value]
    (Conditions/lessThan value)))

(defn *greater-than-or-equal
  "value - `java.lang.Number`

  returns: `org.nd4j.linalg.indexing.conditions.Condition`"
  (^org.nd4j.linalg.indexing.conditions.Condition [^java.lang.Number value]
    (Conditions/greaterThanOrEqual value)))

(defn *abs-greater-than-or-equal
  "value - `java.lang.Number`

  returns: `org.nd4j.linalg.indexing.conditions.Condition`"
  (^org.nd4j.linalg.indexing.conditions.Condition [^java.lang.Number value]
    (Conditions/absGreaterThanOrEqual value)))

(defn *not-equals
  "value - `java.lang.Number`

  returns: `org.nd4j.linalg.indexing.conditions.Condition`"
  (^org.nd4j.linalg.indexing.conditions.Condition [^java.lang.Number value]
    (Conditions/notEquals value)))

(defn *abs-less-than-or-equal
  "value - `java.lang.Number`

  returns: `org.nd4j.linalg.indexing.conditions.Condition`"
  (^org.nd4j.linalg.indexing.conditions.Condition [^java.lang.Number value]
    (Conditions/absLessThanOrEqual value)))

(defn *less-than-or-equal
  "value - `java.lang.Number`

  returns: `org.nd4j.linalg.indexing.conditions.Condition`"
  (^org.nd4j.linalg.indexing.conditions.Condition [^java.lang.Number value]
    (Conditions/lessThanOrEqual value)))

(defn *equals
  "value - `java.lang.Number`

  returns: `org.nd4j.linalg.indexing.conditions.Condition`"
  (^org.nd4j.linalg.indexing.conditions.Condition [^java.lang.Number value]
    (Conditions/equals value)))

