(ns org.nd4j.linalg.api.ops.impl.transforms.MatrixDiag
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms MatrixDiag]))

(defn ->matrix-diag
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  in - `org.nd4j.autodiff.samediff.SDVariable`
  in-place - `boolean`"
  (^MatrixDiag [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable in ^Boolean in-place]
    (new MatrixDiag same-diff in in-place))
  (^MatrixDiag []
    (new MatrixDiag )))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^MatrixDiag this]
    (-> this (.opName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^MatrixDiag this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  i-v - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^MatrixDiag this ^java.util.List i-v]
    (-> this (.doDiff i-v))))

