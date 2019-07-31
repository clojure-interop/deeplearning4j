(ns org.nd4j.linalg.api.ops.impl.accum.bp.CumProdBp
  "Backprop op for cumulative product operation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.accum.bp CumProdBp]))

(defn ->cum-prod-bp
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  orig-input - `org.nd4j.autodiff.samediff.SDVariable`
  grad-at-output - `org.nd4j.autodiff.samediff.SDVariable`
  exclusive - `boolean`
  reverse - `boolean`
  axis - `int`"
  (^CumProdBp [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable orig-input ^org.nd4j.autodiff.samediff.SDVariable grad-at-output ^Boolean exclusive ^Boolean reverse ^Integer axis]
    (new CumProdBp same-diff orig-input grad-at-output exclusive reverse axis))
  (^CumProdBp []
    (new CumProdBp )))

(defn get-num-outputs
  "returns: `int`"
  (^Integer [^CumProdBp this]
    (-> this (.getNumOutputs))))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^CumProdBp this]
    (-> this (.opName))))

