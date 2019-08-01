(ns org.tensorflow.framework.SaveSliceInfoDefOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework SaveSliceInfoDefOrBuilder]))

(defn get-var-offset
  "Offset of this variable into the full variable.
  repeated int64 var_offset = 3;

  index - `int`

  returns: `long`"
  (^Long [^SaveSliceInfoDefOrBuilder this ^Integer index]
    (-> this (.getVarOffset index))))

(defn get-var-shape-count
  "Shape of this variable.
  repeated int64 var_shape = 4;

  returns: `int`"
  (^Integer [^SaveSliceInfoDefOrBuilder this]
    (-> this (.getVarShapeCount))))

(defn get-var-shape
  "Shape of this variable.
  repeated int64 var_shape = 4;

  index - `int`

  returns: `long`"
  (^Long [^SaveSliceInfoDefOrBuilder this ^Integer index]
    (-> this (.getVarShape index))))

(defn get-full-name
  "Name of the full variable of which this is a slice.
  string full_name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^SaveSliceInfoDefOrBuilder this]
    (-> this (.getFullName))))

(defn get-full-name-bytes
  "Name of the full variable of which this is a slice.
  string full_name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^SaveSliceInfoDefOrBuilder this]
    (-> this (.getFullNameBytes))))

(defn get-var-offset-list
  "Offset of this variable into the full variable.
  repeated int64 var_offset = 3;

  returns: `java.util.List<java.lang.Long>`"
  (^java.util.List [^SaveSliceInfoDefOrBuilder this]
    (-> this (.getVarOffsetList))))

(defn get-var-offset-count
  "Offset of this variable into the full variable.
  repeated int64 var_offset = 3;

  returns: `int`"
  (^Integer [^SaveSliceInfoDefOrBuilder this]
    (-> this (.getVarOffsetCount))))

(defn get-var-shape-list
  "Shape of this variable.
  repeated int64 var_shape = 4;

  returns: `java.util.List<java.lang.Long>`"
  (^java.util.List [^SaveSliceInfoDefOrBuilder this]
    (-> this (.getVarShapeList))))

(defn get-full-shape-list
  "Shape of the full variable.
  repeated int64 full_shape = 2;

  returns: `java.util.List<java.lang.Long>`"
  (^java.util.List [^SaveSliceInfoDefOrBuilder this]
    (-> this (.getFullShapeList))))

(defn get-full-shape
  "Shape of the full variable.
  repeated int64 full_shape = 2;

  index - `int`

  returns: `long`"
  (^Long [^SaveSliceInfoDefOrBuilder this ^Integer index]
    (-> this (.getFullShape index))))

(defn get-full-shape-count
  "Shape of the full variable.
  repeated int64 full_shape = 2;

  returns: `int`"
  (^Integer [^SaveSliceInfoDefOrBuilder this]
    (-> this (.getFullShapeCount))))

