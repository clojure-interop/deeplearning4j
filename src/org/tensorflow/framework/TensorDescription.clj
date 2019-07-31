(ns org.tensorflow.framework.TensorDescription
  "Protobuf type tensorflow.TensorDescription"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework TensorDescription]))

(def *-dtype-field-number
  "Static Constant.

  type: int"
  TensorDescription/DTYPE_FIELD_NUMBER)

(def *-shape-field-number
  "Static Constant.

  type: int"
  TensorDescription/SHAPE_FIELD_NUMBER)

(def *-allocation-description-field-number
  "Static Constant.

  type: int"
  TensorDescription/ALLOCATION_DESCRIPTION_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (TensorDescription/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.TensorDescription`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^org.tensorflow.framework.TensorDescription [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (TensorDescription/parseFrom data extension-registry))
  (^org.tensorflow.framework.TensorDescription [^java.nio.ByteBuffer data]
    (TensorDescription/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.TensorDescription`

  throws: java.io.IOException"
  (^org.tensorflow.framework.TensorDescription [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (TensorDescription/parseDelimitedFrom input extension-registry))
  (^org.tensorflow.framework.TensorDescription [^java.io.InputStream input]
    (TensorDescription/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `org.tensorflow.framework.TensorDescription`

  returns: `org.tensorflow.framework.TensorDescription$Builder`"
  (^org.tensorflow.framework.TensorDescription$Builder [^org.tensorflow.framework.TensorDescription prototype]
    (TensorDescription/newBuilder prototype))
  (^org.tensorflow.framework.TensorDescription$Builder []
    (TensorDescription/newBuilder )))

(defn *get-default-instance
  "returns: `org.tensorflow.framework.TensorDescription`"
  (^org.tensorflow.framework.TensorDescription []
    (TensorDescription/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.TensorDescription>`"
  (^com.github.os72.protobuf351.Parser []
    (TensorDescription/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^TensorDescription this]
    (-> this (.getUnknownFields))))

(defn has-shape?
  "Shape of the tensor.
  .tensorflow.TensorShapeProto shape = 2;

  returns: `boolean`"
  (^Boolean [^TensorDescription this]
    (-> this (.hasShape))))

(defn get-allocation-description-or-builder
  "Information about the size and allocator used for the data
  .tensorflow.AllocationDescription allocation_description = 4;

  returns: `org.tensorflow.framework.AllocationDescriptionOrBuilder`"
  (^org.tensorflow.framework.AllocationDescriptionOrBuilder [^TensorDescription this]
    (-> this (.getAllocationDescriptionOrBuilder))))

(defn get-dtype
  "Data type of tensor elements
  .tensorflow.DataType dtype = 1;

  returns: `org.tensorflow.framework.DataType`"
  (^org.tensorflow.framework.DataType [^TensorDescription this]
    (-> this (.getDtype))))

(defn get-shape-or-builder
  "Shape of the tensor.
  .tensorflow.TensorShapeProto shape = 2;

  returns: `org.tensorflow.framework.TensorShapeProtoOrBuilder`"
  (^org.tensorflow.framework.TensorShapeProtoOrBuilder [^TensorDescription this]
    (-> this (.getShapeOrBuilder))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^TensorDescription this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.TensorDescription`"
  (^org.tensorflow.framework.TensorDescription [^TensorDescription this]
    (-> this (.getDefaultInstanceForType))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^TensorDescription this]
    (-> this (.getSerializedSize))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^TensorDescription this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn get-dtype-value
  "Data type of tensor elements
  .tensorflow.DataType dtype = 1;

  returns: `int`"
  (^Integer [^TensorDescription this]
    (-> this (.getDtypeValue))))

(defn get-shape
  "Shape of the tensor.
  .tensorflow.TensorShapeProto shape = 2;

  returns: `org.tensorflow.framework.TensorShapeProto`"
  (^org.tensorflow.framework.TensorShapeProto [^TensorDescription this]
    (-> this (.getShape))))

(defn has-allocation-description?
  "Information about the size and allocator used for the data
  .tensorflow.AllocationDescription allocation_description = 4;

  returns: `boolean`"
  (^Boolean [^TensorDescription this]
    (-> this (.hasAllocationDescription))))

(defn get-allocation-description
  "Information about the size and allocator used for the data
  .tensorflow.AllocationDescription allocation_description = 4;

  returns: `org.tensorflow.framework.AllocationDescription`"
  (^org.tensorflow.framework.AllocationDescription [^TensorDescription this]
    (-> this (.getAllocationDescription))))

(defn hash-code
  "returns: `int`"
  (^Integer [^TensorDescription this]
    (-> this (.hashCode))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.TensorDescription>`"
  (^com.github.os72.protobuf351.Parser [^TensorDescription this]
    (-> this (.getParserForType))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^TensorDescription this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `org.tensorflow.framework.TensorDescription$Builder`"
  (^org.tensorflow.framework.TensorDescription$Builder [^TensorDescription this]
    (-> this (.newBuilderForType))))

(defn to-builder
  "returns: `org.tensorflow.framework.TensorDescription$Builder`"
  (^org.tensorflow.framework.TensorDescription$Builder [^TensorDescription this]
    (-> this (.toBuilder))))

