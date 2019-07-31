(ns org.tensorflow.framework.ResourceHandleProto$Builder
  " Protocol buffer representing a handle to a tensorflow resource. Handles are
  not valid across executions, but can be serialized back and forth from within
  a single run.
 Protobuf type tensorflow.ResourceHandleProto"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework ResourceHandleProto$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (ResourceHandleProto$Builder/getDescriptor )))

(defn clear-name
  "Unique name of this resource.
  string name = 3;

  returns: `org.tensorflow.framework.ResourceHandleProto$Builder`"
  (^org.tensorflow.framework.ResourceHandleProto$Builder [^ResourceHandleProto$Builder this]
    (-> this (.clearName))))

(defn get-maybe-type-name
  "For debug-only, the name of the type pointed to by this handle, if
   available.
  string maybe_type_name = 5;

  returns: `java.lang.String`"
  (^java.lang.String [^ResourceHandleProto$Builder this]
    (-> this (.getMaybeTypeName))))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.ResourceHandleProto$Builder`"
  (^org.tensorflow.framework.ResourceHandleProto$Builder [^ResourceHandleProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn set-device
  "Unique name for the device containing the resource.
  string device = 1;

  value - `java.lang.String`

  returns: `org.tensorflow.framework.ResourceHandleProto$Builder`"
  (^org.tensorflow.framework.ResourceHandleProto$Builder [^ResourceHandleProto$Builder this ^java.lang.String value]
    (-> this (.setDevice value))))

(defn build-partial
  "returns: `org.tensorflow.framework.ResourceHandleProto`"
  (^org.tensorflow.framework.ResourceHandleProto [^ResourceHandleProto$Builder this]
    (-> this (.buildPartial))))

(defn set-container-bytes
  "Container in which this resource is placed.
  string container = 2;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.ResourceHandleProto$Builder`"
  (^org.tensorflow.framework.ResourceHandleProto$Builder [^ResourceHandleProto$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setContainerBytes value))))

(defn set-maybe-type-name
  "For debug-only, the name of the type pointed to by this handle, if
   available.
  string maybe_type_name = 5;

  value - `java.lang.String`

  returns: `org.tensorflow.framework.ResourceHandleProto$Builder`"
  (^org.tensorflow.framework.ResourceHandleProto$Builder [^ResourceHandleProto$Builder this ^java.lang.String value]
    (-> this (.setMaybeTypeName value))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^ResourceHandleProto$Builder this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.ResourceHandleProto`"
  (^org.tensorflow.framework.ResourceHandleProto [^ResourceHandleProto$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.ResourceHandleProto$Builder`"
  (^org.tensorflow.framework.ResourceHandleProto$Builder [^ResourceHandleProto$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn set-container
  "Container in which this resource is placed.
  string container = 2;

  value - `java.lang.String`

  returns: `org.tensorflow.framework.ResourceHandleProto$Builder`"
  (^org.tensorflow.framework.ResourceHandleProto$Builder [^ResourceHandleProto$Builder this ^java.lang.String value]
    (-> this (.setContainer value))))

(defn get-maybe-type-name-bytes
  "For debug-only, the name of the type pointed to by this handle, if
   available.
  string maybe_type_name = 5;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^ResourceHandleProto$Builder this]
    (-> this (.getMaybeTypeNameBytes))))

(defn get-name-bytes
  "Unique name of this resource.
  string name = 3;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^ResourceHandleProto$Builder this]
    (-> this (.getNameBytes))))

