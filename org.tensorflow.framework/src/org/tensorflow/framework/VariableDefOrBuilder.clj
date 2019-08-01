(ns org.tensorflow.framework.VariableDefOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework VariableDefOrBuilder]))

(defn get-save-slice-info-def-or-builder
  "Support for saving variables as slices of a larger variable.
  .tensorflow.SaveSliceInfoDef save_slice_info_def = 4;

  returns: `org.tensorflow.framework.SaveSliceInfoDefOrBuilder`"
  (^org.tensorflow.framework.SaveSliceInfoDefOrBuilder [^VariableDefOrBuilder this]
    (-> this (.getSaveSliceInfoDefOrBuilder))))

(defn get-variable-name
  "Name of the variable tensor.
  string variable_name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^VariableDefOrBuilder this]
    (-> this (.getVariableName))))

(defn get-initial-value-name
  "Name of the tensor holding the variable's initial value.
  string initial_value_name = 6;

  returns: `java.lang.String`"
  (^java.lang.String [^VariableDefOrBuilder this]
    (-> this (.getInitialValueName))))

(defn get-is-resource?
  "Whether to represent this as a ResourceVariable.
  bool is_resource = 5;

  returns: `boolean`"
  (^Boolean [^VariableDefOrBuilder this]
    (-> this (.getIsResource))))

(defn get-initializer-name
  "Name of the initializer op.
  string initializer_name = 2;

  returns: `java.lang.String`"
  (^java.lang.String [^VariableDefOrBuilder this]
    (-> this (.getInitializerName))))

(defn get-snapshot-name
  "Name of the snapshot tensor.
  string snapshot_name = 3;

  returns: `java.lang.String`"
  (^java.lang.String [^VariableDefOrBuilder this]
    (-> this (.getSnapshotName))))

(defn get-snapshot-name-bytes
  "Name of the snapshot tensor.
  string snapshot_name = 3;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^VariableDefOrBuilder this]
    (-> this (.getSnapshotNameBytes))))

(defn get-variable-name-bytes
  "Name of the variable tensor.
  string variable_name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^VariableDefOrBuilder this]
    (-> this (.getVariableNameBytes))))

(defn get-initial-value-name-bytes
  "Name of the tensor holding the variable's initial value.
  string initial_value_name = 6;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^VariableDefOrBuilder this]
    (-> this (.getInitialValueNameBytes))))

(defn get-initializer-name-bytes
  "Name of the initializer op.
  string initializer_name = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^VariableDefOrBuilder this]
    (-> this (.getInitializerNameBytes))))

(defn has-save-slice-info-def?
  "Support for saving variables as slices of a larger variable.
  .tensorflow.SaveSliceInfoDef save_slice_info_def = 4;

  returns: `boolean`"
  (^Boolean [^VariableDefOrBuilder this]
    (-> this (.hasSaveSliceInfoDef))))

(defn get-save-slice-info-def
  "Support for saving variables as slices of a larger variable.
  .tensorflow.SaveSliceInfoDef save_slice_info_def = 4;

  returns: `org.tensorflow.framework.SaveSliceInfoDef`"
  (^org.tensorflow.framework.SaveSliceInfoDef [^VariableDefOrBuilder this]
    (-> this (.getSaveSliceInfoDef))))

