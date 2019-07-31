(ns org.tensorflow.framework.SaveSliceInfoDef$Builder
  "Protobuf type tensorflow.SaveSliceInfoDef"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework SaveSliceInfoDef$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (SaveSliceInfoDef$Builder/getDescriptor )))

(defn get-var-offset
  "Offset of this variable into the full variable.
  repeated int64 var_offset = 3;

  index - `int`

  returns: `long`"
  (^Long [^SaveSliceInfoDef$Builder this ^Integer index]
    (-> this (.getVarOffset index))))

(defn get-var-shape-count
  "Shape of this variable.
  repeated int64 var_shape = 4;

  returns: `int`"
  (^Integer [^SaveSliceInfoDef$Builder this]
    (-> this (.getVarShapeCount))))

(defn add-var-shape
  "Shape of this variable.
  repeated int64 var_shape = 4;

  value - `long`

  returns: `org.tensorflow.framework.SaveSliceInfoDef$Builder`"
  (^org.tensorflow.framework.SaveSliceInfoDef$Builder [^SaveSliceInfoDef$Builder this ^Long value]
    (-> this (.addVarShape value))))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.SaveSliceInfoDef$Builder`"
  (^org.tensorflow.framework.SaveSliceInfoDef$Builder [^SaveSliceInfoDef$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn set-full-name
  "Name of the full variable of which this is a slice.
  string full_name = 1;

  value - `java.lang.String`

  returns: `org.tensorflow.framework.SaveSliceInfoDef$Builder`"
  (^org.tensorflow.framework.SaveSliceInfoDef$Builder [^SaveSliceInfoDef$Builder this ^java.lang.String value]
    (-> this (.setFullName value))))

(defn build-partial
  "returns: `org.tensorflow.framework.SaveSliceInfoDef`"
  (^org.tensorflow.framework.SaveSliceInfoDef [^SaveSliceInfoDef$Builder this]
    (-> this (.buildPartial))))

(defn get-var-shape
  "Shape of this variable.
  repeated int64 var_shape = 4;

  index - `int`

  returns: `long`"
  (^Long [^SaveSliceInfoDef$Builder this ^Integer index]
    (-> this (.getVarShape index))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^SaveSliceInfoDef$Builder this]
    (-> this (.isInitialized))))

(defn get-full-name
  "Name of the full variable of which this is a slice.
  string full_name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^SaveSliceInfoDef$Builder this]
    (-> this (.getFullName))))

(defn clear-full-name
  "Name of the full variable of which this is a slice.
  string full_name = 1;

  returns: `org.tensorflow.framework.SaveSliceInfoDef$Builder`"
  (^org.tensorflow.framework.SaveSliceInfoDef$Builder [^SaveSliceInfoDef$Builder this]
    (-> this (.clearFullName))))

(defn add-full-shape
  "Shape of the full variable.
  repeated int64 full_shape = 2;

  value - `long`

  returns: `org.tensorflow.framework.SaveSliceInfoDef$Builder`"
  (^org.tensorflow.framework.SaveSliceInfoDef$Builder [^SaveSliceInfoDef$Builder this ^Long value]
    (-> this (.addFullShape value))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.SaveSliceInfoDef`"
  (^org.tensorflow.framework.SaveSliceInfoDef [^SaveSliceInfoDef$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.SaveSliceInfoDef$Builder`"
  (^org.tensorflow.framework.SaveSliceInfoDef$Builder [^SaveSliceInfoDef$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn get-full-name-bytes
  "Name of the full variable of which this is a slice.
  string full_name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^SaveSliceInfoDef$Builder this]
    (-> this (.getFullNameBytes))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `org.tensorflow.framework.SaveSliceInfoDef$Builder`"
  (^org.tensorflow.framework.SaveSliceInfoDef$Builder [^SaveSliceInfoDef$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn get-var-offset-list
  "Offset of this variable into the full variable.
  repeated int64 var_offset = 3;

  returns: `java.util.List<java.lang.Long>`"
  (^java.util.List [^SaveSliceInfoDef$Builder this]
    (-> this (.getVarOffsetList))))

(defn add-all-var-offset
  "Offset of this variable into the full variable.
  repeated int64 var_offset = 3;

  values - `java.lang.Iterable`

  returns: `org.tensorflow.framework.SaveSliceInfoDef$Builder`"
  (^org.tensorflow.framework.SaveSliceInfoDef$Builder [^SaveSliceInfoDef$Builder this ^java.lang.Iterable values]
    (-> this (.addAllVarOffset values))))

(defn set-full-name-bytes
  "Name of the full variable of which this is a slice.
  string full_name = 1;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.SaveSliceInfoDef$Builder`"
  (^org.tensorflow.framework.SaveSliceInfoDef$Builder [^SaveSliceInfoDef$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setFullNameBytes value))))

(defn clear-var-offset
  "Offset of this variable into the full variable.
  repeated int64 var_offset = 3;

  returns: `org.tensorflow.framework.SaveSliceInfoDef$Builder`"
  (^org.tensorflow.framework.SaveSliceInfoDef$Builder [^SaveSliceInfoDef$Builder this]
    (-> this (.clearVarOffset))))

(defn add-all-full-shape
  "Shape of the full variable.
  repeated int64 full_shape = 2;

  values - `java.lang.Iterable`

  returns: `org.tensorflow.framework.SaveSliceInfoDef$Builder`"
  (^org.tensorflow.framework.SaveSliceInfoDef$Builder [^SaveSliceInfoDef$Builder this ^java.lang.Iterable values]
    (-> this (.addAllFullShape values))))

