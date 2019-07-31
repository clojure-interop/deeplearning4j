(ns org.nd4j.linalg.api.ops.impl.transforms.comparison.CompareAndSet
  "Element-wise Compare-and-set implementation as Op
 Please check javadoc to specific constructors, for detail information."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms.comparison CompareAndSet]))

(defn ->compare-and-set
  "Constructor.

  This constructor is shortcut to epsEquals.

  x - `org.nd4j.linalg.api.ndarray.INDArray`
  z - `org.nd4j.linalg.api.ndarray.INDArray`
  compare - `double`
  set - `double`
  eps - `double`
  n - `long`"
  (^CompareAndSet [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray z ^Double compare ^Double set ^Double eps ^Long n]
    (new CompareAndSet x z compare set eps n))
  (^CompareAndSet [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray z ^Double compare ^Double set ^Double eps]
    (new CompareAndSet x z compare set eps))
  (^CompareAndSet [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray z ^Double set ^org.nd4j.linalg.indexing.conditions.Condition condition]
    (new CompareAndSet x z set condition))
  (^CompareAndSet [^org.nd4j.linalg.api.ndarray.INDArray x ^Double set ^org.nd4j.linalg.indexing.conditions.Condition condition]
    (new CompareAndSet x set condition))
  (^CompareAndSet []
    (new CompareAndSet )))

(defn properties-for-function
  "Description copied from class: DifferentialFunction

  returns: `java.util.Map<java.lang.String,java.lang.Object>`"
  (^java.util.Map [^CompareAndSet this]
    (-> this (.propertiesForFunction))))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^CompareAndSet this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^CompareAndSet this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^CompareAndSet this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^CompareAndSet this]
    (-> this (.tensorflowName))))

(defn init
  "Description copied from interface: Op

  x - the input - `org.nd4j.linalg.api.ndarray.INDArray`
  y - the pairwise transform ndarray - `org.nd4j.linalg.api.ndarray.INDArray`
  z - the resulting ndarray - `org.nd4j.linalg.api.ndarray.INDArray`
  n - the number of elements - `long`"
  ([^CompareAndSet this ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z ^Long n]
    (-> this (.init x y z n))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  gradient - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^CompareAndSet this ^java.util.List gradient]
    (-> this (.doDiff gradient))))

