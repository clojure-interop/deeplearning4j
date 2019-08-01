(ns org.tensorflow.framework.TensorShapeProto$DimOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework TensorShapeProto$DimOrBuilder]))

(defn get-size
  "Size of the tensor in that dimension.
   This value must be >= -1, but values of -1 are reserved for \"unknown\"
   shapes (values of -1 mean \"unknown\" dimension).  Certain wrappers
   that work with TensorShapeProto may fail at runtime when deserializing
   a TensorShapeProto containing a dim value of -1.
  int64 size = 1;

  returns: `long`"
  (^Long [^TensorShapeProto$DimOrBuilder this]
    (-> this (.getSize))))

(defn get-name
  "Optional name of the tensor dimension.
  string name = 2;

  returns: `java.lang.String`"
  (^java.lang.String [^TensorShapeProto$DimOrBuilder this]
    (-> this (.getName))))

(defn get-name-bytes
  "Optional name of the tensor dimension.
  string name = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^TensorShapeProto$DimOrBuilder this]
    (-> this (.getNameBytes))))

