(ns org.nd4j.linalg.api.ops.impl.accum.SquaredNorm
  "Squared norm (sum_i x_i^2) reduction operation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.accum SquaredNorm]))

(defn ->squared-norm
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  input - `org.nd4j.autodiff.samediff.SDVariable`
  keep-dims - `boolean`
  dimensions - `int`"
  (^SquaredNorm [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable input ^Boolean keep-dims ^Integer dimensions]
    (new SquaredNorm same-diff input keep-dims dimensions))
  (^SquaredNorm []
    (new SquaredNorm )))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^SquaredNorm this]
    (-> this (.opName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  grad - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^SquaredNorm this ^java.util.List grad]
    (-> this (.doDiff grad))))

