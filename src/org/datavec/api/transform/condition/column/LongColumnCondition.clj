(ns org.datavec.api.transform.condition.column.LongColumnCondition
  "Condition that applies to the values in a Long column, using a ConditionOp"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.condition.column LongColumnCondition]))

(defn ->long-column-condition
  "Constructor.

  Constructor for operations such as less than, equal to, greater than, etc.

  column - Column to check for the condition - `java.lang.String`
  sequence-condition-mode - Mode for handling sequence data - `org.datavec.api.transform.condition.SequenceConditionMode`
  op - Operation (<, >=, !=, etc) - `org.datavec.api.transform.condition.ConditionOp`
  value - Value to use in the condition - `long`"
  (^LongColumnCondition [^java.lang.String column ^org.datavec.api.transform.condition.SequenceConditionMode sequence-condition-mode ^org.datavec.api.transform.condition.ConditionOp op ^Long value]
    (new LongColumnCondition column sequence-condition-mode op value))
  (^LongColumnCondition [^java.lang.String column-name ^org.datavec.api.transform.condition.ConditionOp op ^Long value]
    (new LongColumnCondition column-name op value)))

(defn column-condition
  "Description copied from interface: ColumnCondition

  writable - the element to test - `org.datavec.api.writable.Writable`

  returns: true if the condition is met
  false otherwise - `boolean`"
  (^Boolean [^LongColumnCondition this ^org.datavec.api.writable.Writable writable]
    (-> this (.columnCondition writable))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^LongColumnCondition this]
    (-> this (.toString))))

(defn condition
  "Condition on arbitrary input

  input - the input to returnthe condition for - `java.lang.Object`

  returns: true if the condition is met
  false otherwise - `boolean`"
  (^Boolean [^LongColumnCondition this ^java.lang.Object input]
    (-> this (.condition input))))

