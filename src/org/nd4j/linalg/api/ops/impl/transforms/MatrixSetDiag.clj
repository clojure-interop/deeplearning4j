(ns org.nd4j.linalg.api.ops.impl.transforms.MatrixSetDiag
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms MatrixSetDiag]))

(defn ->matrix-set-diag
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  in - `org.nd4j.autodiff.samediff.SDVariable`
  diag - `org.nd4j.autodiff.samediff.SDVariable`
  in-place - `boolean`"
  (^MatrixSetDiag [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable in ^org.nd4j.autodiff.samediff.SDVariable diag ^Boolean in-place]
    (new MatrixSetDiag same-diff in diag in-place))
  (^MatrixSetDiag []
    (new MatrixSetDiag )))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^MatrixSetDiag this]
    (-> this (.tensorflowName))))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^MatrixSetDiag this]
    (-> this (.opName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  i-v - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^MatrixSetDiag this ^java.util.List i-v]
    (-> this (.doDiff i-v))))

