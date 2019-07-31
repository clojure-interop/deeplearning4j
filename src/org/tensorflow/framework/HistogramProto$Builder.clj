(ns org.tensorflow.framework.HistogramProto$Builder
  " Serialization format for histogram module in
  core/lib/histogram/histogram.h
 Protobuf type tensorflow.HistogramProto"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework HistogramProto$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (HistogramProto$Builder/getDescriptor )))

(defn set-num
  "double num = 3;

  value - `double`

  returns: `org.tensorflow.framework.HistogramProto$Builder`"
  (^org.tensorflow.framework.HistogramProto$Builder [^HistogramProto$Builder this ^Double value]
    (-> this (.setNum value))))

(defn clear-bucket
  "repeated double bucket = 7 [packed = true];

  returns: `org.tensorflow.framework.HistogramProto$Builder`"
  (^org.tensorflow.framework.HistogramProto$Builder [^HistogramProto$Builder this]
    (-> this (.clearBucket))))

(defn clear-bucket-limit
  "Parallel arrays encoding the bucket boundaries and the bucket values.
   bucket(i) is the count for the bucket i.  The range for
   a bucket is:
     i == 0:  -DBL_MAX .. bucket_limit(0)
     i != 0:  bucket_limit(i-1) .. bucket_limit(i)
  repeated double bucket_limit = 6 [packed = true];

  returns: `org.tensorflow.framework.HistogramProto$Builder`"
  (^org.tensorflow.framework.HistogramProto$Builder [^HistogramProto$Builder this]
    (-> this (.clearBucketLimit))))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.HistogramProto$Builder`"
  (^org.tensorflow.framework.HistogramProto$Builder [^HistogramProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn get-num
  "double num = 3;

  returns: `double`"
  (^Double [^HistogramProto$Builder this]
    (-> this (.getNum))))

(defn build-partial
  "returns: `org.tensorflow.framework.HistogramProto`"
  (^org.tensorflow.framework.HistogramProto [^HistogramProto$Builder this]
    (-> this (.buildPartial))))

(defn set-sum
  "double sum = 4;

  value - `double`

  returns: `org.tensorflow.framework.HistogramProto$Builder`"
  (^org.tensorflow.framework.HistogramProto$Builder [^HistogramProto$Builder this ^Double value]
    (-> this (.setSum value))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^HistogramProto$Builder this]
    (-> this (.isInitialized))))

(defn get-bucket-count
  "repeated double bucket = 7 [packed = true];

  returns: `int`"
  (^Integer [^HistogramProto$Builder this]
    (-> this (.getBucketCount))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.HistogramProto`"
  (^org.tensorflow.framework.HistogramProto [^HistogramProto$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn get-sum
  "double sum = 4;

  returns: `double`"
  (^Double [^HistogramProto$Builder this]
    (-> this (.getSum))))

(defn clear-max
  "double max = 2;

  returns: `org.tensorflow.framework.HistogramProto$Builder`"
  (^org.tensorflow.framework.HistogramProto$Builder [^HistogramProto$Builder this]
    (-> this (.clearMax))))

(defn get-min
  "double min = 1;

  returns: `double`"
  (^Double [^HistogramProto$Builder this]
    (-> this (.getMin))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.HistogramProto$Builder`"
  (^org.tensorflow.framework.HistogramProto$Builder [^HistogramProto$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn set-sum-squares
  "double sum_squares = 5;

  value - `double`

  returns: `org.tensorflow.framework.HistogramProto$Builder`"
  (^org.tensorflow.framework.HistogramProto$Builder [^HistogramProto$Builder this ^Double value]
    (-> this (.setSumSquares value))))

(defn set-max
  "double max = 2;

  value - `double`

  returns: `org.tensorflow.framework.HistogramProto$Builder`"
  (^org.tensorflow.framework.HistogramProto$Builder [^HistogramProto$Builder this ^Double value]
    (-> this (.setMax value))))

(defn clear-sum-squares
  "double sum_squares = 5;

  returns: `org.tensorflow.framework.HistogramProto$Builder`"
  (^org.tensorflow.framework.HistogramProto$Builder [^HistogramProto$Builder this]
    (-> this (.clearSumSquares))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `org.tensorflow.framework.HistogramProto$Builder`"
  (^org.tensorflow.framework.HistogramProto$Builder [^HistogramProto$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn get-max
  "double max = 2;

  returns: `double`"
  (^Double [^HistogramProto$Builder this]
    (-> this (.getMax))))

(defn get-bucket-list
  "repeated double bucket = 7 [packed = true];

  returns: `java.util.List<java.lang.Double>`"
  (^java.util.List [^HistogramProto$Builder this]
    (-> this (.getBucketList))))

(defn get-bucket-limit-count
  "Parallel arrays encoding the bucket boundaries and the bucket values.
   bucket(i) is the count for the bucket i.  The range for
   a bucket is:
     i == 0:  -DBL_MAX .. bucket_limit(0)
     i != 0:  bucket_limit(i-1) .. bucket_limit(i)
  repeated double bucket_limit = 6 [packed = true];

  returns: `int`"
  (^Integer [^HistogramProto$Builder this]
    (-> this (.getBucketLimitCount))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.HistogramProto$Builder`"
  (^org.tensorflow.framework.HistogramProto$Builder [^HistogramProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn clear-sum
  "double sum = 4;

  returns: `org.tensorflow.framework.HistogramProto$Builder`"
  (^org.tensorflow.framework.HistogramProto$Builder [^HistogramProto$Builder this]
    (-> this (.clearSum))))

(defn clear-num
  "double num = 3;

  returns: `org.tensorflow.framework.HistogramProto$Builder`"
  (^org.tensorflow.framework.HistogramProto$Builder [^HistogramProto$Builder this]
    (-> this (.clearNum))))

(defn set-bucket-limit
  "Parallel arrays encoding the bucket boundaries and the bucket values.
   bucket(i) is the count for the bucket i.  The range for
   a bucket is:
     i == 0:  -DBL_MAX .. bucket_limit(0)
     i != 0:  bucket_limit(i-1) .. bucket_limit(i)
  repeated double bucket_limit = 6 [packed = true];

  index - `int`
  value - `double`

  returns: `org.tensorflow.framework.HistogramProto$Builder`"
  (^org.tensorflow.framework.HistogramProto$Builder [^HistogramProto$Builder this ^Integer index ^Double value]
    (-> this (.setBucketLimit index value))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.HistogramProto$Builder`"
  (^org.tensorflow.framework.HistogramProto$Builder [^HistogramProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn build
  "returns: `org.tensorflow.framework.HistogramProto`"
  (^org.tensorflow.framework.HistogramProto [^HistogramProto$Builder this]
    (-> this (.build))))

(defn add-bucket
  "repeated double bucket = 7 [packed = true];

  value - `double`

  returns: `org.tensorflow.framework.HistogramProto$Builder`"
  (^org.tensorflow.framework.HistogramProto$Builder [^HistogramProto$Builder this ^Double value]
    (-> this (.addBucket value))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.HistogramProto$Builder`

  throws: java.io.IOException"
  (^org.tensorflow.framework.HistogramProto$Builder [^HistogramProto$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^org.tensorflow.framework.HistogramProto$Builder [^HistogramProto$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn set-bucket
  "repeated double bucket = 7 [packed = true];

  index - `int`
  value - `double`

  returns: `org.tensorflow.framework.HistogramProto$Builder`"
  (^org.tensorflow.framework.HistogramProto$Builder [^HistogramProto$Builder this ^Integer index ^Double value]
    (-> this (.setBucket index value))))

(defn add-bucket-limit
  "Parallel arrays encoding the bucket boundaries and the bucket values.
   bucket(i) is the count for the bucket i.  The range for
   a bucket is:
     i == 0:  -DBL_MAX .. bucket_limit(0)
     i != 0:  bucket_limit(i-1) .. bucket_limit(i)
  repeated double bucket_limit = 6 [packed = true];

  value - `double`

  returns: `org.tensorflow.framework.HistogramProto$Builder`"
  (^org.tensorflow.framework.HistogramProto$Builder [^HistogramProto$Builder this ^Double value]
    (-> this (.addBucketLimit value))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `org.tensorflow.framework.HistogramProto$Builder`"
  (^org.tensorflow.framework.HistogramProto$Builder [^HistogramProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn clear-min
  "double min = 1;

  returns: `org.tensorflow.framework.HistogramProto$Builder`"
  (^org.tensorflow.framework.HistogramProto$Builder [^HistogramProto$Builder this]
    (-> this (.clearMin))))

(defn clone
  "returns: `org.tensorflow.framework.HistogramProto$Builder`"
  (^org.tensorflow.framework.HistogramProto$Builder [^HistogramProto$Builder this]
    (-> this (.clone))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^HistogramProto$Builder this]
    (-> this (.getDescriptorForType))))

(defn set-min
  "double min = 1;

  value - `double`

  returns: `org.tensorflow.framework.HistogramProto$Builder`"
  (^org.tensorflow.framework.HistogramProto$Builder [^HistogramProto$Builder this ^Double value]
    (-> this (.setMin value))))

(defn get-bucket-limit
  "Parallel arrays encoding the bucket boundaries and the bucket values.
   bucket(i) is the count for the bucket i.  The range for
   a bucket is:
     i == 0:  -DBL_MAX .. bucket_limit(0)
     i != 0:  bucket_limit(i-1) .. bucket_limit(i)
  repeated double bucket_limit = 6 [packed = true];

  index - `int`

  returns: `double`"
  (^Double [^HistogramProto$Builder this ^Integer index]
    (-> this (.getBucketLimit index))))

(defn get-bucket
  "repeated double bucket = 7 [packed = true];

  index - `int`

  returns: `double`"
  (^Double [^HistogramProto$Builder this ^Integer index]
    (-> this (.getBucket index))))

(defn clear
  "returns: `org.tensorflow.framework.HistogramProto$Builder`"
  (^org.tensorflow.framework.HistogramProto$Builder [^HistogramProto$Builder this]
    (-> this (.clear))))

(defn add-all-bucket-limit
  "Parallel arrays encoding the bucket boundaries and the bucket values.
   bucket(i) is the count for the bucket i.  The range for
   a bucket is:
     i == 0:  -DBL_MAX .. bucket_limit(0)
     i != 0:  bucket_limit(i-1) .. bucket_limit(i)
  repeated double bucket_limit = 6 [packed = true];

  values - `java.lang.Iterable`

  returns: `org.tensorflow.framework.HistogramProto$Builder`"
  (^org.tensorflow.framework.HistogramProto$Builder [^HistogramProto$Builder this ^java.lang.Iterable values]
    (-> this (.addAllBucketLimit values))))

(defn add-all-bucket
  "repeated double bucket = 7 [packed = true];

  values - `java.lang.Iterable`

  returns: `org.tensorflow.framework.HistogramProto$Builder`"
  (^org.tensorflow.framework.HistogramProto$Builder [^HistogramProto$Builder this ^java.lang.Iterable values]
    (-> this (.addAllBucket values))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.HistogramProto$Builder`"
  (^org.tensorflow.framework.HistogramProto$Builder [^HistogramProto$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn get-bucket-limit-list
  "Parallel arrays encoding the bucket boundaries and the bucket values.
   bucket(i) is the count for the bucket i.  The range for
   a bucket is:
     i == 0:  -DBL_MAX .. bucket_limit(0)
     i != 0:  bucket_limit(i-1) .. bucket_limit(i)
  repeated double bucket_limit = 6 [packed = true];

  returns: `java.util.List<java.lang.Double>`"
  (^java.util.List [^HistogramProto$Builder this]
    (-> this (.getBucketLimitList))))

(defn get-sum-squares
  "double sum_squares = 5;

  returns: `double`"
  (^Double [^HistogramProto$Builder this]
    (-> this (.getSumSquares))))

