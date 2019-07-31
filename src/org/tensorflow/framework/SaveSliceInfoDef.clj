(ns org.tensorflow.framework.SaveSliceInfoDef
  "Protobuf type tensorflow.SaveSliceInfoDef"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework SaveSliceInfoDef]))

(def *-full-name-field-number
  "Static Constant.

  type: int"
  SaveSliceInfoDef/FULL_NAME_FIELD_NUMBER)

(def *-full-shape-field-number
  "Static Constant.

  type: int"
  SaveSliceInfoDef/FULL_SHAPE_FIELD_NUMBER)

(def *-var-offset-field-number
  "Static Constant.

  type: int"
  SaveSliceInfoDef/VAR_OFFSET_FIELD_NUMBER)

(def *-var-shape-field-number
  "Static Constant.

  type: int"
  SaveSliceInfoDef/VAR_SHAPE_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (SaveSliceInfoDef/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.SaveSliceInfoDef`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^org.tensorflow.framework.SaveSliceInfoDef [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (SaveSliceInfoDef/parseFrom data extension-registry))
  (^org.tensorflow.framework.SaveSliceInfoDef [^java.nio.ByteBuffer data]
    (SaveSliceInfoDef/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.SaveSliceInfoDef`

  throws: java.io.IOException"
  (^org.tensorflow.framework.SaveSliceInfoDef [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (SaveSliceInfoDef/parseDelimitedFrom input extension-registry))
  (^org.tensorflow.framework.SaveSliceInfoDef [^java.io.InputStream input]
    (SaveSliceInfoDef/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `org.tensorflow.framework.SaveSliceInfoDef`

  returns: `org.tensorflow.framework.SaveSliceInfoDef$Builder`"
  (^org.tensorflow.framework.SaveSliceInfoDef$Builder [^org.tensorflow.framework.SaveSliceInfoDef prototype]
    (SaveSliceInfoDef/newBuilder prototype))
  (^org.tensorflow.framework.SaveSliceInfoDef$Builder []
    (SaveSliceInfoDef/newBuilder )))

(defn *get-default-instance
  "returns: `org.tensorflow.framework.SaveSliceInfoDef`"
  (^org.tensorflow.framework.SaveSliceInfoDef []
    (SaveSliceInfoDef/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.SaveSliceInfoDef>`"
  (^com.github.os72.protobuf351.Parser []
    (SaveSliceInfoDef/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^SaveSliceInfoDef this]
    (-> this (.getUnknownFields))))

(defn get-var-offset
  "Offset of this variable into the full variable.
  repeated int64 var_offset = 3;

  index - `int`

  returns: `long`"
  (^Long [^SaveSliceInfoDef this ^Integer index]
    (-> this (.getVarOffset index))))

(defn get-var-shape-count
  "Shape of this variable.
  repeated int64 var_shape = 4;

  returns: `int`"
  (^Integer [^SaveSliceInfoDef this]
    (-> this (.getVarShapeCount))))

(defn get-var-shape
  "Shape of this variable.
  repeated int64 var_shape = 4;

  index - `int`

  returns: `long`"
  (^Long [^SaveSliceInfoDef this ^Integer index]
    (-> this (.getVarShape index))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^SaveSliceInfoDef this]
    (-> this (.isInitialized))))

(defn get-full-name
  "Name of the full variable of which this is a slice.
  string full_name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^SaveSliceInfoDef this]
    (-> this (.getFullName))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.SaveSliceInfoDef`"
  (^org.tensorflow.framework.SaveSliceInfoDef [^SaveSliceInfoDef this]
    (-> this (.getDefaultInstanceForType))))

(defn get-full-name-bytes
  "Name of the full variable of which this is a slice.
  string full_name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^SaveSliceInfoDef this]
    (-> this (.getFullNameBytes))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^SaveSliceInfoDef this]
    (-> this (.getSerializedSize))))

(defn get-var-offset-list
  "Offset of this variable into the full variable.
  repeated int64 var_offset = 3;

  returns: `java.util.List<java.lang.Long>`"
  (^java.util.List [^SaveSliceInfoDef this]
    (-> this (.getVarOffsetList))))

(defn get-var-offset-count
  "Offset of this variable into the full variable.
  repeated int64 var_offset = 3;

  returns: `int`"
  (^Integer [^SaveSliceInfoDef this]
    (-> this (.getVarOffsetCount))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^SaveSliceInfoDef this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn get-var-shape-list
  "Shape of this variable.
  repeated int64 var_shape = 4;

  returns: `java.util.List<java.lang.Long>`"
  (^java.util.List [^SaveSliceInfoDef this]
    (-> this (.getVarShapeList))))

(defn hash-code
  "returns: `int`"
  (^Integer [^SaveSliceInfoDef this]
    (-> this (.hashCode))))

(defn get-full-shape-list
  "Shape of the full variable.
  repeated int64 full_shape = 2;

  returns: `java.util.List<java.lang.Long>`"
  (^java.util.List [^SaveSliceInfoDef this]
    (-> this (.getFullShapeList))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.SaveSliceInfoDef>`"
  (^com.github.os72.protobuf351.Parser [^SaveSliceInfoDef this]
    (-> this (.getParserForType))))

(defn get-full-shape
  "Shape of the full variable.
  repeated int64 full_shape = 2;

  index - `int`

  returns: `long`"
  (^Long [^SaveSliceInfoDef this ^Integer index]
    (-> this (.getFullShape index))))

(defn get-full-shape-count
  "Shape of the full variable.
  repeated int64 full_shape = 2;

  returns: `int`"
  (^Integer [^SaveSliceInfoDef this]
    (-> this (.getFullShapeCount))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^SaveSliceInfoDef this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `org.tensorflow.framework.SaveSliceInfoDef$Builder`"
  (^org.tensorflow.framework.SaveSliceInfoDef$Builder [^SaveSliceInfoDef this]
    (-> this (.newBuilderForType))))

(defn to-builder
  "returns: `org.tensorflow.framework.SaveSliceInfoDef$Builder`"
  (^org.tensorflow.framework.SaveSliceInfoDef$Builder [^SaveSliceInfoDef this]
    (-> this (.toBuilder))))

