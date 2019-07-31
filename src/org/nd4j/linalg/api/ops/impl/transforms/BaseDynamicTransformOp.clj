(ns org.nd4j.linalg.api.ops.impl.transforms.BaseDynamicTransformOp
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms BaseDynamicTransformOp]))

(defn ->base-dynamic-transform-op
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  args - `org.nd4j.autodiff.samediff.SDVariable[]`
  in-place - `boolean`"
  (^BaseDynamicTransformOp [^org.nd4j.autodiff.samediff.SameDiff same-diff args ^Boolean in-place]
    (new BaseDynamicTransformOp same-diff args in-place))
  (^BaseDynamicTransformOp [inputs outputs]
    (new BaseDynamicTransformOp inputs outputs))
  (^BaseDynamicTransformOp []
    (new BaseDynamicTransformOp )))

(defn calculate-output-shape
  "Description copied from class: DifferentialFunction

  returns: `java.util.List<long[]>`"
  ([^BaseDynamicTransformOp this]
    (-> this (.calculateOutputShape))))

