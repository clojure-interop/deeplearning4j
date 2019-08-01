(ns onnx.OnnxProto3$TensorShapeProto
  " Defines a tensor shape. A dimension can be either an integer value
  or a symbolic variable. A symbolic variable represents an unknown
  dimension.
 Protobuf type onnx.TensorShapeProto"
  (:refer-clojure :only [require comment defn ->])
  (:import [onnx OnnxProto3$TensorShapeProto]))

(def *-dim-field-number
  "Static Constant.

  type: int"
  OnnxProto3$TensorShapeProto/DIM_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (OnnxProto3$TensorShapeProto/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `onnx.OnnxProto3$TensorShapeProto`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^onnx.OnnxProto3$TensorShapeProto [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (OnnxProto3$TensorShapeProto/parseFrom data extension-registry))
  (^onnx.OnnxProto3$TensorShapeProto [^java.nio.ByteBuffer data]
    (OnnxProto3$TensorShapeProto/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `onnx.OnnxProto3$TensorShapeProto`

  throws: java.io.IOException"
  (^onnx.OnnxProto3$TensorShapeProto [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (OnnxProto3$TensorShapeProto/parseDelimitedFrom input extension-registry))
  (^onnx.OnnxProto3$TensorShapeProto [^java.io.InputStream input]
    (OnnxProto3$TensorShapeProto/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `onnx.OnnxProto3$TensorShapeProto`

  returns: `onnx.OnnxProto3$TensorShapeProto$Builder`"
  (^onnx.OnnxProto3$TensorShapeProto$Builder [^onnx.OnnxProto3$TensorShapeProto prototype]
    (OnnxProto3$TensorShapeProto/newBuilder prototype))
  (^onnx.OnnxProto3$TensorShapeProto$Builder []
    (OnnxProto3$TensorShapeProto/newBuilder )))

(defn *get-default-instance
  "returns: `onnx.OnnxProto3$TensorShapeProto`"
  (^onnx.OnnxProto3$TensorShapeProto []
    (OnnxProto3$TensorShapeProto/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<onnx.OnnxProto3$TensorShapeProto>`"
  (^com.github.os72.protobuf351.Parser []
    (OnnxProto3$TensorShapeProto/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^OnnxProto3$TensorShapeProto this]
    (-> this (.getUnknownFields))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^OnnxProto3$TensorShapeProto this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `onnx.OnnxProto3$TensorShapeProto`"
  (^onnx.OnnxProto3$TensorShapeProto [^OnnxProto3$TensorShapeProto this]
    (-> this (.getDefaultInstanceForType))))

(defn get-dim
  "repeated .onnx.TensorShapeProto.Dimension dim = 1;

  index - `int`

  returns: `onnx.OnnxProto3$TensorShapeProto$Dimension`"
  (^onnx.OnnxProto3$TensorShapeProto$Dimension [^OnnxProto3$TensorShapeProto this ^Integer index]
    (-> this (.getDim index))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^OnnxProto3$TensorShapeProto this]
    (-> this (.getSerializedSize))))

(defn get-dim-or-builder
  "repeated .onnx.TensorShapeProto.Dimension dim = 1;

  index - `int`

  returns: `onnx.OnnxProto3$TensorShapeProto$DimensionOrBuilder`"
  (^onnx.OnnxProto3$TensorShapeProto$DimensionOrBuilder [^OnnxProto3$TensorShapeProto this ^Integer index]
    (-> this (.getDimOrBuilder index))))

(defn get-dim-list
  "repeated .onnx.TensorShapeProto.Dimension dim = 1;

  returns: `java.util.List<onnx.OnnxProto3$TensorShapeProto$Dimension>`"
  (^java.util.List [^OnnxProto3$TensorShapeProto this]
    (-> this (.getDimList))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^OnnxProto3$TensorShapeProto this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn hash-code
  "returns: `int`"
  (^Integer [^OnnxProto3$TensorShapeProto this]
    (-> this (.hashCode))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<onnx.OnnxProto3$TensorShapeProto>`"
  (^com.github.os72.protobuf351.Parser [^OnnxProto3$TensorShapeProto this]
    (-> this (.getParserForType))))

(defn get-dim-or-builder-list
  "repeated .onnx.TensorShapeProto.Dimension dim = 1;

  returns: `java.util.List<? extends onnx.OnnxProto3$TensorShapeProto$DimensionOrBuilder>`"
  ([^OnnxProto3$TensorShapeProto this]
    (-> this (.getDimOrBuilderList))))

(defn get-dim-count
  "repeated .onnx.TensorShapeProto.Dimension dim = 1;

  returns: `int`"
  (^Integer [^OnnxProto3$TensorShapeProto this]
    (-> this (.getDimCount))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^OnnxProto3$TensorShapeProto this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `onnx.OnnxProto3$TensorShapeProto$Builder`"
  (^onnx.OnnxProto3$TensorShapeProto$Builder [^OnnxProto3$TensorShapeProto this]
    (-> this (.newBuilderForType))))

(defn to-builder
  "returns: `onnx.OnnxProto3$TensorShapeProto$Builder`"
  (^onnx.OnnxProto3$TensorShapeProto$Builder [^OnnxProto3$TensorShapeProto this]
    (-> this (.toBuilder))))

