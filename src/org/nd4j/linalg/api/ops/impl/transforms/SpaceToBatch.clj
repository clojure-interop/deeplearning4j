(ns org.nd4j.linalg.api.ops.impl.transforms.SpaceToBatch
  "N-dimensional space to batch operation. Transforms data from a tensor from M spatial dimensions into batch dimension
 according to the \"blocks\" specified (a vector of length M). Afterwards the spatial dimensions are optionally padded,
 as specified in \"padding\", a tensor of dim (M, 2), denoting the padding range.

 Example:
 input: [[[[1], [2]], [[3], [4]]]]
 input shape: [1, 2, 2, 1]
 blocks: [2, 2]
 padding: [[0, 0], [0, 0]]

 output: [[[[1]]], [[[2]]], [[[3]]], [[[4]]]]
 output shape: [4, 1, 1, 1]
 *"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms SpaceToBatch]))

(defn ->space-to-batch
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  args - `org.nd4j.autodiff.samediff.SDVariable[]`
  blocks - `int[]`
  padding - `int[][]`
  in-place - `boolean`"
  (^SpaceToBatch [^org.nd4j.autodiff.samediff.SameDiff same-diff args blocks padding ^Boolean in-place]
    (new SpaceToBatch same-diff args blocks padding in-place))
  (^SpaceToBatch []
    (new SpaceToBatch )))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^SpaceToBatch this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^SpaceToBatch this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^SpaceToBatch this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  i-v - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^SpaceToBatch this ^java.util.List i-v]
    (-> this (.doDiff i-v))))

