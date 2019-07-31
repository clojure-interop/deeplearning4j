(ns org.nd4j.linalg.api.ops.BaseGradientOp
  "A gradient op always makes the following assumptions:
 there is always a y (beacuse of backpropagating
 or using the chain rule)
 and that it is special exec (for now)
 This op opType sis meant to be used
 to build derivative operations."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops BaseGradientOp]))

(defn ->base-gradient-op
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  i-v-1 - `org.nd4j.autodiff.samediff.SDVariable`
  i-v-2 - `org.nd4j.autodiff.samediff.SDVariable`
  in-place - `boolean`"
  (^BaseGradientOp [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v-1 ^org.nd4j.autodiff.samediff.SDVariable i-v-2 ^Boolean in-place]
    (new BaseGradientOp same-diff i-v-1 i-v-2 in-place))
  (^BaseGradientOp [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v-1 ^org.nd4j.autodiff.samediff.SDVariable i-v-2]
    (new BaseGradientOp same-diff i-v-1 i-v-2))
  (^BaseGradientOp [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray z]
    (new BaseGradientOp x z))
  (^BaseGradientOp [^org.nd4j.linalg.api.ndarray.INDArray x]
    (new BaseGradientOp x))
  (^BaseGradientOp []
    (new BaseGradientOp )))

(defn wrt
  "The array
  to the gradient with respect to

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseGradientOp this]
    (-> this (.wrt))))

(defn exec-special?
  "Description copied from interface: Op

  returns: true if the executioner needs to do a special
  call or not false otherwise - `boolean`"
  (^Boolean [^BaseGradientOp this]
    (-> this (.isExecSpecial))))

(defn pass-through?
  "Description copied from interface: Op

  returns: true if the op is pass through false otherwise - `boolean`"
  (^Boolean [^BaseGradientOp this]
    (-> this (.isPassThrough))))

