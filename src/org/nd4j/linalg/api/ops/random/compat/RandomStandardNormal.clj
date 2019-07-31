(ns org.nd4j.linalg.api.ops.random.compat.RandomStandardNormal
  "This op is a wrapper for RandomNormal Op"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.random.compat RandomStandardNormal]))

(defn ->random-standard-normal
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  args - `org.nd4j.autodiff.samediff.SDVariable[]`"
  (^RandomStandardNormal [^org.nd4j.autodiff.samediff.SameDiff same-diff args]
    (new RandomStandardNormal same-diff args))
  (^RandomStandardNormal [^org.nd4j.linalg.api.ndarray.INDArray shape]
    (new RandomStandardNormal shape))
  (^RandomStandardNormal []
    (new RandomStandardNormal )))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^RandomStandardNormal this]
    (-> this (.opName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^RandomStandardNormal this]
    (-> this (.tensorflowName))))

(defn get-extra-args
  "returns: `java.lang.Object[]`"
  ([^RandomStandardNormal this]
    (-> this (.getExtraArgs))))

