(ns onnx.OnnxMlProto3$TypeProto
  " Define the types.
 Protobuf type onnx.TypeProto"
  (:refer-clojure :only [require comment defn ->])
  (:import [onnx OnnxMlProto3$TypeProto]))

(def *-tensor-type-field-number
  "Static Constant.

  type: int"
  OnnxMlProto3$TypeProto/TENSOR_TYPE_FIELD_NUMBER)

(def *-sequence-type-field-number
  "Static Constant.

  type: int"
  OnnxMlProto3$TypeProto/SEQUENCE_TYPE_FIELD_NUMBER)

(def *-map-type-field-number
  "Static Constant.

  type: int"
  OnnxMlProto3$TypeProto/MAP_TYPE_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (OnnxMlProto3$TypeProto/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `onnx.OnnxMlProto3$TypeProto`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^onnx.OnnxMlProto3$TypeProto [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (OnnxMlProto3$TypeProto/parseFrom data extension-registry))
  (^onnx.OnnxMlProto3$TypeProto [^java.nio.ByteBuffer data]
    (OnnxMlProto3$TypeProto/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `onnx.OnnxMlProto3$TypeProto`

  throws: java.io.IOException"
  (^onnx.OnnxMlProto3$TypeProto [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (OnnxMlProto3$TypeProto/parseDelimitedFrom input extension-registry))
  (^onnx.OnnxMlProto3$TypeProto [^java.io.InputStream input]
    (OnnxMlProto3$TypeProto/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `onnx.OnnxMlProto3$TypeProto`

  returns: `onnx.OnnxMlProto3$TypeProto$Builder`"
  (^onnx.OnnxMlProto3$TypeProto$Builder [^onnx.OnnxMlProto3$TypeProto prototype]
    (OnnxMlProto3$TypeProto/newBuilder prototype))
  (^onnx.OnnxMlProto3$TypeProto$Builder []
    (OnnxMlProto3$TypeProto/newBuilder )))

(defn *get-default-instance
  "returns: `onnx.OnnxMlProto3$TypeProto`"
  (^onnx.OnnxMlProto3$TypeProto []
    (OnnxMlProto3$TypeProto/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<onnx.OnnxMlProto3$TypeProto>`"
  (^com.github.os72.protobuf351.Parser []
    (OnnxMlProto3$TypeProto/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^OnnxMlProto3$TypeProto this]
    (-> this (.getUnknownFields))))

(defn get-sequence-type
  "The type of a sequence.
  .onnx.TypeProto.Sequence sequence_type = 4;

  returns: `onnx.OnnxMlProto3$TypeProto$Sequence`"
  (^onnx.OnnxMlProto3$TypeProto$Sequence [^OnnxMlProto3$TypeProto this]
    (-> this (.getSequenceType))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^OnnxMlProto3$TypeProto this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `onnx.OnnxMlProto3$TypeProto`"
  (^onnx.OnnxMlProto3$TypeProto [^OnnxMlProto3$TypeProto this]
    (-> this (.getDefaultInstanceForType))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^OnnxMlProto3$TypeProto this]
    (-> this (.getSerializedSize))))

(defn get-map-type
  "The type of a map.
  .onnx.TypeProto.Map map_type = 5;

  returns: `onnx.OnnxMlProto3$TypeProto$Map`"
  (^onnx.OnnxMlProto3$TypeProto$Map [^OnnxMlProto3$TypeProto this]
    (-> this (.getMapType))))

(defn get-map-type-or-builder
  "The type of a map.
  .onnx.TypeProto.Map map_type = 5;

  returns: `onnx.OnnxMlProto3$TypeProto$MapOrBuilder`"
  (^onnx.OnnxMlProto3$TypeProto$MapOrBuilder [^OnnxMlProto3$TypeProto this]
    (-> this (.getMapTypeOrBuilder))))

(defn has-sequence-type?
  "The type of a sequence.
  .onnx.TypeProto.Sequence sequence_type = 4;

  returns: `boolean`"
  (^Boolean [^OnnxMlProto3$TypeProto this]
    (-> this (.hasSequenceType))))

(defn has-map-type?
  "The type of a map.
  .onnx.TypeProto.Map map_type = 5;

  returns: `boolean`"
  (^Boolean [^OnnxMlProto3$TypeProto this]
    (-> this (.hasMapType))))

(defn get-tensor-type
  "The type of a tensor.
  .onnx.TypeProto.Tensor tensor_type = 1;

  returns: `onnx.OnnxMlProto3$TypeProto$Tensor`"
  (^onnx.OnnxMlProto3$TypeProto$Tensor [^OnnxMlProto3$TypeProto this]
    (-> this (.getTensorType))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^OnnxMlProto3$TypeProto this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn get-sequence-type-or-builder
  "The type of a sequence.
  .onnx.TypeProto.Sequence sequence_type = 4;

  returns: `onnx.OnnxMlProto3$TypeProto$SequenceOrBuilder`"
  (^onnx.OnnxMlProto3$TypeProto$SequenceOrBuilder [^OnnxMlProto3$TypeProto this]
    (-> this (.getSequenceTypeOrBuilder))))

(defn get-value-case
  "returns: `onnx.OnnxMlProto3$TypeProto$ValueCase`"
  (^onnx.OnnxMlProto3$TypeProto$ValueCase [^OnnxMlProto3$TypeProto this]
    (-> this (.getValueCase))))

(defn get-tensor-type-or-builder
  "The type of a tensor.
  .onnx.TypeProto.Tensor tensor_type = 1;

  returns: `onnx.OnnxMlProto3$TypeProto$TensorOrBuilder`"
  (^onnx.OnnxMlProto3$TypeProto$TensorOrBuilder [^OnnxMlProto3$TypeProto this]
    (-> this (.getTensorTypeOrBuilder))))

(defn hash-code
  "returns: `int`"
  (^Integer [^OnnxMlProto3$TypeProto this]
    (-> this (.hashCode))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<onnx.OnnxMlProto3$TypeProto>`"
  (^com.github.os72.protobuf351.Parser [^OnnxMlProto3$TypeProto this]
    (-> this (.getParserForType))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^OnnxMlProto3$TypeProto this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `onnx.OnnxMlProto3$TypeProto$Builder`"
  (^onnx.OnnxMlProto3$TypeProto$Builder [^OnnxMlProto3$TypeProto this]
    (-> this (.newBuilderForType))))

(defn has-tensor-type?
  "The type of a tensor.
  .onnx.TypeProto.Tensor tensor_type = 1;

  returns: `boolean`"
  (^Boolean [^OnnxMlProto3$TypeProto this]
    (-> this (.hasTensorType))))

(defn to-builder
  "returns: `onnx.OnnxMlProto3$TypeProto$Builder`"
  (^onnx.OnnxMlProto3$TypeProto$Builder [^OnnxMlProto3$TypeProto this]
    (-> this (.toBuilder))))

