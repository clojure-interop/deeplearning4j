(ns onnx.OnnxMlProto3$TypeProto$Builder
  " Define the types.
 Protobuf type onnx.TypeProto"
  (:refer-clojure :only [require comment defn ->])
  (:import [onnx OnnxMlProto3$TypeProto$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (OnnxMlProto3$TypeProto$Builder/getDescriptor )))

(defn set-tensor-type
  "The type of a tensor.
  .onnx.TypeProto.Tensor tensor_type = 1;

  value - `onnx.OnnxMlProto3$TypeProto$Tensor`

  returns: `onnx.OnnxMlProto3$TypeProto$Builder`"
  (^onnx.OnnxMlProto3$TypeProto$Builder [^OnnxMlProto3$TypeProto$Builder this ^onnx.OnnxMlProto3$TypeProto$Tensor value]
    (-> this (.setTensorType value))))

(defn set-map-type
  "The type of a map.
  .onnx.TypeProto.Map map_type = 5;

  value - `onnx.OnnxMlProto3$TypeProto$Map`

  returns: `onnx.OnnxMlProto3$TypeProto$Builder`"
  (^onnx.OnnxMlProto3$TypeProto$Builder [^OnnxMlProto3$TypeProto$Builder this ^onnx.OnnxMlProto3$TypeProto$Map value]
    (-> this (.setMapType value))))

(defn get-sequence-type
  "The type of a sequence.
  .onnx.TypeProto.Sequence sequence_type = 4;

  returns: `onnx.OnnxMlProto3$TypeProto$Sequence`"
  (^onnx.OnnxMlProto3$TypeProto$Sequence [^OnnxMlProto3$TypeProto$Builder this]
    (-> this (.getSequenceType))))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `onnx.OnnxMlProto3$TypeProto$Builder`"
  (^onnx.OnnxMlProto3$TypeProto$Builder [^OnnxMlProto3$TypeProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn merge-map-type
  "The type of a map.
  .onnx.TypeProto.Map map_type = 5;

  value - `onnx.OnnxMlProto3$TypeProto$Map`

  returns: `onnx.OnnxMlProto3$TypeProto$Builder`"
  (^onnx.OnnxMlProto3$TypeProto$Builder [^OnnxMlProto3$TypeProto$Builder this ^onnx.OnnxMlProto3$TypeProto$Map value]
    (-> this (.mergeMapType value))))

(defn build-partial
  "returns: `onnx.OnnxMlProto3$TypeProto`"
  (^onnx.OnnxMlProto3$TypeProto [^OnnxMlProto3$TypeProto$Builder this]
    (-> this (.buildPartial))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^OnnxMlProto3$TypeProto$Builder this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `onnx.OnnxMlProto3$TypeProto`"
  (^onnx.OnnxMlProto3$TypeProto [^OnnxMlProto3$TypeProto$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `onnx.OnnxMlProto3$TypeProto$Builder`"
  (^onnx.OnnxMlProto3$TypeProto$Builder [^OnnxMlProto3$TypeProto$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn clear-map-type
  "The type of a map.
  .onnx.TypeProto.Map map_type = 5;

  returns: `onnx.OnnxMlProto3$TypeProto$Builder`"
  (^onnx.OnnxMlProto3$TypeProto$Builder [^OnnxMlProto3$TypeProto$Builder this]
    (-> this (.clearMapType))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `onnx.OnnxMlProto3$TypeProto$Builder`"
  (^onnx.OnnxMlProto3$TypeProto$Builder [^OnnxMlProto3$TypeProto$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn get-map-type
  "The type of a map.
  .onnx.TypeProto.Map map_type = 5;

  returns: `onnx.OnnxMlProto3$TypeProto$Map`"
  (^onnx.OnnxMlProto3$TypeProto$Map [^OnnxMlProto3$TypeProto$Builder this]
    (-> this (.getMapType))))

(defn get-map-type-or-builder
  "The type of a map.
  .onnx.TypeProto.Map map_type = 5;

  returns: `onnx.OnnxMlProto3$TypeProto$MapOrBuilder`"
  (^onnx.OnnxMlProto3$TypeProto$MapOrBuilder [^OnnxMlProto3$TypeProto$Builder this]
    (-> this (.getMapTypeOrBuilder))))

(defn has-sequence-type?
  "The type of a sequence.
  .onnx.TypeProto.Sequence sequence_type = 4;

  returns: `boolean`"
  (^Boolean [^OnnxMlProto3$TypeProto$Builder this]
    (-> this (.hasSequenceType))))

(defn clear-value
  "returns: `onnx.OnnxMlProto3$TypeProto$Builder`"
  (^onnx.OnnxMlProto3$TypeProto$Builder [^OnnxMlProto3$TypeProto$Builder this]
    (-> this (.clearValue))))

(defn has-map-type?
  "The type of a map.
  .onnx.TypeProto.Map map_type = 5;

  returns: `boolean`"
  (^Boolean [^OnnxMlProto3$TypeProto$Builder this]
    (-> this (.hasMapType))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `onnx.OnnxMlProto3$TypeProto$Builder`"
  (^onnx.OnnxMlProto3$TypeProto$Builder [^OnnxMlProto3$TypeProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn get-tensor-type
  "The type of a tensor.
  .onnx.TypeProto.Tensor tensor_type = 1;

  returns: `onnx.OnnxMlProto3$TypeProto$Tensor`"
  (^onnx.OnnxMlProto3$TypeProto$Tensor [^OnnxMlProto3$TypeProto$Builder this]
    (-> this (.getTensorType))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `onnx.OnnxMlProto3$TypeProto$Builder`"
  (^onnx.OnnxMlProto3$TypeProto$Builder [^OnnxMlProto3$TypeProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn get-sequence-type-builder
  "The type of a sequence.
  .onnx.TypeProto.Sequence sequence_type = 4;

  returns: `onnx.OnnxMlProto3$TypeProto$Sequence$Builder`"
  (^onnx.OnnxMlProto3$TypeProto$Sequence$Builder [^OnnxMlProto3$TypeProto$Builder this]
    (-> this (.getSequenceTypeBuilder))))

(defn build
  "returns: `onnx.OnnxMlProto3$TypeProto`"
  (^onnx.OnnxMlProto3$TypeProto [^OnnxMlProto3$TypeProto$Builder this]
    (-> this (.build))))

(defn get-sequence-type-or-builder
  "The type of a sequence.
  .onnx.TypeProto.Sequence sequence_type = 4;

  returns: `onnx.OnnxMlProto3$TypeProto$SequenceOrBuilder`"
  (^onnx.OnnxMlProto3$TypeProto$SequenceOrBuilder [^OnnxMlProto3$TypeProto$Builder this]
    (-> this (.getSequenceTypeOrBuilder))))

(defn get-value-case
  "returns: `onnx.OnnxMlProto3$TypeProto$ValueCase`"
  (^onnx.OnnxMlProto3$TypeProto$ValueCase [^OnnxMlProto3$TypeProto$Builder this]
    (-> this (.getValueCase))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `onnx.OnnxMlProto3$TypeProto$Builder`

  throws: java.io.IOException"
  (^onnx.OnnxMlProto3$TypeProto$Builder [^OnnxMlProto3$TypeProto$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^onnx.OnnxMlProto3$TypeProto$Builder [^OnnxMlProto3$TypeProto$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn set-sequence-type
  "The type of a sequence.
  .onnx.TypeProto.Sequence sequence_type = 4;

  value - `onnx.OnnxMlProto3$TypeProto$Sequence`

  returns: `onnx.OnnxMlProto3$TypeProto$Builder`"
  (^onnx.OnnxMlProto3$TypeProto$Builder [^OnnxMlProto3$TypeProto$Builder this ^onnx.OnnxMlProto3$TypeProto$Sequence value]
    (-> this (.setSequenceType value))))

(defn clear-tensor-type
  "The type of a tensor.
  .onnx.TypeProto.Tensor tensor_type = 1;

  returns: `onnx.OnnxMlProto3$TypeProto$Builder`"
  (^onnx.OnnxMlProto3$TypeProto$Builder [^OnnxMlProto3$TypeProto$Builder this]
    (-> this (.clearTensorType))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `onnx.OnnxMlProto3$TypeProto$Builder`"
  (^onnx.OnnxMlProto3$TypeProto$Builder [^OnnxMlProto3$TypeProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn clone
  "returns: `onnx.OnnxMlProto3$TypeProto$Builder`"
  (^onnx.OnnxMlProto3$TypeProto$Builder [^OnnxMlProto3$TypeProto$Builder this]
    (-> this (.clone))))

(defn get-tensor-type-or-builder
  "The type of a tensor.
  .onnx.TypeProto.Tensor tensor_type = 1;

  returns: `onnx.OnnxMlProto3$TypeProto$TensorOrBuilder`"
  (^onnx.OnnxMlProto3$TypeProto$TensorOrBuilder [^OnnxMlProto3$TypeProto$Builder this]
    (-> this (.getTensorTypeOrBuilder))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^OnnxMlProto3$TypeProto$Builder this]
    (-> this (.getDescriptorForType))))

(defn clear-sequence-type
  "The type of a sequence.
  .onnx.TypeProto.Sequence sequence_type = 4;

  returns: `onnx.OnnxMlProto3$TypeProto$Builder`"
  (^onnx.OnnxMlProto3$TypeProto$Builder [^OnnxMlProto3$TypeProto$Builder this]
    (-> this (.clearSequenceType))))

(defn clear
  "returns: `onnx.OnnxMlProto3$TypeProto$Builder`"
  (^onnx.OnnxMlProto3$TypeProto$Builder [^OnnxMlProto3$TypeProto$Builder this]
    (-> this (.clear))))

(defn merge-tensor-type
  "The type of a tensor.
  .onnx.TypeProto.Tensor tensor_type = 1;

  value - `onnx.OnnxMlProto3$TypeProto$Tensor`

  returns: `onnx.OnnxMlProto3$TypeProto$Builder`"
  (^onnx.OnnxMlProto3$TypeProto$Builder [^OnnxMlProto3$TypeProto$Builder this ^onnx.OnnxMlProto3$TypeProto$Tensor value]
    (-> this (.mergeTensorType value))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `onnx.OnnxMlProto3$TypeProto$Builder`"
  (^onnx.OnnxMlProto3$TypeProto$Builder [^OnnxMlProto3$TypeProto$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn get-tensor-type-builder
  "The type of a tensor.
  .onnx.TypeProto.Tensor tensor_type = 1;

  returns: `onnx.OnnxMlProto3$TypeProto$Tensor$Builder`"
  (^onnx.OnnxMlProto3$TypeProto$Tensor$Builder [^OnnxMlProto3$TypeProto$Builder this]
    (-> this (.getTensorTypeBuilder))))

(defn has-tensor-type?
  "The type of a tensor.
  .onnx.TypeProto.Tensor tensor_type = 1;

  returns: `boolean`"
  (^Boolean [^OnnxMlProto3$TypeProto$Builder this]
    (-> this (.hasTensorType))))

(defn merge-sequence-type
  "The type of a sequence.
  .onnx.TypeProto.Sequence sequence_type = 4;

  value - `onnx.OnnxMlProto3$TypeProto$Sequence`

  returns: `onnx.OnnxMlProto3$TypeProto$Builder`"
  (^onnx.OnnxMlProto3$TypeProto$Builder [^OnnxMlProto3$TypeProto$Builder this ^onnx.OnnxMlProto3$TypeProto$Sequence value]
    (-> this (.mergeSequenceType value))))

(defn get-map-type-builder
  "The type of a map.
  .onnx.TypeProto.Map map_type = 5;

  returns: `onnx.OnnxMlProto3$TypeProto$Map$Builder`"
  (^onnx.OnnxMlProto3$TypeProto$Map$Builder [^OnnxMlProto3$TypeProto$Builder this]
    (-> this (.getMapTypeBuilder))))

