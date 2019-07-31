(ns org.datavec.api.transform.reduce.impl.GeographicMidpointReduction
  "Given a set of latitude/longitude coordinates, encoded in Text writables with format \"lat,long\" (the
 delimiter is configurable), determine the geographic midpoint.
 See \"geographic midpoint\" at: http://www.geomidpoint.com/methods.html
 For implementation algorithm, see: http://www.geomidpoint.com/calculation.html"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.reduce.impl GeographicMidpointReduction]))

(defn ->geographic-midpoint-reduction
  "Constructor.

  delim - `java.lang.String`
  new-column-name - `java.lang.String`"
  (^GeographicMidpointReduction [^java.lang.String delim ^java.lang.String new-column-name]
    (new GeographicMidpointReduction delim new-column-name))
  (^GeographicMidpointReduction [^java.lang.String delim]
    (new GeographicMidpointReduction delim)))

(def *-edge-case-eps
  "Static Constant.

  type: double"
  GeographicMidpointReduction/EDGE_CASE_EPS)

(defn output-column-name
  "Description copied from interface: ColumnOp

  returns: the output column name - `java.lang.String`"
  (^java.lang.String [^GeographicMidpointReduction this]
    (-> this (.outputColumnName))))

(defn transform
  "Description copied from interface: ColumnOp

  input-schema - `org.datavec.api.transform.schema.Schema`

  returns: `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^GeographicMidpointReduction this ^org.datavec.api.transform.schema.Schema input-schema]
    (-> this (.transform input-schema))))

(defn get-column-output-meta-data
  "Description copied from interface: AggregableColumnReduction

  new-column-name - `java.util.List`
  column-input-meta - `org.datavec.api.transform.metadata.ColumnMetaData`

  returns: Metadata for the column, after the reduction - `java.util.List<org.datavec.api.transform.metadata.ColumnMetaData>`"
  (^java.util.List [^GeographicMidpointReduction this ^java.util.List new-column-name ^org.datavec.api.transform.metadata.ColumnMetaData column-input-meta]
    (-> this (.getColumnOutputMetaData new-column-name column-input-meta))))

(defn set-input-schema
  "Description copied from interface: ColumnOp

  input-schema - `org.datavec.api.transform.schema.Schema`"
  ([^GeographicMidpointReduction this ^org.datavec.api.transform.schema.Schema input-schema]
    (-> this (.setInputSchema input-schema))))

(defn get-input-schema
  "Description copied from interface: ColumnOp

  returns: `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^GeographicMidpointReduction this]
    (-> this (.getInputSchema))))

(defn column-names
  "Description copied from interface: ColumnOp

  returns: `java.lang.String[]`"
  ([^GeographicMidpointReduction this]
    (-> this (.columnNames))))

(defn get-columns-output-name
  "Description copied from interface: AggregableColumnReduction

  column-input-name - Name of the column before reduction - `java.lang.String`

  returns: Name of the column after the reduction - `java.util.List<java.lang.String>`"
  (^java.util.List [^GeographicMidpointReduction this ^java.lang.String column-input-name]
    (-> this (.getColumnsOutputName column-input-name))))

(defn output-column-names
  "Description copied from interface: ColumnOp

  returns: the output column names - `java.lang.String[]`"
  ([^GeographicMidpointReduction this]
    (-> this (.outputColumnNames))))

(defn reduce-op
  "Description copied from interface: AggregableColumnReduction

  returns: Writable containing the reduced data - `org.datavec.api.transform.ops.IAggregableReduceOp<org.datavec.api.writable.Writable,java.util.List<org.datavec.api.writable.Writable>>`"
  (^org.datavec.api.transform.ops.IAggregableReduceOp [^GeographicMidpointReduction this]
    (-> this (.reduceOp))))

(defn column-name
  "Description copied from interface: ColumnOp

  returns: `java.lang.String`"
  (^java.lang.String [^GeographicMidpointReduction this]
    (-> this (.columnName))))

