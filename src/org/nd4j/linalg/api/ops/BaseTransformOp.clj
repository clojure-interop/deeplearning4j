(ns org.nd4j.linalg.api.ops.BaseTransformOp
  "A base op for basic getters and setters"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops BaseTransformOp]))

(defn ->base-transform-op
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  i-v - `org.nd4j.autodiff.samediff.SDVariable`
  shape - `int[]`
  in-place - `boolean`
  extra-args - `java.lang.Object[]`"
  (^BaseTransformOp [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v shape ^Boolean in-place extra-args]
    (new BaseTransformOp same-diff i-v shape in-place extra-args))
  (^BaseTransformOp [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v-1 ^org.nd4j.autodiff.samediff.SDVariable i-v-2 ^Boolean in-place]
    (new BaseTransformOp same-diff i-v-1 i-v-2 in-place))
  (^BaseTransformOp [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v-1 ^org.nd4j.autodiff.samediff.SDVariable i-v-2]
    (new BaseTransformOp same-diff i-v-1 i-v-2))
  (^BaseTransformOp [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray z]
    (new BaseTransformOp x z))
  (^BaseTransformOp [^org.nd4j.autodiff.samediff.SameDiff same-diff]
    (new BaseTransformOp same-diff))
  (^BaseTransformOp []
    (new BaseTransformOp )))

(defn op-type
  "Description copied from class: DifferentialFunction

  returns: `org.nd4j.linalg.api.ops.Op$Type`"
  (^org.nd4j.linalg.api.ops.Op$Type [^BaseTransformOp this]
    (-> this (.opType))))

(defn calculate-output-shape
  "Description copied from class: DifferentialFunction

  returns: `java.util.List<long[]>`"
  ([^BaseTransformOp this]
    (-> this (.calculateOutputShape))))

(defn z
  "Description copied from interface: Op

  returns: the resulting ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseTransformOp this]
    (-> this (.z))))

