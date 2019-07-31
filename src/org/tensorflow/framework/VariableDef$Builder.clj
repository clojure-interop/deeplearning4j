(ns org.tensorflow.framework.VariableDef$Builder
  " Protocol buffer representing a Variable.
 Protobuf type tensorflow.VariableDef"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework VariableDef$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (VariableDef$Builder/getDescriptor )))

(defn set-initializer-name-bytes
  "Name of the initializer op.
  string initializer_name = 2;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.VariableDef$Builder`"
  (^org.tensorflow.framework.VariableDef$Builder [^VariableDef$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setInitializerNameBytes value))))

(defn merge-save-slice-info-def
  "Support for saving variables as slices of a larger variable.
  .tensorflow.SaveSliceInfoDef save_slice_info_def = 4;

  value - `org.tensorflow.framework.SaveSliceInfoDef`

  returns: `org.tensorflow.framework.VariableDef$Builder`"
  (^org.tensorflow.framework.VariableDef$Builder [^VariableDef$Builder this ^org.tensorflow.framework.SaveSliceInfoDef value]
    (-> this (.mergeSaveSliceInfoDef value))))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.VariableDef$Builder`"
  (^org.tensorflow.framework.VariableDef$Builder [^VariableDef$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn build-partial
  "returns: `org.tensorflow.framework.VariableDef`"
  (^org.tensorflow.framework.VariableDef [^VariableDef$Builder this]
    (-> this (.buildPartial))))

(defn clear-initializer-name
  "Name of the initializer op.
  string initializer_name = 2;

  returns: `org.tensorflow.framework.VariableDef$Builder`"
  (^org.tensorflow.framework.VariableDef$Builder [^VariableDef$Builder this]
    (-> this (.clearInitializerName))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^VariableDef$Builder this]
    (-> this (.isInitialized))))

(defn get-save-slice-info-def-or-builder
  "Support for saving variables as slices of a larger variable.
  .tensorflow.SaveSliceInfoDef save_slice_info_def = 4;

  returns: `org.tensorflow.framework.SaveSliceInfoDefOrBuilder`"
  (^org.tensorflow.framework.SaveSliceInfoDefOrBuilder [^VariableDef$Builder this]
    (-> this (.getSaveSliceInfoDefOrBuilder))))

(defn get-variable-name
  "Name of the variable tensor.
  string variable_name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^VariableDef$Builder this]
    (-> this (.getVariableName))))

