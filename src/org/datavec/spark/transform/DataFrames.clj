(ns org.datavec.spark.transform.DataFrames
  "Namespace for datavec
 dataframe interop"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.transform DataFrames]))

(def *-sequence-uuid-column
  "Static Constant.

  type: java.lang.String"
  DataFrames/SEQUENCE_UUID_COLUMN)

(def *-sequence-index-column
  "Static Constant.

  type: java.lang.String"
  DataFrames/SEQUENCE_INDEX_COLUMN)

(defn *to-columns
  "Convert an array of strings
  to column names

  columns - the columns to convert - `java.lang.String`

  returns: the converted columns - `org.apache.spark.sql.Column[]`"
  ([^java.lang.String columns]
    (DataFrames/toColumns columns)))

(defn *from-schema
  "Convert a datavec schema to a
  struct type in spark

  schema - the schema to convert - `org.datavec.api.transform.schema.Schema`

  returns: the datavec struct type - `org.apache.spark.sql.types.StructType`"
  (^org.apache.spark.sql.types.StructType [^org.datavec.api.transform.schema.Schema schema]
    (DataFrames/fromSchema schema)))

(defn *to-matrix
  "Convert a list of rows to a matrix

  rows - the list of rows to convert - `java.util.List`

  returns: the converted matrix - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^java.util.List rows]
    (DataFrames/toMatrix rows)))

(defn *min
  "MIn for a column

  data-frame - the dataframe toget the column from - `org.datavec.spark.transform.DataRowsFacade`
  column-name - the name of the column to get the min for - `java.lang.String`

  returns: the column that represents the min - `org.apache.spark.sql.Column`"
  (^org.apache.spark.sql.Column [^org.datavec.spark.transform.DataRowsFacade data-frame ^java.lang.String column-name]
    (DataFrames/min data-frame column-name)))

(defn *std
  "Standard deviation for a column

  data-frame - the dataframe toget the column from - `org.datavec.spark.transform.DataRowsFacade`
  column-name - the name of the column to get the standarddeviation for - `java.lang.String`

  returns: the column that represents the standard deviation - `org.apache.spark.sql.Column`"
  (^org.apache.spark.sql.Column [^org.datavec.spark.transform.DataRowsFacade data-frame ^java.lang.String column-name]
    (DataFrames/std data-frame column-name)))

(defn *mean
  "Mean for a column

  data-frame - the dataframe toget the column fron - `org.datavec.spark.transform.DataRowsFacade`
  column-name - the name of the column to get the mean for - `java.lang.String`

  returns: the column that represents the mean - `org.apache.spark.sql.Column`"
  (^org.apache.spark.sql.Column [^org.datavec.spark.transform.DataRowsFacade data-frame ^java.lang.String column-name]
    (DataFrames/mean data-frame column-name)))

(defn *var
  "Standard deviation for a column

  data-frame - the dataframe toget the column from - `org.datavec.spark.transform.DataRowsFacade`
  column-name - the name of the column to get the standarddeviation for - `java.lang.String`

  returns: the column that represents the standard deviation - `org.apache.spark.sql.Column`"
  (^org.apache.spark.sql.Column [^org.datavec.spark.transform.DataRowsFacade data-frame ^java.lang.String column-name]
    (DataFrames/var data-frame column-name)))

(defn *max
  "Max for a column

  data-frame - the dataframe toget the column from - `org.datavec.spark.transform.DataRowsFacade`
  column-name - the name of the columnto get the max for - `java.lang.String`

  returns: the column that represents the max - `org.apache.spark.sql.Column`"
  (^org.apache.spark.sql.Column [^org.datavec.spark.transform.DataRowsFacade data-frame ^java.lang.String column-name]
    (DataFrames/max data-frame column-name)))

(defn *to-list
  "Convert a string array into a list

  input - the input to create the list from - `java.lang.String[]`

  returns: the created array - `java.util.List<java.lang.String>`"
  (^java.util.List [input]
    (DataFrames/toList input)))

