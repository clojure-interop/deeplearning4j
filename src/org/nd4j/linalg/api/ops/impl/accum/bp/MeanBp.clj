(ns org.nd4j.linalg.api.ops.impl.accum.bp.MeanBp
  "Backprop op for Mean reduction operation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.accum.bp MeanBp]))

(defn ->mean-bp
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  orig-input - `org.nd4j.autodiff.samediff.SDVariable`
  grad-at-output - `org.nd4j.autodiff.samediff.SDVariable`
  keep-dims - `boolean`
  dimensions - `int`"
  (^MeanBp [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable orig-input ^org.nd4j.autodiff.samediff.SDVariable grad-at-output ^Boolean keep-dims ^Integer dimensions]
    (new MeanBp same-diff orig-input grad-at-output keep-dims dimensions))
  (^MeanBp []
    (new MeanBp )))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^MeanBp this]
    (-> this (.opName))))

