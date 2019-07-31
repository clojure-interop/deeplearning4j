(ns org.nd4j.linalg.api.ops.impl.loss.L2Loss
  "L2 loss op wrapper"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.loss L2Loss]))

(defn ->l-2-loss
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  args - `org.nd4j.autodiff.samediff.SDVariable[]`"
  (^L2Loss [^org.nd4j.autodiff.samediff.SameDiff same-diff args]
    (new L2Loss same-diff args)))

(defn calculate-output-shape
  "Description copied from class: DifferentialFunction

  returns: `java.util.List<long[]>`"
  ([^L2Loss this]
    (-> this (.calculateOutputShape))))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^L2Loss this]
    (-> this (.opName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^L2Loss this]
    (-> this (.tensorflowName))))

