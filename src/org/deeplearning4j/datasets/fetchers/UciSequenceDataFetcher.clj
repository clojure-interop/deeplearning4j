(ns org.deeplearning4j.datasets.fetchers.UciSequenceDataFetcher
  "Fetcher for UCI synthetic control chart time series dataset.
 Details: https://archive.ics.uci.edu/ml/datasets/Synthetic+Control+Chart+Time+Series
 Data: https://archive.ics.uci.edu/ml/machine-learning-databases/synthetic_control-mld/synthetic_control.data
 Image: https://archive.ics.uci.edu/ml/machine-learning-databases/synthetic_control-mld/data.jpeg"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.datasets.fetchers UciSequenceDataFetcher]))

(defn ->uci-sequence-data-fetcher
  "Constructor."
  (^UciSequenceDataFetcher []
    (new UciSequenceDataFetcher )))

(defn *-num-labels
  "Static Field.

  type: int"
  []
  UciSequenceDataFetcher/NUM_LABELS)

(defn *-num-examples
  "Static Field.

  type: int"
  []
  UciSequenceDataFetcher/NUM_EXAMPLES)

(defn *set-url
  "url - `java.lang.String`"
  ([^java.lang.String url]
    (UciSequenceDataFetcher/setURL url)))

(defn remote-data-url
  "type - `org.deeplearning4j.datasets.fetchers.DataSetType`

  returns: `java.lang.String`"
  (^java.lang.String [^UciSequenceDataFetcher this ^org.deeplearning4j.datasets.fetchers.DataSetType type]
    (-> this (.remoteDataUrl type)))
  (^java.lang.String [^UciSequenceDataFetcher this]
    (-> this (.remoteDataUrl))))

(defn local-cache-name
  "returns: `java.lang.String`"
  (^java.lang.String [^UciSequenceDataFetcher this]
    (-> this (.localCacheName))))

(defn expected-checksum
  "type - `org.deeplearning4j.datasets.fetchers.DataSetType`

  returns: `long`"
  (^Long [^UciSequenceDataFetcher this ^org.deeplearning4j.datasets.fetchers.DataSetType type]
    (-> this (.expectedChecksum type)))
  (^Long [^UciSequenceDataFetcher this]
    (-> this (.expectedChecksum))))

(defn get-record-reader
  "rng-seed - `long`
  shape - `int[]`
  set - `org.deeplearning4j.datasets.fetchers.DataSetType`
  transform - `org.datavec.image.transform.ImageTransform`

  returns: `org.datavec.api.records.reader.impl.csv.CSVSequenceRecordReader`"
  (^org.datavec.api.records.reader.impl.csv.CSVSequenceRecordReader [^UciSequenceDataFetcher this ^Long rng-seed shape ^org.deeplearning4j.datasets.fetchers.DataSetType set ^org.datavec.image.transform.ImageTransform transform]
    (-> this (.getRecordReader rng-seed shape set transform)))
  (^org.datavec.api.records.reader.impl.csv.CSVSequenceRecordReader [^UciSequenceDataFetcher this ^Long rng-seed ^org.deeplearning4j.datasets.fetchers.DataSetType set]
    (-> this (.getRecordReader rng-seed set))))

