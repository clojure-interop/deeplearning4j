(ns org.nd4j.linalg.api.ops.random.custom.RandomExponential
  "Random exponential distribution: p(x) = lambda * exp(-lambda * x)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.random.custom RandomExponential]))

(defn ->random-exponential
  "Constructor.

  sd - `org.nd4j.autodiff.samediff.SameDiff`
  shape - `org.nd4j.autodiff.samediff.SDVariable`
  lambda - `double`"
  (^RandomExponential [^org.nd4j.autodiff.samediff.SameDiff sd ^org.nd4j.autodiff.samediff.SDVariable shape ^Double lambda]
    (new RandomExponential sd shape lambda))
  (^RandomExponential []
    (new RandomExponential )))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^RandomExponential this]
    (-> this (.opName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  gradients - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^RandomExponential this ^java.util.List gradients]
    (-> this (.doDiff gradients))))

