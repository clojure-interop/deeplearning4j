(ns org.nd4j.linalg.api.ops.random.custom.RandomNormal
  "Random normal distribution"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.random.custom RandomNormal]))

(defn ->random-normal
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  shape - `org.nd4j.autodiff.samediff.SDVariable`
  mean - `double`
  stdev - `double`"
  (^RandomNormal [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable shape ^Double mean ^Double stdev]
    (new RandomNormal same-diff shape mean stdev))
  (^RandomNormal []
    (new RandomNormal )))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^RandomNormal this]
    (-> this (.opName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^RandomNormal this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  grad - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^RandomNormal this ^java.util.List grad]
    (-> this (.doDiff grad))))

