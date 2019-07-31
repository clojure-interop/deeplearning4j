(ns org.deeplearning4j.aws.s3.reader.BaseS3DataSetIterator
  "baseline data applyTransformToDestination iterator for"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.aws.s3.reader BaseS3DataSetIterator]))

(defn ->base-s-3-data-set-iterator
  "Constructor."
  (^BaseS3DataSetIterator []
    (new BaseS3DataSetIterator )))

(defn next-object
  "returns: `java.io.InputStream`"
  (^java.io.InputStream [^BaseS3DataSetIterator this]
    (-> this (.nextObject))))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^BaseS3DataSetIterator this]
    (-> this (.hasNext))))

(defn curr-bucket
  "returns: `java.lang.String`"
  (^java.lang.String [^BaseS3DataSetIterator this]
    (-> this (.currBucket))))

(defn next-bucket
  ""
  ([^BaseS3DataSetIterator this]
    (-> this (.nextBucket))))

