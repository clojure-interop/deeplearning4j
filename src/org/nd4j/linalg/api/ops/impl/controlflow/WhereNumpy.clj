(ns org.nd4j.linalg.api.ops.impl.controlflow.WhereNumpy
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.controlflow WhereNumpy]))

(defn ->where-numpy
  "Constructor.

  op-name - `java.lang.String`
  inputs - `org.nd4j.linalg.api.ndarray.INDArray[]`
  outputs - `org.nd4j.linalg.api.ndarray.INDArray[]`
  t-arguments - `java.util.List`
  i-arguments - `java.util.List`"
  (^WhereNumpy [^java.lang.String op-name inputs outputs ^java.util.List t-arguments ^java.util.List i-arguments]
    (new WhereNumpy op-name inputs outputs t-arguments i-arguments))
  (^WhereNumpy [^org.nd4j.autodiff.samediff.SameDiff same-diff args ^Boolean in-place]
    (new WhereNumpy same-diff args in-place))
  (^WhereNumpy [^org.nd4j.autodiff.samediff.SameDiff same-diff args]
    (new WhereNumpy same-diff args)))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^WhereNumpy this]
    (-> this (.opName))))

