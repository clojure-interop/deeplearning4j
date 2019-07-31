(ns onnx.OnnxProto3$TensorProto$Segment
  " For very large tensors, we may want to store them in chunks, in which
  case the following fields will specify the segment that is stored in
  the current TensorProto.
 Protobuf type onnx.TensorProto.Segment"
  (:refer-clojure :only [require comment defn ->])
  (:import [onnx OnnxProto3$TensorProto$Segment]))

(def *-begin-field-number
  "Static Constant.

  type: int"
  OnnxProto3$TensorProto$Segment/BEGIN_FIELD_NUMBER)

(def *-end-field-number
  "Static Constant.

  type: int"
  OnnxProto3$TensorProto$Segment/END_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (OnnxProto3$TensorProto$Segment/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `onnx.OnnxProto3$TensorProto$Segment`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^onnx.OnnxProto3$TensorProto$Segment [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (OnnxProto3$TensorProto$Segment/parseFrom data extension-registry))
  (^onnx.OnnxProto3$TensorProto$Segment [^java.nio.ByteBuffer data]
    (OnnxProto3$TensorProto$Segment/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `onnx.OnnxProto3$TensorProto$Segment`

  throws: java.io.IOException"
  (^onnx.OnnxProto3$TensorProto$Segment [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (OnnxProto3$TensorProto$Segment/parseDelimitedFrom input extension-registry))
  (^onnx.OnnxProto3$TensorProto$Segment [^java.io.InputStream input]
    (OnnxProto3$TensorProto$Segment/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `onnx.OnnxProto3$TensorProto$Segment`

  returns: `onnx.OnnxProto3$TensorProto$Segment$Builder`"
  (^onnx.OnnxProto3$TensorProto$Segment$Builder [^onnx.OnnxProto3$TensorProto$Segment prototype]
    (OnnxProto3$TensorProto$Segment/newBuilder prototype))
  (^onnx.OnnxProto3$TensorProto$Segment$Builder []
    (OnnxProto3$TensorProto$Segment/newBuilder )))

(defn *get-default-instance
  "returns: `onnx.OnnxProto3$TensorProto$Segment`"
  (^onnx.OnnxProto3$TensorProto$Segment []
    (OnnxProto3$TensorProto$Segment/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<onnx.OnnxProto3$TensorProto$Segment>`"
  (^com.github.os72.protobuf351.Parser []
    (OnnxProto3$TensorProto$Segment/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^OnnxProto3$TensorProto$Segment this]
    (-> this (.getUnknownFields))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^OnnxProto3$TensorProto$Segment this]
    (-> this (.isInitialized))))

(defn get-begin
  "int64 begin = 1;

  returns: `long`"
  (^Long [^OnnxProto3$TensorProto$Segment this]
    (-> this (.getBegin))))

(defn get-default-instance-for-type
  "returns: `onnx.OnnxProto3$TensorProto$Segment`"
  (^onnx.OnnxProto3$TensorProto$Segment [^OnnxProto3$TensorProto$Segment this]
    (-> this (.getDefaultInstanceForType))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^OnnxProto3$TensorProto$Segment this]
    (-> this (.getSerializedSize))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^OnnxProto3$TensorProto$Segment this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn get-end
  "int64 end = 2;

  returns: `long`"
  (^Long [^OnnxProto3$TensorProto$Segment this]
    (-> this (.getEnd))))

(defn hash-code
  "returns: `int`"
  (^Integer [^OnnxProto3$TensorProto$Segment this]
    (-> this (.hashCode))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<onnx.OnnxProto3$TensorProto$Segment>`"
  (^com.github.os72.protobuf351.Parser [^OnnxProto3$TensorProto$Segment this]
    (-> this (.getParserForType))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^OnnxProto3$TensorProto$Segment this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `onnx.OnnxProto3$TensorProto$Segment$Builder`"
  (^onnx.OnnxProto3$TensorProto$Segment$Builder [^OnnxProto3$TensorProto$Segment this]
    (-> this (.newBuilderForType))))

(defn to-builder
  "returns: `onnx.OnnxProto3$TensorProto$Segment$Builder`"
  (^onnx.OnnxProto3$TensorProto$Segment$Builder [^OnnxProto3$TensorProto$Segment this]
    (-> this (.toBuilder))))

