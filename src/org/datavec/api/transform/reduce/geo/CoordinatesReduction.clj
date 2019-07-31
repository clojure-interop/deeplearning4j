(ns org.datavec.api.transform.reduce.geo.CoordinatesReduction
  "Applies a ReduceOp to a column of coordinates, for each component independently.
 Basically a dispatchop with n = 2 an integrated coordinate parsing & serialization"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.reduce.geo CoordinatesReduction]))

(defn ->coordinates-reduction
  "Constructor.

  column-name-post-reduce - `java.lang.String`
  op - `org.datavec.api.transform.ReduceOp`
  delimiter - `java.lang.String`"
  (^CoordinatesReduction [^java.lang.String column-name-post-reduce ^org.datavec.api.transform.ReduceOp op ^java.lang.String delimiter]
    (new CoordinatesReduction column-name-post-reduce op delimiter))
  (^CoordinatesReduction [^java.lang.String column-name-post-reduce ^org.datavec.api.transform.ReduceOp op]
    (new CoordinatesReduction column-name-post-reduce op)))

(def *-default-column-name
  "Static Constant.

  type: java.lang.String"
  CoordinatesReduction/DEFAULT_COLUMN_NAME)

(def *-default-delimiter
  "Static Constant.

  type: java.lang.String"
  CoordinatesReduction/DEFAULT_DELIMITER)

(defn output-column-name
  "Description copied from interface: ColumnOp

  returns: the output column name - `java.lang.String`"
  (^java.lang.String [^CoordinatesReduction this]
    (-> this (.outputColumnName))))

(defn transform
  "Description copied from interface: ColumnOp

  input-schema - `org.datavec.api.transform.schema.Schema`

  returns: `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^CoordinatesReduction this ^org.datavec.api.transform.schema.Schema input-schema]
    (-> this (.transform input-schema))))

(defn get-column-output-meta-data
  "Description copied from interface: AggregableColumnReduction

  new-column-name - `java.util.List`
  column-input-meta - `org.datavec.api.transform.metadata.ColumnMetaData`

  returns: Metadata for the column, after the reduction - `java.util.List<org.datavec.api.transform.metadata.ColumnMetaData>`"
  (^java.util.List [^CoordinatesReduction this ^java.util.List new-column-name ^org.datavec.api.transform.metadata.ColumnMetaData column-input-meta]
    (-> this (.getColumnOutputMetaData new-column-name column-input-meta))))

(defn set-input-schema
  "Description copied from interface: ColumnOp

  input-schema - `org.datavec.api.transform.schema.Schema`"
  ([^CoordinatesReduction this ^org.datavec.api.transform.schema.Schema input-schema]
    (-> this (.setInputSchema input-schema))))

(defn get-input-schema
  "Description copied from interface: ColumnOp

  returns: `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^CoordinatesReduction this]
    (-> this (.getInputSchema))))

(defn column-names
  "Description copied from interface: ColumnOp

  returns: `java.lang.String[]`"
  ([^CoordinatesReduction this]
    (-> this (.columnNames))))

(defn get-columns-output-name
  "Description copied from interface: AggregableColumnReduction

  column-input-name - Name of the column before reduction - `java.lang.String`

  returns: Name of the column after the reduction - `java.util.List<java.lang.String>`"
  (^java.util.List [^CoordinatesReduction this ^java.lang.String column-input-name]
    (-> this (.getColumnsOutputName column-input-name))))

(defn output-column-names
  "Description copied from interface: ColumnOp

  returns: the output column names - `java.lang.String[]`"
  ([^CoordinatesReduction this]
    (-> this (.outputColumnNames))))

(defn reduce-op
  "Description copied from interface: AggregableColumnReduction

  returns: Writable containing the reduced data - `org.datavec.api.transform.ops.IAggregableReduceOp<org.datavec.api.writable.Writable,java.util.List<org.datavec.api.writable.Writable>>`"
  (^org.datavec.api.transform.ops.IAggregableReduceOp [^CoordinatesReduction this]
    (-> this (.reduceOp))))

(defn column-name
  "Description copied from interface: ColumnOp

  returns: `java.lang.String`"
  (^java.lang.String [^CoordinatesReduction this]
    (-> this (.columnName))))

