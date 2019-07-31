(ns org.nd4j.linalg.api.ops.impl.transforms.MatrixInverse
  "Matrix Inverse Function"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms MatrixInverse]))

(defn ->matrix-inverse
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  in - `org.nd4j.autodiff.samediff.SDVariable`
  in-place - `boolean`"
  (^MatrixInverse [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable in ^Boolean in-place]
    (new MatrixInverse same-diff in in-place))
  (^MatrixInverse []
    (new MatrixInverse )))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^MatrixInverse this]
    (-> this (.opName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  i-v - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^MatrixInverse this ^java.util.List i-v]
    (-> this (.doDiff i-v))))

