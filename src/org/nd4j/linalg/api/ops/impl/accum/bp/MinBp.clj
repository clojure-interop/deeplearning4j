(ns org.nd4j.linalg.api.ops.impl.accum.bp.MinBp
  "Backprop op for Min reduction operation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.accum.bp MinBp]))

(defn ->min-bp
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  orig-input - `org.nd4j.autodiff.samediff.SDVariable`
  grad-at-output - `org.nd4j.autodiff.samediff.SDVariable`
  keep-dims - `boolean`
  dimensions - `int`"
  (^MinBp [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable orig-input ^org.nd4j.autodiff.samediff.SDVariable grad-at-output ^Boolean keep-dims ^Integer dimensions]
    (new MinBp same-diff orig-input grad-at-output keep-dims dimensions))
  (^MinBp []
    (new MinBp )))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^MinBp this]
    (-> this (.opName))))

