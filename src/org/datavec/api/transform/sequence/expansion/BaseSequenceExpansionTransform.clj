(ns org.datavec.api.transform.sequence.expansion.BaseSequenceExpansionTransform
  "A base class for sequence expansion operations.
 The idea: for one or more columns, expand the values to multiple sequence steps; for all other columns, just
 duplicate the step values when expanding."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.sequence.expansion BaseSequenceExpansionTransform]))

(defn transform
  "Description copied from interface: ColumnOp

  input-schema - `org.datavec.api.transform.schema.Schema`

  returns: `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^BaseSequenceExpansionTransform this ^org.datavec.api.transform.schema.Schema input-schema]
    (-> this (.transform input-schema))))

(defn output-column-name
  "Description copied from interface: ColumnOp

  returns: the output column name - `java.lang.String`"
  (^java.lang.String [^BaseSequenceExpansionTransform this]
    (-> this (.outputColumnName))))

(defn output-column-names
  "Description copied from interface: ColumnOp

  returns: the output column names - `java.lang.String[]`"
  ([^BaseSequenceExpansionTransform this]
    (-> this (.outputColumnNames))))

(defn column-names
  "Description copied from interface: ColumnOp

  returns: `java.lang.String[]`"
  ([^BaseSequenceExpansionTransform this]
    (-> this (.columnNames))))

(defn column-name
  "Description copied from interface: ColumnOp

  returns: `java.lang.String`"
  (^java.lang.String [^BaseSequenceExpansionTransform this]
    (-> this (.columnName))))

(defn map
  "Description copied from interface: Transform

  writables - the record to transform - `java.util.List`

  returns: the transformed writable - `java.util.List<org.datavec.api.writable.Writable>`"
  (^java.util.List [^BaseSequenceExpansionTransform this ^java.util.List writables]
    (-> this (.map writables))))

(defn map-sequence
  "Description copied from interface: Transform

  sequence - `java.util.List`

  returns: `java.util.List<java.util.List<org.datavec.api.writable.Writable>>`"
  (^java.util.List [^BaseSequenceExpansionTransform this ^java.util.List sequence]
    (-> this (.mapSequence sequence))))

