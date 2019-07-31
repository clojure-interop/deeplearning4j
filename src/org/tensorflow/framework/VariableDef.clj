(ns org.tensorflow.framework.VariableDef
  " Protocol buffer representing a Variable.
 Protobuf type tensorflow.VariableDef"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework VariableDef]))

(def *-variable-name-field-number
  "Static Constant.

  type: int"
  VariableDef/VARIABLE_NAME_FIELD_NUMBER)

(def *-initial-value-name-field-number
  "Static Constant.

  type: int"
  VariableDef/INITIAL_VALUE_NAME_FIELD_NUMBER)

(def *-initializer-name-field-number
  "Static Constant.

  type: int"
  VariableDef/INITIALIZER_NAME_FIELD_NUMBER)

(def *-snapshot-name-field-number
  "Static Constant.

  type: int"
  VariableDef/SNAPSHOT_NAME_FIELD_NUMBER)

(def *-save-slice-info-def-field-number
  "Static Constant.

  type: int"
  VariableDef/SAVE_SLICE_INFO_DEF_FIELD_NUMBER)

(def *-is-resource-field-number
  "Static Constant.

  type: int"
  VariableDef/IS_RESOURCE_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (VariableDef/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.VariableDef`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^org.tensorflow.framework.VariableDef [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (VariableDef/parseFrom data extension-registry))
  (^org.tensorflow.framework.VariableDef [^java.nio.ByteBuffer data]
    (VariableDef/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.VariableDef`

  throws: java.io.IOException"
  (^org.tensorflow.framework.VariableDef [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (VariableDef/parseDelimitedFrom input extension-registry))
  (^org.tensorflow.framework.VariableDef [^java.io.InputStream input]
    (VariableDef/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `org.tensorflow.framework.VariableDef`

  returns: `org.tensorflow.framework.VariableDef$Builder`"
  (^org.tensorflow.framework.VariableDef$Builder [^org.tensorflow.framework.VariableDef prototype]
    (VariableDef/newBuilder prototype))
  (^org.tensorflow.framework.VariableDef$Builder []
    (VariableDef/newBuilder )))

(defn *get-default-instance
  "returns: `org.tensorflow.framework.VariableDef`"
  (^org.tensorflow.framework.VariableDef []
    (VariableDef/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.VariableDef>`"
  (^com.github.os72.protobuf351.Parser []
    (VariableDef/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^VariableDef this]
    (-> this (.getUnknownFields))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^VariableDef this]
    (-> this (.isInitialized))))

(defn get-save-slice-info-def-or-builder
  "Support for saving variables as slices of a larger variable.
  .tensorflow.SaveSliceInfoDef save_slice_info_def = 4;

  returns: `org.tensorflow.framework.SaveSliceInfoDefOrBuilder`"
  (^org.tensorflow.framework.SaveSliceInfoDefOrBuilder [^VariableDef this]
    (-> this (.getSaveSliceInfoDefOrBuilder))))

(defn get-variable-name
  "Name of the variable tensor.
  string variable_name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^VariableDef this]
    (-> this (.getVariableName))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.VariableDef`"
  (^org.tensorflow.framework.VariableDef [^VariableDef this]
    (-> this (.getDefaultInstanceForType))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^VariableDef this]
    (-> this (.getSerializedSize))))

(defn get-initial-value-name
  "Name of the tensor holding the variable's initial value.
  string initial_value_name = 6;

  returns: `java.lang.String`"
  (^java.lang.String [^VariableDef this]
    (-> this (.getInitialValueName))))

(defn get-is-resource?
  "Whether to represent this as a ResourceVariable.
  bool is_resource = 5;

  returns: `boolean`"
  (^Boolean [^VariableDef this]
    (-> this (.getIsResource))))

(defn get-initializer-name
  "Name of the initializer op.
  string initializer_name = 2;

  returns: `java.lang.String`"
  (^java.lang.String [^VariableDef this]
    (-> this (.getInitializerName))))

(defn get-snapshot-name
  "Name of the snapshot tensor.
  string snapshot_name = 3;

  returns: `java.lang.String`"
  (^java.lang.String [^VariableDef this]
    (-> this (.getSnapshotName))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^VariableDef this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn get-snapshot-name-bytes
  "Name of the snapshot tensor.
  string snapshot_name = 3;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^VariableDef this]
    (-> this (.getSnapshotNameBytes))))

(defn get-variable-name-bytes
  "Name of the variable tensor.
  string variable_name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^VariableDef this]
    (-> this (.getVariableNameBytes))))

(defn get-initial-value-name-bytes
  "Name of the tensor holding the variable's initial value.
  string initial_value_name = 6;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^VariableDef this]
    (-> this (.getInitialValueNameBytes))))

(defn get-initializer-name-bytes
  "Name of the initializer op.
  string initializer_name = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^VariableDef this]
    (-> this (.getInitializerNameBytes))))

(defn hash-code
  "returns: `int`"
  (^Integer [^VariableDef this]
    (-> this (.hashCode))))

(defn has-save-slice-info-def?
  "Support for saving variables as slices of a larger variable.
  .tensorflow.SaveSliceInfoDef save_slice_info_def = 4;

  returns: `boolean`"
  (^Boolean [^VariableDef this]
    (-> this (.hasSaveSliceInfoDef))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.VariableDef>`"
  (^com.github.os72.protobuf351.Parser [^VariableDef this]
    (-> this (.getParserForType))))

(defn get-save-slice-info-def
  "Support for saving variables as slices of a larger variable.
  .tensorflow.SaveSliceInfoDef save_slice_info_def = 4;

  returns: `org.tensorflow.framework.SaveSliceInfoDef`"
  (^org.tensorflow.framework.SaveSliceInfoDef [^VariableDef this]
    (-> this (.getSaveSliceInfoDef))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^VariableDef this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `org.tensorflow.framework.VariableDef$Builder`"
  (^org.tensorflow.framework.VariableDef$Builder [^VariableDef this]
    (-> this (.newBuilderForType))))

(defn to-builder
  "returns: `org.tensorflow.framework.VariableDef$Builder`"
  (^org.tensorflow.framework.VariableDef$Builder [^VariableDef this]
    (-> this (.toBuilder))))

