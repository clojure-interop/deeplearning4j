(ns org.datavec.api.transform.transform.sequence.SequenceDifferenceTransform
  "SequenceDifferenceTransform: for an input sequence, calculate the difference on one column.
 For each time t, calculate someColumn(t) - someColumn(t-s), where s >= 1 is the 'lookback' period.

 Note: at t=0 (i.e., the first step in a sequence; or more generally, for all times t < s), there is no previous value
 from which to calculate the difference. The SequenceDifferenceTransform.FirstStepMode enumeration provides the following ways of handling
 these time steps:
 1. Default: output = someColumn(t) - someColumn(max(t-s, 0))
 2. SpecifiedValue: output = someColumn(t) - someColumn(t-s) if t-s >= 0, or a custom Writable object (for example, a DoubleWritable(0)
 or NullWritable).

 Note: this is an in-place operation: i.e., the values in each column are modified. If the original values are
 to be retained in the data set, first make a copy (for example, using TransformProcess.Builder.duplicateColumn(String, String))
 and apply the difference operation in-place on the copy."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.transform.sequence SequenceDifferenceTransform]))

(defn ->sequence-difference-transform
  "Constructor.

  Create a SequenceDifferenceTransform with default lookback of 1, and using FirstStepMode.Default,
  where the output column name is specified

  column-name - Name of the column to perform the operation on. - `java.lang.String`
  new-column-name - New name for the column. May be same as the origina lcolumn name - `java.lang.String`
  lookback - Lookback period, in number of time steps. Must be > 0 - `int`
  first-step-mode - see SequenceDifferenceTransform.FirstStepMode - `org.datavec.api.transform.transform.sequence.SequenceDifferenceTransform$FirstStepMode`
  specified-value-writable - Must be null if using FirstStepMode.Default, or non-null if using FirstStepMode.SpecifiedValue - `org.datavec.api.writable.Writable`"
  (^SequenceDifferenceTransform [^java.lang.String column-name ^java.lang.String new-column-name ^Integer lookback ^org.datavec.api.transform.transform.sequence.SequenceDifferenceTransform$FirstStepMode first-step-mode ^org.datavec.api.writable.Writable specified-value-writable]
    (new SequenceDifferenceTransform column-name new-column-name lookback first-step-mode specified-value-writable))
  (^SequenceDifferenceTransform [^java.lang.String column-name ^java.lang.String new-column-name ^Integer lookback]
    (new SequenceDifferenceTransform column-name new-column-name lookback))
  (^SequenceDifferenceTransform [^java.lang.String column-name]
    (new SequenceDifferenceTransform column-name)))

(defn map
  "Description copied from interface: Transform

  writables - the record to transform - `java.util.List`

  returns: the transformed writable - `java.util.List<org.datavec.api.writable.Writable>`"
  (^java.util.List [^SequenceDifferenceTransform this ^java.util.List writables]
    (-> this (.map writables))))

(defn output-column-name
  "The output column name
  after the operation has been applied

  returns: the output column name - `java.lang.String`"
  (^java.lang.String [^SequenceDifferenceTransform this]
    (-> this (.outputColumnName))))

(defn transform
  "Description copied from interface: ColumnOp

  input-schema - `org.datavec.api.transform.schema.Schema`

  returns: `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^SequenceDifferenceTransform this ^org.datavec.api.transform.schema.Schema input-schema]
    (-> this (.transform input-schema))))

(defn set-input-schema
  "Description copied from interface: ColumnOp

  input-schema - `org.datavec.api.transform.schema.Schema`"
  ([^SequenceDifferenceTransform this ^org.datavec.api.transform.schema.Schema input-schema]
    (-> this (.setInputSchema input-schema))))

(defn get-input-schema
  "Description copied from interface: ColumnOp

  returns: `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^SequenceDifferenceTransform this]
    (-> this (.getInputSchema))))

(defn map-sequence
  "Description copied from interface: Transform

  sequence - `java.util.List`

  returns: `java.util.List<java.util.List<org.datavec.api.writable.Writable>>`"
  (^java.util.List [^SequenceDifferenceTransform this ^java.util.List sequence]
    (-> this (.mapSequence sequence))))

(defn column-names
  "Returns column names
  this op is meant to run on

  returns: `java.lang.String[]`"
  ([^SequenceDifferenceTransform this]
    (-> this (.columnNames))))

(defn output-column-names
  "The output column names
  This will often be the same as the input

  returns: the output column names - `java.lang.String[]`"
  ([^SequenceDifferenceTransform this]
    (-> this (.outputColumnNames))))

(defn column-name
  "Returns a singular column name
  this op is meant to run on

  returns: `java.lang.String`"
  (^java.lang.String [^SequenceDifferenceTransform this]
    (-> this (.columnName))))

