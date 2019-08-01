(ns org.tensorflow.framework.TensorSliceProto$Extent
  " Extent of the slice in one dimension.
 Protobuf type tensorflow.TensorSliceProto.Extent"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework TensorSliceProto$Extent]))

(def *-start-field-number
  "Static Constant.

  type: int"
  TensorSliceProto$Extent/START_FIELD_NUMBER)

(def *-length-field-number
  "Static Constant.

  type: int"
  TensorSliceProto$Extent/LENGTH_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (TensorSliceProto$Extent/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.TensorSliceProto$Extent`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^org.tensorflow.framework.TensorSliceProto$Extent [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (TensorSliceProto$Extent/parseFrom data extension-registry))
  (^org.tensorflow.framework.TensorSliceProto$Extent [^java.nio.ByteBuffer data]
    (TensorSliceProto$Extent/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.TensorSliceProto$Extent`

  throws: java.io.IOException"
  (^org.tensorflow.framework.TensorSliceProto$Extent [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (TensorSliceProto$Extent/parseDelimitedFrom input extension-registry))
  (^org.tensorflow.framework.TensorSliceProto$Extent [^java.io.InputStream input]
    (TensorSliceProto$Extent/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `org.tensorflow.framework.TensorSliceProto$Extent`

  returns: `org.tensorflow.framework.TensorSliceProto$Extent$Builder`"
  (^org.tensorflow.framework.TensorSliceProto$Extent$Builder [^org.tensorflow.framework.TensorSliceProto$Extent prototype]
    (TensorSliceProto$Extent/newBuilder prototype))
  (^org.tensorflow.framework.TensorSliceProto$Extent$Builder []
    (TensorSliceProto$Extent/newBuilder )))

(defn *get-default-instance
  "returns: `org.tensorflow.framework.TensorSliceProto$Extent`"
  (^org.tensorflow.framework.TensorSliceProto$Extent []
    (TensorSliceProto$Extent/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.TensorSliceProto$Extent>`"
  (^com.github.os72.protobuf351.Parser []
    (TensorSliceProto$Extent/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^TensorSliceProto$Extent this]
    (-> this (.getUnknownFields))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^TensorSliceProto$Extent this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.TensorSliceProto$Extent`"
  (^org.tensorflow.framework.TensorSliceProto$Extent [^TensorSliceProto$Extent this]
    (-> this (.getDefaultInstanceForType))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^TensorSliceProto$Extent this]
    (-> this (.getSerializedSize))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^TensorSliceProto$Extent this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn get-length
  "int64 length = 2;

  returns: `long`"
  (^Long [^TensorSliceProto$Extent this]
    (-> this (.getLength))))

(defn hash-code
  "returns: `int`"
  (^Integer [^TensorSliceProto$Extent this]
    (-> this (.hashCode))))

(defn get-start
  "Start index of the slice, starting at 0.
  int64 start = 1;

  returns: `long`"
  (^Long [^TensorSliceProto$Extent this]
    (-> this (.getStart))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.TensorSliceProto$Extent>`"
  (^com.github.os72.protobuf351.Parser [^TensorSliceProto$Extent this]
    (-> this (.getParserForType))))

(defn get-has-length-case
  "returns: `org.tensorflow.framework.TensorSliceProto$Extent$HasLengthCase`"
  (^org.tensorflow.framework.TensorSliceProto$Extent$HasLengthCase [^TensorSliceProto$Extent this]
    (-> this (.getHasLengthCase))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^TensorSliceProto$Extent this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `org.tensorflow.framework.TensorSliceProto$Extent$Builder`"
  (^org.tensorflow.framework.TensorSliceProto$Extent$Builder [^TensorSliceProto$Extent this]
    (-> this (.newBuilderForType))))

(defn to-builder
  "returns: `org.tensorflow.framework.TensorSliceProto$Extent$Builder`"
  (^org.tensorflow.framework.TensorSliceProto$Extent$Builder [^TensorSliceProto$Extent this]
    (-> this (.toBuilder))))

