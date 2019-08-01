(ns org.tensorflow.framework.TensorShapeProto$Dim
  " One dimension of the tensor.
 Protobuf type tensorflow.TensorShapeProto.Dim"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework TensorShapeProto$Dim]))

(def *-size-field-number
  "Static Constant.

  type: int"
  TensorShapeProto$Dim/SIZE_FIELD_NUMBER)

(def *-name-field-number
  "Static Constant.

  type: int"
  TensorShapeProto$Dim/NAME_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (TensorShapeProto$Dim/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.TensorShapeProto$Dim`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^org.tensorflow.framework.TensorShapeProto$Dim [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (TensorShapeProto$Dim/parseFrom data extension-registry))
  (^org.tensorflow.framework.TensorShapeProto$Dim [^java.nio.ByteBuffer data]
    (TensorShapeProto$Dim/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.TensorShapeProto$Dim`

  throws: java.io.IOException"
  (^org.tensorflow.framework.TensorShapeProto$Dim [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (TensorShapeProto$Dim/parseDelimitedFrom input extension-registry))
  (^org.tensorflow.framework.TensorShapeProto$Dim [^java.io.InputStream input]
    (TensorShapeProto$Dim/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `org.tensorflow.framework.TensorShapeProto$Dim`

  returns: `org.tensorflow.framework.TensorShapeProto$Dim$Builder`"
  (^org.tensorflow.framework.TensorShapeProto$Dim$Builder [^org.tensorflow.framework.TensorShapeProto$Dim prototype]
    (TensorShapeProto$Dim/newBuilder prototype))
  (^org.tensorflow.framework.TensorShapeProto$Dim$Builder []
    (TensorShapeProto$Dim/newBuilder )))

(defn *get-default-instance
  "returns: `org.tensorflow.framework.TensorShapeProto$Dim`"
  (^org.tensorflow.framework.TensorShapeProto$Dim []
    (TensorShapeProto$Dim/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.TensorShapeProto$Dim>`"
  (^com.github.os72.protobuf351.Parser []
    (TensorShapeProto$Dim/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^TensorShapeProto$Dim this]
    (-> this (.getUnknownFields))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^TensorShapeProto$Dim this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.TensorShapeProto$Dim`"
  (^org.tensorflow.framework.TensorShapeProto$Dim [^TensorShapeProto$Dim this]
    (-> this (.getDefaultInstanceForType))))

(defn get-name-bytes
  "Optional name of the tensor dimension.
  string name = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^TensorShapeProto$Dim this]
    (-> this (.getNameBytes))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^TensorShapeProto$Dim this]
    (-> this (.getSerializedSize))))

(defn get-name
  "Optional name of the tensor dimension.
  string name = 2;

  returns: `java.lang.String`"
  (^java.lang.String [^TensorShapeProto$Dim this]
    (-> this (.getName))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^TensorShapeProto$Dim this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn hash-code
  "returns: `int`"
  (^Integer [^TensorShapeProto$Dim this]
    (-> this (.hashCode))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.TensorShapeProto$Dim>`"
  (^com.github.os72.protobuf351.Parser [^TensorShapeProto$Dim this]
    (-> this (.getParserForType))))

(defn get-size
  "Size of the tensor in that dimension.
   This value must be >= -1, but values of -1 are reserved for \"unknown\"
   shapes (values of -1 mean \"unknown\" dimension).  Certain wrappers
   that work with TensorShapeProto may fail at runtime when deserializing
   a TensorShapeProto containing a dim value of -1.
  int64 size = 1;

  returns: `long`"
  (^Long [^TensorShapeProto$Dim this]
    (-> this (.getSize))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^TensorShapeProto$Dim this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `org.tensorflow.framework.TensorShapeProto$Dim$Builder`"
  (^org.tensorflow.framework.TensorShapeProto$Dim$Builder [^TensorShapeProto$Dim this]
    (-> this (.newBuilderForType))))

(defn to-builder
  "returns: `org.tensorflow.framework.TensorShapeProto$Dim$Builder`"
  (^org.tensorflow.framework.TensorShapeProto$Dim$Builder [^TensorShapeProto$Dim this]
    (-> this (.toBuilder))))

