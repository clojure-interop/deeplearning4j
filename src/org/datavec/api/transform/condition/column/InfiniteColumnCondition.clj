(ns org.datavec.api.transform.condition.column.InfiniteColumnCondition
  "A column condition that simply checks whether a floating point value is infinite"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.condition.column InfiniteColumnCondition]))

(defn ->infinite-column-condition
  "Constructor.

  column-name - Column to check for the condition - `java.lang.String`
  sequence-condition-mode - Sequence condition mode - `org.datavec.api.transform.condition.SequenceConditionMode`"
  (^InfiniteColumnCondition [^java.lang.String column-name ^org.datavec.api.transform.condition.SequenceConditionMode sequence-condition-mode]
    (new InfiniteColumnCondition column-name sequence-condition-mode))
  (^InfiniteColumnCondition [^java.lang.String column-name]
    (new InfiniteColumnCondition column-name)))

(defn column-condition
  "Description copied from interface: ColumnCondition

  writable - the element to test - `org.datavec.api.writable.Writable`

  returns: true if the condition is met
  false otherwise - `boolean`"
  (^Boolean [^InfiniteColumnCondition this ^org.datavec.api.writable.Writable writable]
    (-> this (.columnCondition writable))))

(defn condition
  "Description copied from interface: Condition

  input - the input to returnthe condition for - `java.lang.Object`

  returns: true if the condition is met
  false otherwise - `boolean`"
  (^Boolean [^InfiniteColumnCondition this ^java.lang.Object input]
    (-> this (.condition input))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^InfiniteColumnCondition this]
    (-> this (.toString))))

