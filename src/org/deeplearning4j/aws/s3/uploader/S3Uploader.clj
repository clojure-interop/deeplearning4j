(ns org.deeplearning4j.aws.s3.uploader.S3Uploader
  "Uploads files to S3"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.aws.s3.uploader S3Uploader]))

(defn ->s-3-uploader
  "Constructor."
  (^S3Uploader []
    (new S3Uploader )))

(defn multi-part-upload
  "Multi part upload for big files

  file - the file to upload - `java.io.File`
  bucket-name - the bucket name to upload - `java.lang.String`"
  ([^S3Uploader this ^java.io.File file ^java.lang.String bucket-name]
    (-> this (.multiPartUpload file bucket-name))))

(defn upload
  "Upload the file to the bucket.
  Will create the bucket if it hasn't already been created

  file - the file to upload - `java.io.File`
  bucket-name - the name of the bucket - `java.lang.String`"
  ([^S3Uploader this ^java.io.File file ^java.lang.String bucket-name]
    (-> this (.upload file bucket-name)))
  ([^S3Uploader this ^java.io.File file ^java.lang.String name ^java.lang.String bucket-name]
    (-> this (.upload file name bucket-name))))

(defn upload-folder
  "bucket-name - `java.lang.String`
  key-prefix - `java.lang.String`
  folder-path - `java.io.File`
  include-sub-dir - `boolean`

  returns: `com.amazonaws.services.s3.transfer.MultipleFileUpload`"
  (^com.amazonaws.services.s3.transfer.MultipleFileUpload [^S3Uploader this ^java.lang.String bucket-name ^java.lang.String key-prefix ^java.io.File folder-path ^Boolean include-sub-dir]
    (-> this (.uploadFolder bucket-name key-prefix folder-path include-sub-dir))))

(defn upload-file-list
  "bucket-name - `java.lang.String`
  folder-path - `java.io.File`
  file-list - `java.util.List`
  key-prefix - `java.lang.String`

  returns: `com.amazonaws.services.s3.transfer.MultipleFileUpload`"
  (^com.amazonaws.services.s3.transfer.MultipleFileUpload [^S3Uploader this ^java.lang.String bucket-name ^java.io.File folder-path ^java.util.List file-list ^java.lang.String key-prefix]
    (-> this (.uploadFileList bucket-name folder-path file-list key-prefix))))

