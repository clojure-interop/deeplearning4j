(ns org.datavec.api.transform.reduce.AggregableColumnReduction
  "A column reduction defines how a single column should be reduced.
 Used in conjunction with Reducer to provide custom reduction functionality."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.reduce AggregableColumnReduction]))

(defn reduce-op
  "Reduce a single column.
  Note: The List<Writable>
  here is a single column in a reduction window,
  and NOT the single row
  (as is usually the case for List<Writable> instances

  returns: Writable containing the reduced data - `org.datavec.api.transform.ops.IAggregableReduceOp<org.datavec.api.writable.Writable,java.util.List<org.datavec.api.writable.Writable>>`"
  (^org.datavec.api.transform.ops.IAggregableReduceOp [^AggregableColumnReduction this]
    (-> this (.reduceOp))))

(defn get-columns-output-name
  "Post-reduce: what is the name of the column?
  For example, \"myColumn\" -> \"mean(myColumn)\"

  column-input-name - Name of the column before reduction - `java.lang.String`

  returns: Name of the column after the reduction - `java.util.List<java.lang.String>`"
  (^java.util.List [^AggregableColumnReduction this ^java.lang.String column-input-name]
    (-> this (.getColumnsOutputName column-input-name))))

(defn get-column-output-meta-data
  "Post-reduce: what is the metadata (type, etc) for this column?
  For example: a \"count unique\" operation on a String (StringMetaData) column would return an Integer (IntegerMetaData) column

  new-column-name - `java.util.List`
  column-input-meta - Metadata for the column, before reduce - `org.datavec.api.transform.metadata.ColumnMetaData`

  returns: Metadata for the column, after the reduction - `java.util.List<org.datavec.api.transform.metadata.ColumnMetaData>`"
  (^java.util.List [^AggregableColumnReduction this ^java.util.List new-column-name ^org.datavec.api.transform.metadata.ColumnMetaData column-input-meta]
    (-> this (.getColumnOutputMetaData new-column-name column-input-meta))))

