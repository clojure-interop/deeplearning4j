(ns org.nd4j.linalg.api.ops.impl.shape.Eye
  "Computes a batch of identity matrices of shape (numRows, numCols), returns a single tensor.
 This batch of identity matrices can be specified as list of integers.
 Example:
 batchShape: [3,3]
 numRows: 2
 numCols: 4

 returns a tensor of shape (3, 3, 2, 4) that consists of 3 * 3 batches of (2,4)-shaped identity matrices:

 1 0 0 0
 0 1 0 0"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.shape Eye]))

(defn ->eye
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  num-rows - `org.nd4j.autodiff.samediff.SDVariable`
  num-cols - `org.nd4j.autodiff.samediff.SDVariable`
  batch-shape - `org.nd4j.autodiff.samediff.SDVariable`"
  (^Eye [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable num-rows ^org.nd4j.autodiff.samediff.SDVariable num-cols ^org.nd4j.autodiff.samediff.SDVariable batch-shape]
    (new Eye same-diff num-rows num-cols batch-shape))
  (^Eye [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable num-rows ^org.nd4j.autodiff.samediff.SDVariable num-cols]
    (new Eye same-diff num-rows num-cols))
  (^Eye [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable num-rows]
    (new Eye same-diff num-rows))
  (^Eye []
    (new Eye )))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^Eye this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^Eye this]
    (-> this (.tensorflowName))))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^Eye this]
    (-> this (.opName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  out-grad - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^Eye this ^java.util.List out-grad]
    (-> this (.doDiff out-grad))))