(defn clear-initial-value-name
  "Name of the tensor holding the variable's initial value.
  string initial_value_name = 6;

  returns: `org.tensorflow.framework.VariableDef$Builder`"
  (^org.tensorflow.framework.VariableDef$Builder [^VariableDef$Builder this]
    (-> this (.clearInitialValueName))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.VariableDef`"
  (^org.tensorflow.framework.VariableDef [^VariableDef$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.VariableDef$Builder`"
  (^org.tensorflow.framework.VariableDef$Builder [^VariableDef$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `org.tensorflow.framework.VariableDef$Builder`"
  (^org.tensorflow.framework.VariableDef$Builder [^VariableDef$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn clear-is-resource
  "Whether to represent this as a ResourceVariable.
  bool is_resource = 5;

  returns: `org.tensorflow.framework.VariableDef$Builder`"
  (^org.tensorflow.framework.VariableDef$Builder [^VariableDef$Builder this]
    (-> this (.clearIsResource))))

(defn get-initial-value-name
  "Name of the tensor holding the variable's initial value.
  string initial_value_name = 6;

  returns: `java.lang.String`"
  (^java.lang.String [^VariableDef$Builder this]
    (-> this (.getInitialValueName))))

(defn get-is-resource?
  "Whether to represent this as a ResourceVariable.
  bool is_resource = 5;

  returns: `boolean`"
  (^Boolean [^VariableDef$Builder this]
    (-> this (.getIsResource))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.VariableDef$Builder`"
  (^org.tensorflow.framework.VariableDef$Builder [^VariableDef$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn clear-snapshot-name
  "Name of the snapshot tensor.
  string snapshot_name = 3;

  returns: `org.tensorflow.framework.VariableDef$Builder`"
  (^org.tensorflow.framework.VariableDef$Builder [^VariableDef$Builder this]
    (-> this (.clearSnapshotName))))

(defn set-variable-name
  "Name of the variable tensor.
  string variable_name = 1;

  value - `java.lang.String`

  returns: `org.tensorflow.framework.VariableDef$Builder`"
  (^org.tensorflow.framework.VariableDef$Builder [^VariableDef$Builder this ^java.lang.String value]
    (-> this (.setVariableName value))))

(defn set-snapshot-name
  "Name of the snapshot tensor.
  string snapshot_name = 3;

  value - `java.lang.String`

  returns: `org.tensorflow.framework.VariableDef$Builder`"
  (^org.tensorflow.framework.VariableDef$Builder [^VariableDef$Builder this ^java.lang.String value]
    (-> this (.setSnapshotName value))))

(defn set-initializer-name
  "Name of the initializer op.
  string initializer_name = 2;

  value - `java.lang.String`

  returns: `org.tensorflow.framework.VariableDef$Builder`"
  (^org.tensorflow.framework.VariableDef$Builder [^VariableDef$Builder this ^java.lang.String value]
    (-> this (.setInitializerName value))))

(defn set-snapshot-name-bytes
  "Name of the snapshot tensor.
  string snapshot_name = 3;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.VariableDef$Builder`"
  (^org.tensorflow.framework.VariableDef$Builder [^VariableDef$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setSnapshotNameBytes value))))

(defn get-initializer-name
  "Name of the initializer op.
  string initializer_name = 2;

  returns: `java.lang.String`"
  (^java.lang.String [^VariableDef$Builder this]
    (-> this (.getInitializerName))))

(defn clear-variable-name
  "Name of the variable tensor.
  string variable_name = 1;

  returns: `org.tensorflow.framework.VariableDef$Builder`"
  (^org.tensorflow.framework.VariableDef$Builder [^VariableDef$Builder this]
    (-> this (.clearVariableName))))

(defn get-snapshot-name
  "Name of the snapshot tensor.
  string snapshot_name = 3;

  returns: `java.lang.String`"
  (^java.lang.String [^VariableDef$Builder this]
    (-> this (.getSnapshotName))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.VariableDef$Builder`"
  (^org.tensorflow.framework.VariableDef$Builder [^VariableDef$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn set-variable-name-bytes
  "Name of the variable tensor.
  string variable_name = 1;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.VariableDef$Builder`"
  (^org.tensorflow.framework.VariableDef$Builder [^VariableDef$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setVariableNameBytes value))))

(defn set-initial-value-name
  "Name of the tensor holding the variable's initial value.
  string initial_value_name = 6;

  value - `java.lang.String`

  returns: `org.tensorflow.framework.VariableDef$Builder`"
  (^org.tensorflow.framework.VariableDef$Builder [^VariableDef$Builder this ^java.lang.String value]
    (-> this (.setInitialValueName value))))

(defn build
  "returns: `org.tensorflow.framework.VariableDef`"
  (^org.tensorflow.framework.VariableDef [^VariableDef$Builder this]
    (-> this (.build))))

(defn get-snapshot-name-bytes
  "Name of the snapshot tensor.
  string snapshot_name = 3;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^VariableDef$Builder this]
    (-> this (.getSnapshotNameBytes))))

(defn get-variable-name-bytes
  "Name of the variable tensor.
  string variable_name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^VariableDef$Builder this]
    (-> this (.getVariableNameBytes))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.VariableDef$Builder`

  throws: java.io.IOException"
  (^org.tensorflow.framework.VariableDef$Builder [^VariableDef$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^org.tensorflow.framework.VariableDef$Builder [^VariableDef$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn set-is-resource
  "Whether to represent this as a ResourceVariable.
  bool is_resource = 5;

  value - `boolean`

  returns: `org.tensorflow.framework.VariableDef$Builder`"
  (^org.tensorflow.framework.VariableDef$Builder [^VariableDef$Builder this ^Boolean value]
    (-> this (.setIsResource value))))

(defn set-save-slice-info-def
  "Support for saving variables as slices of a larger variable.
  .tensorflow.SaveSliceInfoDef save_slice_info_def = 4;

  value - `org.tensorflow.framework.SaveSliceInfoDef`

  returns: `org.tensorflow.framework.VariableDef$Builder`"
  (^org.tensorflow.framework.VariableDef$Builder [^VariableDef$Builder this ^org.tensorflow.framework.SaveSliceInfoDef value]
    (-> this (.setSaveSliceInfoDef value))))

(defn get-initial-value-name-bytes
  "Name of the tensor holding the variable's initial value.
  string initial_value_name = 6;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^VariableDef$Builder this]
    (-> this (.getInitialValueNameBytes))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `org.tensorflow.framework.VariableDef$Builder`"
  (^org.tensorflow.framework.VariableDef$Builder [^VariableDef$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn get-initializer-name-bytes
  "Name of the initializer op.
  string initializer_name = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^VariableDef$Builder this]
    (-> this (.getInitializerNameBytes))))

(defn clone
  "returns: `org.tensorflow.framework.VariableDef$Builder`"
  (^org.tensorflow.framework.VariableDef$Builder [^VariableDef$Builder this]
    (-> this (.clone))))

(defn set-initial-value-name-bytes
  "Name of the tensor holding the variable's initial value.
  string initial_value_name = 6;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.VariableDef$Builder`"
  (^org.tensorflow.framework.VariableDef$Builder [^VariableDef$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setInitialValueNameBytes value))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^VariableDef$Builder this]
    (-> this (.getDescriptorForType))))

