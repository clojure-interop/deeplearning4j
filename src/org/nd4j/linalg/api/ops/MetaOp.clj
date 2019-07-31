(ns org.nd4j.linalg.api.ops.MetaOp
  "MetaOp is special op, that contains multiple ops"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops MetaOp]))

(defn get-first-op
  "returns: `org.nd4j.linalg.api.ops.Op`"
  (^org.nd4j.linalg.api.ops.Op [^MetaOp this]
    (-> this (.getFirstOp))))

(defn get-second-op
  "returns: `org.nd4j.linalg.api.ops.Op`"
  (^org.nd4j.linalg.api.ops.Op [^MetaOp this]
    (-> this (.getSecondOp))))

(defn get-first-op-descriptor
  "returns: `org.nd4j.linalg.api.ops.grid.OpDescriptor`"
  (^org.nd4j.linalg.api.ops.grid.OpDescriptor [^MetaOp this]
    (-> this (.getFirstOpDescriptor))))

(defn get-second-op-descriptor
  "returns: `org.nd4j.linalg.api.ops.grid.OpDescriptor`"
  (^org.nd4j.linalg.api.ops.grid.OpDescriptor [^MetaOp this]
    (-> this (.getSecondOpDescriptor))))

(defn set-first-pointers
  "pointers - `org.nd4j.linalg.api.ops.grid.GridPointers`"
  ([^MetaOp this ^org.nd4j.linalg.api.ops.grid.GridPointers pointers]
    (-> this (.setFirstPointers pointers))))

(defn set-second-pointers
  "pointers - `org.nd4j.linalg.api.ops.grid.GridPointers`"
  ([^MetaOp this ^org.nd4j.linalg.api.ops.grid.GridPointers pointers]
    (-> this (.setSecondPointers pointers))))

