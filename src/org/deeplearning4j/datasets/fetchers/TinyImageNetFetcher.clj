(ns org.deeplearning4j.datasets.fetchers.TinyImageNetFetcher
  "Tiny ImageNet is a subset of the ImageNet database. TinyImageNet is the default course challenge for CS321n
 at Stanford University.
 Tiny ImageNet has 200 classes, each consisting of 500 training images.
 See: http://cs231n.stanford.edu/ and
 https://tiny-imagenet.herokuapp.com/"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.datasets.fetchers TinyImageNetFetcher]))

(defn ->tiny-image-net-fetcher
  "Constructor."
  (^TinyImageNetFetcher []
    (new TinyImageNetFetcher )))

(defn *-input-width
  "Static Field.

  type: int"
  []
  TinyImageNetFetcher/INPUT_WIDTH)

(defn *-input-height
  "Static Field.

  type: int"
  []
  TinyImageNetFetcher/INPUT_HEIGHT)

(defn *-input-channels
  "Static Field.

  type: int"
  []
  TinyImageNetFetcher/INPUT_CHANNELS)

(defn *-num-labels
  "Static Field.

  type: int"
  []
  TinyImageNetFetcher/NUM_LABELS)

(defn *-num-examples
  "Static Field.

  type: int"
  []
  TinyImageNetFetcher/NUM_EXAMPLES)

(defn remote-data-url
  "set - `org.deeplearning4j.datasets.fetchers.DataSetType`

  returns: `java.lang.String`"
  (^java.lang.String [^TinyImageNetFetcher this ^org.deeplearning4j.datasets.fetchers.DataSetType set]
    (-> this (.remoteDataUrl set))))

(defn local-cache-name
  "returns: `java.lang.String`"
  (^java.lang.String [^TinyImageNetFetcher this]
    (-> this (.localCacheName))))

(defn expected-checksum
  "set - `org.deeplearning4j.datasets.fetchers.DataSetType`

  returns: `long`"
  (^Long [^TinyImageNetFetcher this ^org.deeplearning4j.datasets.fetchers.DataSetType set]
    (-> this (.expectedChecksum set))))

(defn get-record-reader
  "rng-seed - `long`
  img-dim - `int[]`
  set - `org.deeplearning4j.datasets.fetchers.DataSetType`
  image-transform - `org.datavec.image.transform.ImageTransform`

  returns: `org.datavec.api.records.reader.RecordReader`"
  (^org.datavec.api.records.reader.RecordReader [^TinyImageNetFetcher this ^Long rng-seed img-dim ^org.deeplearning4j.datasets.fetchers.DataSetType set ^org.datavec.image.transform.ImageTransform image-transform]
    (-> this (.getRecordReader rng-seed img-dim set image-transform))))

