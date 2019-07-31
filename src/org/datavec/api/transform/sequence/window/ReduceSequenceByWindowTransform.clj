(ns org.datavec.api.transform.sequence.window.ReduceSequenceByWindowTransform
  "Idea: do two things.
 First, apply a window function to the sequence data.
 Second: Reduce that window of data into a single value by using a Reduce function"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.sequence.window ReduceSequenceByWindowTransform]))

(defn ->reduce-sequence-by-window-transform
  "Constructor.

  reducer - `org.datavec.api.transform.reduce.IAssociativeReducer`
  window-function - `org.datavec.api.transform.sequence.window.WindowFunction`"
  (^ReduceSequenceByWindowTransform [^org.datavec.api.transform.reduce.IAssociativeReducer reducer ^org.datavec.api.transform.sequence.window.WindowFunction window-function]
    (new ReduceSequenceByWindowTransform reducer window-function)))

(defn map
  "Description copied from interface: Transform

  writables - the record to transform - `java.util.List`

  returns: the transformed writable - `java.util.List<org.datavec.api.writable.Writable>`"
  (^java.util.List [^ReduceSequenceByWindowTransform this ^java.util.List writables]
    (-> this (.map writables))))

(defn output-column-name
  "The output column name
  after the operation has been applied

  returns: the output column name - `java.lang.String`"
  (^java.lang.String [^ReduceSequenceByWindowTransform this]
    (-> this (.outputColumnName))))

(defn transform
  "Description copied from interface: ColumnOp

  input-schema - `org.datavec.api.transform.schema.Schema`

  returns: `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^ReduceSequenceByWindowTransform this ^org.datavec.api.transform.schema.Schema input-schema]
    (-> this (.transform input-schema))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ReduceSequenceByWindowTransform this]
    (-> this (.toString))))

(defn set-input-schema
  "Description copied from interface: ColumnOp

  input-schema - `org.datavec.api.transform.schema.Schema`"
  ([^ReduceSequenceByWindowTransform this ^org.datavec.api.transform.schema.Schema input-schema]
    (-> this (.setInputSchema input-schema))))

(defn get-input-schema
  "Description copied from interface: ColumnOp

  returns: `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^ReduceSequenceByWindowTransform this]
    (-> this (.getInputSchema))))

(defn map-sequence
  "Description copied from interface: Transform

  sequence - `java.util.List`

  returns: `java.util.List<java.util.List<org.datavec.api.writable.Writable>>`"
  (^java.util.List [^ReduceSequenceByWindowTransform this ^java.util.List sequence]
    (-> this (.mapSequence sequence))))

(defn column-names
  "Returns column names
  this op is meant to run on

  returns: `java.lang.String[]`"
  ([^ReduceSequenceByWindowTransform this]
    (-> this (.columnNames))))

(defn output-column-names
  "The output column names
  This will often be the same as the input

  returns: the output column names - `java.lang.String[]`"
  ([^ReduceSequenceByWindowTransform this]
    (-> this (.outputColumnNames))))

(defn column-name
  "Returns a singular column name
  this op is meant to run on

  returns: `java.lang.String`"
  (^java.lang.String [^ReduceSequenceByWindowTransform this]
    (-> this (.columnName))))

