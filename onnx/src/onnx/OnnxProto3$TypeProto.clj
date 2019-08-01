(ns onnx.OnnxProto3$TypeProto
  " Define the types.
 Protobuf type onnx.TypeProto"
  (:refer-clojure :only [require comment defn ->])
  (:import [onnx OnnxProto3$TypeProto]))

(def *-tensor-type-field-number
  "Static Constant.

  type: int"
  OnnxProto3$TypeProto/TENSOR_TYPE_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (OnnxProto3$TypeProto/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `onnx.OnnxProto3$TypeProto`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^onnx.OnnxProto3$TypeProto [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (OnnxProto3$TypeProto/parseFrom data extension-registry))
  (^onnx.OnnxProto3$TypeProto [^java.nio.ByteBuffer data]
    (OnnxProto3$TypeProto/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `onnx.OnnxProto3$TypeProto`

  throws: java.io.IOException"
  (^onnx.OnnxProto3$TypeProto [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (OnnxProto3$TypeProto/parseDelimitedFrom input extension-registry))
  (^onnx.OnnxProto3$TypeProto [^java.io.InputStream input]
    (OnnxProto3$TypeProto/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `onnx.OnnxProto3$TypeProto`

  returns: `onnx.OnnxProto3$TypeProto$Builder`"
  (^onnx.OnnxProto3$TypeProto$Builder [^onnx.OnnxProto3$TypeProto prototype]
    (OnnxProto3$TypeProto/newBuilder prototype))
  (^onnx.OnnxProto3$TypeProto$Builder []
    (OnnxProto3$TypeProto/newBuilder )))

(defn *get-default-instance
  "returns: `onnx.OnnxProto3$TypeProto`"
  (^onnx.OnnxProto3$TypeProto []
    (OnnxProto3$TypeProto/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<onnx.OnnxProto3$TypeProto>`"
  (^com.github.os72.protobuf351.Parser []
    (OnnxProto3$TypeProto/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^OnnxProto3$TypeProto this]
    (-> this (.getUnknownFields))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^OnnxProto3$TypeProto this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `onnx.OnnxProto3$TypeProto`"
  (^onnx.OnnxProto3$TypeProto [^OnnxProto3$TypeProto this]
    (-> this (.getDefaultInstanceForType))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^OnnxProto3$TypeProto this]
    (-> this (.getSerializedSize))))

(defn get-tensor-type
  "The type of a tensor.
  .onnx.TypeProto.Tensor tensor_type = 1;

  returns: `onnx.OnnxProto3$TypeProto$Tensor`"
  (^onnx.OnnxProto3$TypeProto$Tensor [^OnnxProto3$TypeProto this]
    (-> this (.getTensorType))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^OnnxProto3$TypeProto this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn get-value-case
  "returns: `onnx.OnnxProto3$TypeProto$ValueCase`"
  (^onnx.OnnxProto3$TypeProto$ValueCase [^OnnxProto3$TypeProto this]
    (-> this (.getValueCase))))

(defn get-tensor-type-or-builder
  "The type of a tensor.
  .onnx.TypeProto.Tensor tensor_type = 1;

  returns: `onnx.OnnxProto3$TypeProto$TensorOrBuilder`"
  (^onnx.OnnxProto3$TypeProto$TensorOrBuilder [^OnnxProto3$TypeProto this]
    (-> this (.getTensorTypeOrBuilder))))

(defn hash-code
  "returns: `int`"
  (^Integer [^OnnxProto3$TypeProto this]
    (-> this (.hashCode))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<onnx.OnnxProto3$TypeProto>`"
  (^com.github.os72.protobuf351.Parser [^OnnxProto3$TypeProto this]
    (-> this (.getParserForType))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^OnnxProto3$TypeProto this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `onnx.OnnxProto3$TypeProto$Builder`"
  (^onnx.OnnxProto3$TypeProto$Builder [^OnnxProto3$TypeProto this]
    (-> this (.newBuilderForType))))

(defn has-tensor-type?
  "The type of a tensor.
  .onnx.TypeProto.Tensor tensor_type = 1;

  returns: `boolean`"
  (^Boolean [^OnnxProto3$TypeProto this]
    (-> this (.hasTensorType))))

(defn to-builder
  "returns: `onnx.OnnxProto3$TypeProto$Builder`"
  (^onnx.OnnxProto3$TypeProto$Builder [^OnnxProto3$TypeProto this]
    (-> this (.toBuilder))))

