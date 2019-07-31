(ns org.datavec.api.transform.condition.column.TrivialColumnCondition
  "Created by huitseeker on 5/17/17."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.condition.column TrivialColumnCondition]))

(defn ->trivial-column-condition
  "Constructor.

  name - `java.lang.String`"
  (^TrivialColumnCondition [^java.lang.String name]
    (new TrivialColumnCondition name)))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^TrivialColumnCondition this]
    (-> this (.toString))))

(defn column-condition
  "Description copied from interface: ColumnCondition

  writable - the element to test - `org.datavec.api.writable.Writable`

  returns: true if the condition is met
  false otherwise - `boolean`"
  (^Boolean [^TrivialColumnCondition this ^org.datavec.api.writable.Writable writable]
    (-> this (.columnCondition writable))))

(defn condition
  "Description copied from interface: Condition

  writables - Current example - `java.util.List`

  returns: true if condition satisfied, false otherwise - `boolean`"
  (^Boolean [^TrivialColumnCondition this ^java.util.List writables]
    (-> this (.condition writables))))

