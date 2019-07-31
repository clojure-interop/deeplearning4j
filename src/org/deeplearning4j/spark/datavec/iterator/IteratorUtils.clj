(ns org.deeplearning4j.spark.datavec.iterator.IteratorUtils
  "Utilities for working with RDDs and RecordReaderMultiDataSetIterator"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.datavec.iterator IteratorUtils]))

(defn ->iterator-utils
  "Constructor."
  (^IteratorUtils []
    (new IteratorUtils )))

(defn *map-rrmdsi
  "Apply to an arbitrary mix of non-sequence and sequence data, in the form of JavaRDD<List<Writable>>
  and JavaRDD<List<List<Writable>>>.
  Note: this method performs a join by key. To perform this, we require that each record (and every step of
  sequence records) contain the same key value (could be any Writable).
  NOTE: The RecordReaderMultiDataSetIterator must use SparkSourceDummyReader and
  SparkSourceDummySeqReader instances in place of \"real\" RecordReader and SequenceRecordReader instances

  rdds - RDD with non-sequence data. May be null. - `java.util.List`
  seq-rdds - RDDs with sequence data. May be null. - `java.util.List`
  rdds-key-columns - Column indices for the keys in the (non-sequence) RDDs data - `int[]`
  seq-rdds-key-columns - Column indices for the keys in the sequence RDDs data - `int[]`
  filter-missing - If true: filter out any records that don't have matching keys in all RDDs - `boolean`
  iterator - RecordReaderMultiDataSetIterator with SparkSourceDummyReader and SparkSourceDummySeqReaderreaders - `org.deeplearning4j.datasets.datavec.RecordReaderMultiDataSetIterator`

  returns: `org.apache.spark.api.java.JavaRDD<org.nd4j.linalg.dataset.api.MultiDataSet>`"
  (^org.apache.spark.api.java.JavaRDD [^java.util.List rdds ^java.util.List seq-rdds rdds-key-columns seq-rdds-key-columns ^Boolean filter-missing ^org.deeplearning4j.datasets.datavec.RecordReaderMultiDataSetIterator iterator]
    (IteratorUtils/mapRRMDSI rdds seq-rdds rdds-key-columns seq-rdds-key-columns filter-missing iterator))
  (^org.apache.spark.api.java.JavaRDD [^org.apache.spark.api.java.JavaRDD rdd ^org.deeplearning4j.datasets.datavec.RecordReaderMultiDataSetIterator iterator]
    (IteratorUtils/mapRRMDSI rdd iterator)))

(defn *map-rrmdsi-seq
  "Apply a single sequence reader RecordReaderMultiDataSetIterator to sequence data, in the form of
  JavaRDD<List<List<Writable>>>.
  NOTE: The RecordReaderMultiDataSetIterator must use SparkSourceDummySeqReader in place of
  \"real\" SequenceRecordReader instances

  rdd - RDD with writables - `org.apache.spark.api.java.JavaRDD`
  iterator - RecordReaderMultiDataSetIterator with SparkSourceDummySeqReader sequence readers - `org.deeplearning4j.datasets.datavec.RecordReaderMultiDataSetIterator`

  returns: `org.apache.spark.api.java.JavaRDD<org.nd4j.linalg.dataset.api.MultiDataSet>`"
  (^org.apache.spark.api.java.JavaRDD [^org.apache.spark.api.java.JavaRDD rdd ^org.deeplearning4j.datasets.datavec.RecordReaderMultiDataSetIterator iterator]
    (IteratorUtils/mapRRMDSISeq rdd iterator)))

(defn *map-rrmdsi-records
  "rdd - `org.apache.spark.api.java.JavaRDD`
  iterator - `org.deeplearning4j.datasets.datavec.RecordReaderMultiDataSetIterator`

  returns: `org.apache.spark.api.java.JavaRDD<org.nd4j.linalg.dataset.api.MultiDataSet>`"
  (^org.apache.spark.api.java.JavaRDD [^org.apache.spark.api.java.JavaRDD rdd ^org.deeplearning4j.datasets.datavec.RecordReaderMultiDataSetIterator iterator]
    (IteratorUtils/mapRRMDSIRecords rdd iterator)))

