(ns org.nd4j.linalg.api.ops.impl.transforms.MatrixDiagPart
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms MatrixDiagPart]))

(defn ->matrix-diag-part
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  in - `org.nd4j.autodiff.samediff.SDVariable`
  in-place - `boolean`"
  (^MatrixDiagPart [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable in ^Boolean in-place]
    (new MatrixDiagPart same-diff in in-place))
  (^MatrixDiagPart []
    (new MatrixDiagPart )))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^MatrixDiagPart this]
    (-> this (.opName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^MatrixDiagPart this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  i-v - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^MatrixDiagPart this ^java.util.List i-v]
    (-> this (.doDiff i-v))))

