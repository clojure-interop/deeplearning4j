(ns org.deeplearning4j.aws.s3.BaseS3
  "The S3 Credentials works via discovering the credentials
 from the system properties (passed in via -D or System wide)
 If you invoke the JVM with -Dorg.deeplearning4j.aws.accessKey=YOUR_ACCESS_KEY
 and -Dorg.deeplearning4j.aws.accessSecret=YOUR_SECRET_KEY
 this will pick up the credentials from there, otherwise it will also attempt to look in
 the system environment for the following variables:
 AWS_ACCESS_KEY_ID
 AWS_SECRET_ACCESS_KEY"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.aws.s3 BaseS3]))

(defn ->base-s-3
  "Constructor.

  file - `java.io.File`

  throws: java.lang.Exception"
  (^BaseS3 [^java.io.File file]
    (new BaseS3 file))
  (^BaseS3 []
    (new BaseS3 )))

(def *-access-key
  "Static Constant.

  type: java.lang.String"
  BaseS3/ACCESS_KEY)

(def *-access-secret
  "Static Constant.

  type: java.lang.String"
  BaseS3/ACCESS_SECRET)

(def *-aws-access-key
  "Static Constant.

  type: java.lang.String"
  BaseS3/AWS_ACCESS_KEY)

(def *-aws-secret-key
  "Static Constant.

  type: java.lang.String"
  BaseS3/AWS_SECRET_KEY)

(defn get-creds
  "returns: `com.amazonaws.auth.AWSCredentials`"
  (^com.amazonaws.auth.AWSCredentials [^BaseS3 this]
    (-> this (.getCreds))))

(defn set-creds
  "creds - `com.amazonaws.auth.AWSCredentials`"
  ([^BaseS3 this ^com.amazonaws.auth.AWSCredentials creds]
    (-> this (.setCreds creds))))

(defn get-client
  "returns: `com.amazonaws.services.s3.AmazonS3`"
  (^com.amazonaws.services.s3.AmazonS3 [^BaseS3 this]
    (-> this (.getClient))))

(defn get-ec-2
  "returns: `com.amazonaws.services.ec2.AmazonEC2`"
  (^com.amazonaws.services.ec2.AmazonEC2 [^BaseS3 this]
    (-> this (.getEc2))))

