(ns org.nd4j.linalg.api.ops.impl.accum.bp.Norm2Bp
  "Backprop op for Norm2 reduction operation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.accum.bp Norm2Bp]))

(defn ->norm-2-bp
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  orig-input - `org.nd4j.autodiff.samediff.SDVariable`
  grad-at-output - `org.nd4j.autodiff.samediff.SDVariable`
  keep-dims - `boolean`
  dimensions - `int`"
  (^Norm2Bp [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable orig-input ^org.nd4j.autodiff.samediff.SDVariable grad-at-output ^Boolean keep-dims ^Integer dimensions]
    (new Norm2Bp same-diff orig-input grad-at-output keep-dims dimensions))
  (^Norm2Bp []
    (new Norm2Bp )))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^Norm2Bp this]
    (-> this (.opName))))

