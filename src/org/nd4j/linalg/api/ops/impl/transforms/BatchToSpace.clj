(ns org.nd4j.linalg.api.ops.impl.transforms.BatchToSpace
  "N-dimensional batch to space operation. Transforms data from a tensor from batch dimension into M spatial dimensions
 according to the \"blocks\" specified (a vector of length M). Afterwards the spatial dimensions are optionally cropped,
 as specified in \"crops\", a tensor of dim (M, 2), denoting the crop range.

 Example:
 input: [[[[1]]], [[[2]]], [[[3]]], [[[4]]]]
 input shape: [4, 1, 1, 1]
 blocks: [2, 2]
 crops: [[0, 0], [0, 0]]

 output: [[[[1], [2]], [[3], [4]]]]
 output shape: [1, 2, 2, 1]"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms BatchToSpace]))

(defn ->batch-to-space
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  args - `org.nd4j.autodiff.samediff.SDVariable[]`
  blocks - `int[]`
  crops - `int[][]`
  in-place - `boolean`"
  (^BatchToSpace [^org.nd4j.autodiff.samediff.SameDiff same-diff args blocks crops ^Boolean in-place]
    (new BatchToSpace same-diff args blocks crops in-place))
  (^BatchToSpace []
    (new BatchToSpace )))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^BatchToSpace this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^BatchToSpace this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^BatchToSpace this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  i-v - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^BatchToSpace this ^java.util.List i-v]
    (-> this (.doDiff i-v))))

