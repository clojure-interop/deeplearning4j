(ns org.datavec.api.transform.condition.column.StringColumnCondition
  "Condition that applies to the values in a String column, using a ConditionOp"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.condition.column StringColumnCondition]))

(defn ->string-column-condition
  "Constructor.

  Constructor for conditions equal or not equal

  column - Column to check for the condition - `java.lang.String`
  sequence-condition-mode - Mode for handling sequence data - `org.datavec.api.transform.condition.SequenceConditionMode`
  op - Operation (== or != only) - `org.datavec.api.transform.condition.ConditionOp`
  value - Value to use in the condition - `java.lang.String`"
  (^StringColumnCondition [^java.lang.String column ^org.datavec.api.transform.condition.SequenceConditionMode sequence-condition-mode ^org.datavec.api.transform.condition.ConditionOp op ^java.lang.String value]
    (new StringColumnCondition column sequence-condition-mode op value))
  (^StringColumnCondition [^java.lang.String column-name ^org.datavec.api.transform.condition.ConditionOp op ^java.lang.String value]
    (new StringColumnCondition column-name op value)))

(defn column-condition
  "Description copied from interface: ColumnCondition

  writable - the element to test - `org.datavec.api.writable.Writable`

  returns: true if the condition is met
  false otherwise - `boolean`"
  (^Boolean [^StringColumnCondition this ^org.datavec.api.writable.Writable writable]
    (-> this (.columnCondition writable))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^StringColumnCondition this]
    (-> this (.toString))))

(defn condition
  "Condition on arbitrary input

  input - the input to returnthe condition for - `java.lang.Object`

  returns: true if the condition is met
  false otherwise - `boolean`"
  (^Boolean [^StringColumnCondition this ^java.lang.Object input]
    (-> this (.condition input))))

