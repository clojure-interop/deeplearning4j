(ns org.datavec.api.transform.sequence.trim.SequenceTrimTransform
  "SequenceTrimTranform removes the first or last N values in a sequence. Note that the resulting sequence
 may be of length 0, if the input sequence is less than or equal to N."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.sequence.trim SequenceTrimTransform]))

(defn ->sequence-trim-transform
  "Constructor.

  num-steps-to-trim - Number of time steps to trim from the sequence - `int`
  trim-from-start - If true: Trim values from the start of the sequence. If false: trim values from the end. - `boolean`"
  (^SequenceTrimTransform [^Integer num-steps-to-trim ^Boolean trim-from-start]
    (new SequenceTrimTransform num-steps-to-trim trim-from-start)))

(defn map
  "Description copied from interface: Transform

  writables - the record to transform - `java.util.List`

  returns: the transformed writable - `java.util.List<org.datavec.api.writable.Writable>`"
  (^java.util.List [^SequenceTrimTransform this ^java.util.List writables]
    (-> this (.map writables))))

(defn output-column-name
  "Description copied from interface: ColumnOp

  returns: the output column name - `java.lang.String`"
  (^java.lang.String [^SequenceTrimTransform this]
    (-> this (.outputColumnName))))

(defn transform
  "Description copied from interface: ColumnOp

  input-schema - `org.datavec.api.transform.schema.Schema`

  returns: `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^SequenceTrimTransform this ^org.datavec.api.transform.schema.Schema input-schema]
    (-> this (.transform input-schema))))

(defn set-input-schema
  "Description copied from interface: ColumnOp

  input-schema - `org.datavec.api.transform.schema.Schema`"
  ([^SequenceTrimTransform this ^org.datavec.api.transform.schema.Schema input-schema]
    (-> this (.setInputSchema input-schema))))

(defn get-input-schema
  "Description copied from interface: ColumnOp

  returns: `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^SequenceTrimTransform this]
    (-> this (.getInputSchema))))

(defn map-sequence
  "Description copied from interface: Transform

  sequence - `java.util.List`

  returns: `java.util.List<java.util.List<org.datavec.api.writable.Writable>>`"
  (^java.util.List [^SequenceTrimTransform this ^java.util.List sequence]
    (-> this (.mapSequence sequence))))

(defn column-names
  "Description copied from interface: ColumnOp

  returns: `java.lang.String[]`"
  ([^SequenceTrimTransform this]
    (-> this (.columnNames))))

(defn output-column-names
  "Description copied from interface: ColumnOp

  returns: the output column names - `java.lang.String[]`"
  ([^SequenceTrimTransform this]
    (-> this (.outputColumnNames))))

(defn column-name
  "Description copied from interface: ColumnOp

  returns: `java.lang.String`"
  (^java.lang.String [^SequenceTrimTransform this]
    (-> this (.columnName))))

