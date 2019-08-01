(ns onnx.OnnxMlProto3$OperatorSetIdProto$Builder
  " OperatorSets are uniquely identified by a (domain, opset_version) pair.
 Protobuf type onnx.OperatorSetIdProto"
  (:refer-clojure :only [require comment defn ->])
  (:import [onnx OnnxMlProto3$OperatorSetIdProto$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (OnnxMlProto3$OperatorSetIdProto$Builder/getDescriptor )))

(defn set-version
  "The version of the operator set being identified.
   This field MUST be present in this version of the IR.
  int64 version = 2;

  value - `long`

  returns: `onnx.OnnxMlProto3$OperatorSetIdProto$Builder`"
  (^onnx.OnnxMlProto3$OperatorSetIdProto$Builder [^OnnxMlProto3$OperatorSetIdProto$Builder this ^Long value]
    (-> this (.setVersion value))))

(defn clear-domain
  "The domain of the operator set being identified.
   The empty string (\"\") or absence of this field implies the operator
   set that is defined as part of the ONNX specification.
   This field MUST be present in this version of the IR when referring to any other operator set.
  string domain = 1;

  returns: `onnx.OnnxMlProto3$OperatorSetIdProto$Builder`"
  (^onnx.OnnxMlProto3$OperatorSetIdProto$Builder [^OnnxMlProto3$OperatorSetIdProto$Builder this]
    (-> this (.clearDomain))))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `onnx.OnnxMlProto3$OperatorSetIdProto$Builder`"
  (^onnx.OnnxMlProto3$OperatorSetIdProto$Builder [^OnnxMlProto3$OperatorSetIdProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn build-partial
  "returns: `onnx.OnnxMlProto3$OperatorSetIdProto`"
  (^onnx.OnnxMlProto3$OperatorSetIdProto [^OnnxMlProto3$OperatorSetIdProto$Builder this]
    (-> this (.buildPartial))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^OnnxMlProto3$OperatorSetIdProto$Builder this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `onnx.OnnxMlProto3$OperatorSetIdProto`"
  (^onnx.OnnxMlProto3$OperatorSetIdProto [^OnnxMlProto3$OperatorSetIdProto$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `onnx.OnnxMlProto3$OperatorSetIdProto$Builder`"
  (^onnx.OnnxMlProto3$OperatorSetIdProto$Builder [^OnnxMlProto3$OperatorSetIdProto$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn get-domain-bytes
  "The domain of the operator set being identified.
   The empty string (\"\") or absence of this field implies the operator
   set that is defined as part of the ONNX specification.
   This field MUST be present in this version of the IR when referring to any other operator set.
  string domain = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxMlProto3$OperatorSetIdProto$Builder this]
    (-> this (.getDomainBytes))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `onnx.OnnxMlProto3$OperatorSetIdProto$Builder`"
  (^onnx.OnnxMlProto3$OperatorSetIdProto$Builder [^OnnxMlProto3$OperatorSetIdProto$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `onnx.OnnxMlProto3$OperatorSetIdProto$Builder`"
  (^onnx.OnnxMlProto3$OperatorSetIdProto$Builder [^OnnxMlProto3$OperatorSetIdProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn clear-version
  "The version of the operator set being identified.
   This field MUST be present in this version of the IR.
  int64 version = 2;

  returns: `onnx.OnnxMlProto3$OperatorSetIdProto$Builder`"
  (^onnx.OnnxMlProto3$OperatorSetIdProto$Builder [^OnnxMlProto3$OperatorSetIdProto$Builder this]
    (-> this (.clearVersion))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `onnx.OnnxMlProto3$OperatorSetIdProto$Builder`"
  (^onnx.OnnxMlProto3$OperatorSetIdProto$Builder [^OnnxMlProto3$OperatorSetIdProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn get-version
  "The version of the operator set being identified.
   This field MUST be present in this version of the IR.
  int64 version = 2;

  returns: `long`"
  (^Long [^OnnxMlProto3$OperatorSetIdProto$Builder this]
    (-> this (.getVersion))))

(defn build
  "returns: `onnx.OnnxMlProto3$OperatorSetIdProto`"
  (^onnx.OnnxMlProto3$OperatorSetIdProto [^OnnxMlProto3$OperatorSetIdProto$Builder this]
    (-> this (.build))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `onnx.OnnxMlProto3$OperatorSetIdProto$Builder`

  throws: java.io.IOException"
  (^onnx.OnnxMlProto3$OperatorSetIdProto$Builder [^OnnxMlProto3$OperatorSetIdProto$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^onnx.OnnxMlProto3$OperatorSetIdProto$Builder [^OnnxMlProto3$OperatorSetIdProto$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `onnx.OnnxMlProto3$OperatorSetIdProto$Builder`"
  (^onnx.OnnxMlProto3$OperatorSetIdProto$Builder [^OnnxMlProto3$OperatorSetIdProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn get-domain
  "The domain of the operator set being identified.
   The empty string (\"\") or absence of this field implies the operator
   set that is defined as part of the ONNX specification.
   This field MUST be present in this version of the IR when referring to any other operator set.
  string domain = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxMlProto3$OperatorSetIdProto$Builder this]
    (-> this (.getDomain))))

(defn clone
  "returns: `onnx.OnnxMlProto3$OperatorSetIdProto$Builder`"
  (^onnx.OnnxMlProto3$OperatorSetIdProto$Builder [^OnnxMlProto3$OperatorSetIdProto$Builder this]
    (-> this (.clone))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^OnnxMlProto3$OperatorSetIdProto$Builder this]
    (-> this (.getDescriptorForType))))

(defn set-domain
  "The domain of the operator set being identified.
   The empty string (\"\") or absence of this field implies the operator
   set that is defined as part of the ONNX specification.
   This field MUST be present in this version of the IR when referring to any other operator set.
  string domain = 1;

  value - `java.lang.String`

  returns: `onnx.OnnxMlProto3$OperatorSetIdProto$Builder`"
  (^onnx.OnnxMlProto3$OperatorSetIdProto$Builder [^OnnxMlProto3$OperatorSetIdProto$Builder this ^java.lang.String value]
    (-> this (.setDomain value))))

(defn clear
  "returns: `onnx.OnnxMlProto3$OperatorSetIdProto$Builder`"
  (^onnx.OnnxMlProto3$OperatorSetIdProto$Builder [^OnnxMlProto3$OperatorSetIdProto$Builder this]
    (-> this (.clear))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `onnx.OnnxMlProto3$OperatorSetIdProto$Builder`"
  (^onnx.OnnxMlProto3$OperatorSetIdProto$Builder [^OnnxMlProto3$OperatorSetIdProto$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn set-domain-bytes
  "The domain of the operator set being identified.
   The empty string (\"\") or absence of this field implies the operator
   set that is defined as part of the ONNX specification.
   This field MUST be present in this version of the IR when referring to any other operator set.
  string domain = 1;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `onnx.OnnxMlProto3$OperatorSetIdProto$Builder`"
  (^onnx.OnnxMlProto3$OperatorSetIdProto$Builder [^OnnxMlProto3$OperatorSetIdProto$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setDomainBytes value))))

