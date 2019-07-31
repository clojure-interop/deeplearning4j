(ns org.nd4j.autodiff.samediff.SDVariable
  "A variable representing a component within a
 graph.
 SDVariable is used for symbolic declaration
 of equations."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.autodiff.samediff SDVariable]))

(defn get-arr
  "A getter for the allocated ndarray with this SDVariable.
  This getter will lazy initialize an array if one is not found based on the associated shape and
  WeightInitScheme - if this is possible.
  If this is not possible (due to shapes being unknown, etc) either:
  (a) null is returned - if enforceExistence == false, or
  (b) an IllegalStateException is thrown, if enforceExistence == true

  enforce-existence - `boolean`

  returns: the INDArray associated with this variable. - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^SDVariable this ^Boolean enforce-existence]
    (-> this (.getArr enforce-existence)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^SDVariable this]
    (-> this (.getArr))))

(defn place-holder?
  "Returns true if this variable is a place holder

  returns: `boolean`"
  (^Boolean [^SDVariable this]
    (-> this (.isPlaceHolder))))

(defn set-array
  "array - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this ^org.nd4j.linalg.api.ndarray.INDArray array]
    (-> this (.setArray array))))

(defn min
  "name - `java.lang.String`
  keep-dims - `boolean`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this ^java.lang.String name ^Boolean keep-dims ^Integer dimensions]
    (-> this (.min name keep-dims dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this ^Boolean keep-dims ^Integer dimensions]
    (-> this (.min keep-dims dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this ^Integer dimensions]
    (-> this (.min dimensions))))

(defn rdivi
  "var-name - `java.lang.String`
  same-diff-variable - `double`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this ^java.lang.String var-name ^Double same-diff-variable]
    (-> this (.rdivi var-name same-diff-variable)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this ^Double same-diff-variable]
    (-> this (.rdivi same-diff-variable))))

(defn assign
  "value - `java.lang.Number`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this ^java.lang.Number value]
    (-> this (.assign value))))

(defn std
  "name - `java.lang.String`
  bias-corrected - `boolean`
  keep-dims - `boolean`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this ^java.lang.String name ^Boolean bias-corrected ^Boolean keep-dims ^Integer dimensions]
    (-> this (.std name bias-corrected keep-dims dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this ^java.lang.String name ^Boolean bias-corrected ^Integer dimensions]
    (-> this (.std name bias-corrected dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this ^Boolean bias-corrected ^Integer dimensions]
    (-> this (.std bias-corrected dimensions))))

(defn op-type
  "Description copied from class: DifferentialFunction

  returns: `org.nd4j.linalg.api.ops.Op$Type`"
  (^org.nd4j.linalg.api.ops.Op$Type [^SDVariable this]
    (-> this (.opType))))

(defn lt
  "name - `java.lang.String`
  value - `double`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this ^java.lang.String name ^Double value]
    (-> this (.lt name value)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this ^Double value]
    (-> this (.lt value))))

(defn neq
  "name - `java.lang.String`
  value - `double`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this ^java.lang.String name ^Double value]
    (-> this (.neq name value)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this ^Double value]
    (-> this (.neq value))))

(defn truncated-div
  "var-name - `java.lang.String`
  same-diff-variable - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this ^java.lang.String var-name ^org.nd4j.autodiff.samediff.SDVariable same-diff-variable]
    (-> this (.truncatedDiv var-name same-diff-variable)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this ^org.nd4j.autodiff.samediff.SDVariable same-diff-variable]
    (-> this (.truncatedDiv same-diff-variable))))

(defn gradient
  "Nicer looking alias
  for the gradient variable.
  The gradient variable is meant to be an
  a variable representation
  of the gradient represented
  in the underlying DifferentialFunction

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this]
    (-> this (.gradient))))

(defn sub
  "var-name - `java.lang.String`
  same-diff-variable - `double`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this ^java.lang.String var-name ^Double same-diff-variable]
    (-> this (.sub var-name same-diff-variable)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this ^Double same-diff-variable]
    (-> this (.sub same-diff-variable))))

(defn arg
  "Description copied from class: DifferentialFunction

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this]
    (-> this (.arg))))

(defn store-and-allocate-new-array
  "Allocate and return a new array
  based on the vertex id and weight initialization.

  returns: the allocated array - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^SDVariable this]
    (-> this (.storeAndAllocateNewArray))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^SDVariable this]
    (-> this (.opName))))

(defn args
  "Description copied from class: DifferentialFunction

  returns: the arguments for a given function - `org.nd4j.autodiff.samediff.SDVariable[]`"
  ([^SDVariable this]
    (-> this (.args))))

(defn eq
  "name - `java.lang.String`
  value - `double`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this ^java.lang.String name ^Double value]
    (-> this (.eq name value)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this ^Double value]
    (-> this (.eq value))))

(defn rsubi
  "var-name - `java.lang.String`
  same-diff-variable - `double`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this ^java.lang.String var-name ^Double same-diff-variable]
    (-> this (.rsubi var-name same-diff-variable)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this ^Double same-diff-variable]
    (-> this (.rsubi same-diff-variable))))

