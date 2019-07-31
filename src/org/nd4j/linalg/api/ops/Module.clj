(ns org.nd4j.linalg.api.ops.Module
  "A Module is a CustomOp
 with varying input arguments
 and automatically calculated outputs
 defined at a higher level than c++.
 A Module is meant to be a way of implementing custom operations
 in straight java/nd4j."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops Module]))

(defn exec
  "inputs - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^Module this ^org.nd4j.linalg.api.ndarray.INDArray inputs]
    (-> this (.exec inputs))))

(defn sub-modules
  "returns: `org.nd4j.linalg.api.ops.Module[]`"
  ([^Module this]
    (-> this (.subModules))))

(defn add-module
  "module - `org.nd4j.linalg.api.ops.Module`"
  ([^Module this ^org.nd4j.linalg.api.ops.Module module]
    (-> this (.addModule module))))

(defn exec-same-diff
  "input - `org.nd4j.autodiff.samediff.SDVariable`"
  ([^Module this ^org.nd4j.autodiff.samediff.SDVariable input]
    (-> this (.execSameDiff input))))

