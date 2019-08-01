(ns org.tensorflow.framework.HistogramProto
  " Serialization format for histogram module in
  core/lib/histogram/histogram.h
 Protobuf type tensorflow.HistogramProto"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework HistogramProto]))

(def *-min-field-number
  "Static Constant.

  type: int"
  HistogramProto/MIN_FIELD_NUMBER)

(def *-max-field-number
  "Static Constant.

  type: int"
  HistogramProto/MAX_FIELD_NUMBER)

(def *-num-field-number
  "Static Constant.

  type: int"
  HistogramProto/NUM_FIELD_NUMBER)

(def *-sum-field-number
  "Static Constant.

  type: int"
  HistogramProto/SUM_FIELD_NUMBER)

(def *-sum-squares-field-number
  "Static Constant.

  type: int"
  HistogramProto/SUM_SQUARES_FIELD_NUMBER)

(def *-bucket-limit-field-number
  "Static Constant.

  type: int"
  HistogramProto/BUCKET_LIMIT_FIELD_NUMBER)

(def *-bucket-field-number
  "Static Constant.

  type: int"
  HistogramProto/BUCKET_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (HistogramProto/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.HistogramProto`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^org.tensorflow.framework.HistogramProto [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (HistogramProto/parseFrom data extension-registry))
  (^org.tensorflow.framework.HistogramProto [^java.nio.ByteBuffer data]
    (HistogramProto/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.HistogramProto`

  throws: java.io.IOException"
  (^org.tensorflow.framework.HistogramProto [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (HistogramProto/parseDelimitedFrom input extension-registry))
  (^org.tensorflow.framework.HistogramProto [^java.io.InputStream input]
    (HistogramProto/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `org.tensorflow.framework.HistogramProto`

  returns: `org.tensorflow.framework.HistogramProto$Builder`"
  (^org.tensorflow.framework.HistogramProto$Builder [^org.tensorflow.framework.HistogramProto prototype]
    (HistogramProto/newBuilder prototype))
  (^org.tensorflow.framework.HistogramProto$Builder []
    (HistogramProto/newBuilder )))

(defn *get-default-instance
  "returns: `org.tensorflow.framework.HistogramProto`"
  (^org.tensorflow.framework.HistogramProto []
    (HistogramProto/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.HistogramProto>`"
  (^com.github.os72.protobuf351.Parser []
    (HistogramProto/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^HistogramProto this]
    (-> this (.getUnknownFields))))

(defn get-num
  "double num = 3;

  returns: `double`"
  (^Double [^HistogramProto this]
    (-> this (.getNum))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^HistogramProto this]
    (-> this (.isInitialized))))

(defn get-bucket-count
  "repeated double bucket = 7 [packed = true];

  returns: `int`"
  (^Integer [^HistogramProto this]
    (-> this (.getBucketCount))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.HistogramProto`"
  (^org.tensorflow.framework.HistogramProto [^HistogramProto this]
    (-> this (.getDefaultInstanceForType))))

(defn get-sum
  "double sum = 4;

  returns: `double`"
  (^Double [^HistogramProto this]
    (-> this (.getSum))))

(defn get-min
  "double min = 1;

  returns: `double`"
  (^Double [^HistogramProto this]
    (-> this (.getMin))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^HistogramProto this]
    (-> this (.getSerializedSize))))

(defn get-max
  "double max = 2;

  returns: `double`"
  (^Double [^HistogramProto this]
    (-> this (.getMax))))

(defn get-bucket-list
  "repeated double bucket = 7 [packed = true];

  returns: `java.util.List<java.lang.Double>`"
  (^java.util.List [^HistogramProto this]
    (-> this (.getBucketList))))

(defn get-bucket-limit-count
  "Parallel arrays encoding the bucket boundaries and the bucket values.
   bucket(i) is the count for the bucket i.  The range for
   a bucket is:
     i == 0:  -DBL_MAX .. bucket_limit(0)
     i != 0:  bucket_limit(i-1) .. bucket_limit(i)
  repeated double bucket_limit = 6 [packed = true];

  returns: `int`"
  (^Integer [^HistogramProto this]
    (-> this (.getBucketLimitCount))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^HistogramProto this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn hash-code
  "returns: `int`"
  (^Integer [^HistogramProto this]
    (-> this (.hashCode))))

(defn get-bucket-limit
  "Parallel arrays encoding the bucket boundaries and the bucket values.
   bucket(i) is the count for the bucket i.  The range for
   a bucket is:
     i == 0:  -DBL_MAX .. bucket_limit(0)
     i != 0:  bucket_limit(i-1) .. bucket_limit(i)
  repeated double bucket_limit = 6 [packed = true];

  index - `int`

  returns: `double`"
  (^Double [^HistogramProto this ^Integer index]
    (-> this (.getBucketLimit index))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.HistogramProto>`"
  (^com.github.os72.protobuf351.Parser [^HistogramProto this]
    (-> this (.getParserForType))))

(defn get-bucket
  "repeated double bucket = 7 [packed = true];

  index - `int`

  returns: `double`"
  (^Double [^HistogramProto this ^Integer index]
    (-> this (.getBucket index))))

(defn get-bucket-limit-list
  "Parallel arrays encoding the bucket boundaries and the bucket values.
   bucket(i) is the count for the bucket i.  The range for
   a bucket is:
     i == 0:  -DBL_MAX .. bucket_limit(0)
     i != 0:  bucket_limit(i-1) .. bucket_limit(i)
  repeated double bucket_limit = 6 [packed = true];

  returns: `java.util.List<java.lang.Double>`"
  (^java.util.List [^HistogramProto this]
    (-> this (.getBucketLimitList))))

(defn get-sum-squares
  "double sum_squares = 5;

  returns: `double`"
  (^Double [^HistogramProto this]
    (-> this (.getSumSquares))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^HistogramProto this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `org.tensorflow.framework.HistogramProto$Builder`"
  (^org.tensorflow.framework.HistogramProto$Builder [^HistogramProto this]
    (-> this (.newBuilderForType))))

(defn to-builder
  "returns: `org.tensorflow.framework.HistogramProto$Builder`"
  (^org.tensorflow.framework.HistogramProto$Builder [^HistogramProto this]
    (-> this (.toBuilder))))

