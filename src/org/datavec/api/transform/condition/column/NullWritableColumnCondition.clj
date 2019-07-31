(ns org.datavec.api.transform.condition.column.NullWritableColumnCondition
  "Condition that applies to the values in any column. Specifically, condition is true
 if the Writable value is a NullWritable, and false for any other value"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.condition.column NullWritableColumnCondition]))

(defn ->null-writable-column-condition
  "Constructor.

  column-name - `java.lang.String`"
  (^NullWritableColumnCondition [^java.lang.String column-name]
    (new NullWritableColumnCondition column-name)))

(defn column-condition
  "Description copied from interface: ColumnCondition

  writable - the element to test - `org.datavec.api.writable.Writable`

  returns: true if the condition is met
  false otherwise - `boolean`"
  (^Boolean [^NullWritableColumnCondition this ^org.datavec.api.writable.Writable writable]
    (-> this (.columnCondition writable))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^NullWritableColumnCondition this]
    (-> this (.toString))))

(defn condition
  "Condition on arbitrary input

  input - the input to returnthe condition for - `java.lang.Object`

  returns: true if the condition is met
  false otherwise - `boolean`"
  (^Boolean [^NullWritableColumnCondition this ^java.lang.Object input]
    (-> this (.condition input))))

