(ns org.datavec.api.transform.reduce.ColumnReduction
  "A column reduction defines how a single column should be reduced.
 Used in conjunction with Reducer to provide custom reduction functionality."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.reduce ColumnReduction]))

(defn reduce-column
  "Reduce a single column.
  Note: The List<Writable>
  here is a single column in a reduction window,
  and NOT the single row
  (as is usually the case for List<Writable> instances

  column-data - The Writable objects for a column - `java.util.List`

  returns: Writable containing the reduced data - `org.datavec.api.writable.Writable`"
  (^org.datavec.api.writable.Writable [^ColumnReduction this ^java.util.List column-data]
    (-> this (.reduceColumn column-data))))

(defn get-column-output-name
  "Post-reduce: what is the name of the column?
  For example, \"myColumn\" -> \"mean(myColumn)\"

  column-input-name - Name of the column before reduction - `java.lang.String`

  returns: Name of the column after the reduction - `java.lang.String`"
  (^java.lang.String [^ColumnReduction this ^java.lang.String column-input-name]
    (-> this (.getColumnOutputName column-input-name))))

(defn get-column-output-meta-data
  "Post-reduce: what is the metadata (type, etc) for this column?
  For example: a \"count unique\" operation on a String (StringMetaData) column would return an Integer (IntegerMetaData) column

  new-column-name - `java.lang.String`
  column-input-meta - Metadata for the column, before reduce - `org.datavec.api.transform.metadata.ColumnMetaData`

  returns: Metadata for the column, after the reduction - `org.datavec.api.transform.metadata.ColumnMetaData`"
  (^org.datavec.api.transform.metadata.ColumnMetaData [^ColumnReduction this ^java.lang.String new-column-name ^org.datavec.api.transform.metadata.ColumnMetaData column-input-meta]
    (-> this (.getColumnOutputMetaData new-column-name column-input-meta))))

