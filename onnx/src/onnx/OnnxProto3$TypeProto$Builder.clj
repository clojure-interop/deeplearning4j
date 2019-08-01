(ns onnx.OnnxProto3$TypeProto$Builder
  " Define the types.
 Protobuf type onnx.TypeProto"
  (:refer-clojure :only [require comment defn ->])
  (:import [onnx OnnxProto3$TypeProto$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (OnnxProto3$TypeProto$Builder/getDescriptor )))

(defn set-tensor-type
  "The type of a tensor.
  .onnx.TypeProto.Tensor tensor_type = 1;

  value - `onnx.OnnxProto3$TypeProto$Tensor`

  returns: `onnx.OnnxProto3$TypeProto$Builder`"
  (^onnx.OnnxProto3$TypeProto$Builder [^OnnxProto3$TypeProto$Builder this ^onnx.OnnxProto3$TypeProto$Tensor value]
    (-> this (.setTensorType value))))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `onnx.OnnxProto3$TypeProto$Builder`"
  (^onnx.OnnxProto3$TypeProto$Builder [^OnnxProto3$TypeProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn build-partial
  "returns: `onnx.OnnxProto3$TypeProto`"
  (^onnx.OnnxProto3$TypeProto [^OnnxProto3$TypeProto$Builder this]
    (-> this (.buildPartial))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^OnnxProto3$TypeProto$Builder this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `onnx.OnnxProto3$TypeProto`"
  (^onnx.OnnxProto3$TypeProto [^OnnxProto3$TypeProto$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `onnx.OnnxProto3$TypeProto$Builder`"
  (^onnx.OnnxProto3$TypeProto$Builder [^OnnxProto3$TypeProto$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `onnx.OnnxProto3$TypeProto$Builder`"
  (^onnx.OnnxProto3$TypeProto$Builder [^OnnxProto3$TypeProto$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn clear-value
  "returns: `onnx.OnnxProto3$TypeProto$Builder`"
  (^onnx.OnnxProto3$TypeProto$Builder [^OnnxProto3$TypeProto$Builder this]
    (-> this (.clearValue))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `onnx.OnnxProto3$TypeProto$Builder`"
  (^onnx.OnnxProto3$TypeProto$Builder [^OnnxProto3$TypeProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn get-tensor-type
  "The type of a tensor.
  .onnx.TypeProto.Tensor tensor_type = 1;

  returns: `onnx.OnnxProto3$TypeProto$Tensor`"
  (^onnx.OnnxProto3$TypeProto$Tensor [^OnnxProto3$TypeProto$Builder this]
    (-> this (.getTensorType))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `onnx.OnnxProto3$TypeProto$Builder`"
  (^onnx.OnnxProto3$TypeProto$Builder [^OnnxProto3$TypeProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn build
  "returns: `onnx.OnnxProto3$TypeProto`"
  (^onnx.OnnxProto3$TypeProto [^OnnxProto3$TypeProto$Builder this]
    (-> this (.build))))

(defn get-value-case
  "returns: `onnx.OnnxProto3$TypeProto$ValueCase`"
  (^onnx.OnnxProto3$TypeProto$ValueCase [^OnnxProto3$TypeProto$Builder this]
    (-> this (.getValueCase))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `onnx.OnnxProto3$TypeProto$Builder`

  throws: java.io.IOException"
  (^onnx.OnnxProto3$TypeProto$Builder [^OnnxProto3$TypeProto$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^onnx.OnnxProto3$TypeProto$Builder [^OnnxProto3$TypeProto$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn clear-tensor-type
  "The type of a tensor.
  .onnx.TypeProto.Tensor tensor_type = 1;

  returns: `onnx.OnnxProto3$TypeProto$Builder`"
  (^onnx.OnnxProto3$TypeProto$Builder [^OnnxProto3$TypeProto$Builder this]
    (-> this (.clearTensorType))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `onnx.OnnxProto3$TypeProto$Builder`"
  (^onnx.OnnxProto3$TypeProto$Builder [^OnnxProto3$TypeProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn clone
  "returns: `onnx.OnnxProto3$TypeProto$Builder`"
  (^onnx.OnnxProto3$TypeProto$Builder [^OnnxProto3$TypeProto$Builder this]
    (-> this (.clone))))

(defn get-tensor-type-or-builder
  "The type of a tensor.
  .onnx.TypeProto.Tensor tensor_type = 1;

  returns: `onnx.OnnxProto3$TypeProto$TensorOrBuilder`"
  (^onnx.OnnxProto3$TypeProto$TensorOrBuilder [^OnnxProto3$TypeProto$Builder this]
    (-> this (.getTensorTypeOrBuilder))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^OnnxProto3$TypeProto$Builder this]
    (-> this (.getDescriptorForType))))

(defn clear
  "returns: `onnx.OnnxProto3$TypeProto$Builder`"
  (^onnx.OnnxProto3$TypeProto$Builder [^OnnxProto3$TypeProto$Builder this]
    (-> this (.clear))))

(defn merge-tensor-type
  "The type of a tensor.
  .onnx.TypeProto.Tensor tensor_type = 1;

  value - `onnx.OnnxProto3$TypeProto$Tensor`

  returns: `onnx.OnnxProto3$TypeProto$Builder`"
  (^onnx.OnnxProto3$TypeProto$Builder [^OnnxProto3$TypeProto$Builder this ^onnx.OnnxProto3$TypeProto$Tensor value]
    (-> this (.mergeTensorType value))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `onnx.OnnxProto3$TypeProto$Builder`"
  (^onnx.OnnxProto3$TypeProto$Builder [^OnnxProto3$TypeProto$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn get-tensor-type-builder
  "The type of a tensor.
  .onnx.TypeProto.Tensor tensor_type = 1;

  returns: `onnx.OnnxProto3$TypeProto$Tensor$Builder`"
  (^onnx.OnnxProto3$TypeProto$Tensor$Builder [^OnnxProto3$TypeProto$Builder this]
    (-> this (.getTensorTypeBuilder))))

(defn has-tensor-type?
  "The type of a tensor.
  .onnx.TypeProto.Tensor tensor_type = 1;

  returns: `boolean`"
  (^Boolean [^OnnxProto3$TypeProto$Builder this]
    (-> this (.hasTensorType))))

