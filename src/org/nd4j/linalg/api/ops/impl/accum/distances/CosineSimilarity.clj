(ns org.nd4j.linalg.api.ops.impl.accum.distances.CosineSimilarity
  "Cosine similarity
 Note that you need to initialize
 a scaling constant equal to the norm2 of the
 vector"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.accum.distances CosineSimilarity]))

(defn ->cosine-similarity
  "Constructor.

  x - `org.nd4j.linalg.api.ndarray.INDArray`
  y - `org.nd4j.linalg.api.ndarray.INDArray`
  z - `org.nd4j.linalg.api.ndarray.INDArray`
  new-format - `boolean`
  keep-dims - `boolean`
  dimensions - `int`"
  (^CosineSimilarity [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z ^Boolean new-format ^Boolean keep-dims ^Integer dimensions]
    (new CosineSimilarity x y z new-format keep-dims dimensions))
  (^CosineSimilarity [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v ^org.nd4j.autodiff.samediff.SDVariable i-v-2 dimensions]
    (new CosineSimilarity same-diff i-v i-v-2 dimensions))
  (^CosineSimilarity [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v dimensions]
    (new CosineSimilarity same-diff i-v dimensions))
  (^CosineSimilarity [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y]
    (new CosineSimilarity x y))
  (^CosineSimilarity [^org.nd4j.linalg.api.ndarray.INDArray x]
    (new CosineSimilarity x))
  (^CosineSimilarity []
    (new CosineSimilarity )))

(def *-op-name
  "Static Constant.

  type: java.lang.String"
  CosineSimilarity/OP_NAME)

(defn *do-diff
  "same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  f - `org.nd4j.autodiff.functions.DifferentialFunctionFactory`
  x - `org.nd4j.autodiff.samediff.SDVariable`
  y - `org.nd4j.autodiff.samediff.SDVariable`
  grad-out - `org.nd4j.autodiff.samediff.SDVariable`
  dimensions - `int`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.functions.DifferentialFunctionFactory f ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable y ^org.nd4j.autodiff.samediff.SDVariable grad-out ^Integer dimensions]
    (CosineSimilarity/doDiff same-diff f x y grad-out dimensions)))

(defn op-type
  "Description copied from class: DifferentialFunction

  returns: `org.nd4j.linalg.api.ops.Op$Type`"
  (^org.nd4j.linalg.api.ops.Op$Type [^CosineSimilarity this]
    (-> this (.opType))))

(defn get-op-type
  "returns: `org.nd4j.linalg.api.ops.Op$Type`"
  (^org.nd4j.linalg.api.ops.Op$Type [^CosineSimilarity this]
    (-> this (.getOpType))))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^CosineSimilarity this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^CosineSimilarity this]
    (-> this (.opName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  i-v-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^CosineSimilarity this ^java.util.List i-v-1]
    (-> this (.doDiff i-v-1))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^CosineSimilarity this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^CosineSimilarity this]
    (-> this (.tensorflowName))))

