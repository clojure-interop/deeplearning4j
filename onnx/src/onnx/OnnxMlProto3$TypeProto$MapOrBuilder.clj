(ns onnx.OnnxMlProto3$TypeProto$MapOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [onnx OnnxMlProto3$TypeProto$MapOrBuilder]))

(defn get-key-type-value
  "This field MUST be present for this version of the IR.
   This field MUST refer to an integral type ([U]INT{8|16|32|64}) or STRING
  .onnx.TensorProto.DataType key_type = 1;

  returns: `int`"
  (^Integer [^OnnxMlProto3$TypeProto$MapOrBuilder this]
    (-> this (.getKeyTypeValue))))

(defn get-key-type
  "This field MUST be present for this version of the IR.
   This field MUST refer to an integral type ([U]INT{8|16|32|64}) or STRING
  .onnx.TensorProto.DataType key_type = 1;

  returns: `onnx.OnnxMlProto3$TensorProto$DataType`"
  (^onnx.OnnxMlProto3$TensorProto$DataType [^OnnxMlProto3$TypeProto$MapOrBuilder this]
    (-> this (.getKeyType))))

(defn has-value-type?
  "This field MUST be present for this version of the IR.
  .onnx.TypeProto value_type = 2;

  returns: `boolean`"
  (^Boolean [^OnnxMlProto3$TypeProto$MapOrBuilder this]
    (-> this (.hasValueType))))

(defn get-value-type
  "This field MUST be present for this version of the IR.
  .onnx.TypeProto value_type = 2;

  returns: `onnx.OnnxMlProto3$TypeProto`"
  (^onnx.OnnxMlProto3$TypeProto [^OnnxMlProto3$TypeProto$MapOrBuilder this]
    (-> this (.getValueType))))

(defn get-value-type-or-builder
  "This field MUST be present for this version of the IR.
  .onnx.TypeProto value_type = 2;

  returns: `onnx.OnnxMlProto3$TypeProtoOrBuilder`"
  (^onnx.OnnxMlProto3$TypeProtoOrBuilder [^OnnxMlProto3$TypeProto$MapOrBuilder this]
    (-> this (.getValueTypeOrBuilder))))

