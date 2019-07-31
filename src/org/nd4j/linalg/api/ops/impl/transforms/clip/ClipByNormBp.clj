(ns org.nd4j.linalg.api.ops.impl.transforms.clip.ClipByNormBp
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms.clip ClipByNormBp]))

(defn ->clip-by-norm-bp
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  x - `org.nd4j.autodiff.samediff.SDVariable`
  eps - `org.nd4j.autodiff.samediff.SDVariable`
  clip-value - `double`
  dimensions - `int`"
  (^ClipByNormBp [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable eps ^Double clip-value ^Integer dimensions]
    (new ClipByNormBp same-diff x eps clip-value dimensions))
  (^ClipByNormBp []
    (new ClipByNormBp )))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^ClipByNormBp this]
    (-> this (.opName))))

