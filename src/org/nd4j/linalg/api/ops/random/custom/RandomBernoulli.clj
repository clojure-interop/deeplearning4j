(ns org.nd4j.linalg.api.ops.random.custom.RandomBernoulli
  "Random bernoulli distribution: p(x=1) = p, p(x=0) = 1-p
 i.e., output is 0 or 1 with probability p."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.random.custom RandomBernoulli]))

(defn ->random-bernoulli
  "Constructor.

  sd - `org.nd4j.autodiff.samediff.SameDiff`
  shape - `org.nd4j.autodiff.samediff.SDVariable`
  p - `double`"
  (^RandomBernoulli [^org.nd4j.autodiff.samediff.SameDiff sd ^org.nd4j.autodiff.samediff.SDVariable shape ^Double p]
    (new RandomBernoulli sd shape p))
  (^RandomBernoulli []
    (new RandomBernoulli )))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^RandomBernoulli this]
    (-> this (.opName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  gradients - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^RandomBernoulli this ^java.util.List gradients]
    (-> this (.doDiff gradients))))

