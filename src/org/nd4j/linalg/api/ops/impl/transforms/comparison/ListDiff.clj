(ns org.nd4j.linalg.api.ops.impl.transforms.comparison.ListDiff
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms.comparison ListDiff]))

(defn ->list-diff
  "Constructor."
  (^ListDiff []
    (new ListDiff )))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^ListDiff this]
    (-> this (.tensorflowName))))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^ListDiff this]
    (-> this (.opName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^ListDiff this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

