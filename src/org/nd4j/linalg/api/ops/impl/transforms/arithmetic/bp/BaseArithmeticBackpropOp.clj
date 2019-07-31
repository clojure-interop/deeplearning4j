(ns org.nd4j.linalg.api.ops.impl.transforms.arithmetic.bp.BaseArithmeticBackpropOp
  "Base arithmetic backprop operation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms.arithmetic.bp BaseArithmeticBackpropOp]))

(defn ->base-arithmetic-backprop-op
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  x - `org.nd4j.autodiff.samediff.SDVariable`
  y - `org.nd4j.autodiff.samediff.SDVariable`
  eps - `org.nd4j.autodiff.samediff.SDVariable`"
  (^BaseArithmeticBackpropOp [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable y ^org.nd4j.autodiff.samediff.SDVariable eps]
    (new BaseArithmeticBackpropOp same-diff x y eps))
  (^BaseArithmeticBackpropOp []
    (new BaseArithmeticBackpropOp )))

(defn do-diff
  "Description copied from class: DifferentialFunction

  i-v - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^BaseArithmeticBackpropOp this ^java.util.List i-v]
    (-> this (.doDiff i-v))))

(defn calculate-output-shape
  "Description copied from class: DifferentialFunction

  returns: `java.util.List<long[]>`"
  ([^BaseArithmeticBackpropOp this]
    (-> this (.calculateOutputShape))))