(defn argmax
  "name - `java.lang.String`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this ^java.lang.String name ^Integer dimensions]
    (-> this (.argmax name dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this ^Integer dimensions]
    (-> this (.argmax dimensions))))

(defn mean
  "name - `java.lang.String`
  keep-dims - `boolean`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this ^java.lang.String name ^Boolean keep-dims ^Integer dimensions]
    (-> this (.mean name keep-dims dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this ^Boolean keep-dims ^Integer dimensions]
    (-> this (.mean keep-dims dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this ^Integer dimensions]
    (-> this (.mean dimensions))))

(defn prod
  "name - `java.lang.String`
  keep-dims - `boolean`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this ^java.lang.String name ^Boolean keep-dims ^Integer dimensions]
    (-> this (.prod name keep-dims dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this ^Boolean keep-dims ^Integer dimensions]
    (-> this (.prod keep-dims dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this ^Integer dimensions]
    (-> this (.prod dimensions))))

(defn sum
  "name - `java.lang.String`
  keep-dims - `boolean`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this ^java.lang.String name ^Boolean keep-dims ^Integer dimensions]
    (-> this (.sum name keep-dims dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this ^Boolean keep-dims ^Integer dimensions]
    (-> this (.sum keep-dims dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this ^Integer dimensions]
    (-> this (.sum dimensions))))

(defn init-from-onnx
  "Description copied from class: DifferentialFunction

  node - `onnx.OnnxProto3$NodeProto`
  init-with - `org.nd4j.autodiff.samediff.SameDiff`
  attributes-for-node - `java.util.Map`
  graph - `onnx.OnnxProto3$GraphProto`"
  ([^SDVariable this ^onnx.OnnxProto3$NodeProto node ^org.nd4j.autodiff.samediff.SameDiff init-with ^java.util.Map attributes-for-node ^onnx.OnnxProto3$GraphProto graph]
    (-> this (.initFromOnnx node init-with attributes-for-node graph))))

(defn max
  "name - `java.lang.String`
  keep-dims - `boolean`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this ^java.lang.String name ^Boolean keep-dims ^Integer dimensions]
    (-> this (.max name keep-dims dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this ^Boolean keep-dims ^Integer dimensions]
    (-> this (.max keep-dims dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this ^Integer dimensions]
    (-> this (.max dimensions))))

(defn muli
  "var-name - `java.lang.String`
  same-diff-variable - `double`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this ^java.lang.String var-name ^Double same-diff-variable]
    (-> this (.muli var-name same-diff-variable)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this ^Double same-diff-variable]
    (-> this (.muli same-diff-variable))))

(defn mmul
  "other - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this ^org.nd4j.autodiff.samediff.SDVariable other]
    (-> this (.mmul other))))

(defn pow
  "var-name - `java.lang.String`
  value - `double`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this ^java.lang.String var-name ^Double value]
    (-> this (.pow var-name value)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this ^Double value]
    (-> this (.pow value))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^SDVariable this]
    (-> this (.toString))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^SDVariable this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

(defn argmin
  "name - `java.lang.String`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this ^java.lang.String name ^Integer dimensions]
    (-> this (.argmin name dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this ^Integer dimensions]
    (-> this (.argmin dimensions))))

(defn gt
  "name - `java.lang.String`
  value - `double`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this ^java.lang.String name ^Double value]
    (-> this (.gt name value)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this ^Double value]
    (-> this (.gt value))))

(defn gte
  "name - `java.lang.String`
  value - `double`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this ^java.lang.String name ^Double value]
    (-> this (.gte name value)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this ^Double value]
    (-> this (.gte value))))

(defn norm-1
  "name - `java.lang.String`
  keep-dims - `boolean`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this ^java.lang.String name ^Boolean keep-dims ^Integer dimensions]
    (-> this (.norm1 name keep-dims dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this ^Boolean keep-dims ^Integer dimensions]
    (-> this (.norm1 keep-dims dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this ^Integer dimensions]
    (-> this (.norm1 dimensions))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^SDVariable this]
    (-> this (.tensorflowName))))

(defn eval
  "Evaluate the result of this variable

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^SDVariable this]
    (-> this (.eval))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^SDVariable this]
    (-> this (.onnxName))))

(defn neg
  "Negate op

  name - `java.lang.String`

  returns: Negated variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this ^java.lang.String name]
    (-> this (.neg name)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this]
    (-> this (.neg))))

(defn divi
  "var-name - `java.lang.String`
  same-diff-variable - `double`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this ^java.lang.String var-name ^Double same-diff-variable]
    (-> this (.divi var-name same-diff-variable)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this ^Double same-diff-variable]
    (-> this (.divi same-diff-variable))))

(defn output-variables
  "Description copied from class: DifferentialFunction

  base-name - `java.lang.String`

  returns: `org.nd4j.autodiff.samediff.SDVariable[]`"
  ([^SDVariable this ^java.lang.String base-name]
    (-> this (.outputVariables base-name)))
  ([^SDVariable this]
    (-> this (.outputVariables))))

