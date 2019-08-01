(ns onnx.OnnxProto3$TypeProto$Tensor
  "Protobuf type onnx.TypeProto.Tensor"
  (:refer-clojure :only [require comment defn ->])
  (:import [onnx OnnxProto3$TypeProto$Tensor]))

(def *-elem-type-field-number
  "Static Constant.

  type: int"
  OnnxProto3$TypeProto$Tensor/ELEM_TYPE_FIELD_NUMBER)

(def *-shape-field-number
  "Static Constant.

  type: int"
  OnnxProto3$TypeProto$Tensor/SHAPE_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (OnnxProto3$TypeProto$Tensor/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `onnx.OnnxProto3$TypeProto$Tensor`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^onnx.OnnxProto3$TypeProto$Tensor [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (OnnxProto3$TypeProto$Tensor/parseFrom data extension-registry))
  (^onnx.OnnxProto3$TypeProto$Tensor [^java.nio.ByteBuffer data]
    (OnnxProto3$TypeProto$Tensor/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `onnx.OnnxProto3$TypeProto$Tensor`

  throws: java.io.IOException"
  (^onnx.OnnxProto3$TypeProto$Tensor [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (OnnxProto3$TypeProto$Tensor/parseDelimitedFrom input extension-registry))
  (^onnx.OnnxProto3$TypeProto$Tensor [^java.io.InputStream input]
    (OnnxProto3$TypeProto$Tensor/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `onnx.OnnxProto3$TypeProto$Tensor`

  returns: `onnx.OnnxProto3$TypeProto$Tensor$Builder`"
  (^onnx.OnnxProto3$TypeProto$Tensor$Builder [^onnx.OnnxProto3$TypeProto$Tensor prototype]
    (OnnxProto3$TypeProto$Tensor/newBuilder prototype))
  (^onnx.OnnxProto3$TypeProto$Tensor$Builder []
    (OnnxProto3$TypeProto$Tensor/newBuilder )))

(defn *get-default-instance
  "returns: `onnx.OnnxProto3$TypeProto$Tensor`"
  (^onnx.OnnxProto3$TypeProto$Tensor []
    (OnnxProto3$TypeProto$Tensor/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<onnx.OnnxProto3$TypeProto$Tensor>`"
  (^com.github.os72.protobuf351.Parser []
    (OnnxProto3$TypeProto$Tensor/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^OnnxProto3$TypeProto$Tensor this]
    (-> this (.getUnknownFields))))

(defn has-shape?
  ".onnx.TensorShapeProto shape = 2;

  returns: `boolean`"
  (^Boolean [^OnnxProto3$TypeProto$Tensor this]
    (-> this (.hasShape))))

(defn get-shape-or-builder
  ".onnx.TensorShapeProto shape = 2;

  returns: `onnx.OnnxProto3$TensorShapeProtoOrBuilder`"
  (^onnx.OnnxProto3$TensorShapeProtoOrBuilder [^OnnxProto3$TypeProto$Tensor this]
    (-> this (.getShapeOrBuilder))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^OnnxProto3$TypeProto$Tensor this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `onnx.OnnxProto3$TypeProto$Tensor`"
  (^onnx.OnnxProto3$TypeProto$Tensor [^OnnxProto3$TypeProto$Tensor this]
    (-> this (.getDefaultInstanceForType))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^OnnxProto3$TypeProto$Tensor this]
    (-> this (.getSerializedSize))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^OnnxProto3$TypeProto$Tensor this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn get-elem-type-value
  "This field MUST NOT have the value of UNDEFINED
   This field MUST be present for this version of the IR.
  .onnx.TensorProto.DataType elem_type = 1;

  returns: `int`"
  (^Integer [^OnnxProto3$TypeProto$Tensor this]
    (-> this (.getElemTypeValue))))

(defn get-shape
  ".onnx.TensorShapeProto shape = 2;

  returns: `onnx.OnnxProto3$TensorShapeProto`"
  (^onnx.OnnxProto3$TensorShapeProto [^OnnxProto3$TypeProto$Tensor this]
    (-> this (.getShape))))

(defn hash-code
  "returns: `int`"
  (^Integer [^OnnxProto3$TypeProto$Tensor this]
    (-> this (.hashCode))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<onnx.OnnxProto3$TypeProto$Tensor>`"
  (^com.github.os72.protobuf351.Parser [^OnnxProto3$TypeProto$Tensor this]
    (-> this (.getParserForType))))

(defn get-elem-type
  "This field MUST NOT have the value of UNDEFINED
   This field MUST be present for this version of the IR.
  .onnx.TensorProto.DataType elem_type = 1;

  returns: `onnx.OnnxProto3$TensorProto$DataType`"
  (^onnx.OnnxProto3$TensorProto$DataType [^OnnxProto3$TypeProto$Tensor this]
    (-> this (.getElemType))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^OnnxProto3$TypeProto$Tensor this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `onnx.OnnxProto3$TypeProto$Tensor$Builder`"
  (^onnx.OnnxProto3$TypeProto$Tensor$Builder [^OnnxProto3$TypeProto$Tensor this]
    (-> this (.newBuilderForType))))

(defn to-builder
  "returns: `onnx.OnnxProto3$TypeProto$Tensor$Builder`"
  (^onnx.OnnxProto3$TypeProto$Tensor$Builder [^OnnxProto3$TypeProto$Tensor this]
    (-> this (.toBuilder))))

