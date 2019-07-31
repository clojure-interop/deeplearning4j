(ns org.nd4j.linalg.api.ops.impl.transforms.comparison.CompareAndReplace
  "Element-wise Compare-and-Replace implementation as Op
 Basically this op does the same as Compare-and-Set, but op.X is checked against Condition instead"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms.comparison CompareAndReplace]))

(defn ->compare-and-replace
  "Constructor.

  With this constructor, op will check each X element against given Condition, and if condition met, element Z will be set to Y value, and X otherwise
  Pseudocode:
  z[i] = condition(x[i]) ? y[i] : x[i];

  x - `org.nd4j.linalg.api.ndarray.INDArray`
  y - `org.nd4j.linalg.api.ndarray.INDArray`
  z - `org.nd4j.linalg.api.ndarray.INDArray`
  condition - `org.nd4j.linalg.indexing.conditions.Condition`"
  (^CompareAndReplace [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z ^org.nd4j.linalg.indexing.conditions.Condition condition]
    (new CompareAndReplace x y z condition))
  (^CompareAndReplace [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.indexing.conditions.Condition condition]
    (new CompareAndReplace x y condition))
  (^CompareAndReplace []
    (new CompareAndReplace )))

(defn properties-for-function
  "Description copied from class: DifferentialFunction

  returns: `java.util.Map<java.lang.String,java.lang.Object>`"
  (^java.util.Map [^CompareAndReplace this]
    (-> this (.propertiesForFunction))))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^CompareAndReplace this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^CompareAndReplace this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^CompareAndReplace this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^CompareAndReplace this]
    (-> this (.tensorflowName))))

(defn init
  "Description copied from interface: Op

  x - the input - `org.nd4j.linalg.api.ndarray.INDArray`
  y - the pairwise transform ndarray - `org.nd4j.linalg.api.ndarray.INDArray`
  z - the resulting ndarray - `org.nd4j.linalg.api.ndarray.INDArray`
  n - the number of elements - `long`"
  ([^CompareAndReplace this ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z ^Long n]
    (-> this (.init x y z n))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  grad - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^CompareAndReplace this ^java.util.List grad]
    (-> this (.doDiff grad))))

