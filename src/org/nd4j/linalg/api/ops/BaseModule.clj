(ns org.nd4j.linalg.api.ops.BaseModule
  "Abstract base class for Module
 that handles Dynamic ops and handles nesting.
 This is a logical unit for defining layers
 very similar to pytorch's modules, or tensorflow's layers."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops BaseModule]))

(defn ->base-module
  "Constructor.

  op-name - `java.lang.String`
  inputs - `org.nd4j.linalg.api.ndarray.INDArray[]`
  outputs - `org.nd4j.linalg.api.ndarray.INDArray[]`
  t-arguments - `java.util.List`
  i-arguments - `java.util.List`
  modules - `java.util.List`"
  (^BaseModule [^java.lang.String op-name inputs outputs ^java.util.List t-arguments ^java.util.List i-arguments ^java.util.List modules]
    (new BaseModule op-name inputs outputs t-arguments i-arguments modules))
  (^BaseModule [^java.lang.String op-name ^org.nd4j.autodiff.samediff.SameDiff same-diff args ^Boolean in-place ^java.util.List modules]
    (new BaseModule op-name same-diff args in-place modules)))

(defn sub-modules
  "returns: `org.nd4j.linalg.api.ops.Module[]`"
  ([^BaseModule this]
    (-> this (.subModules))))

(defn add-module
  "module - `org.nd4j.linalg.api.ops.Module`"
  ([^BaseModule this ^org.nd4j.linalg.api.ops.Module module]
    (-> this (.addModule module))))