(defn *from-struct-type
  "Create a datavec schema
  from a struct type

  struct-type - the struct type to create the schema from - `org.apache.spark.sql.types.StructType`

  returns: the created schema - `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^org.apache.spark.sql.types.StructType struct-type]
    (DataFrames/fromStructType struct-type)))

(defn *to-records-sequence
  "Convert the given DataFrame to a sequence
  Note: It is assumed here that the DataFrame has been created by toDataFrameSequence(Schema, JavaRDD).
  In particular:
  - the first column is a UUID for the original sequence the row is from
  - the second column is a time step index: where the row appeared in the original sequence

  Typical use: Normalization via the Normalization static methods

  data-frame - Data frame to convert - `org.datavec.spark.transform.DataRowsFacade`

  returns: Data in sequence (i.e., List<List<Writable>> form - `org.nd4j.linalg.primitives.Pair<org.datavec.api.transform.schema.Schema,org.apache.spark.api.java.JavaRDD<java.util.List<java.util.List<org.datavec.api.writable.Writable>>>>`"
  (^org.nd4j.linalg.primitives.Pair [^org.datavec.spark.transform.DataRowsFacade data-frame]
    (DataFrames/toRecordsSequence data-frame)))

(defn *to-records
  "Create a compatible schema
  and rdd for datavec

  data-frame - the dataframe to convert - `org.datavec.spark.transform.DataRowsFacade`

  returns: the converted schema and rdd of writables - `org.nd4j.linalg.primitives.Pair<org.datavec.api.transform.schema.Schema,org.apache.spark.api.java.JavaRDD<java.util.List<org.datavec.api.writable.Writable>>>`"
  (^org.nd4j.linalg.primitives.Pair [^org.datavec.spark.transform.DataRowsFacade data-frame]
    (DataFrames/toRecords data-frame)))

(defn *to-data-frame-sequence
  "Convert the given sequence data set to a DataFrame.
  Note: The resulting DataFrame has two additional columns added to it:
  - Column 0: Sequence UUID (name: SEQUENCE_UUID_COLUMN) - a UUID for the original sequence
  - Column 1: Sequence index (name: SEQUENCE_INDEX_COLUMN - an index (integer, starting at 0) for the position
  of this record in the original time series.
  These two columns are required if the data is to be converted back into a sequence at a later point, for example
  using toRecordsSequence(DataRowsFacade)

  schema - Schema for the data - `org.datavec.api.transform.schema.Schema`
  data - Sequence data to convert to a DataFrame - `org.apache.spark.api.java.JavaRDD`

  returns: The dataframe object - `org.datavec.spark.transform.DataRowsFacade`"
  (^org.datavec.spark.transform.DataRowsFacade [^org.datavec.api.transform.schema.Schema schema ^org.apache.spark.api.java.JavaRDD data]
    (DataFrames/toDataFrameSequence schema data)))

(defn *to-array
  "Convert a string list into a array

  list - the input to create the array from - `java.util.List`

  returns: the created list - `java.lang.String[]`"
  ([^java.util.List list]
    (DataFrames/toArray list)))

(defn *to-data-frame
  "Creates a data frame from a collection of writables
  rdd given a schema

  schema - the schema to use - `org.datavec.api.transform.schema.Schema`
  data - the data to convert - `org.apache.spark.api.java.JavaRDD`

  returns: the dataframe object - `org.datavec.spark.transform.DataRowsFacade`"
  (^org.datavec.spark.transform.DataRowsFacade [^org.datavec.api.transform.schema.Schema schema ^org.apache.spark.api.java.JavaRDD data]
    (DataFrames/toDataFrame schema data)))

(defn *to-column
  "Convert a list of string names
  to columns

  columns - the columns to convert - `java.util.List`

  returns: the resulting column list - `java.util.List<org.apache.spark.sql.Column>`"
  (^java.util.List [^java.util.List columns]
    (DataFrames/toColumn columns)))

(defn *from-schema-sequence
  "Convert the DataVec sequence schema to a StructType for Spark, for example for use in
  toDataFrameSequence(Schema, JavaRDD)}
  Note: as per toDataFrameSequence(Schema, JavaRDD)}, the StructType has two additional columns added to it:
  - Column 0: Sequence UUID (name: SEQUENCE_UUID_COLUMN) - a UUID for the original sequence
  - Column 1: Sequence index (name: SEQUENCE_INDEX_COLUMN - an index (integer, starting at 0) for the position
  of this record in the original time series.
  These two columns are required if the data is to be converted back into a sequence at a later point, for example
  using toRecordsSequence(DataRowsFacade)

  schema - Schema to convert - `org.datavec.api.transform.schema.Schema`

  returns: StructType for the schema - `org.apache.spark.sql.types.StructType`"
  (^org.apache.spark.sql.types.StructType [^org.datavec.api.transform.schema.Schema schema]
    (DataFrames/fromSchemaSequence schema)))

(defn *row-to-writables
  "Convert a given Row to a list of writables, given the specified Schema

  schema - Schema for the data - `org.datavec.api.transform.schema.Schema`
  row - Row of data - `org.apache.spark.sql.Row`

  returns: `java.util.List<org.datavec.api.writable.Writable>`"
  (^java.util.List [^org.datavec.api.transform.schema.Schema schema ^org.apache.spark.sql.Row row]
    (DataFrames/rowToWritables schema row)))

