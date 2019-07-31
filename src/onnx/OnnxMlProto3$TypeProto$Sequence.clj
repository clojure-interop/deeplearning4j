(ns onnx.OnnxMlProto3$TypeProto$Sequence
  " repeated T
 Protobuf type onnx.TypeProto.Sequence"
  (:refer-clojure :only [require comment defn ->])
  (:import [onnx OnnxMlProto3$TypeProto$Sequence]))

(def *-elem-type-field-number
  "Static Constant.

  type: int"
  OnnxMlProto3$TypeProto$Sequence/ELEM_TYPE_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (OnnxMlProto3$TypeProto$Sequence/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `onnx.OnnxMlProto3$TypeProto$Sequence`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^onnx.OnnxMlProto3$TypeProto$Sequence [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (OnnxMlProto3$TypeProto$Sequence/parseFrom data extension-registry))
  (^onnx.OnnxMlProto3$TypeProto$Sequence [^java.nio.ByteBuffer data]
    (OnnxMlProto3$TypeProto$Sequence/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `onnx.OnnxMlProto3$TypeProto$Sequence`

  throws: java.io.IOException"
  (^onnx.OnnxMlProto3$TypeProto$Sequence [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (OnnxMlProto3$TypeProto$Sequence/parseDelimitedFrom input extension-registry))
  (^onnx.OnnxMlProto3$TypeProto$Sequence [^java.io.InputStream input]
    (OnnxMlProto3$TypeProto$Sequence/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `onnx.OnnxMlProto3$TypeProto$Sequence`

  returns: `onnx.OnnxMlProto3$TypeProto$Sequence$Builder`"
  (^onnx.OnnxMlProto3$TypeProto$Sequence$Builder [^onnx.OnnxMlProto3$TypeProto$Sequence prototype]
    (OnnxMlProto3$TypeProto$Sequence/newBuilder prototype))
  (^onnx.OnnxMlProto3$TypeProto$Sequence$Builder []
    (OnnxMlProto3$TypeProto$Sequence/newBuilder )))

(defn *get-default-instance
  "returns: `onnx.OnnxMlProto3$TypeProto$Sequence`"
  (^onnx.OnnxMlProto3$TypeProto$Sequence []
    (OnnxMlProto3$TypeProto$Sequence/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<onnx.OnnxMlProto3$TypeProto$Sequence>`"
  (^com.github.os72.protobuf351.Parser []
    (OnnxMlProto3$TypeProto$Sequence/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^OnnxMlProto3$TypeProto$Sequence this]
    (-> this (.getUnknownFields))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^OnnxMlProto3$TypeProto$Sequence this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `onnx.OnnxMlProto3$TypeProto$Sequence`"
  (^onnx.OnnxMlProto3$TypeProto$Sequence [^OnnxMlProto3$TypeProto$Sequence this]
    (-> this (.getDefaultInstanceForType))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^OnnxMlProto3$TypeProto$Sequence this]
    (-> this (.getSerializedSize))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^OnnxMlProto3$TypeProto$Sequence this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn get-elem-type-or-builder
  "The type and optional shape of each element of the sequence.
   This field MUST be present for this version of the IR.
  .onnx.TypeProto elem_type = 1;

  returns: `onnx.OnnxMlProto3$TypeProtoOrBuilder`"
  (^onnx.OnnxMlProto3$TypeProtoOrBuilder [^OnnxMlProto3$TypeProto$Sequence this]
    (-> this (.getElemTypeOrBuilder))))

(defn hash-code
  "returns: `int`"
  (^Integer [^OnnxMlProto3$TypeProto$Sequence this]
    (-> this (.hashCode))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<onnx.OnnxMlProto3$TypeProto$Sequence>`"
  (^com.github.os72.protobuf351.Parser [^OnnxMlProto3$TypeProto$Sequence this]
    (-> this (.getParserForType))))

(defn has-elem-type?
  "The type and optional shape of each element of the sequence.
   This field MUST be present for this version of the IR.
  .onnx.TypeProto elem_type = 1;

  returns: `boolean`"
  (^Boolean [^OnnxMlProto3$TypeProto$Sequence this]
    (-> this (.hasElemType))))

(defn get-elem-type
  "The type and optional shape of each element of the sequence.
   This field MUST be present for this version of the IR.
  .onnx.TypeProto elem_type = 1;

  returns: `onnx.OnnxMlProto3$TypeProto`"
  (^onnx.OnnxMlProto3$TypeProto [^OnnxMlProto3$TypeProto$Sequence this]
    (-> this (.getElemType))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^OnnxMlProto3$TypeProto$Sequence this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `onnx.OnnxMlProto3$TypeProto$Sequence$Builder`"
  (^onnx.OnnxMlProto3$TypeProto$Sequence$Builder [^OnnxMlProto3$TypeProto$Sequence this]
    (-> this (.newBuilderForType))))

(defn to-builder
  "returns: `onnx.OnnxMlProto3$TypeProto$Sequence$Builder`"
  (^onnx.OnnxMlProto3$TypeProto$Sequence$Builder [^OnnxMlProto3$TypeProto$Sequence this]
    (-> this (.toBuilder))))

