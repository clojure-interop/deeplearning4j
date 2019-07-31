(ns org.nd4j.linalg.api.ops.impl.shape.bp.StridedSliceBp
  "Strided Slice backprop function"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.shape.bp StridedSliceBp]))

(defn ->strided-slice-bp
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  in - `org.nd4j.autodiff.samediff.SDVariable`
  grad - `org.nd4j.autodiff.samediff.SDVariable`
  begin - `long[]`
  end - `long[]`
  strides - `long[]`
  begin-mask - `int`
  end-mask - `int`
  ellipsis-mask - `int`
  new-axis-mask - `int`
  shrink-axis-mask - `int`"
  (^StridedSliceBp [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable in ^org.nd4j.autodiff.samediff.SDVariable grad begin end strides ^Integer begin-mask ^Integer end-mask ^Integer ellipsis-mask ^Integer new-axis-mask ^Integer shrink-axis-mask]
    (new StridedSliceBp same-diff in grad begin end strides begin-mask end-mask ellipsis-mask new-axis-mask shrink-axis-mask))
  (^StridedSliceBp []
    (new StridedSliceBp )))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^StridedSliceBp this]
    (-> this (.opName))))

(defn assert-valid-for-execution
  "Description copied from interface: CustomOp"
  ([^StridedSliceBp this]
    (-> this (.assertValidForExecution))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  i-v - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^StridedSliceBp this ^java.util.List i-v]
    (-> this (.doDiff i-v))))

