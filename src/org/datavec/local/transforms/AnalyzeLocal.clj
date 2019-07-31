(ns org.datavec.local.transforms.AnalyzeLocal
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.local.transforms AnalyzeLocal]))

(defn ->analyze-local
  "Constructor."
  (^AnalyzeLocal []
    (new AnalyzeLocal )))

(defn *analyze
  "Analyse the specified data - returns a DataAnalysis object with summary information about each column

  schema - Schema for data - `org.datavec.api.transform.schema.Schema`
  rr - Data to analyze - `org.datavec.api.records.reader.RecordReader`
  max-histogram-buckets - `int`

  returns: DataAnalysis for data - `org.datavec.api.transform.analysis.DataAnalysis`"
  (^org.datavec.api.transform.analysis.DataAnalysis [^org.datavec.api.transform.schema.Schema schema ^org.datavec.api.records.reader.RecordReader rr ^Integer max-histogram-buckets]
    (AnalyzeLocal/analyze schema rr max-histogram-buckets))
  (^org.datavec.api.transform.analysis.DataAnalysis [^org.datavec.api.transform.schema.Schema schema ^org.datavec.api.records.reader.RecordReader rr]
    (AnalyzeLocal/analyze schema rr)))

(defn *analyze-quality-sequence
  "Analyze the data quality of sequence data - provides a report on missing values, values that don't comply with schema, etc

  schema - Schema for data - `org.datavec.api.transform.schema.Schema`
  data - Data to analyze - `org.datavec.api.records.reader.SequenceRecordReader`

  returns: DataQualityAnalysis object - `org.datavec.api.transform.quality.DataQualityAnalysis`"
  (^org.datavec.api.transform.quality.DataQualityAnalysis [^org.datavec.api.transform.schema.Schema schema ^org.datavec.api.records.reader.SequenceRecordReader data]
    (AnalyzeLocal/analyzeQualitySequence schema data)))

(defn *analyze-quality
  "Analyze the data quality of data - provides a report on missing values, values that don't comply with schema, etc

  schema - Schema for data - `org.datavec.api.transform.schema.Schema`
  data - Data to analyze - `org.datavec.api.records.reader.RecordReader`

  returns: DataQualityAnalysis object - `org.datavec.api.transform.quality.DataQualityAnalysis`"
  (^org.datavec.api.transform.quality.DataQualityAnalysis [^org.datavec.api.transform.schema.Schema schema ^org.datavec.api.records.reader.RecordReader data]
    (AnalyzeLocal/analyzeQuality schema data)))

(defn *get-unique
  "Get a list of unique values from the specified columns.
  For sequence data, use getUniqueSequence(List, Schema, SequenceRecordReader)

  column-name - Name of the column to get unique values from - `java.lang.String`
  schema - Data schema - `org.datavec.api.transform.schema.Schema`
  data - Data to get unique values from - `org.datavec.api.records.reader.RecordReader`

  returns: List of unique values - `java.util.Set<org.datavec.api.writable.Writable>`"
  (^java.util.Set [^java.lang.String column-name ^org.datavec.api.transform.schema.Schema schema ^org.datavec.api.records.reader.RecordReader data]
    (AnalyzeLocal/getUnique column-name schema data)))

(defn *get-unique-sequence
  "Get a list of unique values from the specified column of a sequence

  column-name - Name of the column to get unique values from - `java.lang.String`
  schema - Data schema - `org.datavec.api.transform.schema.Schema`
  sequence-data - Sequence data to get unique values from - `org.datavec.api.records.reader.SequenceRecordReader`

  returns: `java.util.Set<org.datavec.api.writable.Writable>`"
  (^java.util.Set [^java.lang.String column-name ^org.datavec.api.transform.schema.Schema schema ^org.datavec.api.records.reader.SequenceRecordReader sequence-data]
    (AnalyzeLocal/getUniqueSequence column-name schema sequence-data)))

