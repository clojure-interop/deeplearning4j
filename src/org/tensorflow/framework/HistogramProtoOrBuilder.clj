(ns org.tensorflow.framework.HistogramProtoOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework HistogramProtoOrBuilder]))

(defn get-num
  "double num = 3;

  returns: `double`"
  (^Double [^HistogramProtoOrBuilder this]
    (-> this (.getNum))))

(defn get-bucket-count
  "repeated double bucket = 7 [packed = true];

  returns: `int`"
  (^Integer [^HistogramProtoOrBuilder this]
    (-> this (.getBucketCount))))

(defn get-sum
  "double sum = 4;

  returns: `double`"
  (^Double [^HistogramProtoOrBuilder this]
    (-> this (.getSum))))

(defn get-min
  "double min = 1;

  returns: `double`"
  (^Double [^HistogramProtoOrBuilder this]
    (-> this (.getMin))))

(defn get-max
  "double max = 2;

  returns: `double`"
  (^Double [^HistogramProtoOrBuilder this]
    (-> this (.getMax))))

(defn get-bucket-list
  "repeated double bucket = 7 [packed = true];

  returns: `java.util.List<java.lang.Double>`"
  (^java.util.List [^HistogramProtoOrBuilder this]
    (-> this (.getBucketList))))

(defn get-bucket-limit-count
  "Parallel arrays encoding the bucket boundaries and the bucket values.
   bucket(i) is the count for the bucket i.  The range for
   a bucket is:
     i == 0:  -DBL_MAX .. bucket_limit(0)
     i != 0:  bucket_limit(i-1) .. bucket_limit(i)
  repeated double bucket_limit = 6 [packed = true];

  returns: `int`"
  (^Integer [^HistogramProtoOrBuilder this]
    (-> this (.getBucketLimitCount))))

(defn get-bucket-limit
  "Parallel arrays encoding the bucket boundaries and the bucket values.
   bucket(i) is the count for the bucket i.  The range for
   a bucket is:
     i == 0:  -DBL_MAX .. bucket_limit(0)
     i != 0:  bucket_limit(i-1) .. bucket_limit(i)
  repeated double bucket_limit = 6 [packed = true];

  index - `int`

  returns: `double`"
  (^Double [^HistogramProtoOrBuilder this ^Integer index]
    (-> this (.getBucketLimit index))))

(defn get-bucket
  "repeated double bucket = 7 [packed = true];

  index - `int`

  returns: `double`"
  (^Double [^HistogramProtoOrBuilder this ^Integer index]
    (-> this (.getBucket index))))

(defn get-bucket-limit-list
  "Parallel arrays encoding the bucket boundaries and the bucket values.
   bucket(i) is the count for the bucket i.  The range for
   a bucket is:
     i == 0:  -DBL_MAX .. bucket_limit(0)
     i != 0:  bucket_limit(i-1) .. bucket_limit(i)
  repeated double bucket_limit = 6 [packed = true];

  returns: `java.util.List<java.lang.Double>`"
  (^java.util.List [^HistogramProtoOrBuilder this]
    (-> this (.getBucketLimitList))))

(defn get-sum-squares
  "double sum_squares = 5;

  returns: `double`"
  (^Double [^HistogramProtoOrBuilder this]
    (-> this (.getSumSquares))))

