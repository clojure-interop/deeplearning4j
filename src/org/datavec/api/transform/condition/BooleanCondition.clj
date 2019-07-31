(ns org.datavec.api.transform.condition.BooleanCondition
  "BooleanCondition: used for creating compound conditions,
 such as AND(ConditionA, ConditionB, ...)
 As a BooleanCondition is a condition,
 these can be chained together,
 like NOT(OR(AND(...),AND(...)))"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.condition BooleanCondition]))

(defn ->boolean-condition
  "Constructor.

  type - `org.datavec.api.transform.condition.BooleanCondition$Type`
  conditions - `org.datavec.api.transform.condition.Condition`"
  (^BooleanCondition [^org.datavec.api.transform.condition.BooleanCondition$Type type ^org.datavec.api.transform.condition.Condition conditions]
    (new BooleanCondition type conditions)))

(defn *and
  "And of all the given conditions

  conditions - the conditions to and - `org.datavec.api.transform.condition.Condition`

  returns: a joint and of all these conditions - `org.datavec.api.transform.condition.Condition`"
  (^org.datavec.api.transform.condition.Condition [^org.datavec.api.transform.condition.Condition conditions]
    (BooleanCondition/AND conditions)))

(defn *or
  "Or of all the given conditions

  conditions - the conditions to or - `org.datavec.api.transform.condition.Condition`

  returns: a joint and of all these conditions - `org.datavec.api.transform.condition.Condition`"
  (^org.datavec.api.transform.condition.Condition [^org.datavec.api.transform.condition.Condition conditions]
    (BooleanCondition/OR conditions)))

(defn *not
  "Not of the given condition

  condition - the conditions to and - `org.datavec.api.transform.condition.Condition`

  returns: a joint and of all these condition - `org.datavec.api.transform.condition.Condition`"
  (^org.datavec.api.transform.condition.Condition [^org.datavec.api.transform.condition.Condition condition]
    (BooleanCondition/NOT condition)))

(defn *xor
  "And of all the given conditions

  first - the first condition - `org.datavec.api.transform.condition.Condition`
  second - the second condition for xor - `org.datavec.api.transform.condition.Condition`

  returns: the xor of these 2 conditions - `org.datavec.api.transform.condition.Condition`"
  (^org.datavec.api.transform.condition.Condition [^org.datavec.api.transform.condition.Condition first ^org.datavec.api.transform.condition.Condition second]
    (BooleanCondition/XOR first second)))

(defn output-column-name
  "The output column name
  after the operation has been applied

  returns: the output column name - `java.lang.String`"
  (^java.lang.String [^BooleanCondition this]
    (-> this (.outputColumnName))))

(defn condition-sequence
  "Description copied from interface: Condition

  sequence - Current sequence - `java.util.List`

  returns: true if condition satisfied, false otherwise - `boolean`"
  (^Boolean [^BooleanCondition this ^java.util.List sequence]
    (-> this (.conditionSequence sequence))))

(defn transform
  "Get the output schema for this transformation, given an input schema

  input-schema - `org.datavec.api.transform.schema.Schema`

  returns: `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^BooleanCondition this ^org.datavec.api.transform.schema.Schema input-schema]
    (-> this (.transform input-schema))))

(defn condition
  "Description copied from interface: Condition

  list - Current example - `java.util.List`

  returns: true if condition satisfied, false otherwise - `boolean`"
  (^Boolean [^BooleanCondition this ^java.util.List list]
    (-> this (.condition list))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BooleanCondition this]
    (-> this (.toString))))

(defn set-input-schema
  "Description copied from interface: Condition

  schema - `org.datavec.api.transform.schema.Schema`"
  ([^BooleanCondition this ^org.datavec.api.transform.schema.Schema schema]
    (-> this (.setInputSchema schema))))

(defn get-input-schema
  "Description copied from interface: Condition

  returns: `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^BooleanCondition this]
    (-> this (.getInputSchema))))

(defn column-names
  "Returns column names
  this op is meant to run on

  returns: `java.lang.String[]`"
  ([^BooleanCondition this]
    (-> this (.columnNames))))

(defn output-column-names
  "The output column names
  This will often be the same as the input

  returns: the output column names - `java.lang.String[]`"
  ([^BooleanCondition this]
    (-> this (.outputColumnNames))))

(defn column-name
  "Returns a singular column name
  this op is meant to run on

  returns: `java.lang.String`"
  (^java.lang.String [^BooleanCondition this]
    (-> this (.columnName))))

