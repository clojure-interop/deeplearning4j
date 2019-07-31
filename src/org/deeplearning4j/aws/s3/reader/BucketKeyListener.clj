(ns org.deeplearning4j.aws.s3.reader.BucketKeyListener
  "When paginating through a result applyTransformToDestination,
 allows the user to react to a bucket result being found"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.aws.s3.reader BucketKeyListener]))

(defn on-key
  "s-3 - an s3 client - `com.amazonaws.services.s3.AmazonS3`
  bucket - the bucket being iterated on - `java.lang.String`
  key - the current key - `java.lang.String`"
  ([^BucketKeyListener this ^com.amazonaws.services.s3.AmazonS3 s-3 ^java.lang.String bucket ^java.lang.String key]
    (-> this (.onKey s-3 bucket key))))

