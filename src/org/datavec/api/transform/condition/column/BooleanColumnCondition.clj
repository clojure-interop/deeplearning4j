(ns org.datavec.api.transform.condition.column.BooleanColumnCondition
  "Created by agibsonccc on 11/26/16."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.condition.column BooleanColumnCondition]))

(defn column-condition
  "Returns whether the given element
  meets the condition set by this operation

  writable - the element to test - `org.datavec.api.writable.Writable`

  returns: true if the condition is met
  false otherwise - `boolean`"
  (^Boolean [^BooleanColumnCondition this ^org.datavec.api.writable.Writable writable]
    (-> this (.columnCondition writable))))

(defn condition
  "Condition on arbitrary input

  input - the input to returnthe condition for - `java.lang.Object`

  returns: true if the condition is met
  false otherwise - `boolean`"
  (^Boolean [^BooleanColumnCondition this ^java.lang.Object input]
    (-> this (.condition input))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BooleanColumnCondition this]
    (-> this (.toString))))

