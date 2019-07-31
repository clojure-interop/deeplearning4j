(ns org.nd4j.linalg.api.ops.impl.shape.bp.SliceBp
  "Slice backprop function"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.shape.bp SliceBp]))

(defn ->slice-bp
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  input - `org.nd4j.autodiff.samediff.SDVariable`
  gradient - `org.nd4j.autodiff.samediff.SDVariable`
  begin - `int[]`
  size - `int[]`"
  (^SliceBp [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable input ^org.nd4j.autodiff.samediff.SDVariable gradient begin size]
    (new SliceBp same-diff input gradient begin size))
  (^SliceBp []
    (new SliceBp )))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^SliceBp this]
    (-> this (.opName))))

(defn assert-valid-for-execution
  "Description copied from interface: CustomOp"
  ([^SliceBp this]
    (-> this (.assertValidForExecution))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  i-v - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^SliceBp this ^java.util.List i-v]
    (-> this (.doDiff i-v))))

