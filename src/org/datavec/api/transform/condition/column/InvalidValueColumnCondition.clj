(ns org.datavec.api.transform.condition.column.InvalidValueColumnCondition
  "A Condition that applies to a single column.
 Whenever the specified value is invalid according to the schema, the condition applies.

 For example, if a Writable contains String values in an Integer column (and these cannot be parsed to an integer), then
 the condition would return true, as these values are invalid according to the schema."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.condition.column InvalidValueColumnCondition]))

(defn ->invalid-value-column-condition
  "Constructor.

  column-name - `java.lang.String`"
  (^InvalidValueColumnCondition [^java.lang.String column-name]
    (new InvalidValueColumnCondition column-name)))

(defn column-condition
  "Description copied from interface: ColumnCondition

  writable - the element to test - `org.datavec.api.writable.Writable`

  returns: true if the condition is met
  false otherwise - `boolean`"
  (^Boolean [^InvalidValueColumnCondition this ^org.datavec.api.writable.Writable writable]
    (-> this (.columnCondition writable))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^InvalidValueColumnCondition this]
    (-> this (.toString))))

(defn condition
  "Condition on arbitrary input

  input - the input to returnthe condition for - `java.lang.Object`

  returns: true if the condition is met
  false otherwise - `boolean`"
  (^Boolean [^InvalidValueColumnCondition this ^java.lang.Object input]
    (-> this (.condition input))))

