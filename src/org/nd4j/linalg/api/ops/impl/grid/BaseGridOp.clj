(ns org.nd4j.linalg.api.ops.impl.grid.BaseGridOp
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.grid BaseGridOp]))

(defn ->base-grid-op
  "Constructor.

  x - `org.nd4j.linalg.api.ndarray.INDArray`
  y - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^BaseGridOp [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y]
    (new BaseGridOp x y))
  (^BaseGridOp []
    (new BaseGridOp )))

(defn get-grid-descriptor
  "returns: `org.nd4j.linalg.api.ops.grid.GridDescriptor`"
  (^org.nd4j.linalg.api.ops.grid.GridDescriptor [^BaseGridOp this]
    (-> this (.getGridDescriptor))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^BaseGridOp this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^BaseGridOp this]
    (-> this (.tensorflowName))))