(defn has-save-slice-info-def?
  "Support for saving variables as slices of a larger variable.
  .tensorflow.SaveSliceInfoDef save_slice_info_def = 4;

  returns: `boolean`"
  (^Boolean [^VariableDef$Builder this]
    (-> this (.hasSaveSliceInfoDef))))

(defn clear-save-slice-info-def
  "Support for saving variables as slices of a larger variable.
  .tensorflow.SaveSliceInfoDef save_slice_info_def = 4;

  returns: `org.tensorflow.framework.VariableDef$Builder`"
  (^org.tensorflow.framework.VariableDef$Builder [^VariableDef$Builder this]
    (-> this (.clearSaveSliceInfoDef))))

(defn clear
  "returns: `org.tensorflow.framework.VariableDef$Builder`"
  (^org.tensorflow.framework.VariableDef$Builder [^VariableDef$Builder this]
    (-> this (.clear))))

(defn get-save-slice-info-def
  "Support for saving variables as slices of a larger variable.
  .tensorflow.SaveSliceInfoDef save_slice_info_def = 4;

  returns: `org.tensorflow.framework.SaveSliceInfoDef`"
  (^org.tensorflow.framework.SaveSliceInfoDef [^VariableDef$Builder this]
    (-> this (.getSaveSliceInfoDef))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.VariableDef$Builder`"
  (^org.tensorflow.framework.VariableDef$Builder [^VariableDef$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn get-save-slice-info-def-builder
  "Support for saving variables as slices of a larger variable.
  .tensorflow.SaveSliceInfoDef save_slice_info_def = 4;

  returns: `org.tensorflow.framework.SaveSliceInfoDef$Builder`"
  (^org.tensorflow.framework.SaveSliceInfoDef$Builder [^VariableDef$Builder this]
    (-> this (.getSaveSliceInfoDefBuilder))))

