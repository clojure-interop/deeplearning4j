(ns org.deeplearning4j.aws.s3.reader.S3Downloader
  "Downloads files from S3"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.aws.s3.reader S3Downloader]))

(defn ->s-3-downloader
  "Constructor."
  (^S3Downloader []
    (new S3Downloader )))

(defn next-list
  "Iterator style one list at a time

  list - the list to get the next batch for - `com.amazonaws.services.s3.model.ObjectListing`

  returns: the next batch of objects or null if
  none are left - `com.amazonaws.services.s3.model.ObjectListing`"
  (^com.amazonaws.services.s3.model.ObjectListing [^S3Downloader this ^com.amazonaws.services.s3.model.ObjectListing list]
    (-> this (.nextList list))))

(defn buckets
  "Returns the list of buckets in s3

  returns: the list of buckets - `java.util.List<java.lang.String>`"
  (^java.util.List [^S3Downloader this]
    (-> this (.buckets))))

(defn download
  "bucket - `java.lang.String`
  key - `java.lang.String`
  to - `java.io.File`

  throws: java.io.IOException"
  ([^S3Downloader this ^java.lang.String bucket ^java.lang.String key ^java.io.File to]
    (-> this (.download bucket key to))))

(defn keys-for-bucket
  "Return the keys for a bucket

  bucket - the bucket to get the keys for - `java.lang.String`

  returns: the bucket's keys - `java.util.List<java.lang.String>`"
  (^java.util.List [^S3Downloader this ^java.lang.String bucket]
    (-> this (.keysForBucket bucket))))

(defn object-for-key
  "Returns an input stream for the given bucket and key

  bucket - the bucket to retrieve from - `java.lang.String`
  key - the key of the objec t - `java.lang.String`

  returns: an input stream to the object - `java.io.InputStream`"
  (^java.io.InputStream [^S3Downloader this ^java.lang.String bucket ^java.lang.String key]
    (-> this (.objectForKey bucket key))))

(defn paginate
  "Paginates through a bucket's keys invoking the listener
  at each key

  bucket - the bucket to iterate - `java.lang.String`
  listener - the listener - `org.deeplearning4j.aws.s3.reader.BucketKeyListener`"
  ([^S3Downloader this ^java.lang.String bucket ^org.deeplearning4j.aws.s3.reader.BucketKeyListener listener]
    (-> this (.paginate bucket listener))))

(defn iterate-bucket
  "Iterate over individual buckets.
  Returns input streams to each object.
  It is your responsibility to close the input streams

  bucket - the bucket to iterate over - `java.lang.String`

  returns: an iterator over the objects in an s3 bucket - `java.util.Iterator<java.io.InputStream>`"
  (^java.util.Iterator [^S3Downloader this ^java.lang.String bucket]
    (-> this (.iterateBucket bucket))))

(defn list-objects
  "Simple way of retrieving the listings for a bucket

  bucket - the bucket to retrieve listings for - `java.lang.String`

  returns: the object listing for this bucket - `com.amazonaws.services.s3.model.ObjectListing`"
  (^com.amazonaws.services.s3.model.ObjectListing [^S3Downloader this ^java.lang.String bucket]
    (-> this (.listObjects bucket))))

(defn download-folder
  "bucket-name - `java.lang.String`
  key-prefix - `java.lang.String`
  folder-path - `java.io.File`

  returns: `com.amazonaws.services.s3.transfer.MultipleFileDownload`"
  (^com.amazonaws.services.s3.transfer.MultipleFileDownload [^S3Downloader this ^java.lang.String bucket-name ^java.lang.String key-prefix ^java.io.File folder-path]
    (-> this (.downloadFolder bucket-name key-prefix folder-path))))

