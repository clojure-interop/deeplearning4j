(ns org.datavec.spark.transform.Normalization
  "Simple dataframe based normalization.
 Column based transforms such as min/max scaling
 based on column min max and zero mean unit variance
 using column wise statistics."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.transform Normalization]))

(defn ->normalization
  "Constructor."
  (^Normalization []
    (new Normalization )))

(defn *zeromean-unit-variance
  "Normalize by zero mean unit variance

  schema - the schema to useto create the data frame - `org.datavec.api.transform.schema.Schema`
  data - the data to normalize - `org.apache.spark.api.java.JavaRDD`
  skip-columns - `java.util.List`

  returns: a zero mean unit variance centered
  rdd - `org.apache.spark.api.java.JavaRDD<java.util.List<org.datavec.api.writable.Writable>>`"
  (^org.apache.spark.api.java.JavaRDD [^org.datavec.api.transform.schema.Schema schema ^org.apache.spark.api.java.JavaRDD data ^java.util.List skip-columns]
    (Normalization/zeromeanUnitVariance schema data skip-columns))
  (^org.apache.spark.api.java.JavaRDD [^org.datavec.api.transform.schema.Schema schema ^org.apache.spark.api.java.JavaRDD data]
    (Normalization/zeromeanUnitVariance schema data))
  (^org.datavec.spark.transform.DataRowsFacade [^org.datavec.spark.transform.DataRowsFacade frame]
    (Normalization/zeromeanUnitVariance frame)))

(defn *normalize
  "Scale based on min,max

  schema - the schema of the data to scale - `org.datavec.api.transform.schema.Schema`
  data - the data to scale - `org.apache.spark.api.java.JavaRDD`
  min - the minimum value - `double`
  max - the maximum value - `double`
  skip-columns - `java.util.List`

  returns: the normalized ata - `org.apache.spark.api.java.JavaRDD<java.util.List<org.datavec.api.writable.Writable>>`"
  (^org.apache.spark.api.java.JavaRDD [^org.datavec.api.transform.schema.Schema schema ^org.apache.spark.api.java.JavaRDD data ^Double min ^Double max ^java.util.List skip-columns]
    (Normalization/normalize schema data min max skip-columns))
  (^org.apache.spark.api.java.JavaRDD [^org.datavec.api.transform.schema.Schema schema ^org.apache.spark.api.java.JavaRDD data ^Double min ^Double max]
    (Normalization/normalize schema data min max))
  (^org.datavec.spark.transform.DataRowsFacade [^org.datavec.spark.transform.DataRowsFacade data-frame ^Double min ^Double max]
    (Normalization/normalize data-frame min max))
  (^org.apache.spark.api.java.JavaRDD [^org.datavec.api.transform.schema.Schema schema ^org.apache.spark.api.java.JavaRDD data]
    (Normalization/normalize schema data))
  (^org.datavec.spark.transform.DataRowsFacade [^org.datavec.spark.transform.DataRowsFacade data-frame]
    (Normalization/normalize data-frame)))

(defn *zero-mean-unit-variance-sequence
  "Normalize the sequence by zero mean unit variance

  schema - Schema of the data to normalize - `org.datavec.api.transform.schema.Schema`
  sequence - Sequence data - `org.apache.spark.api.java.JavaRDD`
  exclude-columns - List of columns to exclude from the normalization - `java.util.List`

  returns: Normalized sequence - `org.apache.spark.api.java.JavaRDD<java.util.List<java.util.List<org.datavec.api.writable.Writable>>>`"
  (^org.apache.spark.api.java.JavaRDD [^org.datavec.api.transform.schema.Schema schema ^org.apache.spark.api.java.JavaRDD sequence ^java.util.List exclude-columns]
    (Normalization/zeroMeanUnitVarianceSequence schema sequence exclude-columns))
  (^org.apache.spark.api.java.JavaRDD [^org.datavec.api.transform.schema.Schema schema ^org.apache.spark.api.java.JavaRDD sequence]
    (Normalization/zeroMeanUnitVarianceSequence schema sequence)))

(defn *min-max-columns
  "Returns the min and max of the given columns

  data - the data to get the max for - `org.datavec.spark.transform.DataRowsFacade`
  columns - the columns to get the - `java.util.List`

  returns: `java.util.List<org.apache.spark.sql.Row>`"
  (^java.util.List [^org.datavec.spark.transform.DataRowsFacade data ^java.util.List columns]
    (Normalization/minMaxColumns data columns)))

(defn *std-dev-mean-columns
  "Returns the standard deviation and mean of the given columns

  data - the data to get the max for - `org.datavec.spark.transform.DataRowsFacade`
  columns - the columns to get the - `java.util.List`

  returns: `java.util.List<org.apache.spark.sql.Row>`"
  (^java.util.List [^org.datavec.spark.transform.DataRowsFacade data ^java.util.List columns]
    (Normalization/stdDevMeanColumns data columns)))

(defn *aggregate
  "Aggregate based on an arbitrary list
  of aggregation and grouping functions

  data - the dataframe to aggregate - `org.datavec.spark.transform.DataRowsFacade`
  columns - the columns to aggregate - `java.lang.String[]`
  functions - the functions to use - `java.lang.String[]`

  returns: the list of rows with the aggregated statistics.
  Each row will be a function with the desired columnar output
  in the order in which the columns were specified. - `java.util.List<org.apache.spark.sql.Row>`"
  (^java.util.List [^org.datavec.spark.transform.DataRowsFacade data columns functions]
    (Normalization/aggregate data columns functions)))

(defn *normalize-sequence
  "Normalize each column of a sequence, based on min/max

  schema - Schema of the data - `org.datavec.api.transform.schema.Schema`
  data - Data to normalize - `org.apache.spark.api.java.JavaRDD`
  min - New minimum value - `double`
  max - New maximum value - `double`
  exclude-columns - List of columns to exclude - `java.util.List`

  returns: Normalized data - `org.apache.spark.api.java.JavaRDD<java.util.List<java.util.List<org.datavec.api.writable.Writable>>>`"
  (^org.apache.spark.api.java.JavaRDD [^org.datavec.api.transform.schema.Schema schema ^org.apache.spark.api.java.JavaRDD data ^Double min ^Double max ^java.util.List exclude-columns]
    (Normalization/normalizeSequence schema data min max exclude-columns))
  (^org.apache.spark.api.java.JavaRDD [^org.datavec.api.transform.schema.Schema schema ^org.apache.spark.api.java.JavaRDD data ^Double min ^Double max]
    (Normalization/normalizeSequence schema data min max))
  (^org.apache.spark.api.java.JavaRDD [^org.datavec.api.transform.schema.Schema schema ^org.apache.spark.api.java.JavaRDD data]
    (Normalization/normalizeSequence schema data)))