(defn clear-container
  "Container in which this resource is placed.
  string container = 2;

  returns: `org.tensorflow.framework.ResourceHandleProto$Builder`"
  (^org.tensorflow.framework.ResourceHandleProto$Builder [^ResourceHandleProto$Builder this]
    (-> this (.clearContainer))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `org.tensorflow.framework.ResourceHandleProto$Builder`"
  (^org.tensorflow.framework.ResourceHandleProto$Builder [^ResourceHandleProto$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn set-name
  "Unique name of this resource.
  string name = 3;

  value - `java.lang.String`

  returns: `org.tensorflow.framework.ResourceHandleProto$Builder`"
  (^org.tensorflow.framework.ResourceHandleProto$Builder [^ResourceHandleProto$Builder this ^java.lang.String value]
    (-> this (.setName value))))

(defn set-device-bytes
  "Unique name for the device containing the resource.
  string device = 1;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.ResourceHandleProto$Builder`"
  (^org.tensorflow.framework.ResourceHandleProto$Builder [^ResourceHandleProto$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setDeviceBytes value))))

(defn get-name
  "Unique name of this resource.
  string name = 3;

  returns: `java.lang.String`"
  (^java.lang.String [^ResourceHandleProto$Builder this]
    (-> this (.getName))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.ResourceHandleProto$Builder`"
  (^org.tensorflow.framework.ResourceHandleProto$Builder [^ResourceHandleProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn set-maybe-type-name-bytes
  "For debug-only, the name of the type pointed to by this handle, if
   available.
  string maybe_type_name = 5;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.ResourceHandleProto$Builder`"
  (^org.tensorflow.framework.ResourceHandleProto$Builder [^ResourceHandleProto$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setMaybeTypeNameBytes value))))

(defn set-name-bytes
  "Unique name of this resource.
  string name = 3;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.ResourceHandleProto$Builder`"
  (^org.tensorflow.framework.ResourceHandleProto$Builder [^ResourceHandleProto$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setNameBytes value))))

(defn get-container-bytes
  "Container in which this resource is placed.
  string container = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^ResourceHandleProto$Builder this]
    (-> this (.getContainerBytes))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.ResourceHandleProto$Builder`"
  (^org.tensorflow.framework.ResourceHandleProto$Builder [^ResourceHandleProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn clear-maybe-type-name
  "For debug-only, the name of the type pointed to by this handle, if
   available.
  string maybe_type_name = 5;

  returns: `org.tensorflow.framework.ResourceHandleProto$Builder`"
  (^org.tensorflow.framework.ResourceHandleProto$Builder [^ResourceHandleProto$Builder this]
    (-> this (.clearMaybeTypeName))))

(defn build
  "returns: `org.tensorflow.framework.ResourceHandleProto`"
  (^org.tensorflow.framework.ResourceHandleProto [^ResourceHandleProto$Builder this]
    (-> this (.build))))

(defn get-container
  "Container in which this resource is placed.
  string container = 2;

  returns: `java.lang.String`"
  (^java.lang.String [^ResourceHandleProto$Builder this]
    (-> this (.getContainer))))

(defn get-device-bytes
  "Unique name for the device containing the resource.
  string device = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^ResourceHandleProto$Builder this]
    (-> this (.getDeviceBytes))))

(defn get-device
  "Unique name for the device containing the resource.
  string device = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^ResourceHandleProto$Builder this]
    (-> this (.getDevice))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.ResourceHandleProto$Builder`

  throws: java.io.IOException"
  (^org.tensorflow.framework.ResourceHandleProto$Builder [^ResourceHandleProto$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^org.tensorflow.framework.ResourceHandleProto$Builder [^ResourceHandleProto$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn clear-device
  "Unique name for the device containing the resource.
  string device = 1;

  returns: `org.tensorflow.framework.ResourceHandleProto$Builder`"
  (^org.tensorflow.framework.ResourceHandleProto$Builder [^ResourceHandleProto$Builder this]
    (-> this (.clearDevice))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `org.tensorflow.framework.ResourceHandleProto$Builder`"
  (^org.tensorflow.framework.ResourceHandleProto$Builder [^ResourceHandleProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn clone
  "returns: `org.tensorflow.framework.ResourceHandleProto$Builder`"
  (^org.tensorflow.framework.ResourceHandleProto$Builder [^ResourceHandleProto$Builder this]
    (-> this (.clone))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^ResourceHandleProto$Builder this]
    (-> this (.getDescriptorForType))))

(defn set-hash-code
  "Hash code for the type of the resource. Is only valid in the same device
   and in the same execution.
  uint64 hash_code = 4;

  value - `long`

  returns: `org.tensorflow.framework.ResourceHandleProto$Builder`"
  (^org.tensorflow.framework.ResourceHandleProto$Builder [^ResourceHandleProto$Builder this ^Long value]
    (-> this (.setHashCode value))))

(defn clear
  "returns: `org.tensorflow.framework.ResourceHandleProto$Builder`"
  (^org.tensorflow.framework.ResourceHandleProto$Builder [^ResourceHandleProto$Builder this]
    (-> this (.clear))))

(defn get-hash-code
  "Hash code for the type of the resource. Is only valid in the same device
   and in the same execution.
  uint64 hash_code = 4;

  returns: `long`"
  (^Long [^ResourceHandleProto$Builder this]
    (-> this (.getHashCode))))

(defn clear-hash-code
  "Hash code for the type of the resource. Is only valid in the same device
   and in the same execution.
  uint64 hash_code = 4;

  returns: `org.tensorflow.framework.ResourceHandleProto$Builder`"
  (^org.tensorflow.framework.ResourceHandleProto$Builder [^ResourceHandleProto$Builder this]
    (-> this (.clearHashCode))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.ResourceHandleProto$Builder`"
  (^org.tensorflow.framework.ResourceHandleProto$Builder [^ResourceHandleProto$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

