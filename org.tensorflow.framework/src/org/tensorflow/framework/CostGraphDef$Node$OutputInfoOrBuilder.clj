(ns org.tensorflow.framework.CostGraphDef$Node$OutputInfoOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework CostGraphDef$Node$OutputInfoOrBuilder]))

(defn get-size
  "int64 size = 1;

  returns: `long`"
  (^Long [^CostGraphDef$Node$OutputInfoOrBuilder this]
    (-> this (.getSize))))

(defn get-alias-input-port
  "If >= 0, the output is an alias of an input. Note that an alias input
   may itself be an alias. The algorithm will therefore need to follow
   those pointers.
  int64 alias_input_port = 2;

  returns: `long`"
  (^Long [^CostGraphDef$Node$OutputInfoOrBuilder this]
    (-> this (.getAliasInputPort))))

(defn has-shape?
  ".tensorflow.TensorShapeProto shape = 3;

  returns: `boolean`"
  (^Boolean [^CostGraphDef$Node$OutputInfoOrBuilder this]
    (-> this (.hasShape))))

(defn get-shape
  ".tensorflow.TensorShapeProto shape = 3;

  returns: `org.tensorflow.framework.TensorShapeProto`"
  (^org.tensorflow.framework.TensorShapeProto [^CostGraphDef$Node$OutputInfoOrBuilder this]
    (-> this (.getShape))))

(defn get-shape-or-builder
  ".tensorflow.TensorShapeProto shape = 3;

  returns: `org.tensorflow.framework.TensorShapeProtoOrBuilder`"
  (^org.tensorflow.framework.TensorShapeProtoOrBuilder [^CostGraphDef$Node$OutputInfoOrBuilder this]
    (-> this (.getShapeOrBuilder))))

(defn get-dtype-value
  ".tensorflow.DataType dtype = 4;

  returns: `int`"
  (^Integer [^CostGraphDef$Node$OutputInfoOrBuilder this]
    (-> this (.getDtypeValue))))

(defn get-dtype
  ".tensorflow.DataType dtype = 4;

  returns: `org.tensorflow.framework.DataType`"
  (^org.tensorflow.framework.DataType [^CostGraphDef$Node$OutputInfoOrBuilder this]
    (-> this (.getDtype))))

