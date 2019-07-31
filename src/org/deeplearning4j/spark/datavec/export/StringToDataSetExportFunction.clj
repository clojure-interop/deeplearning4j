(ns org.deeplearning4j.spark.datavec.export.StringToDataSetExportFunction
  "A function (used in forEachPartition) to convert Strings to DataSet objects using a RecordReader (such as a CSVRecordReader).
 Use with JavaRDD<String>.foreachPartition()"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.datavec.export StringToDataSetExportFunction]))

(defn ->string-to-data-set-export-function
  "Constructor.

  output-dir - `java.net.URI`
  record-reader - `org.datavec.api.records.reader.RecordReader`
  batch-size - `int`
  regression - `boolean`
  label-index - `int`
  num-possible-labels - `int`"
  (^StringToDataSetExportFunction [^java.net.URI output-dir ^org.datavec.api.records.reader.RecordReader record-reader ^Integer batch-size ^Boolean regression ^Integer label-index ^Integer num-possible-labels]
    (new StringToDataSetExportFunction output-dir record-reader batch-size regression label-index num-possible-labels)))

(defn call
  "string-iterator - `java.util.Iterator`

  throws: java.lang.Exception"
  ([^StringToDataSetExportFunction this ^java.util.Iterator string-iterator]
    (-> this (.call string-iterator))))

