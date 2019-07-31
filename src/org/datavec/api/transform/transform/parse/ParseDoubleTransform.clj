(ns org.datavec.api.transform.transform.parse.ParseDoubleTransform
  "Convert string writables to doubles"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.transform.parse ParseDoubleTransform]))

(defn ->parse-double-transform
  "Constructor."
  (^ParseDoubleTransform []
    (new ParseDoubleTransform )))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ParseDoubleTransform this]
    (-> this (.toString))))

(defn transform
  "Get the output schema for this transformation, given an input schema

  input-schema - `org.datavec.api.transform.schema.Schema`

  returns: `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^ParseDoubleTransform this ^org.datavec.api.transform.schema.Schema input-schema]
    (-> this (.transform input-schema))))

(defn map
  "Description copied from interface: Transform

  writables - the record to transform - `java.util.List`

  returns: the transformed writable - `java.util.List<org.datavec.api.writable.Writable>`"
  (^java.util.List [^ParseDoubleTransform this ^java.util.List writables]
    (-> this (.map writables))))

(defn map-sequence
  "Transform a sequence

  sequence - `java.lang.Object`

  returns: `java.lang.Object`"
  (^java.lang.Object [^ParseDoubleTransform this ^java.lang.Object sequence]
    (-> this (.mapSequence sequence))))

(defn output-column-name
  "The output column name
  after the operation has been applied

  returns: the output column name - `java.lang.String`"
  (^java.lang.String [^ParseDoubleTransform this]
    (-> this (.outputColumnName))))

(defn output-column-names
  "The output column names
  This will often be the same as the input

  returns: the output column names - `java.lang.String[]`"
  ([^ParseDoubleTransform this]
    (-> this (.outputColumnNames))))

(defn column-names
  "Returns column names
  this op is meant to run on

  returns: `java.lang.String[]`"
  ([^ParseDoubleTransform this]
    (-> this (.columnNames))))

(defn column-name
  "Returns a singular column name
  this op is meant to run on

  returns: `java.lang.String`"
  (^java.lang.String [^ParseDoubleTransform this]
    (-> this (.columnName))))

