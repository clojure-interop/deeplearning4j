(ns onnx.OnnxProto3$TypeProto$Tensor$Builder
  "Protobuf type onnx.TypeProto.Tensor"
  (:refer-clojure :only [require comment defn ->])
  (:import [onnx OnnxProto3$TypeProto$Tensor$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (OnnxProto3$TypeProto$Tensor$Builder/getDescriptor )))

(defn has-shape?
  ".onnx.TensorShapeProto shape = 2;

  returns: `boolean`"
  (^Boolean [^OnnxProto3$TypeProto$Tensor$Builder this]
    (-> this (.hasShape))))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `onnx.OnnxProto3$TypeProto$Tensor$Builder`"
  (^onnx.OnnxProto3$TypeProto$Tensor$Builder [^OnnxProto3$TypeProto$Tensor$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn build-partial
  "returns: `onnx.OnnxProto3$TypeProto$Tensor`"
  (^onnx.OnnxProto3$TypeProto$Tensor [^OnnxProto3$TypeProto$Tensor$Builder this]
    (-> this (.buildPartial))))

(defn clear-elem-type
  "This field MUST NOT have the value of UNDEFINED
   This field MUST be present for this version of the IR.
  .onnx.TensorProto.DataType elem_type = 1;

  returns: `onnx.OnnxProto3$TypeProto$Tensor$Builder`"
  (^onnx.OnnxProto3$TypeProto$Tensor$Builder [^OnnxProto3$TypeProto$Tensor$Builder this]
    (-> this (.clearElemType))))

(defn get-shape-or-builder
  ".onnx.TensorShapeProto shape = 2;

  returns: `onnx.OnnxProto3$TensorShapeProtoOrBuilder`"
  (^onnx.OnnxProto3$TensorShapeProtoOrBuilder [^OnnxProto3$TypeProto$Tensor$Builder this]
    (-> this (.getShapeOrBuilder))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^OnnxProto3$TypeProto$Tensor$Builder this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `onnx.OnnxProto3$TypeProto$Tensor`"
  (^onnx.OnnxProto3$TypeProto$Tensor [^OnnxProto3$TypeProto$Tensor$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `onnx.OnnxProto3$TypeProto$Tensor$Builder`"
  (^onnx.OnnxProto3$TypeProto$Tensor$Builder [^OnnxProto3$TypeProto$Tensor$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn set-elem-type-value
  "This field MUST NOT have the value of UNDEFINED
   This field MUST be present for this version of the IR.
  .onnx.TensorProto.DataType elem_type = 1;

  value - `int`

  returns: `onnx.OnnxProto3$TypeProto$Tensor$Builder`"
  (^onnx.OnnxProto3$TypeProto$Tensor$Builder [^OnnxProto3$TypeProto$Tensor$Builder this ^Integer value]
    (-> this (.setElemTypeValue value))))

(defn set-shape
  ".onnx.TensorShapeProto shape = 2;

  value - `onnx.OnnxProto3$TensorShapeProto`

  returns: `onnx.OnnxProto3$TypeProto$Tensor$Builder`"
  (^onnx.OnnxProto3$TypeProto$Tensor$Builder [^OnnxProto3$TypeProto$Tensor$Builder this ^onnx.OnnxProto3$TensorShapeProto value]
    (-> this (.setShape value))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `onnx.OnnxProto3$TypeProto$Tensor$Builder`"
  (^onnx.OnnxProto3$TypeProto$Tensor$Builder [^OnnxProto3$TypeProto$Tensor$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn set-elem-type
  "This field MUST NOT have the value of UNDEFINED
   This field MUST be present for this version of the IR.
  .onnx.TensorProto.DataType elem_type = 1;

  value - `onnx.OnnxProto3$TensorProto$DataType`

  returns: `onnx.OnnxProto3$TypeProto$Tensor$Builder`"
  (^onnx.OnnxProto3$TypeProto$Tensor$Builder [^OnnxProto3$TypeProto$Tensor$Builder this ^onnx.OnnxProto3$TensorProto$DataType value]
    (-> this (.setElemType value))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `onnx.OnnxProto3$TypeProto$Tensor$Builder`"
  (^onnx.OnnxProto3$TypeProto$Tensor$Builder [^OnnxProto3$TypeProto$Tensor$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `onnx.OnnxProto3$TypeProto$Tensor$Builder`"
  (^onnx.OnnxProto3$TypeProto$Tensor$Builder [^OnnxProto3$TypeProto$Tensor$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn build
  "returns: `onnx.OnnxProto3$TypeProto$Tensor`"
  (^onnx.OnnxProto3$TypeProto$Tensor [^OnnxProto3$TypeProto$Tensor$Builder this]
    (-> this (.build))))

(defn merge-shape
  ".onnx.TensorShapeProto shape = 2;

  value - `onnx.OnnxProto3$TensorShapeProto`

  returns: `onnx.OnnxProto3$TypeProto$Tensor$Builder`"
  (^onnx.OnnxProto3$TypeProto$Tensor$Builder [^OnnxProto3$TypeProto$Tensor$Builder this ^onnx.OnnxProto3$TensorShapeProto value]
    (-> this (.mergeShape value))))

(defn get-shape-builder
  ".onnx.TensorShapeProto shape = 2;

  returns: `onnx.OnnxProto3$TensorShapeProto$Builder`"
  (^onnx.OnnxProto3$TensorShapeProto$Builder [^OnnxProto3$TypeProto$Tensor$Builder this]
    (-> this (.getShapeBuilder))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `onnx.OnnxProto3$TypeProto$Tensor$Builder`

  throws: java.io.IOException"
  (^onnx.OnnxProto3$TypeProto$Tensor$Builder [^OnnxProto3$TypeProto$Tensor$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^onnx.OnnxProto3$TypeProto$Tensor$Builder [^OnnxProto3$TypeProto$Tensor$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn get-elem-type-value
  "This field MUST NOT have the value of UNDEFINED
   This field MUST be present for this version of the IR.
  .onnx.TensorProto.DataType elem_type = 1;

  returns: `int`"
  (^Integer [^OnnxProto3$TypeProto$Tensor$Builder this]
    (-> this (.getElemTypeValue))))

(defn get-shape
  ".onnx.TensorShapeProto shape = 2;

  returns: `onnx.OnnxProto3$TensorShapeProto`"
  (^onnx.OnnxProto3$TensorShapeProto [^OnnxProto3$TypeProto$Tensor$Builder this]
    (-> this (.getShape))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `onnx.OnnxProto3$TypeProto$Tensor$Builder`"
  (^onnx.OnnxProto3$TypeProto$Tensor$Builder [^OnnxProto3$TypeProto$Tensor$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn clone
  "returns: `onnx.OnnxProto3$TypeProto$Tensor$Builder`"
  (^onnx.OnnxProto3$TypeProto$Tensor$Builder [^OnnxProto3$TypeProto$Tensor$Builder this]
    (-> this (.clone))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^OnnxProto3$TypeProto$Tensor$Builder this]
    (-> this (.getDescriptorForType))))

(defn clear-shape
  ".onnx.TensorShapeProto shape = 2;

  returns: `onnx.OnnxProto3$TypeProto$Tensor$Builder`"
  (^onnx.OnnxProto3$TypeProto$Tensor$Builder [^OnnxProto3$TypeProto$Tensor$Builder this]
    (-> this (.clearShape))))

(defn clear
  "returns: `onnx.OnnxProto3$TypeProto$Tensor$Builder`"
  (^onnx.OnnxProto3$TypeProto$Tensor$Builder [^OnnxProto3$TypeProto$Tensor$Builder this]
    (-> this (.clear))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `onnx.OnnxProto3$TypeProto$Tensor$Builder`"
  (^onnx.OnnxProto3$TypeProto$Tensor$Builder [^OnnxProto3$TypeProto$Tensor$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn get-elem-type
  "This field MUST NOT have the value of UNDEFINED
   This field MUST be present for this version of the IR.
  .onnx.TensorProto.DataType elem_type = 1;

  returns: `onnx.OnnxProto3$TensorProto$DataType`"
  (^onnx.OnnxProto3$TensorProto$DataType [^OnnxProto3$TypeProto$Tensor$Builder this]
    (-> this (.getElemType))))

