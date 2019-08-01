(ns org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProtoOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework RemoteFusedGraphExecuteInfo$TensorShapeTypeProtoOrBuilder]))

(defn get-dtype-value
  ".tensorflow.DataType dtype = 1;

  returns: `int`"
  (^Integer [^RemoteFusedGraphExecuteInfo$TensorShapeTypeProtoOrBuilder this]
    (-> this (.getDtypeValue))))

(defn get-dtype
  ".tensorflow.DataType dtype = 1;

  returns: `org.tensorflow.framework.DataType`"
  (^org.tensorflow.framework.DataType [^RemoteFusedGraphExecuteInfo$TensorShapeTypeProtoOrBuilder this]
    (-> this (.getDtype))))

(defn has-shape?
  ".tensorflow.TensorShapeProto shape = 2;

  returns: `boolean`"
  (^Boolean [^RemoteFusedGraphExecuteInfo$TensorShapeTypeProtoOrBuilder this]
    (-> this (.hasShape))))

(defn get-shape
  ".tensorflow.TensorShapeProto shape = 2;

  returns: `org.tensorflow.framework.TensorShapeProto`"
  (^org.tensorflow.framework.TensorShapeProto [^RemoteFusedGraphExecuteInfo$TensorShapeTypeProtoOrBuilder this]
    (-> this (.getShape))))

(defn get-shape-or-builder
  ".tensorflow.TensorShapeProto shape = 2;

  returns: `org.tensorflow.framework.TensorShapeProtoOrBuilder`"
  (^org.tensorflow.framework.TensorShapeProtoOrBuilder [^RemoteFusedGraphExecuteInfo$TensorShapeTypeProtoOrBuilder this]
    (-> this (.getShapeOrBuilder))))

