(ns org.datavec.api.transform.condition.Condition
  "The Condition interface defines a binary state that either holds/is satisfied for an example/sequence,
 or does not hold.
 Example: number greater than x, String is one of {X,Y,Z}, etc.
 Typical uses for conditions: filtering, conditional replacement, conditional reduction, etc"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.condition Condition]))

(defn condition
  "Is the condition satisfied for the current input/example?
  Returns true if condition is satisfied, or false otherwise.

  list - Current example - `java.util.List`

  returns: true if condition satisfied, false otherwise - `boolean`"
  (^Boolean [^Condition this ^java.util.List list]
    (-> this (.condition list))))

(defn condition-sequence
  "Is the condition satisfied for the current input/sequence?
  Returns true if condition is satisfied, or false otherwise.

  sequence - Current sequence - `java.util.List`

  returns: true if condition satisfied, false otherwise - `boolean`"
  (^Boolean [^Condition this ^java.util.List sequence]
    (-> this (.conditionSequence sequence))))

(defn set-input-schema
  "Setter for the input schema

  schema - `org.datavec.api.transform.schema.Schema`"
  ([^Condition this ^org.datavec.api.transform.schema.Schema schema]
    (-> this (.setInputSchema schema))))

(defn get-input-schema
  "Getter for the input schema

  returns: `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^Condition this]
    (-> this (.getInputSchema))))

