(ns org.tensorflow.framework.TensorShapeProto$Dim$Builder
  " One dimension of the tensor.
 Protobuf type tensorflow.TensorShapeProto.Dim"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework TensorShapeProto$Dim$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (TensorShapeProto$Dim$Builder/getDescriptor )))

(defn clear-name
  "Optional name of the tensor dimension.
  string name = 2;

  returns: `org.tensorflow.framework.TensorShapeProto$Dim$Builder`"
  (^org.tensorflow.framework.TensorShapeProto$Dim$Builder [^TensorShapeProto$Dim$Builder this]
    (-> this (.clearName))))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.TensorShapeProto$Dim$Builder`"
  (^org.tensorflow.framework.TensorShapeProto$Dim$Builder [^TensorShapeProto$Dim$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn build-partial
  "returns: `org.tensorflow.framework.TensorShapeProto$Dim`"
  (^org.tensorflow.framework.TensorShapeProto$Dim [^TensorShapeProto$Dim$Builder this]
    (-> this (.buildPartial))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^TensorShapeProto$Dim$Builder this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.TensorShapeProto$Dim`"
  (^org.tensorflow.framework.TensorShapeProto$Dim [^TensorShapeProto$Dim$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.TensorShapeProto$Dim$Builder`"
  (^org.tensorflow.framework.TensorShapeProto$Dim$Builder [^TensorShapeProto$Dim$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn get-name-bytes
  "Optional name of the tensor dimension.
  string name = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^TensorShapeProto$Dim$Builder this]
    (-> this (.getNameBytes))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `org.tensorflow.framework.TensorShapeProto$Dim$Builder`"
  (^org.tensorflow.framework.TensorShapeProto$Dim$Builder [^TensorShapeProto$Dim$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn set-name
  "Optional name of the tensor dimension.
  string name = 2;

  value - `java.lang.String`

  returns: `org.tensorflow.framework.TensorShapeProto$Dim$Builder`"
  (^org.tensorflow.framework.TensorShapeProto$Dim$Builder [^TensorShapeProto$Dim$Builder this ^java.lang.String value]
    (-> this (.setName value))))

(defn get-name
  "Optional name of the tensor dimension.
  string name = 2;

  returns: `java.lang.String`"
  (^java.lang.String [^TensorShapeProto$Dim$Builder this]
    (-> this (.getName))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.TensorShapeProto$Dim$Builder`"
  (^org.tensorflow.framework.TensorShapeProto$Dim$Builder [^TensorShapeProto$Dim$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn set-name-bytes
  "Optional name of the tensor dimension.
  string name = 2;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.TensorShapeProto$Dim$Builder`"
  (^org.tensorflow.framework.TensorShapeProto$Dim$Builder [^TensorShapeProto$Dim$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setNameBytes value))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.TensorShapeProto$Dim$Builder`"
  (^org.tensorflow.framework.TensorShapeProto$Dim$Builder [^TensorShapeProto$Dim$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn build
  "returns: `org.tensorflow.framework.TensorShapeProto$Dim`"
  (^org.tensorflow.framework.TensorShapeProto$Dim [^TensorShapeProto$Dim$Builder this]
    (-> this (.build))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.TensorShapeProto$Dim$Builder`

  throws: java.io.IOException"
  (^org.tensorflow.framework.TensorShapeProto$Dim$Builder [^TensorShapeProto$Dim$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^org.tensorflow.framework.TensorShapeProto$Dim$Builder [^TensorShapeProto$Dim$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `org.tensorflow.framework.TensorShapeProto$Dim$Builder`"
  (^org.tensorflow.framework.TensorShapeProto$Dim$Builder [^TensorShapeProto$Dim$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn set-size
  "Size of the tensor in that dimension.
   This value must be >= -1, but values of -1 are reserved for \"unknown\"
   shapes (values of -1 mean \"unknown\" dimension).  Certain wrappers
   that work with TensorShapeProto may fail at runtime when deserializing
   a TensorShapeProto containing a dim value of -1.
  int64 size = 1;

  value - `long`

  returns: `org.tensorflow.framework.TensorShapeProto$Dim$Builder`"
  (^org.tensorflow.framework.TensorShapeProto$Dim$Builder [^TensorShapeProto$Dim$Builder this ^Long value]
    (-> this (.setSize value))))

(defn clone
  "returns: `org.tensorflow.framework.TensorShapeProto$Dim$Builder`"
  (^org.tensorflow.framework.TensorShapeProto$Dim$Builder [^TensorShapeProto$Dim$Builder this]
    (-> this (.clone))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^TensorShapeProto$Dim$Builder this]
    (-> this (.getDescriptorForType))))

(defn clear
  "returns: `org.tensorflow.framework.TensorShapeProto$Dim$Builder`"
  (^org.tensorflow.framework.TensorShapeProto$Dim$Builder [^TensorShapeProto$Dim$Builder this]
    (-> this (.clear))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.TensorShapeProto$Dim$Builder`"
  (^org.tensorflow.framework.TensorShapeProto$Dim$Builder [^TensorShapeProto$Dim$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn get-size
  "Size of the tensor in that dimension.
   This value must be >= -1, but values of -1 are reserved for \"unknown\"
   shapes (values of -1 mean \"unknown\" dimension).  Certain wrappers
   that work with TensorShapeProto may fail at runtime when deserializing
   a TensorShapeProto containing a dim value of -1.
  int64 size = 1;

  returns: `long`"
  (^Long [^TensorShapeProto$Dim$Builder this]
    (-> this (.getSize))))

(defn clear-size
  "Size of the tensor in that dimension.
   This value must be >= -1, but values of -1 are reserved for \"unknown\"
   shapes (values of -1 mean \"unknown\" dimension).  Certain wrappers
   that work with TensorShapeProto may fail at runtime when deserializing
   a TensorShapeProto containing a dim value of -1.
  int64 size = 1;

  returns: `org.tensorflow.framework.TensorShapeProto$Dim$Builder`"
  (^org.tensorflow.framework.TensorShapeProto$Dim$Builder [^TensorShapeProto$Dim$Builder this]
    (-> this (.clearSize))))

