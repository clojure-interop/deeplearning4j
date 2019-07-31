(ns org.nd4j.linalg.api.ops.impl.transforms.MatrixDeterminant
  "Matrix Determinant op
 Given input with shape [..., N, N] output the determinant for each sub-matrix."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms MatrixDeterminant]))

(defn ->matrix-determinant
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  in - `org.nd4j.autodiff.samediff.SDVariable`
  in-place - `boolean`"
  (^MatrixDeterminant [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable in ^Boolean in-place]
    (new MatrixDeterminant same-diff in in-place))
  (^MatrixDeterminant []
    (new MatrixDeterminant )))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^MatrixDeterminant this]
    (-> this (.opName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^MatrixDeterminant this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  i-v - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^MatrixDeterminant this ^java.util.List i-v]
    (-> this (.doDiff i-v))))

