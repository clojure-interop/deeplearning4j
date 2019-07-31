(ns org.nd4j.linalg.api.ops.impl.accum.BatchMmul
  "Batched matrix multiplication.
 Matrix multiply a batch of matrices. First and second batch of matrices have to be arrays of same
 length and each pair taken from these sets has to have dimensions (M, N) and (N, K),
 respectively. The result of this operation will be a batch of multiplied matrices. The
 result has the same length as both input batches and each output matrix is of shape (M, K)."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.accum BatchMmul]))

(defn ->batch-mmul
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  matrices - `org.nd4j.autodiff.samediff.SDVariable[]`
  transpose-a - `boolean`
  transpose-b - `boolean`"
  (^BatchMmul [^org.nd4j.autodiff.samediff.SameDiff same-diff matrices ^Boolean transpose-a ^Boolean transpose-b]
    (new BatchMmul same-diff matrices transpose-a transpose-b))
  (^BatchMmul []
    (new BatchMmul )))

(defn get-num-outputs
  "returns: `int`"
  (^Integer [^BatchMmul this]
    (-> this (.getNumOutputs))))

(defn add-args
  ""
  ([^BatchMmul this]
    (-> this (.addArgs))))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^BatchMmul this]
    (-> this (.opName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  grads - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^BatchMmul this ^java.util.List grads]
    (-> this (.doDiff grads))))

