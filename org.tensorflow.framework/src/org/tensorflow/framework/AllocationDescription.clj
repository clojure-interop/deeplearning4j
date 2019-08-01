(ns org.tensorflow.framework.AllocationDescription
  "Protobuf type tensorflow.AllocationDescription"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework AllocationDescription]))

(def *-requested-bytes-field-number
  "Static Constant.

  type: int"
  AllocationDescription/REQUESTED_BYTES_FIELD_NUMBER)

(def *-allocated-bytes-field-number
  "Static Constant.

  type: int"
  AllocationDescription/ALLOCATED_BYTES_FIELD_NUMBER)

(def *-allocator-name-field-number
  "Static Constant.

  type: int"
  AllocationDescription/ALLOCATOR_NAME_FIELD_NUMBER)

(def *-allocation-id-field-number
  "Static Constant.

  type: int"
  AllocationDescription/ALLOCATION_ID_FIELD_NUMBER)

(def *-has-single-reference-field-number
  "Static Constant.

  type: int"
  AllocationDescription/HAS_SINGLE_REFERENCE_FIELD_NUMBER)

(def *-ptr-field-number
  "Static Constant.

  type: int"
  AllocationDescription/PTR_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (AllocationDescription/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.AllocationDescription`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^org.tensorflow.framework.AllocationDescription [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (AllocationDescription/parseFrom data extension-registry))
  (^org.tensorflow.framework.AllocationDescription [^java.nio.ByteBuffer data]
    (AllocationDescription/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.AllocationDescription`

  throws: java.io.IOException"
  (^org.tensorflow.framework.AllocationDescription [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (AllocationDescription/parseDelimitedFrom input extension-registry))
  (^org.tensorflow.framework.AllocationDescription [^java.io.InputStream input]
    (AllocationDescription/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `org.tensorflow.framework.AllocationDescription`

  returns: `org.tensorflow.framework.AllocationDescription$Builder`"
  (^org.tensorflow.framework.AllocationDescription$Builder [^org.tensorflow.framework.AllocationDescription prototype]
    (AllocationDescription/newBuilder prototype))
  (^org.tensorflow.framework.AllocationDescription$Builder []
    (AllocationDescription/newBuilder )))

(defn *get-default-instance
  "returns: `org.tensorflow.framework.AllocationDescription`"
  (^org.tensorflow.framework.AllocationDescription []
    (AllocationDescription/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.AllocationDescription>`"
  (^com.github.os72.protobuf351.Parser []
    (AllocationDescription/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^AllocationDescription this]
    (-> this (.getUnknownFields))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^AllocationDescription this]
    (-> this (.isInitialized))))

(defn get-allocated-bytes
  "Total number of bytes allocated if known
  int64 allocated_bytes = 2;

  returns: `long`"
  (^Long [^AllocationDescription this]
    (-> this (.getAllocatedBytes))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.AllocationDescription`"
  (^org.tensorflow.framework.AllocationDescription [^AllocationDescription this]
    (-> this (.getDefaultInstanceForType))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^AllocationDescription this]
    (-> this (.getSerializedSize))))

(defn get-allocation-id
  "Identifier of the allocated buffer if known
  int64 allocation_id = 4;

  returns: `long`"
  (^Long [^AllocationDescription this]
    (-> this (.getAllocationId))))

(defn get-has-single-reference?
  "Set if this tensor only has one remaining reference
  bool has_single_reference = 5;

  returns: `boolean`"
  (^Boolean [^AllocationDescription this]
    (-> this (.getHasSingleReference))))

(defn get-allocator-name
  "Name of the allocator used
  string allocator_name = 3;

  returns: `java.lang.String`"
  (^java.lang.String [^AllocationDescription this]
    (-> this (.getAllocatorName))))

(defn get-allocator-name-bytes
  "Name of the allocator used
  string allocator_name = 3;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^AllocationDescription this]
    (-> this (.getAllocatorNameBytes))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^AllocationDescription this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn get-ptr
  "Address of the allocation.
  uint64 ptr = 6;

  returns: `long`"
  (^Long [^AllocationDescription this]
    (-> this (.getPtr))))

(defn hash-code
  "returns: `int`"
  (^Integer [^AllocationDescription this]
    (-> this (.hashCode))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.AllocationDescription>`"
  (^com.github.os72.protobuf351.Parser [^AllocationDescription this]
    (-> this (.getParserForType))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AllocationDescription this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `org.tensorflow.framework.AllocationDescription$Builder`"
  (^org.tensorflow.framework.AllocationDescription$Builder [^AllocationDescription this]
    (-> this (.newBuilderForType))))

(defn to-builder
  "returns: `org.tensorflow.framework.AllocationDescription$Builder`"
  (^org.tensorflow.framework.AllocationDescription$Builder [^AllocationDescription this]
    (-> this (.toBuilder))))

(defn get-requested-bytes
  "Total number of bytes requested

  int64 requested_bytes = 1;

  returns: `long`"
  (^Long [^AllocationDescription this]
    (-> this (.getRequestedBytes))))