(defn set-full-shape
  "Shape of the full variable.
  repeated int64 full_shape = 2;

  index - `int`
  value - `long`

  returns: `org.tensorflow.framework.SaveSliceInfoDef$Builder`"
  (^org.tensorflow.framework.SaveSliceInfoDef$Builder [^SaveSliceInfoDef$Builder this ^Integer index ^Long value]
    (-> this (.setFullShape index value))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.SaveSliceInfoDef$Builder`"
  (^org.tensorflow.framework.SaveSliceInfoDef$Builder [^SaveSliceInfoDef$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn get-var-offset-count
  "Offset of this variable into the full variable.
  repeated int64 var_offset = 3;

  returns: `int`"
  (^Integer [^SaveSliceInfoDef$Builder this]
    (-> this (.getVarOffsetCount))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.SaveSliceInfoDef$Builder`"
  (^org.tensorflow.framework.SaveSliceInfoDef$Builder [^SaveSliceInfoDef$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn build
  "returns: `org.tensorflow.framework.SaveSliceInfoDef`"
  (^org.tensorflow.framework.SaveSliceInfoDef [^SaveSliceInfoDef$Builder this]
    (-> this (.build))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.SaveSliceInfoDef$Builder`

  throws: java.io.IOException"
  (^org.tensorflow.framework.SaveSliceInfoDef$Builder [^SaveSliceInfoDef$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^org.tensorflow.framework.SaveSliceInfoDef$Builder [^SaveSliceInfoDef$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn add-var-offset
  "Offset of this variable into the full variable.
  repeated int64 var_offset = 3;

  value - `long`

  returns: `org.tensorflow.framework.SaveSliceInfoDef$Builder`"
  (^org.tensorflow.framework.SaveSliceInfoDef$Builder [^SaveSliceInfoDef$Builder this ^Long value]
    (-> this (.addVarOffset value))))

(defn clear-full-shape
  "Shape of the full variable.
  repeated int64 full_shape = 2;

  returns: `org.tensorflow.framework.SaveSliceInfoDef$Builder`"
  (^org.tensorflow.framework.SaveSliceInfoDef$Builder [^SaveSliceInfoDef$Builder this]
    (-> this (.clearFullShape))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `org.tensorflow.framework.SaveSliceInfoDef$Builder`"
  (^org.tensorflow.framework.SaveSliceInfoDef$Builder [^SaveSliceInfoDef$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn clone
  "returns: `org.tensorflow.framework.SaveSliceInfoDef$Builder`"
  (^org.tensorflow.framework.SaveSliceInfoDef$Builder [^SaveSliceInfoDef$Builder this]
    (-> this (.clone))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^SaveSliceInfoDef$Builder this]
    (-> this (.getDescriptorForType))))

(defn get-var-shape-list
  "Shape of this variable.
  repeated int64 var_shape = 4;

  returns: `java.util.List<java.lang.Long>`"
  (^java.util.List [^SaveSliceInfoDef$Builder this]
    (-> this (.getVarShapeList))))

(defn get-full-shape-list
  "Shape of the full variable.
  repeated int64 full_shape = 2;

  returns: `java.util.List<java.lang.Long>`"
  (^java.util.List [^SaveSliceInfoDef$Builder this]
    (-> this (.getFullShapeList))))

(defn set-var-shape
  "Shape of this variable.
  repeated int64 var_shape = 4;

  index - `int`
  value - `long`

  returns: `org.tensorflow.framework.SaveSliceInfoDef$Builder`"
  (^org.tensorflow.framework.SaveSliceInfoDef$Builder [^SaveSliceInfoDef$Builder this ^Integer index ^Long value]
    (-> this (.setVarShape index value))))

(defn clear
  "returns: `org.tensorflow.framework.SaveSliceInfoDef$Builder`"
  (^org.tensorflow.framework.SaveSliceInfoDef$Builder [^SaveSliceInfoDef$Builder this]
    (-> this (.clear))))

(defn clear-var-shape
  "Shape of this variable.
  repeated int64 var_shape = 4;

  returns: `org.tensorflow.framework.SaveSliceInfoDef$Builder`"
  (^org.tensorflow.framework.SaveSliceInfoDef$Builder [^SaveSliceInfoDef$Builder this]
    (-> this (.clearVarShape))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.SaveSliceInfoDef$Builder`"
  (^org.tensorflow.framework.SaveSliceInfoDef$Builder [^SaveSliceInfoDef$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn get-full-shape
  "Shape of the full variable.
  repeated int64 full_shape = 2;

  index - `int`

  returns: `long`"
  (^Long [^SaveSliceInfoDef$Builder this ^Integer index]
    (-> this (.getFullShape index))))

(defn get-full-shape-count
  "Shape of the full variable.
  repeated int64 full_shape = 2;

  returns: `int`"
  (^Integer [^SaveSliceInfoDef$Builder this]
    (-> this (.getFullShapeCount))))

(defn add-all-var-shape
  "Shape of this variable.
  repeated int64 var_shape = 4;

  values - `java.lang.Iterable`

  returns: `org.tensorflow.framework.SaveSliceInfoDef$Builder`"
  (^org.tensorflow.framework.SaveSliceInfoDef$Builder [^SaveSliceInfoDef$Builder this ^java.lang.Iterable values]
    (-> this (.addAllVarShape values))))

(defn set-var-offset
  "Offset of this variable into the full variable.
  repeated int64 var_offset = 3;

  index - `int`
  value - `long`

  returns: `org.tensorflow.framework.SaveSliceInfoDef$Builder`"
  (^org.tensorflow.framework.SaveSliceInfoDef$Builder [^SaveSliceInfoDef$Builder this ^Integer index ^Long value]
    (-> this (.setVarOffset index value))))

