(ns org.deeplearning4j.aws.s3.reader.BucketIterator
  "Iterator over individual S3 bucket"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.aws.s3.reader BucketIterator]))

(defn ->bucket-iterator
  "Constructor.

  bucket - `java.lang.String`
  s-3 - `org.deeplearning4j.aws.s3.reader.S3Downloader`"
  (^BucketIterator [^java.lang.String bucket ^org.deeplearning4j.aws.s3.reader.S3Downloader s-3]
    (new BucketIterator bucket s-3))
  (^BucketIterator [^java.lang.String bucket]
    (new BucketIterator bucket)))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^BucketIterator this]
    (-> this (.hasNext))))

(defn next
  "returns: `java.io.InputStream`"
  (^java.io.InputStream [^BucketIterator this]
    (-> this (.next))))

(defn remove
  ""
  ([^BucketIterator this]
    (-> this (.remove))))

