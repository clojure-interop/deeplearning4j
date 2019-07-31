(ns org.deeplearning4j.datasets.fetchers.SvhnDataFetcher
  "The Street View House Numbers (SVHN) Dataset is a real-world image dataset for developing machine learning
 and object recognition algorithms with minimal requirement on data preprocessing and formatting.
 The SVHN datasets contain 10 classes (digits) with 73257 digits for training, 26032 digits for testing, and 531131 extra.
 Datasets in \"Format 1: Full Numbers\" are fetched.
 See: http://ufldl.stanford.edu/housenumbers/"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.datasets.fetchers SvhnDataFetcher]))

(defn ->svhn-data-fetcher
  "Constructor."
  (^SvhnDataFetcher []
    (new SvhnDataFetcher )))

(defn *-num-labels
  "Static Field.

  type: int"
  []
  SvhnDataFetcher/NUM_LABELS)

(defn *set-base-url
  "base-url - `java.lang.String`"
  ([^java.lang.String base-url]
    (SvhnDataFetcher/setBaseUrl base-url)))

(defn remote-data-url
  "set - `org.deeplearning4j.datasets.fetchers.DataSetType`

  returns: `java.lang.String`"
  (^java.lang.String [^SvhnDataFetcher this ^org.deeplearning4j.datasets.fetchers.DataSetType set]
    (-> this (.remoteDataUrl set))))

(defn local-cache-name
  "returns: `java.lang.String`"
  (^java.lang.String [^SvhnDataFetcher this]
    (-> this (.localCacheName))))

(defn data-set-name
  "set - `org.deeplearning4j.datasets.fetchers.DataSetType`

  returns: `java.lang.String`"
  (^java.lang.String [^SvhnDataFetcher this ^org.deeplearning4j.datasets.fetchers.DataSetType set]
    (-> this (.dataSetName set))))

(defn expected-checksum
  "set - `org.deeplearning4j.datasets.fetchers.DataSetType`

  returns: `long`"
  (^Long [^SvhnDataFetcher this ^org.deeplearning4j.datasets.fetchers.DataSetType set]
    (-> this (.expectedChecksum set))))

(defn get-data-set-path
  "set - `org.deeplearning4j.datasets.fetchers.DataSetType`

  returns: `java.io.File`

  throws: java.io.IOException"
  (^java.io.File [^SvhnDataFetcher this ^org.deeplearning4j.datasets.fetchers.DataSetType set]
    (-> this (.getDataSetPath set))))

(defn get-record-reader
  "rng-seed - `long`
  img-dim - `int[]`
  set - `org.deeplearning4j.datasets.fetchers.DataSetType`
  image-transform - `org.datavec.image.transform.ImageTransform`

  returns: `org.datavec.api.records.reader.RecordReader`"
  (^org.datavec.api.records.reader.RecordReader [^SvhnDataFetcher this ^Long rng-seed img-dim ^org.deeplearning4j.datasets.fetchers.DataSetType set ^org.datavec.image.transform.ImageTransform image-transform]
    (-> this (.getRecordReader rng-seed img-dim set image-transform))))

