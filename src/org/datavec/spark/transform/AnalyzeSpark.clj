(ns org.datavec.spark.transform.AnalyzeSpark
  "AnalizeSpark: static methods for
 analyzing and
 processing RDD<List<Writable>> and RDD<List<List<Writable>>"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.transform AnalyzeSpark]))

(defn ->analyze-spark
  "Constructor."
  (^AnalyzeSpark []
    (new AnalyzeSpark )))

(def *-default-histogram-buckets
  "Static Constant.

  type: int"
  AnalyzeSpark/DEFAULT_HISTOGRAM_BUCKETS)

(defn *min
  "Get the minimum value for the specified column

  all-data - All data - `org.apache.spark.api.java.JavaRDD`
  column-name - Name of the column to get the minimum value for - `java.lang.String`
  schema - Schema of the data - `org.datavec.api.transform.schema.Schema`

  returns: Minimum value for the column - `org.datavec.api.writable.Writable`"
  (^org.datavec.api.writable.Writable [^org.apache.spark.api.java.JavaRDD all-data ^java.lang.String column-name ^org.datavec.api.transform.schema.Schema schema]
    (AnalyzeSpark/min all-data column-name schema)))

(defn *analyze-quality-sequence
  "Analyze the data quality of sequence data - provides a report on missing values, values that don't comply with schema, etc

  schema - Schema for data - `org.datavec.api.transform.schema.Schema`
  data - Data to analyze - `org.apache.spark.api.java.JavaRDD`

  returns: DataQualityAnalysis object - `org.datavec.api.transform.quality.DataQualityAnalysis`"
  (^org.datavec.api.transform.quality.DataQualityAnalysis [^org.datavec.api.transform.schema.Schema schema ^org.apache.spark.api.java.JavaRDD data]
    (AnalyzeSpark/analyzeQualitySequence schema data)))

(defn *max
  "Get the maximum value for the specified column

  all-data - All data - `org.apache.spark.api.java.JavaRDD`
  column-name - Name of the column to get the minimum value for - `java.lang.String`
  schema - Schema of the data - `org.datavec.api.transform.schema.Schema`

  returns: Maximum value for the column - `org.datavec.api.writable.Writable`"
  (^org.datavec.api.writable.Writable [^org.apache.spark.api.java.JavaRDD all-data ^java.lang.String column-name ^org.datavec.api.transform.schema.Schema schema]
    (AnalyzeSpark/max all-data column-name schema)))

(defn *analyze-quality
  "Analyze the data quality of data - provides a report on missing values, values that don't comply with schema, etc

  schema - Schema for data - `org.datavec.api.transform.schema.Schema`
  data - Data to analyze - `org.apache.spark.api.java.JavaRDD`

  returns: DataQualityAnalysis object - `org.datavec.api.transform.quality.DataQualityAnalysis`"
  (^org.datavec.api.transform.quality.DataQualityAnalysis [^org.datavec.api.transform.schema.Schema schema ^org.apache.spark.api.java.JavaRDD data]
    (AnalyzeSpark/analyzeQuality schema data)))

(defn *analyze
  "Analyse the specified data - returns a DataAnalysis object with summary information about each column

  schema - Schema for data - `org.datavec.api.transform.schema.Schema`
  data - Data to analyze - `org.apache.spark.api.java.JavaRDD`

  returns: DataAnalysis for data - `org.datavec.api.transform.analysis.DataAnalysis`"
  (^org.datavec.api.transform.analysis.DataAnalysis [^org.datavec.api.transform.schema.Schema schema ^org.apache.spark.api.java.JavaRDD data]
    (AnalyzeSpark/analyze schema data))
  (^org.datavec.api.transform.analysis.DataAnalysis [^org.datavec.api.transform.schema.Schema schema ^org.apache.spark.api.java.JavaRDD data ^Integer max-histogram-buckets]
    (AnalyzeSpark/analyze schema data max-histogram-buckets)))

(defn *get-unique-sequence
  "Get a list of unique values from the specified column of a sequence

  column-name - Name of the column to get unique values from - `java.lang.String`
  schema - Data schema - `org.datavec.api.transform.schema.Schema`
  sequence-data - Sequence data to get unique values from - `org.apache.spark.api.java.JavaRDD`

  returns: `java.util.List<org.datavec.api.writable.Writable>`"
  (^java.util.List [^java.lang.String column-name ^org.datavec.api.transform.schema.Schema schema ^org.apache.spark.api.java.JavaRDD sequence-data]
    (AnalyzeSpark/getUniqueSequence column-name schema sequence-data)))

(defn *get-unique
  "Get a list of unique values from the specified columns.
  For sequence data, use getUniqueSequence(List, Schema, JavaRDD)

  column-name - Name of the column to get unique values from - `java.lang.String`
  schema - Data schema - `org.datavec.api.transform.schema.Schema`
  data - Data to get unique values from - `org.apache.spark.api.java.JavaRDD`

  returns: List of unique values - `java.util.List<org.datavec.api.writable.Writable>`"
  (^java.util.List [^java.lang.String column-name ^org.datavec.api.transform.schema.Schema schema ^org.apache.spark.api.java.JavaRDD data]
    (AnalyzeSpark/getUnique column-name schema data)))

(defn *sample-invalid-from-column-sequence
  "Randomly sample a set of invalid values from a specified column, for a sequence data set.
  Values are considered invalid according to the Schema / ColumnMetaData

  num-to-sample - Maximum number of invalid values to sample - `int`
  column-name - Same of the column from which to sample invalid values - `java.lang.String`
  schema - Data schema - `org.datavec.api.transform.schema.Schema`
  data - Data - `org.apache.spark.api.java.JavaRDD`

  returns: List of invalid examples - `java.util.List<org.datavec.api.writable.Writable>`"
  (^java.util.List [^Integer num-to-sample ^java.lang.String column-name ^org.datavec.api.transform.schema.Schema schema ^org.apache.spark.api.java.JavaRDD data]
    (AnalyzeSpark/sampleInvalidFromColumnSequence num-to-sample column-name schema data)))

(defn *sample-most-frequent-from-column
  "Sample the N most frequently occurring values in the specified column

  n-most-frequent - Top N values to sample - `int`
  column-name - Name of the column to sample from - `java.lang.String`
  schema - Schema of the data - `org.datavec.api.transform.schema.Schema`
  data - RDD containing the data - `org.apache.spark.api.java.JavaRDD`

  returns: List of the most frequently occurring Writable objects in that column, along with their counts - `java.util.Map<org.datavec.api.writable.Writable,java.lang.Long>`"
  (^java.util.Map [^Integer n-most-frequent ^java.lang.String column-name ^org.datavec.api.transform.schema.Schema schema ^org.apache.spark.api.java.JavaRDD data]
    (AnalyzeSpark/sampleMostFrequentFromColumn n-most-frequent column-name schema data)))

(defn *sample-from-column-sequence
  "Randomly sample values from a single column, in all sequences.
  Values may be taken from any sequence (i.e., sequence order is not preserved)

  count - Number of values to sample - `int`
  column-name - Name of the column to sample from - `java.lang.String`
  schema - Schema - `org.datavec.api.transform.schema.Schema`
  sequence-data - Data to sample from - `org.apache.spark.api.java.JavaRDD`

  returns: A list of random samples - `java.util.List<org.datavec.api.writable.Writable>`"
  (^java.util.List [^Integer count ^java.lang.String column-name ^org.datavec.api.transform.schema.Schema schema ^org.apache.spark.api.java.JavaRDD sequence-data]
    (AnalyzeSpark/sampleFromColumnSequence count column-name schema sequence-data)))

(defn *sample-from-column
  "Randomly sample values from a single column

  count - Number of values to sample - `int`
  column-name - Name of the column to sample from - `java.lang.String`
  schema - Schema - `org.datavec.api.transform.schema.Schema`
  data - Data to sample from - `org.apache.spark.api.java.JavaRDD`

  returns: A list of random samples - `java.util.List<org.datavec.api.writable.Writable>`"
  (^java.util.List [^Integer count ^java.lang.String column-name ^org.datavec.api.transform.schema.Schema schema ^org.apache.spark.api.java.JavaRDD data]
    (AnalyzeSpark/sampleFromColumn count column-name schema data)))

(defn *sample-invalid-from-column
  "Randomly sample a set of invalid values from a specified column.
  Values are considered invalid according to the Schema / ColumnMetaData

  num-to-sample - Maximum number of invalid values to sample - `int`
  column-name - Same of the column from which to sample invalid values - `java.lang.String`
  schema - Data schema - `org.datavec.api.transform.schema.Schema`
  data - Data - `org.apache.spark.api.java.JavaRDD`
  ignore-missing - If true: ignore missing values (NullWritable or empty/null string) when sampling. If false: include missing values in sampling - `boolean`

  returns: List of invalid examples - `java.util.List<org.datavec.api.writable.Writable>`"
  (^java.util.List [^Integer num-to-sample ^java.lang.String column-name ^org.datavec.api.transform.schema.Schema schema ^org.apache.spark.api.java.JavaRDD data ^Boolean ignore-missing]
    (AnalyzeSpark/sampleInvalidFromColumn num-to-sample column-name schema data ignore-missing))
  (^java.util.List [^Integer num-to-sample ^java.lang.String column-name ^org.datavec.api.transform.schema.Schema schema ^org.apache.spark.api.java.JavaRDD data]
    (AnalyzeSpark/sampleInvalidFromColumn num-to-sample column-name schema data)))

(defn *analyze-sequence
  "schema - `org.datavec.api.transform.schema.Schema`
  data - `org.apache.spark.api.java.JavaRDD`
  max-histogram-buckets - `int`

  returns: `org.datavec.api.transform.analysis.SequenceDataAnalysis`"
  (^org.datavec.api.transform.analysis.SequenceDataAnalysis [^org.datavec.api.transform.schema.Schema schema ^org.apache.spark.api.java.JavaRDD data ^Integer max-histogram-buckets]
    (AnalyzeSpark/analyzeSequence schema data max-histogram-buckets))
  (^org.datavec.api.transform.analysis.SequenceDataAnalysis [^org.datavec.api.transform.schema.Schema schema ^org.apache.spark.api.java.JavaRDD data]
    (AnalyzeSpark/analyzeSequence schema data)))

(defn *sample
  "Randomly sample a set of examples

  count - Number of samples to generate - `int`
  data - Data to sample from - `org.apache.spark.api.java.JavaRDD`

  returns: Samples - `java.util.List<java.util.List<org.datavec.api.writable.Writable>>`"
  (^java.util.List [^Integer count ^org.apache.spark.api.java.JavaRDD data]
    (AnalyzeSpark/sample count data)))

(defn *sample-sequence
  "Randomly sample a number of sequences from the data

  count - Number of sequences to sample - `int`
  data - Data to sample from - `org.apache.spark.api.java.JavaRDD`

  returns: Sequence samples - `java.util.List<java.util.List<java.util.List<org.datavec.api.writable.Writable>>>`"
  (^java.util.List [^Integer count ^org.apache.spark.api.java.JavaRDD data]
    (AnalyzeSpark/sampleSequence count data)))

