(ns onnx.OnnxMlProto3$TensorShapeProto
  " Defines a tensor shape. A dimension can be either an integer value
  or a symbolic variable. A symbolic variable represents an unknown
  dimension.
 Protobuf type onnx.TensorShapeProto"
  (:refer-clojure :only [require comment defn ->])
  (:import [onnx OnnxMlProto3$TensorShapeProto]))

(def *-dim-field-number
  "Static Constant.

  type: int"
  OnnxMlProto3$TensorShapeProto/DIM_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (OnnxMlProto3$TensorShapeProto/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `onnx.OnnxMlProto3$TensorShapeProto`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^onnx.OnnxMlProto3$TensorShapeProto [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (OnnxMlProto3$TensorShapeProto/parseFrom data extension-registry))
  (^onnx.OnnxMlProto3$TensorShapeProto [^java.nio.ByteBuffer data]
    (OnnxMlProto3$TensorShapeProto/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `onnx.OnnxMlProto3$TensorShapeProto`

  throws: java.io.IOException"
  (^onnx.OnnxMlProto3$TensorShapeProto [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (OnnxMlProto3$TensorShapeProto/parseDelimitedFrom input extension-registry))
  (^onnx.OnnxMlProto3$TensorShapeProto [^java.io.InputStream input]
    (OnnxMlProto3$TensorShapeProto/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `onnx.OnnxMlProto3$TensorShapeProto`

  returns: `onnx.OnnxMlProto3$TensorShapeProto$Builder`"
  (^onnx.OnnxMlProto3$TensorShapeProto$Builder [^onnx.OnnxMlProto3$TensorShapeProto prototype]
    (OnnxMlProto3$TensorShapeProto/newBuilder prototype))
  (^onnx.OnnxMlProto3$TensorShapeProto$Builder []
    (OnnxMlProto3$TensorShapeProto/newBuilder )))

(defn *get-default-instance
  "returns: `onnx.OnnxMlProto3$TensorShapeProto`"
  (^onnx.OnnxMlProto3$TensorShapeProto []
    (OnnxMlProto3$TensorShapeProto/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<onnx.OnnxMlProto3$TensorShapeProto>`"
  (^com.github.os72.protobuf351.Parser []
    (OnnxMlProto3$TensorShapeProto/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^OnnxMlProto3$TensorShapeProto this]
    (-> this (.getUnknownFields))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^OnnxMlProto3$TensorShapeProto this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `onnx.OnnxMlProto3$TensorShapeProto`"
  (^onnx.OnnxMlProto3$TensorShapeProto [^OnnxMlProto3$TensorShapeProto this]
    (-> this (.getDefaultInstanceForType))))

(defn get-dim
  "repeated .onnx.TensorShapeProto.Dimension dim = 1;

  index - `int`

  returns: `onnx.OnnxMlProto3$TensorShapeProto$Dimension`"
  (^onnx.OnnxMlProto3$TensorShapeProto$Dimension [^OnnxMlProto3$TensorShapeProto this ^Integer index]
    (-> this (.getDim index))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^OnnxMlProto3$TensorShapeProto this]
    (-> this (.getSerializedSize))))

(defn get-dim-or-builder
  "repeated .onnx.TensorShapeProto.Dimension dim = 1;

  index - `int`

  returns: `onnx.OnnxMlProto3$TensorShapeProto$DimensionOrBuilder`"
  (^onnx.OnnxMlProto3$TensorShapeProto$DimensionOrBuilder [^OnnxMlProto3$TensorShapeProto this ^Integer index]
    (-> this (.getDimOrBuilder index))))

(defn get-dim-list
  "repeated .onnx.TensorShapeProto.Dimension dim = 1;

  returns: `java.util.List<onnx.OnnxMlProto3$TensorShapeProto$Dimension>`"
  (^java.util.List [^OnnxMlProto3$TensorShapeProto this]
    (-> this (.getDimList))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^OnnxMlProto3$TensorShapeProto this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn hash-code
  "returns: `int`"
  (^Integer [^OnnxMlProto3$TensorShapeProto this]
    (-> this (.hashCode))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<onnx.OnnxMlProto3$TensorShapeProto>`"
  (^com.github.os72.protobuf351.Parser [^OnnxMlProto3$TensorShapeProto this]
    (-> this (.getParserForType))))

(defn get-dim-or-builder-list
  "repeated .onnx.TensorShapeProto.Dimension dim = 1;

  returns: `java.util.List<? extends onnx.OnnxMlProto3$TensorShapeProto$DimensionOrBuilder>`"
  ([^OnnxMlProto3$TensorShapeProto this]
    (-> this (.getDimOrBuilderList))))

(defn get-dim-count
  "repeated .onnx.TensorShapeProto.Dimension dim = 1;

  returns: `int`"
  (^Integer [^OnnxMlProto3$TensorShapeProto this]
    (-> this (.getDimCount))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^OnnxMlProto3$TensorShapeProto this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `onnx.OnnxMlProto3$TensorShapeProto$Builder`"
  (^onnx.OnnxMlProto3$TensorShapeProto$Builder [^OnnxMlProto3$TensorShapeProto this]
    (-> this (.newBuilderForType))))

(defn to-builder
  "returns: `onnx.OnnxMlProto3$TensorShapeProto$Builder`"
  (^onnx.OnnxMlProto3$TensorShapeProto$Builder [^OnnxMlProto3$TensorShapeProto this]
    (-> this (.toBuilder))))

