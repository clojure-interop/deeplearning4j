(ns org.tensorflow.framework.KernelDef$AttrConstraintOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework KernelDef$AttrConstraintOrBuilder]))

(defn get-name
  "Name of an attr from the Op.
  string name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^KernelDef$AttrConstraintOrBuilder this]
    (-> this (.getName))))

(defn get-name-bytes
  "Name of an attr from the Op.
  string name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^KernelDef$AttrConstraintOrBuilder this]
    (-> this (.getNameBytes))))

(defn has-allowed-values?
  "A list of values that this kernel supports for this attr.
   Like OpDef.AttrDef.allowed_values, except for kernels instead of Ops.
  .tensorflow.AttrValue allowed_values = 2;

  returns: `boolean`"
  (^Boolean [^KernelDef$AttrConstraintOrBuilder this]
    (-> this (.hasAllowedValues))))

(defn get-allowed-values
  "A list of values that this kernel supports for this attr.
   Like OpDef.AttrDef.allowed_values, except for kernels instead of Ops.
  .tensorflow.AttrValue allowed_values = 2;

  returns: `org.tensorflow.framework.AttrValue`"
  (^org.tensorflow.framework.AttrValue [^KernelDef$AttrConstraintOrBuilder this]
    (-> this (.getAllowedValues))))

(defn get-allowed-values-or-builder
  "A list of values that this kernel supports for this attr.
   Like OpDef.AttrDef.allowed_values, except for kernels instead of Ops.
  .tensorflow.AttrValue allowed_values = 2;

  returns: `org.tensorflow.framework.AttrValueOrBuilder`"
  (^org.tensorflow.framework.AttrValueOrBuilder [^KernelDef$AttrConstraintOrBuilder this]
    (-> this (.getAllowedValuesOrBuilder))))

