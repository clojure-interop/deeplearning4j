(ns org.nd4j.linalg.api.ops.impl.meta.BaseMetaOp
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.meta BaseMetaOp]))

(defn ->base-meta-op
  "Constructor.

  x - `org.nd4j.linalg.api.ndarray.INDArray`
  y - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^BaseMetaOp [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y]
    (new BaseMetaOp x y))
  (^BaseMetaOp []
    (new BaseMetaOp )))

(defn get-first-op-descriptor
  "returns: `org.nd4j.linalg.api.ops.grid.OpDescriptor`"
  (^org.nd4j.linalg.api.ops.grid.OpDescriptor [^BaseMetaOp this]
    (-> this (.getFirstOpDescriptor))))

(defn get-second-op-descriptor
  "returns: `org.nd4j.linalg.api.ops.grid.OpDescriptor`"
  (^org.nd4j.linalg.api.ops.grid.OpDescriptor [^BaseMetaOp this]
    (-> this (.getSecondOpDescriptor))))

(defn get-first-op
  "returns: `org.nd4j.linalg.api.ops.Op`"
  (^org.nd4j.linalg.api.ops.Op [^BaseMetaOp this]
    (-> this (.getFirstOp))))

(defn get-second-op
  "returns: `org.nd4j.linalg.api.ops.Op`"
  (^org.nd4j.linalg.api.ops.Op [^BaseMetaOp this]
    (-> this (.getSecondOp))))

(defn set-first-pointers
  "pointers - `org.nd4j.linalg.api.ops.grid.GridPointers`"
  ([^BaseMetaOp this ^org.nd4j.linalg.api.ops.grid.GridPointers pointers]
    (-> this (.setFirstPointers pointers))))

(defn set-second-pointers
  "pointers - `org.nd4j.linalg.api.ops.grid.GridPointers`"
  ([^BaseMetaOp this ^org.nd4j.linalg.api.ops.grid.GridPointers pointers]
    (-> this (.setSecondPointers pointers))))

