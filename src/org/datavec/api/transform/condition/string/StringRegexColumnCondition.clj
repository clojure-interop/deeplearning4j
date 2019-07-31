(ns org.datavec.api.transform.condition.string.StringRegexColumnCondition
  "Condition that applies to the values in a String column, using a provided regex.
 Condition return true if the String matches the regex, or false otherwise

 Note: Uses Writable.toString(), hence can potentially be applied to non-String columns"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.condition.string StringRegexColumnCondition]))

(defn ->string-regex-column-condition
  "Constructor.

  column-name - `java.lang.String`
  regex - `java.lang.String`
  sequence-condition-mode - `org.datavec.api.transform.condition.SequenceConditionMode`"
  (^StringRegexColumnCondition [^java.lang.String column-name ^java.lang.String regex ^org.datavec.api.transform.condition.SequenceConditionMode sequence-condition-mode]
    (new StringRegexColumnCondition column-name regex sequence-condition-mode))
  (^StringRegexColumnCondition [^java.lang.String column-name ^java.lang.String regex]
    (new StringRegexColumnCondition column-name regex)))

(defn column-condition
  "Description copied from interface: ColumnCondition

  writable - the element to test - `org.datavec.api.writable.Writable`

  returns: true if the condition is met
  false otherwise - `boolean`"
  (^Boolean [^StringRegexColumnCondition this ^org.datavec.api.writable.Writable writable]
    (-> this (.columnCondition writable))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^StringRegexColumnCondition this]
    (-> this (.toString))))

(defn condition
  "Condition on arbitrary input

  input - the input to returnthe condition for - `java.lang.Object`

  returns: true if the condition is met
  false otherwise - `boolean`"
  (^Boolean [^StringRegexColumnCondition this ^java.lang.Object input]
    (-> this (.condition input))))

