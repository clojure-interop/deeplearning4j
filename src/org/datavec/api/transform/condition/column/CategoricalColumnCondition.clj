(ns org.datavec.api.transform.condition.column.CategoricalColumnCondition
  "Condition that applies to the values in a Categorical column, using a ConditionOp"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.condition.column CategoricalColumnCondition]))

(defn ->categorical-column-condition
  "Constructor.

  Constructor for conditions equal or not equal

  column-name - Column to check for the condition - `java.lang.String`
  sequence-condition-mode - Mode for handling sequence data - `org.datavec.api.transform.condition.SequenceConditionMode`
  op - Operation (== or != only) - `org.datavec.api.transform.condition.ConditionOp`
  value - Value to use in the condition - `java.lang.String`"
  (^CategoricalColumnCondition [^java.lang.String column-name ^org.datavec.api.transform.condition.SequenceConditionMode sequence-condition-mode ^org.datavec.api.transform.condition.ConditionOp op ^java.lang.String value]
    (new CategoricalColumnCondition column-name sequence-condition-mode op value))
  (^CategoricalColumnCondition [^java.lang.String column-name ^org.datavec.api.transform.condition.ConditionOp op ^java.lang.String value]
    (new CategoricalColumnCondition column-name op value)))

(defn column-condition
  "Description copied from interface: ColumnCondition

  writable - the element to test - `org.datavec.api.writable.Writable`

  returns: true if the condition is met
  false otherwise - `boolean`"
  (^Boolean [^CategoricalColumnCondition this ^org.datavec.api.writable.Writable writable]
    (-> this (.columnCondition writable))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^CategoricalColumnCondition this]
    (-> this (.toString))))

(defn condition
  "Condition on arbitrary input

  input - the input to returnthe condition for - `java.lang.Object`

  returns: true if the condition is met
  false otherwise - `boolean`"
  (^Boolean [^CategoricalColumnCondition this ^java.lang.Object input]
    (-> this (.condition input))))

