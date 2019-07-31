(ns org.tensorflow.framework.VariantTensorDataProtoOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework VariantTensorDataProtoOrBuilder]))

(defn get-type-name
  "Name of the type of objects being serialized.
  string type_name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^VariantTensorDataProtoOrBuilder this]
    (-> this (.getTypeName))))

(defn get-type-name-bytes
  "Name of the type of objects being serialized.
  string type_name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^VariantTensorDataProtoOrBuilder this]
    (-> this (.getTypeNameBytes))))

(defn get-metadata
  "Portions of the object that are not Tensors.
  bytes metadata = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^VariantTensorDataProtoOrBuilder this]
    (-> this (.getMetadata))))

(defn get-tensors-list
  "Tensors contained within objects being serialized.
  repeated .tensorflow.TensorProto tensors = 3;

  returns: `java.util.List<org.tensorflow.framework.TensorProto>`"
  (^java.util.List [^VariantTensorDataProtoOrBuilder this]
    (-> this (.getTensorsList))))

(defn get-tensors
  "Tensors contained within objects being serialized.
  repeated .tensorflow.TensorProto tensors = 3;

  index - `int`

  returns: `org.tensorflow.framework.TensorProto`"
  (^org.tensorflow.framework.TensorProto [^VariantTensorDataProtoOrBuilder this ^Integer index]
    (-> this (.getTensors index))))

(defn get-tensors-count
  "Tensors contained within objects being serialized.
  repeated .tensorflow.TensorProto tensors = 3;

  returns: `int`"
  (^Integer [^VariantTensorDataProtoOrBuilder this]
    (-> this (.getTensorsCount))))

(defn get-tensors-or-builder-list
  "Tensors contained within objects being serialized.
  repeated .tensorflow.TensorProto tensors = 3;

  returns: `java.util.List<? extends org.tensorflow.framework.TensorProtoOrBuilder>`"
  ([^VariantTensorDataProtoOrBuilder this]
    (-> this (.getTensorsOrBuilderList))))

(defn get-tensors-or-builder
  "Tensors contained within objects being serialized.
  repeated .tensorflow.TensorProto tensors = 3;

  index - `int`

  returns: `org.tensorflow.framework.TensorProtoOrBuilder`"
  (^org.tensorflow.framework.TensorProtoOrBuilder [^VariantTensorDataProtoOrBuilder this ^Integer index]
    (-> this (.getTensorsOrBuilder index))))

