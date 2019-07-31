(ns onnx.OnnxMlProto3$TypeProto$Sequence$Builder
  " repeated T
 Protobuf type onnx.TypeProto.Sequence"
  (:refer-clojure :only [require comment defn ->])
  (:import [onnx OnnxMlProto3$TypeProto$Sequence$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (OnnxMlProto3$TypeProto$Sequence$Builder/getDescriptor )))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `onnx.OnnxMlProto3$TypeProto$Sequence$Builder`"
  (^onnx.OnnxMlProto3$TypeProto$Sequence$Builder [^OnnxMlProto3$TypeProto$Sequence$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn build-partial
  "returns: `onnx.OnnxMlProto3$TypeProto$Sequence`"
  (^onnx.OnnxMlProto3$TypeProto$Sequence [^OnnxMlProto3$TypeProto$Sequence$Builder this]
    (-> this (.buildPartial))))

(defn clear-elem-type
  "The type and optional shape of each element of the sequence.
   This field MUST be present for this version of the IR.
  .onnx.TypeProto elem_type = 1;

  returns: `onnx.OnnxMlProto3$TypeProto$Sequence$Builder`"
  (^onnx.OnnxMlProto3$TypeProto$Sequence$Builder [^OnnxMlProto3$TypeProto$Sequence$Builder this]
    (-> this (.clearElemType))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^OnnxMlProto3$TypeProto$Sequence$Builder this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `onnx.OnnxMlProto3$TypeProto$Sequence`"
  (^onnx.OnnxMlProto3$TypeProto$Sequence [^OnnxMlProto3$TypeProto$Sequence$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `onnx.OnnxMlProto3$TypeProto$Sequence$Builder`"
  (^onnx.OnnxMlProto3$TypeProto$Sequence$Builder [^OnnxMlProto3$TypeProto$Sequence$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `onnx.OnnxMlProto3$TypeProto$Sequence$Builder`"
  (^onnx.OnnxMlProto3$TypeProto$Sequence$Builder [^OnnxMlProto3$TypeProto$Sequence$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn set-elem-type
  "The type and optional shape of each element of the sequence.
   This field MUST be present for this version of the IR.
  .onnx.TypeProto elem_type = 1;

  value - `onnx.OnnxMlProto3$TypeProto`

  returns: `onnx.OnnxMlProto3$TypeProto$Sequence$Builder`"
  (^onnx.OnnxMlProto3$TypeProto$Sequence$Builder [^OnnxMlProto3$TypeProto$Sequence$Builder this ^onnx.OnnxMlProto3$TypeProto value]
    (-> this (.setElemType value))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `onnx.OnnxMlProto3$TypeProto$Sequence$Builder`"
  (^onnx.OnnxMlProto3$TypeProto$Sequence$Builder [^OnnxMlProto3$TypeProto$Sequence$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `onnx.OnnxMlProto3$TypeProto$Sequence$Builder`"
  (^onnx.OnnxMlProto3$TypeProto$Sequence$Builder [^OnnxMlProto3$TypeProto$Sequence$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn build
  "returns: `onnx.OnnxMlProto3$TypeProto$Sequence`"
  (^onnx.OnnxMlProto3$TypeProto$Sequence [^OnnxMlProto3$TypeProto$Sequence$Builder this]
    (-> this (.build))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `onnx.OnnxMlProto3$TypeProto$Sequence$Builder`

  throws: java.io.IOException"
  (^onnx.OnnxMlProto3$TypeProto$Sequence$Builder [^OnnxMlProto3$TypeProto$Sequence$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^onnx.OnnxMlProto3$TypeProto$Sequence$Builder [^OnnxMlProto3$TypeProto$Sequence$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn get-elem-type-or-builder
  "The type and optional shape of each element of the sequence.
   This field MUST be present for this version of the IR.
  .onnx.TypeProto elem_type = 1;

  returns: `onnx.OnnxMlProto3$TypeProtoOrBuilder`"
  (^onnx.OnnxMlProto3$TypeProtoOrBuilder [^OnnxMlProto3$TypeProto$Sequence$Builder this]
    (-> this (.getElemTypeOrBuilder))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `onnx.OnnxMlProto3$TypeProto$Sequence$Builder`"
  (^onnx.OnnxMlProto3$TypeProto$Sequence$Builder [^OnnxMlProto3$TypeProto$Sequence$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn clone
  "returns: `onnx.OnnxMlProto3$TypeProto$Sequence$Builder`"
  (^onnx.OnnxMlProto3$TypeProto$Sequence$Builder [^OnnxMlProto3$TypeProto$Sequence$Builder this]
    (-> this (.clone))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^OnnxMlProto3$TypeProto$Sequence$Builder this]
    (-> this (.getDescriptorForType))))

(defn clear
  "returns: `onnx.OnnxMlProto3$TypeProto$Sequence$Builder`"
  (^onnx.OnnxMlProto3$TypeProto$Sequence$Builder [^OnnxMlProto3$TypeProto$Sequence$Builder this]
    (-> this (.clear))))

(defn merge-elem-type
  "The type and optional shape of each element of the sequence.
   This field MUST be present for this version of the IR.
  .onnx.TypeProto elem_type = 1;

  value - `onnx.OnnxMlProto3$TypeProto`

  returns: `onnx.OnnxMlProto3$TypeProto$Sequence$Builder`"
  (^onnx.OnnxMlProto3$TypeProto$Sequence$Builder [^OnnxMlProto3$TypeProto$Sequence$Builder this ^onnx.OnnxMlProto3$TypeProto value]
    (-> this (.mergeElemType value))))

(defn has-elem-type?
  "The type and optional shape of each element of the sequence.
   This field MUST be present for this version of the IR.
  .onnx.TypeProto elem_type = 1;

  returns: `boolean`"
  (^Boolean [^OnnxMlProto3$TypeProto$Sequence$Builder this]
    (-> this (.hasElemType))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `onnx.OnnxMlProto3$TypeProto$Sequence$Builder`"
  (^onnx.OnnxMlProto3$TypeProto$Sequence$Builder [^OnnxMlProto3$TypeProto$Sequence$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn get-elem-type
  "The type and optional shape of each element of the sequence.
   This field MUST be present for this version of the IR.
  .onnx.TypeProto elem_type = 1;

  returns: `onnx.OnnxMlProto3$TypeProto`"
  (^onnx.OnnxMlProto3$TypeProto [^OnnxMlProto3$TypeProto$Sequence$Builder this]
    (-> this (.getElemType))))

(defn get-elem-type-builder
  "The type and optional shape of each element of the sequence.
   This field MUST be present for this version of the IR.
  .onnx.TypeProto elem_type = 1;

  returns: `onnx.OnnxMlProto3$TypeProto$Builder`"
  (^onnx.OnnxMlProto3$TypeProto$Builder [^OnnxMlProto3$TypeProto$Sequence$Builder this]
    (-> this (.getElemTypeBuilder))))

