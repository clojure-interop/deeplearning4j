(ns org.nd4j.linalg.api.ops.impl.controlflow.Where
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.controlflow Where]))

(defn ->where
  "Constructor.

  op-name - `java.lang.String`
  inputs - `org.nd4j.linalg.api.ndarray.INDArray[]`
  outputs - `org.nd4j.linalg.api.ndarray.INDArray[]`
  t-arguments - `java.util.List`
  i-arguments - `java.util.List`"
  (^Where [^java.lang.String op-name inputs outputs ^java.util.List t-arguments ^java.util.List i-arguments]
    (new Where op-name inputs outputs t-arguments i-arguments))
  (^Where [^org.nd4j.autodiff.samediff.SameDiff same-diff args ^Boolean in-place]
    (new Where same-diff args in-place))
  (^Where [^org.nd4j.autodiff.samediff.SameDiff same-diff args]
    (new Where same-diff args)))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^Where this]
    (-> this (.opName))))

