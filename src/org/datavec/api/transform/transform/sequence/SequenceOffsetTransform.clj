(ns org.datavec.api.transform.transform.sequence.SequenceOffsetTransform
  "Sequence offset transform takes a sequence, and shifts The values in one or more columns by a specified number of
 times steps. It has 2 modes of operation (OperationType enum), with respect to the columns it operates on:
 InPlace: operations may be performed in-place, modifying the values in the specified columns
 NewColumn: operations may produce new columns, with the original (source) columns remaining unmodified

 Additionally, there are 2 modes for handling values outside the original sequence (EdgeHandling enum):
 TrimSequence: the entire sequence is trimmed (start or end) by a specified number of steps
 SpecifiedValue: for any values outside of the original sequence, they are given a specified value

 Note 1: When specifying offsets, they are done as follows:
 Positive offsets: move the values in the specified columns to a later time. Earlier time steps are either be trimmed
 or Given specified values; the last values in these columns will be truncated/removed.

 Note 2: Care must be taken when using TrimSequence: for example, if we chain multiple sequence offset transforms on the
 one dataset, we may end up trimming much more than we want. In this case, it may be better to use SpecifiedValue,
 (with, for example, NullWritable) and then do a single trim operation (via SequenceTrimTransform)
 at the end."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.transform.sequence SequenceOffsetTransform]))

(defn ->sequence-offset-transform
  "Constructor.

  columns-to-offset - `java.util.List`
  offset-amount - `int`
  operation-type - `org.datavec.api.transform.transform.sequence.SequenceOffsetTransform$OperationType`
  edge-handling - `org.datavec.api.transform.transform.sequence.SequenceOffsetTransform$EdgeHandling`
  edge-case-value - `org.datavec.api.writable.Writable`"
  (^SequenceOffsetTransform [^java.util.List columns-to-offset ^Integer offset-amount ^org.datavec.api.transform.transform.sequence.SequenceOffsetTransform$OperationType operation-type ^org.datavec.api.transform.transform.sequence.SequenceOffsetTransform$EdgeHandling edge-handling ^org.datavec.api.writable.Writable edge-case-value]
    (new SequenceOffsetTransform columns-to-offset offset-amount operation-type edge-handling edge-case-value)))

(defn transform
  "Description copied from interface: ColumnOp

  input-schema - `org.datavec.api.transform.schema.Schema`

  returns: `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^SequenceOffsetTransform this ^org.datavec.api.transform.schema.Schema input-schema]
    (-> this (.transform input-schema))))

(defn set-input-schema
  "Description copied from interface: ColumnOp

  input-schema - `org.datavec.api.transform.schema.Schema`"
  ([^SequenceOffsetTransform this ^org.datavec.api.transform.schema.Schema input-schema]
    (-> this (.setInputSchema input-schema))))

(defn output-column-name
  "Description copied from interface: ColumnOp

  returns: the output column name - `java.lang.String`"
  (^java.lang.String [^SequenceOffsetTransform this]
    (-> this (.outputColumnName))))

(defn output-column-names
  "Description copied from interface: ColumnOp

  returns: the output column names - `java.lang.String[]`"
  ([^SequenceOffsetTransform this]
    (-> this (.outputColumnNames))))

(defn column-names
  "Description copied from interface: ColumnOp

  returns: `java.lang.String[]`"
  ([^SequenceOffsetTransform this]
    (-> this (.columnNames))))

(defn column-name
  "Description copied from interface: ColumnOp

  returns: `java.lang.String`"
  (^java.lang.String [^SequenceOffsetTransform this]
    (-> this (.columnName))))

(defn map
  "Description copied from interface: Transform

  writables - the record to transform - `java.util.List`

  returns: the transformed writable - `java.util.List<org.datavec.api.writable.Writable>`"
  (^java.util.List [^SequenceOffsetTransform this ^java.util.List writables]
    (-> this (.map writables))))

(defn map-sequence
  "Description copied from interface: Transform

  sequence - `java.util.List`

  returns: `java.util.List<java.util.List<org.datavec.api.writable.Writable>>`"
  (^java.util.List [^SequenceOffsetTransform this ^java.util.List sequence]
    (-> this (.mapSequence sequence))))

