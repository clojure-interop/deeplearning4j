(ns org.nd4j.linalg.api.ops.impl.accum.BaseReduction
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.accum BaseReduction]))

(defn ->base-reduction
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  input-1 - input 1 - `org.nd4j.autodiff.samediff.SDVariable`
  input-2 - input 2 - `org.nd4j.autodiff.samediff.SDVariable`
  keep-dims - If true: reduction dimensions were kept - `boolean`
  dimensions - Dimensions to reduce. May be null - `int`"
  (^BaseReduction [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable input-1 ^org.nd4j.autodiff.samediff.SDVariable input-2 ^Boolean keep-dims ^Integer dimensions]
    (new BaseReduction same-diff input-1 input-2 keep-dims dimensions))
  (^BaseReduction [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable input ^Boolean keep-dims ^Integer dimensions]
    (new BaseReduction same-diff input keep-dims dimensions))
  (^BaseReduction []
    (new BaseReduction )))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^BaseReduction this]
    (-> this (.opName))))