(defn norm-2
  "name - `java.lang.String`
  keep-dims - `boolean`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this ^java.lang.String name ^Boolean keep-dims ^Integer dimensions]
    (-> this (.norm2 name keep-dims dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this ^Boolean keep-dims ^Integer dimensions]
    (-> this (.norm2 keep-dims dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this ^Integer dimensions]
    (-> this (.norm2 dimensions))))

(defn squared-difference
  "var-name - `java.lang.String`
  same-diff-variable - `org.nd4j.autodiff.samediff.SDVariable`

  returns: squared difference between variables - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this ^java.lang.String var-name ^org.nd4j.autodiff.samediff.SDVariable same-diff-variable]
    (-> this (.squaredDifference var-name same-diff-variable)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this ^org.nd4j.autodiff.samediff.SDVariable same-diff-variable]
    (-> this (.squaredDifference same-diff-variable))))

(defn mul
  "var-name - `java.lang.String`
  value - `double`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this ^java.lang.String var-name ^Double value]
    (-> this (.mul var-name value)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this ^Double same-diff-variable]
    (-> this (.mul same-diff-variable))))

(defn rsub
  "var-name - `java.lang.String`
  same-diff-variable - `double`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this ^java.lang.String var-name ^Double same-diff-variable]
    (-> this (.rsub var-name same-diff-variable)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this ^Double same-diff-variable]
    (-> this (.rsub same-diff-variable))))

(defn addi
  "var-name - `java.lang.String`
  same-diff-variable - `double`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this ^java.lang.String var-name ^Double same-diff-variable]
    (-> this (.addi var-name same-diff-variable)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this ^Double same-diff-variable]
    (-> this (.addi same-diff-variable))))

(defn get-shape
  "Returns the shape of this variable

  returns: `long[]`"
  ([^SDVariable this]
    (-> this (.getShape))))

(defn div
  "var-name - `java.lang.String`
  same-diff-variable - `double`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this ^java.lang.String var-name ^Double same-diff-variable]
    (-> this (.div var-name same-diff-variable)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this ^Double same-diff-variable]
    (-> this (.div same-diff-variable))))

(defn lte
  "name - `java.lang.String`
  value - `double`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this ^java.lang.String name ^Double value]
    (-> this (.lte name value)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this ^Double value]
    (-> this (.lte value))))

(defn init-from-tensor-flow
  "Description copied from class: DifferentialFunction

  node-def - `org.tensorflow.framework.NodeDef`
  init-with - `org.nd4j.autodiff.samediff.SameDiff`
  attributes-for-node - `java.util.Map`
  graph - `org.tensorflow.framework.GraphDef`"
  ([^SDVariable this ^org.tensorflow.framework.NodeDef node-def ^org.nd4j.autodiff.samediff.SameDiff init-with ^java.util.Map attributes-for-node ^org.tensorflow.framework.GraphDef graph]
    (-> this (.initFromTensorFlow node-def init-with attributes-for-node graph))))

(defn hash-code
  "returns: `int`"
  (^Integer [^SDVariable this]
    (-> this (.hashCode))))

(defn add
  "var-name - `java.lang.String`
  same-diff-variable - `double`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this ^java.lang.String var-name ^Double same-diff-variable]
    (-> this (.add var-name same-diff-variable)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this ^Double same-diff-variable]
    (-> this (.add same-diff-variable))))

(defn get-gradient
  "A getter for the variable gradient.
  Note here that a lazy initialization of the
  gradient variable will happen if the gradient
  isn't present at this variable's initialization
  but is set later.

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this]
    (-> this (.getGradient))))

(defn dup
  "Description copied from class: DifferentialFunction

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this]
    (-> this (.dup))))

(defn rdiv
  "var-name - `java.lang.String`
  same-diff-variable - `double`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this ^java.lang.String var-name ^Double same-diff-variable]
    (-> this (.rdiv var-name same-diff-variable)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this ^Double same-diff-variable]
    (-> this (.rdiv same-diff-variable))))

(defn get
  "indices - `org.nd4j.autodiff.samediff.SDIndex`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this ^org.nd4j.autodiff.samediff.SDIndex indices]
    (-> this (.get indices))))

(defn subi
  "var-name - `java.lang.String`
  same-diff-variable - `double`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this ^java.lang.String var-name ^Double same-diff-variable]
    (-> this (.subi var-name same-diff-variable)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this ^Double same-diff-variable]
    (-> this (.subi same-diff-variable))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^SDVariable this ^java.lang.Object o]
    (-> this (.equals o))))

(defn normmax
  "name - `java.lang.String`
  keep-dims - `boolean`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this ^java.lang.String name ^Boolean keep-dims ^Integer dimensions]
    (-> this (.normmax name keep-dims dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this ^Boolean keep-dims ^Integer dimensions]
    (-> this (.normmax keep-dims dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SDVariable this ^Integer dimensions]
    (-> this (.normmax dimensions))))

