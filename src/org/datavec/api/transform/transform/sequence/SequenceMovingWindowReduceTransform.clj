(ns org.datavec.api.transform.transform.sequence.SequenceMovingWindowReduceTransform
  "SequenceMovingWindowReduceTransform Adds a new column, where the value is derived by:
 (a) using a window of the last N values in a single column,
 (b) Apply a reduction op on the window to calculate a new value
 for example, this transformer can be used to implement a simple moving average of the last N values,
 or determine the minimum or maximum values in the last N time steps.
 For a simple moving average, length 20: new SequenceMovingWindowReduceTransform(\"myCol\", 20, ReduceOp.Mean)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.transform.sequence SequenceMovingWindowReduceTransform]))

(defn ->sequence-moving-window-reduce-transform
  "Constructor.

  column-name - Column name to perform windowing on - `java.lang.String`
  new-column-name - Name of the new output column (with results) - `java.lang.String`
  lookback - Look back period for windowing - `int`
  op - Reduction operation to perform on each window - `org.datavec.api.transform.ReduceOp`
  edge-case-handling - How the 1st steps should be handled (positions in sequence with indices less then the look-back period) - `org.datavec.api.transform.transform.sequence.SequenceMovingWindowReduceTransform$EdgeCaseHandling`
  edge-case-value - Used only with EdgeCaseHandling.SpecifiedValue, maybe null otherwise - `org.datavec.api.writable.Writable`"
  (^SequenceMovingWindowReduceTransform [^java.lang.String column-name ^java.lang.String new-column-name ^Integer lookback ^org.datavec.api.transform.ReduceOp op ^org.datavec.api.transform.transform.sequence.SequenceMovingWindowReduceTransform$EdgeCaseHandling edge-case-handling ^org.datavec.api.writable.Writable edge-case-value]
    (new SequenceMovingWindowReduceTransform column-name new-column-name lookback op edge-case-handling edge-case-value))
  (^SequenceMovingWindowReduceTransform [^java.lang.String column-name ^Integer lookback ^org.datavec.api.transform.ReduceOp op]
    (new SequenceMovingWindowReduceTransform column-name lookback op)))

(defn *default-output-column-name
  "original-name - `java.lang.String`
  lookback - `int`
  op - `org.datavec.api.transform.ReduceOp`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String original-name ^Integer lookback ^org.datavec.api.transform.ReduceOp op]
    (SequenceMovingWindowReduceTransform/defaultOutputColumnName original-name lookback op)))

(defn map
  "Description copied from interface: Transform

  writables - the record to transform - `java.util.List`

  returns: the transformed writable - `java.util.List<org.datavec.api.writable.Writable>`"
  (^java.util.List [^SequenceMovingWindowReduceTransform this ^java.util.List writables]
    (-> this (.map writables))))

(defn output-column-name
  "The output column name
  after the operation has been applied

  returns: the output column name - `java.lang.String`"
  (^java.lang.String [^SequenceMovingWindowReduceTransform this]
    (-> this (.outputColumnName))))

(defn transform
  "Description copied from interface: ColumnOp

  input-schema - `org.datavec.api.transform.schema.Schema`

  returns: `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^SequenceMovingWindowReduceTransform this ^org.datavec.api.transform.schema.Schema input-schema]
    (-> this (.transform input-schema))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^SequenceMovingWindowReduceTransform this]
    (-> this (.toString))))

(defn set-input-schema
  "Description copied from interface: ColumnOp

  input-schema - `org.datavec.api.transform.schema.Schema`"
  ([^SequenceMovingWindowReduceTransform this ^org.datavec.api.transform.schema.Schema input-schema]
    (-> this (.setInputSchema input-schema))))

(defn get-input-schema
  "Description copied from interface: ColumnOp

  returns: `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^SequenceMovingWindowReduceTransform this]
    (-> this (.getInputSchema))))

(defn map-sequence
  "Description copied from interface: Transform

  sequence - `java.util.List`

  returns: `java.util.List<java.util.List<org.datavec.api.writable.Writable>>`"
  (^java.util.List [^SequenceMovingWindowReduceTransform this ^java.util.List sequence]
    (-> this (.mapSequence sequence))))

(defn column-names
  "Returns column names
  this op is meant to run on

  returns: `java.lang.String[]`"
  ([^SequenceMovingWindowReduceTransform this]
    (-> this (.columnNames))))

(defn output-column-names
  "The output column names
  This will often be the same as the input

  returns: the output column names - `java.lang.String[]`"
  ([^SequenceMovingWindowReduceTransform this]
    (-> this (.outputColumnNames))))

(defn column-name
  "Returns a singular column name
  this op is meant to run on

  returns: `java.lang.String`"
  (^java.lang.String [^SequenceMovingWindowReduceTransform this]
    (-> this (.columnName))))

