(ns org.nd4j.linalg.api.ops.impl.accum.StandardDeviation
  "Standard deviation (sqrt of variance)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.accum StandardDeviation]))

(defn ->standard-deviation
  "Constructor.

  x - `org.nd4j.linalg.api.ndarray.INDArray`
  y - `org.nd4j.linalg.api.ndarray.INDArray`
  z - `org.nd4j.linalg.api.ndarray.INDArray`
  new-format - `boolean`
  keep-dims - `boolean`
  dimensions - `int[]`"
  (^StandardDeviation [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z ^Boolean new-format ^Boolean keep-dims dimensions]
    (new StandardDeviation x y z new-format keep-dims dimensions))
  (^StandardDeviation [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v ^Boolean bias-corrected ^Boolean keep-dims dimensions]
    (new StandardDeviation same-diff i-v bias-corrected keep-dims dimensions))
  (^StandardDeviation [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^Long n]
    (new StandardDeviation x y n))
  (^StandardDeviation [^org.nd4j.linalg.api.ndarray.INDArray x ^Boolean bias-corrected]
    (new StandardDeviation x bias-corrected))
  (^StandardDeviation [^org.nd4j.linalg.api.ndarray.INDArray x]
    (new StandardDeviation x))
  (^StandardDeviation []
    (new StandardDeviation )))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^StandardDeviation this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^StandardDeviation this]
    (-> this (.opName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  grad - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^StandardDeviation this ^java.util.List grad]
    (-> this (.doDiff grad))))

