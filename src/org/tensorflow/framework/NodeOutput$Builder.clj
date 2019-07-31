(ns org.tensorflow.framework.NodeOutput$Builder
  " Output sizes recorded for a single execution of a graph node.
 Protobuf type tensorflow.NodeOutput"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework NodeOutput$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (NodeOutput$Builder/getDescriptor )))

(defn set-slot
  "int32 slot = 1;

  value - `int`

  returns: `org.tensorflow.framework.NodeOutput$Builder`"
  (^org.tensorflow.framework.NodeOutput$Builder [^NodeOutput$Builder this ^Integer value]
    (-> this (.setSlot value))))

(defn get-tensor-description
  ".tensorflow.TensorDescription tensor_description = 3;

  returns: `org.tensorflow.framework.TensorDescription`"
  (^org.tensorflow.framework.TensorDescription [^NodeOutput$Builder this]
    (-> this (.getTensorDescription))))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.NodeOutput$Builder`"
  (^org.tensorflow.framework.NodeOutput$Builder [^NodeOutput$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn has-tensor-description?
  ".tensorflow.TensorDescription tensor_description = 3;

  returns: `boolean`"
  (^Boolean [^NodeOutput$Builder this]
    (-> this (.hasTensorDescription))))

(defn build-partial
  "returns: `org.tensorflow.framework.NodeOutput`"
  (^org.tensorflow.framework.NodeOutput [^NodeOutput$Builder this]
    (-> this (.buildPartial))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^NodeOutput$Builder this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.NodeOutput`"
  (^org.tensorflow.framework.NodeOutput [^NodeOutput$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.NodeOutput$Builder`"
  (^org.tensorflow.framework.NodeOutput$Builder [^NodeOutput$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `org.tensorflow.framework.NodeOutput$Builder`"
  (^org.tensorflow.framework.NodeOutput$Builder [^NodeOutput$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn get-tensor-description-builder
  ".tensorflow.TensorDescription tensor_description = 3;

  returns: `org.tensorflow.framework.TensorDescription$Builder`"
  (^org.tensorflow.framework.TensorDescription$Builder [^NodeOutput$Builder this]
    (-> this (.getTensorDescriptionBuilder))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.NodeOutput$Builder`"
  (^org.tensorflow.framework.NodeOutput$Builder [^NodeOutput$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.NodeOutput$Builder`"
  (^org.tensorflow.framework.NodeOutput$Builder [^NodeOutput$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn get-tensor-description-or-builder
  ".tensorflow.TensorDescription tensor_description = 3;

  returns: `org.tensorflow.framework.TensorDescriptionOrBuilder`"
  (^org.tensorflow.framework.TensorDescriptionOrBuilder [^NodeOutput$Builder this]
    (-> this (.getTensorDescriptionOrBuilder))))

(defn build
  "returns: `org.tensorflow.framework.NodeOutput`"
  (^org.tensorflow.framework.NodeOutput [^NodeOutput$Builder this]
    (-> this (.build))))

(defn clear-slot
  "int32 slot = 1;

  returns: `org.tensorflow.framework.NodeOutput$Builder`"
  (^org.tensorflow.framework.NodeOutput$Builder [^NodeOutput$Builder this]
    (-> this (.clearSlot))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.NodeOutput$Builder`

  throws: java.io.IOException"
  (^org.tensorflow.framework.NodeOutput$Builder [^NodeOutput$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^org.tensorflow.framework.NodeOutput$Builder [^NodeOutput$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn clear-tensor-description
  ".tensorflow.TensorDescription tensor_description = 3;

  returns: `org.tensorflow.framework.NodeOutput$Builder`"
  (^org.tensorflow.framework.NodeOutput$Builder [^NodeOutput$Builder this]
    (-> this (.clearTensorDescription))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `org.tensorflow.framework.NodeOutput$Builder`"
  (^org.tensorflow.framework.NodeOutput$Builder [^NodeOutput$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn clone
  "returns: `org.tensorflow.framework.NodeOutput$Builder`"
  (^org.tensorflow.framework.NodeOutput$Builder [^NodeOutput$Builder this]
    (-> this (.clone))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^NodeOutput$Builder this]
    (-> this (.getDescriptorForType))))

(defn clear
  "returns: `org.tensorflow.framework.NodeOutput$Builder`"
  (^org.tensorflow.framework.NodeOutput$Builder [^NodeOutput$Builder this]
    (-> this (.clear))))

(defn set-tensor-description
  ".tensorflow.TensorDescription tensor_description = 3;

  value - `org.tensorflow.framework.TensorDescription`

  returns: `org.tensorflow.framework.NodeOutput$Builder`"
  (^org.tensorflow.framework.NodeOutput$Builder [^NodeOutput$Builder this ^org.tensorflow.framework.TensorDescription value]
    (-> this (.setTensorDescription value))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.NodeOutput$Builder`"
  (^org.tensorflow.framework.NodeOutput$Builder [^NodeOutput$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn get-slot
  "int32 slot = 1;

  returns: `int`"
  (^Integer [^NodeOutput$Builder this]
    (-> this (.getSlot))))

(defn merge-tensor-description
  ".tensorflow.TensorDescription tensor_description = 3;

  value - `org.tensorflow.framework.TensorDescription`

  returns: `org.tensorflow.framework.NodeOutput$Builder`"
  (^org.tensorflow.framework.NodeOutput$Builder [^NodeOutput$Builder this ^org.tensorflow.framework.TensorDescription value]
    (-> this (.mergeTensorDescription value))))

