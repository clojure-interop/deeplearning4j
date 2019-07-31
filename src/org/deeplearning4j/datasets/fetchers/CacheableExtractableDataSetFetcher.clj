(ns org.deeplearning4j.datasets.fetchers.CacheableExtractableDataSetFetcher
  "Abstract class for enabling dataset downloading and local caching."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.datasets.fetchers CacheableExtractableDataSetFetcher]))

(defn ->cacheable-extractable-data-set-fetcher
  "Constructor."
  (^CacheableExtractableDataSetFetcher []
    (new CacheableExtractableDataSetFetcher )))

(defn data-set-name
  "set - `org.deeplearning4j.datasets.fetchers.DataSetType`

  returns: `java.lang.String`"
  (^java.lang.String [^CacheableExtractableDataSetFetcher this ^org.deeplearning4j.datasets.fetchers.DataSetType set]
    (-> this (.dataSetName set))))

(defn remote-data-url
  "set - `org.deeplearning4j.datasets.fetchers.DataSetType`

  returns: `java.lang.String`"
  (^java.lang.String [^CacheableExtractableDataSetFetcher this ^org.deeplearning4j.datasets.fetchers.DataSetType set]
    (-> this (.remoteDataUrl set)))
  (^java.lang.String [^CacheableExtractableDataSetFetcher this]
    (-> this (.remoteDataUrl))))

(defn expected-checksum
  "set - `org.deeplearning4j.datasets.fetchers.DataSetType`

  returns: `long`"
  (^Long [^CacheableExtractableDataSetFetcher this ^org.deeplearning4j.datasets.fetchers.DataSetType set]
    (-> this (.expectedChecksum set)))
  (^Long [^CacheableExtractableDataSetFetcher this]
    (-> this (.expectedChecksum))))

(defn download-and-extract
  "Downloads and extracts the local dataset.

  set - `org.deeplearning4j.datasets.fetchers.DataSetType`

  throws: java.io.IOException"
  ([^CacheableExtractableDataSetFetcher this ^org.deeplearning4j.datasets.fetchers.DataSetType set]
    (-> this (.downloadAndExtract set)))
  ([^CacheableExtractableDataSetFetcher this]
    (-> this (.downloadAndExtract))))

(defn cached?
  "Returns a boolean indicating if the dataset is already cached locally.

  returns: boolean - `boolean`"
  (^Boolean [^CacheableExtractableDataSetFetcher this]
    (-> this (.isCached))))

(defn local-cache-name
  "returns: `java.lang.String`"
  (^java.lang.String [^CacheableExtractableDataSetFetcher this]
    (-> this (.localCacheName))))

(defn get-record-reader
  "rng-seed - `long`
  img-dim - `int[]`
  set - `org.deeplearning4j.datasets.fetchers.DataSetType`
  image-transform - `org.datavec.image.transform.ImageTransform`

  returns: `org.datavec.api.records.reader.RecordReader`"
  (^org.datavec.api.records.reader.RecordReader [^CacheableExtractableDataSetFetcher this ^Long rng-seed img-dim ^org.deeplearning4j.datasets.fetchers.DataSetType set ^org.datavec.image.transform.ImageTransform image-transform]
    (-> this (.getRecordReader rng-seed img-dim set image-transform))))

