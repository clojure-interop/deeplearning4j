(ns org.datavec.api.transform.condition.column.NaNColumnCondition
  "A column condition that simply checks whether a floating point value is NaN"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.condition.column NaNColumnCondition]))

(defn ->na-n-column-condition
  "Constructor.

  column-name - Name of the column to check the condition for - `java.lang.String`
  sequence-condition-mode - Sequence condition mode - `org.datavec.api.transform.condition.SequenceConditionMode`"
  (^NaNColumnCondition [^java.lang.String column-name ^org.datavec.api.transform.condition.SequenceConditionMode sequence-condition-mode]
    (new NaNColumnCondition column-name sequence-condition-mode))
  (^NaNColumnCondition [^java.lang.String column-name]
    (new NaNColumnCondition column-name)))

(defn column-condition
  "Description copied from interface: ColumnCondition

  writable - the element to test - `org.datavec.api.writable.Writable`

  returns: true if the condition is met
  false otherwise - `boolean`"
  (^Boolean [^NaNColumnCondition this ^org.datavec.api.writable.Writable writable]
    (-> this (.columnCondition writable))))

(defn condition
  "Description copied from interface: Condition

  input - the input to returnthe condition for - `java.lang.Object`

  returns: true if the condition is met
  false otherwise - `boolean`"
  (^Boolean [^NaNColumnCondition this ^java.lang.Object input]
    (-> this (.condition input))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^NaNColumnCondition this]
    (-> this (.toString))))

