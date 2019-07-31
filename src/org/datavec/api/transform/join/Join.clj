(ns org.datavec.api.transform.join.Join
  "Join class: used to specify a join (like an SQL join)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.join Join]))

(defn get-output-schema
  "returns: `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^Join this]
    (-> this (.getOutputSchema))))

(defn join-examples
  "Join the examples.
  Note: left or right examples may be null; if they are null, the appropriate NullWritables are inserted.

  left-example - `java.util.List`
  right-example - `java.util.List`

  returns: `java.util.List<org.datavec.api.writable.Writable>`"
  (^java.util.List [^Join this ^java.util.List left-example ^java.util.List right-example]
    (-> this (.joinExamples left-example right-example))))

