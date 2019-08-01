(ns org.tensorflow.framework.TensorSliceProto
  " Can only be interpreted if you know the corresponding TensorShape.
 Protobuf type tensorflow.TensorSliceProto"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework TensorSliceProto]))

(def *-extent-field-number
  "Static Constant.

  type: int"
  TensorSliceProto/EXTENT_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (TensorSliceProto/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.TensorSliceProto`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^org.tensorflow.framework.TensorSliceProto [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (TensorSliceProto/parseFrom data extension-registry))
  (^org.tensorflow.framework.TensorSliceProto [^java.nio.ByteBuffer data]
    (TensorSliceProto/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.TensorSliceProto`

  throws: java.io.IOException"
  (^org.tensorflow.framework.TensorSliceProto [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (TensorSliceProto/parseDelimitedFrom input extension-registry))
  (^org.tensorflow.framework.TensorSliceProto [^java.io.InputStream input]
    (TensorSliceProto/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `org.tensorflow.framework.TensorSliceProto`

  returns: `org.tensorflow.framework.TensorSliceProto$Builder`"
  (^org.tensorflow.framework.TensorSliceProto$Builder [^org.tensorflow.framework.TensorSliceProto prototype]
    (TensorSliceProto/newBuilder prototype))
  (^org.tensorflow.framework.TensorSliceProto$Builder []
    (TensorSliceProto/newBuilder )))

(defn *get-default-instance
  "returns: `org.tensorflow.framework.TensorSliceProto`"
  (^org.tensorflow.framework.TensorSliceProto []
    (TensorSliceProto/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.TensorSliceProto>`"
  (^com.github.os72.protobuf351.Parser []
    (TensorSliceProto/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^TensorSliceProto this]
    (-> this (.getUnknownFields))))

(defn get-extent-list
  "Extent of the slice in all tensor dimensions.
   Must have one entry for each of the dimension of the tensor that this
   slice belongs to.  The order of sizes is the same as the order of
   dimensions in the TensorShape.
  repeated .tensorflow.TensorSliceProto.Extent extent = 1;

  returns: `java.util.List<org.tensorflow.framework.TensorSliceProto$Extent>`"
  (^java.util.List [^TensorSliceProto this]
    (-> this (.getExtentList))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^TensorSliceProto this]
    (-> this (.isInitialized))))

(defn get-extent-or-builder
  "Extent of the slice in all tensor dimensions.
   Must have one entry for each of the dimension of the tensor that this
   slice belongs to.  The order of sizes is the same as the order of
   dimensions in the TensorShape.
  repeated .tensorflow.TensorSliceProto.Extent extent = 1;

  index - `int`

  returns: `org.tensorflow.framework.TensorSliceProto$ExtentOrBuilder`"
  (^org.tensorflow.framework.TensorSliceProto$ExtentOrBuilder [^TensorSliceProto this ^Integer index]
    (-> this (.getExtentOrBuilder index))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.TensorSliceProto`"
  (^org.tensorflow.framework.TensorSliceProto [^TensorSliceProto this]
    (-> this (.getDefaultInstanceForType))))

(defn get-extent
  "Extent of the slice in all tensor dimensions.
   Must have one entry for each of the dimension of the tensor that this
   slice belongs to.  The order of sizes is the same as the order of
   dimensions in the TensorShape.
  repeated .tensorflow.TensorSliceProto.Extent extent = 1;

  index - `int`

  returns: `org.tensorflow.framework.TensorSliceProto$Extent`"
  (^org.tensorflow.framework.TensorSliceProto$Extent [^TensorSliceProto this ^Integer index]
    (-> this (.getExtent index))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^TensorSliceProto this]
    (-> this (.getSerializedSize))))

(defn get-extent-count
  "Extent of the slice in all tensor dimensions.
   Must have one entry for each of the dimension of the tensor that this
   slice belongs to.  The order of sizes is the same as the order of
   dimensions in the TensorShape.
  repeated .tensorflow.TensorSliceProto.Extent extent = 1;

  returns: `int`"
  (^Integer [^TensorSliceProto this]
    (-> this (.getExtentCount))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^TensorSliceProto this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn hash-code
  "returns: `int`"
  (^Integer [^TensorSliceProto this]
    (-> this (.hashCode))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.TensorSliceProto>`"
  (^com.github.os72.protobuf351.Parser [^TensorSliceProto this]
    (-> this (.getParserForType))))

(defn get-extent-or-builder-list
  "Extent of the slice in all tensor dimensions.
   Must have one entry for each of the dimension of the tensor that this
   slice belongs to.  The order of sizes is the same as the order of
   dimensions in the TensorShape.
  repeated .tensorflow.TensorSliceProto.Extent extent = 1;

  returns: `java.util.List<? extends org.tensorflow.framework.TensorSliceProto$ExtentOrBuilder>`"
  ([^TensorSliceProto this]
    (-> this (.getExtentOrBuilderList))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^TensorSliceProto this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `org.tensorflow.framework.TensorSliceProto$Builder`"
  (^org.tensorflow.framework.TensorSliceProto$Builder [^TensorSliceProto this]
    (-> this (.newBuilderForType))))

(defn to-builder
  "returns: `org.tensorflow.framework.TensorSliceProto$Builder`"
  (^org.tensorflow.framework.TensorSliceProto$Builder [^TensorSliceProto this]
    (-> this (.toBuilder))))

