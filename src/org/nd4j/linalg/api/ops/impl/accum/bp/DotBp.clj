(ns org.nd4j.linalg.api.ops.impl.accum.bp.DotBp
  "Backprop op for Dot pairwise reduction operation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.accum.bp DotBp]))

(defn ->dot-bp
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  orig-input-1 - `org.nd4j.autodiff.samediff.SDVariable`
  orig-input-2 - `org.nd4j.autodiff.samediff.SDVariable`
  grad-at-output - `org.nd4j.autodiff.samediff.SDVariable`
  keep-dims - `boolean`
  dimensions - `int`"
  (^DotBp [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable orig-input-1 ^org.nd4j.autodiff.samediff.SDVariable orig-input-2 ^org.nd4j.autodiff.samediff.SDVariable grad-at-output ^Boolean keep-dims ^Integer dimensions]
    (new DotBp same-diff orig-input-1 orig-input-2 grad-at-output keep-dims dimensions))
  (^DotBp []
    (new DotBp )))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^DotBp this]
    (-> this (.opName))))

