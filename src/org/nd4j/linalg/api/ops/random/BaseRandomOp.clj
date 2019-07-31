(ns org.nd4j.linalg.api.ops.random.BaseRandomOp
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.random BaseRandomOp]))

(defn ->base-random-op
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  i-v - `org.nd4j.autodiff.samediff.SDVariable`"
  (^BaseRandomOp [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v]
    (new BaseRandomOp same-diff i-v)))

(defn op-type
  "Description copied from class: DifferentialFunction

  returns: `org.nd4j.linalg.api.ops.Op$Type`"
  (^org.nd4j.linalg.api.ops.Op$Type [^BaseRandomOp this]
    (-> this (.opType))))

(defn calculate-output-shape
  "Description copied from class: DifferentialFunction

  returns: `java.util.List<long[]>`"
  ([^BaseRandomOp this]
    (-> this (.calculateOutputShape))))

