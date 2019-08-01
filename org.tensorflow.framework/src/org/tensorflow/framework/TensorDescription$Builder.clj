(ns org.tensorflow.framework.TensorDescription$Builder
  "Protobuf type tensorflow.TensorDescription"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework TensorDescription$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (TensorDescription$Builder/getDescriptor )))

(defn has-shape?
  "Shape of the tensor.
  .tensorflow.TensorShapeProto shape = 2;

  returns: `boolean`"
  (^Boolean [^TensorDescription$Builder this]
    (-> this (.hasShape))))

(defn get-allocation-description-or-builder
  "Information about the size and allocator used for the data
  .tensorflow.AllocationDescription allocation_description = 4;

  returns: `org.tensorflow.framework.AllocationDescriptionOrBuilder`"
  (^org.tensorflow.framework.AllocationDescriptionOrBuilder [^TensorDescription$Builder this]
    (-> this (.getAllocationDescriptionOrBuilder))))

(defn get-dtype
  "Data type of tensor elements
  .tensorflow.DataType dtype = 1;

  returns: `org.tensorflow.framework.DataType`"
  (^org.tensorflow.framework.DataType [^TensorDescription$Builder this]
    (-> this (.getDtype))))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.TensorDescription$Builder`"
  (^org.tensorflow.framework.TensorDescription$Builder [^TensorDescription$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn build-partial
  "returns: `org.tensorflow.framework.TensorDescription`"
  (^org.tensorflow.framework.TensorDescription [^TensorDescription$Builder this]
    (-> this (.buildPartial))))

(defn clear-dtype
  "Data type of tensor elements
  .tensorflow.DataType dtype = 1;

  returns: `org.tensorflow.framework.TensorDescription$Builder`"
  (^org.tensorflow.framework.TensorDescription$Builder [^TensorDescription$Builder this]
    (-> this (.clearDtype))))

(defn get-shape-or-builder
  "Shape of the tensor.
  .tensorflow.TensorShapeProto shape = 2;

  returns: `org.tensorflow.framework.TensorShapeProtoOrBuilder`"
  (^org.tensorflow.framework.TensorShapeProtoOrBuilder [^TensorDescription$Builder this]
    (-> this (.getShapeOrBuilder))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^TensorDescription$Builder this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.TensorDescription`"
  (^org.tensorflow.framework.TensorDescription [^TensorDescription$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.TensorDescription$Builder`"
  (^org.tensorflow.framework.TensorDescription$Builder [^TensorDescription$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn set-shape
  "Shape of the tensor.
  .tensorflow.TensorShapeProto shape = 2;

  value - `org.tensorflow.framework.TensorShapeProto`

  returns: `org.tensorflow.framework.TensorDescription$Builder`"
  (^org.tensorflow.framework.TensorDescription$Builder [^TensorDescription$Builder this ^org.tensorflow.framework.TensorShapeProto value]
    (-> this (.setShape value))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `org.tensorflow.framework.TensorDescription$Builder`"
  (^org.tensorflow.framework.TensorDescription$Builder [^TensorDescription$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn set-dtype
  "Data type of tensor elements
  .tensorflow.DataType dtype = 1;

  value - `org.tensorflow.framework.DataType`

  returns: `org.tensorflow.framework.TensorDescription$Builder`"
  (^org.tensorflow.framework.TensorDescription$Builder [^TensorDescription$Builder this ^org.tensorflow.framework.DataType value]
    (-> this (.setDtype value))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.TensorDescription$Builder`"
  (^org.tensorflow.framework.TensorDescription$Builder [^TensorDescription$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.TensorDescription$Builder`"
  (^org.tensorflow.framework.TensorDescription$Builder [^TensorDescription$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn set-allocation-description
  "Information about the size and allocator used for the data
  .tensorflow.AllocationDescription allocation_description = 4;

  value - `org.tensorflow.framework.AllocationDescription`

  returns: `org.tensorflow.framework.TensorDescription$Builder`"
  (^org.tensorflow.framework.TensorDescription$Builder [^TensorDescription$Builder this ^org.tensorflow.framework.AllocationDescription value]
    (-> this (.setAllocationDescription value))))

(defn build
  "returns: `org.tensorflow.framework.TensorDescription`"
  (^org.tensorflow.framework.TensorDescription [^TensorDescription$Builder this]
    (-> this (.build))))

(defn merge-shape
  "Shape of the tensor.
  .tensorflow.TensorShapeProto shape = 2;

  value - `org.tensorflow.framework.TensorShapeProto`

  returns: `org.tensorflow.framework.TensorDescription$Builder`"
  (^org.tensorflow.framework.TensorDescription$Builder [^TensorDescription$Builder this ^org.tensorflow.framework.TensorShapeProto value]
    (-> this (.mergeShape value))))

(defn get-dtype-value
  "Data type of tensor elements
  .tensorflow.DataType dtype = 1;

  returns: `int`"
  (^Integer [^TensorDescription$Builder this]
    (-> this (.getDtypeValue))))

(defn get-shape-builder
  "Shape of the tensor.
  .tensorflow.TensorShapeProto shape = 2;

  returns: `org.tensorflow.framework.TensorShapeProto$Builder`"
  (^org.tensorflow.framework.TensorShapeProto$Builder [^TensorDescription$Builder this]
    (-> this (.getShapeBuilder))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.TensorDescription$Builder`

  throws: java.io.IOException"
  (^org.tensorflow.framework.TensorDescription$Builder [^TensorDescription$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^org.tensorflow.framework.TensorDescription$Builder [^TensorDescription$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn get-shape
  "Shape of the tensor.
  .tensorflow.TensorShapeProto shape = 2;

  returns: `org.tensorflow.framework.TensorShapeProto`"
  (^org.tensorflow.framework.TensorShapeProto [^TensorDescription$Builder this]
    (-> this (.getShape))))

(defn has-allocation-description?
  "Information about the size and allocator used for the data
  .tensorflow.AllocationDescription allocation_description = 4;

  returns: `boolean`"
  (^Boolean [^TensorDescription$Builder this]
    (-> this (.hasAllocationDescription))))

(defn get-allocation-description
  "Information about the size and allocator used for the data
  .tensorflow.AllocationDescription allocation_description = 4;

  returns: `org.tensorflow.framework.AllocationDescription`"
  (^org.tensorflow.framework.AllocationDescription [^TensorDescription$Builder this]
    (-> this (.getAllocationDescription))))

(defn merge-allocation-description
  "Information about the size and allocator used for the data
  .tensorflow.AllocationDescription allocation_description = 4;

  value - `org.tensorflow.framework.AllocationDescription`

  returns: `org.tensorflow.framework.TensorDescription$Builder`"
  (^org.tensorflow.framework.TensorDescription$Builder [^TensorDescription$Builder this ^org.tensorflow.framework.AllocationDescription value]
    (-> this (.mergeAllocationDescription value))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `org.tensorflow.framework.TensorDescription$Builder`"
  (^org.tensorflow.framework.TensorDescription$Builder [^TensorDescription$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn get-allocation-description-builder
  "Information about the size and allocator used for the data
  .tensorflow.AllocationDescription allocation_description = 4;

  returns: `org.tensorflow.framework.AllocationDescription$Builder`"
  (^org.tensorflow.framework.AllocationDescription$Builder [^TensorDescription$Builder this]
    (-> this (.getAllocationDescriptionBuilder))))

(defn clone
  "returns: `org.tensorflow.framework.TensorDescription$Builder`"
  (^org.tensorflow.framework.TensorDescription$Builder [^TensorDescription$Builder this]
    (-> this (.clone))))

(defn clear-allocation-description
  "Information about the size and allocator used for the data
  .tensorflow.AllocationDescription allocation_description = 4;

  returns: `org.tensorflow.framework.TensorDescription$Builder`"
  (^org.tensorflow.framework.TensorDescription$Builder [^TensorDescription$Builder this]
    (-> this (.clearAllocationDescription))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^TensorDescription$Builder this]
    (-> this (.getDescriptorForType))))

(defn clear-shape
  "Shape of the tensor.
  .tensorflow.TensorShapeProto shape = 2;

  returns: `org.tensorflow.framework.TensorDescription$Builder`"
  (^org.tensorflow.framework.TensorDescription$Builder [^TensorDescription$Builder this]
    (-> this (.clearShape))))

(defn clear
  "returns: `org.tensorflow.framework.TensorDescription$Builder`"
  (^org.tensorflow.framework.TensorDescription$Builder [^TensorDescription$Builder this]
    (-> this (.clear))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.TensorDescription$Builder`"
  (^org.tensorflow.framework.TensorDescription$Builder [^TensorDescription$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn set-dtype-value
  "Data type of tensor elements
  .tensorflow.DataType dtype = 1;

  value - `int`

  returns: `org.tensorflow.framework.TensorDescription$Builder`"
  (^org.tensorflow.framework.TensorDescription$Builder [^TensorDescription$Builder this ^Integer value]
    (-> this (.setDtypeValue value))))

