(ns org.tensorflow.framework.VariantTensorDataProto
  " Protocol buffer representing the serialization format of DT_VARIANT tensors.
 Protobuf type tensorflow.VariantTensorDataProto"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework VariantTensorDataProto]))

(def *-type-name-field-number
  "Static Constant.

  type: int"
  VariantTensorDataProto/TYPE_NAME_FIELD_NUMBER)

(def *-metadata-field-number
  "Static Constant.

  type: int"
  VariantTensorDataProto/METADATA_FIELD_NUMBER)

(def *-tensors-field-number
  "Static Constant.

  type: int"
  VariantTensorDataProto/TENSORS_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (VariantTensorDataProto/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.VariantTensorDataProto`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^org.tensorflow.framework.VariantTensorDataProto [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (VariantTensorDataProto/parseFrom data extension-registry))
  (^org.tensorflow.framework.VariantTensorDataProto [^java.nio.ByteBuffer data]
    (VariantTensorDataProto/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.VariantTensorDataProto`

  throws: java.io.IOException"
  (^org.tensorflow.framework.VariantTensorDataProto [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (VariantTensorDataProto/parseDelimitedFrom input extension-registry))
  (^org.tensorflow.framework.VariantTensorDataProto [^java.io.InputStream input]
    (VariantTensorDataProto/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `org.tensorflow.framework.VariantTensorDataProto`

  returns: `org.tensorflow.framework.VariantTensorDataProto$Builder`"
  (^org.tensorflow.framework.VariantTensorDataProto$Builder [^org.tensorflow.framework.VariantTensorDataProto prototype]
    (VariantTensorDataProto/newBuilder prototype))
  (^org.tensorflow.framework.VariantTensorDataProto$Builder []
    (VariantTensorDataProto/newBuilder )))

(defn *get-default-instance
  "returns: `org.tensorflow.framework.VariantTensorDataProto`"
  (^org.tensorflow.framework.VariantTensorDataProto []
    (VariantTensorDataProto/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.VariantTensorDataProto>`"
  (^com.github.os72.protobuf351.Parser []
    (VariantTensorDataProto/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^VariantTensorDataProto this]
    (-> this (.getUnknownFields))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^VariantTensorDataProto this]
    (-> this (.isInitialized))))

(defn get-tensors-or-builder
  "Tensors contained within objects being serialized.
  repeated .tensorflow.TensorProto tensors = 3;

  index - `int`

  returns: `org.tensorflow.framework.TensorProtoOrBuilder`"
  (^org.tensorflow.framework.TensorProtoOrBuilder [^VariantTensorDataProto this ^Integer index]
    (-> this (.getTensorsOrBuilder index))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.VariantTensorDataProto`"
  (^org.tensorflow.framework.VariantTensorDataProto [^VariantTensorDataProto this]
    (-> this (.getDefaultInstanceForType))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^VariantTensorDataProto this]
    (-> this (.getSerializedSize))))

(defn get-type-name-bytes
  "Name of the type of objects being serialized.
  string type_name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^VariantTensorDataProto this]
    (-> this (.getTypeNameBytes))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^VariantTensorDataProto this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn get-tensors
  "Tensors contained within objects being serialized.
  repeated .tensorflow.TensorProto tensors = 3;

  index - `int`

  returns: `org.tensorflow.framework.TensorProto`"
  (^org.tensorflow.framework.TensorProto [^VariantTensorDataProto this ^Integer index]
    (-> this (.getTensors index))))

(defn get-tensors-or-builder-list
  "Tensors contained within objects being serialized.
  repeated .tensorflow.TensorProto tensors = 3;

  returns: `java.util.List<? extends org.tensorflow.framework.TensorProtoOrBuilder>`"
  ([^VariantTensorDataProto this]
    (-> this (.getTensorsOrBuilderList))))

(defn get-tensors-list
  "Tensors contained within objects being serialized.
  repeated .tensorflow.TensorProto tensors = 3;

  returns: `java.util.List<org.tensorflow.framework.TensorProto>`"
  (^java.util.List [^VariantTensorDataProto this]
    (-> this (.getTensorsList))))

(defn hash-code
  "returns: `int`"
  (^Integer [^VariantTensorDataProto this]
    (-> this (.hashCode))))

(defn get-metadata
  "Portions of the object that are not Tensors.
  bytes metadata = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^VariantTensorDataProto this]
    (-> this (.getMetadata))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.VariantTensorDataProto>`"
  (^com.github.os72.protobuf351.Parser [^VariantTensorDataProto this]
    (-> this (.getParserForType))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^VariantTensorDataProto this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `org.tensorflow.framework.VariantTensorDataProto$Builder`"
  (^org.tensorflow.framework.VariantTensorDataProto$Builder [^VariantTensorDataProto this]
    (-> this (.newBuilderForType))))

(defn get-type-name
  "Name of the type of objects being serialized.
  string type_name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^VariantTensorDataProto this]
    (-> this (.getTypeName))))

(defn get-tensors-count
  "Tensors contained within objects being serialized.
  repeated .tensorflow.TensorProto tensors = 3;

  returns: `int`"
  (^Integer [^VariantTensorDataProto this]
    (-> this (.getTensorsCount))))

(defn to-builder
  "returns: `org.tensorflow.framework.VariantTensorDataProto$Builder`"
  (^org.tensorflow.framework.VariantTensorDataProto$Builder [^VariantTensorDataProto this]
    (-> this (.toBuilder))))

