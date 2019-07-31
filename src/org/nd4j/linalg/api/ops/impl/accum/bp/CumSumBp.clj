(ns org.nd4j.linalg.api.ops.impl.accum.bp.CumSumBp
  "Backprop op for cumulative sum operation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.accum.bp CumSumBp]))

(defn ->cum-sum-bp
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  orig-input - `org.nd4j.autodiff.samediff.SDVariable`
  grad-at-output - `org.nd4j.autodiff.samediff.SDVariable`
  exclusive - `boolean`
  reverse - `boolean`
  axis - `int`"
  (^CumSumBp [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable orig-input ^org.nd4j.autodiff.samediff.SDVariable grad-at-output ^Boolean exclusive ^Boolean reverse ^Integer axis]
    (new CumSumBp same-diff orig-input grad-at-output exclusive reverse axis))
  (^CumSumBp []
    (new CumSumBp )))

(defn get-num-outputs
  "returns: `int`"
  (^Integer [^CumSumBp this]
    (-> this (.getNumOutputs))))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^CumSumBp this]
    (-> this (.opName))))

