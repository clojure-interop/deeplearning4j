(ns org.nd4j.autodiff.functions.DifferentialFunction
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.autodiff.functions DifferentialFunction]))

(defn ->differential-function
  "Constructor.

  Initialize the function from the given
  NodeDef

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  node-def - `org.tensorflow.framework.NodeDef`
  attributes-for-node - `java.util.Map`
  graph - `org.tensorflow.framework.GraphDef`"
  (^DifferentialFunction [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.tensorflow.framework.NodeDef node-def ^java.util.Map attributes-for-node ^org.tensorflow.framework.GraphDef graph]
    (new DifferentialFunction same-diff node-def attributes-for-node graph))
  (^DifferentialFunction [^org.nd4j.autodiff.samediff.SameDiff same-diff ^Boolean in-place args]
    (new DifferentialFunction same-diff in-place args))
  (^DifferentialFunction [^org.nd4j.autodiff.samediff.SameDiff same-diff extra-args]
    (new DifferentialFunction same-diff extra-args))
  (^DifferentialFunction []
    (new DifferentialFunction )))

(defn calculate-output-shape
  "Calculate
  the output shape for this op

  returns: `java.util.List<long[]>`"
  ([^DifferentialFunction this]
    (-> this (.calculateOutputShape))))

(defn op-type
  "The type of the op

  returns: `org.nd4j.linalg.api.ops.Op$Type`"
  (^org.nd4j.linalg.api.ops.Op$Type [^DifferentialFunction this]
    (-> this (.opType))))

(defn f
  "Shortcut for the DifferentialFunctionFactory

  returns: `org.nd4j.autodiff.functions.DifferentialFunctionFactory`"
  (^org.nd4j.autodiff.functions.DifferentialFunctionFactory [^DifferentialFunction this]
    (-> this (.f))))

(defn output-variable
  "returns: The output variable, or the first output variable, if multiple outputs exist - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunction this]
    (-> this (.outputVariable))))

(defn properties-for-function
  "Returns the properties for a given function

  returns: `java.util.Map<java.lang.String,java.lang.Object>`"
  (^java.util.Map [^DifferentialFunction this]
    (-> this (.propertiesForFunction))))

(defn arg
  "Return the specified argument for this function

  num - Number of the argument. Must be in range 0 to numArgs - 1 inclusive - `int`

  returns: Specified argument - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunction this ^Integer num]
    (-> this (.arg num)))
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunction this]
    (-> this (.arg))))

(defn as-properties
  "Return function properties for the given function

  returns: `org.nd4j.autodiff.functions.FunctionProperties`"
  (^org.nd4j.autodiff.functions.FunctionProperties [^DifferentialFunction this]
    (-> this (.asProperties))))

(defn op-name
  "The name of the op

  returns: `java.lang.String`"
  (^java.lang.String [^DifferentialFunction this]
    (-> this (.opName))))

(defn args
  "Return the arguments for a given function

  returns: the arguments for a given function - `org.nd4j.autodiff.samediff.SDVariable[]`"
  ([^DifferentialFunction this]
    (-> this (.args))))

(defn larg
  "The left argument for this function

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunction this]
    (-> this (.larg))))

(defn init-from-onnx
  "Iniitialize the function from the given
  OnnxProto3.NodeProto

  node - `onnx.OnnxProto3$NodeProto`
  init-with - `org.nd4j.autodiff.samediff.SameDiff`
  attributes-for-node - `java.util.Map`
  graph - `onnx.OnnxProto3$GraphProto`"
  ([^DifferentialFunction this ^onnx.OnnxProto3$NodeProto node ^org.nd4j.autodiff.samediff.SameDiff init-with ^java.util.Map attributes-for-node ^onnx.OnnxProto3$GraphProto graph]
    (-> this (.initFromOnnx node init-with attributes-for-node graph))))

(defn tensorflow-names
  "The opName of this function tensorflow

  returns: `java.lang.String[]`"
  ([^DifferentialFunction this]
    (-> this (.tensorflowNames))))

(defn do-diff
  "The actual implementation for automatic differentiation.

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^DifferentialFunction this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

(defn diff
  "Perform automatic differentiation
  wrt the input variables

  i-v-1 - the input variables - `java.util.List`

  returns: the differentiated output
  wrt each input variable - `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^DifferentialFunction this ^java.util.List i-v-1]
    (-> this (.diff i-v-1))))

(defn get-value
  "Get the value for a given property
  for this function

  property - the property to get - `java.lang.reflect.Field`

  returns: the value for the function if it exists - `java.lang.Object`"
  (^java.lang.Object [^DifferentialFunction this ^java.lang.reflect.Field property]
    (-> this (.getValue property))))

(defn rarg
  "The right argument for this function.
  Note that this assumes that there are 2 args for this
  function, if 2 are not set, it throws an
  ND4JIllegalStateException

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunction this]
    (-> this (.rarg))))

(defn arg-names
  "returns: `java.lang.String[]`"
  ([^DifferentialFunction this]
    (-> this (.argNames))))

(defn op-num
  "The number of the op (mainly for old legacy XYZ ops
  like Op)

  returns: `int`"
  (^Integer [^DifferentialFunction this]
    (-> this (.opNum))))

(defn get-num-outputs
  "returns: `int`"
  (^Integer [^DifferentialFunction this]
    (-> this (.getNumOutputs))))

(defn output-variables-names
  "returns: `java.lang.String[]`"
  ([^DifferentialFunction this]
    (-> this (.outputVariablesNames))))

(defn tensorflow-name
  "The opName of this function tensorflow

  returns: `java.lang.String`"
  (^java.lang.String [^DifferentialFunction this]
    (-> this (.tensorflowName))))

(defn mappings-for-function
  "Returns the mappings for a given function (
  for tensorflow and onnx import mapping properties
  of this function). The mapping is indexed by field name.
  If the function has no properties, this returned map
  will be empty.
  Note that some functions have multiple names.
  This function returns a map indexed by each
  alias it has for a given name.
  These names include both onnx and tensorflow names (which might be 1 or more)

  returns: `java.util.Map<java.lang.String,java.util.Map<java.lang.String,org.nd4j.imports.descriptors.properties.PropertyMapping>>`"
  (^java.util.Map [^DifferentialFunction this]
    (-> this (.mappingsForFunction))))

(defn config-properties?
  "Returns true if the fields for this class should be looked up from a configuration class.

  returns: `boolean`"
  (^Boolean [^DifferentialFunction this]
    (-> this (.isConfigProperties))))

(defn onnx-name
  "The opName of this function in onnx

  returns: `java.lang.String`"
  (^java.lang.String [^DifferentialFunction this]
    (-> this (.onnxName))))

(defn resolve-properties-from-same-diff-before-execution
  "Resolve properties and arguments right before execution of
  this operation."
  ([^DifferentialFunction this]
    (-> this (.resolvePropertiesFromSameDiffBeforeExecution))))

(defn attribute-adapters-for-function
  "Returns the AttributeAdapter s for each of the
  possible ops for import (typically tensorflow and onnx)
  See AttributeAdapter for more information on what the
  adapter does.
  Similar to mappingsForFunction(), the returned map
  contains a AttributeAdapter for each field name
  when one is present. (It is optional for one to exist)_

  returns: `java.util.Map<java.lang.String,java.util.Map<java.lang.String,org.nd4j.imports.descriptors.properties.AttributeAdapter>>`"
  (^java.util.Map [^DifferentialFunction this]
    (-> this (.attributeAdaptersForFunction))))

(defn output-variables
  "Return the output functions for this differential function.

  base-name - `java.lang.String`

  returns: `org.nd4j.autodiff.samediff.SDVariable[]`"
  ([^DifferentialFunction this ^java.lang.String base-name]
    (-> this (.outputVariables base-name)))
  ([^DifferentialFunction this]
    (-> this (.outputVariables))))

(defn set-value-for
  "Set the value for this function.
  Note that if value is null an ND4JIllegalStateException
  will be thrown.

  target - the target field - `java.lang.reflect.Field`
  value - the value to set - `java.lang.Object`"
  ([^DifferentialFunction this ^java.lang.reflect.Field target ^java.lang.Object value]
    (-> this (.setValueFor target value))))

(defn init-from-tensor-flow
  "Initialize the function from the given
  NodeDef

  node-def - `org.tensorflow.framework.NodeDef`
  init-with - `org.nd4j.autodiff.samediff.SameDiff`
  attributes-for-node - `java.util.Map`
  graph - `org.tensorflow.framework.GraphDef`"
  ([^DifferentialFunction this ^org.tensorflow.framework.NodeDef node-def ^org.nd4j.autodiff.samediff.SameDiff init-with ^java.util.Map attributes-for-node ^org.tensorflow.framework.GraphDef graph]
    (-> this (.initFromTensorFlow node-def init-with attributes-for-node graph))))

(defn hash-code
  "returns: `int`"
  (^Integer [^DifferentialFunction this]
    (-> this (.hashCode))))

(defn onnx-names
  "The opName of this function in onnx

  returns: `java.lang.String[]`"
  ([^DifferentialFunction this]
    (-> this (.onnxNames))))

(defn dup
  "Duplicate this function

  returns: `org.nd4j.autodiff.functions.DifferentialFunction`"
  (^org.nd4j.autodiff.functions.DifferentialFunction [^DifferentialFunction this]
    (-> this (.dup))))

(defn has-place-holder-inputs?
  "Returns true if this
  function has place holder inputs

  returns: `boolean`"
  (^Boolean [^DifferentialFunction this]
    (-> this (.hasPlaceHolderInputs))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^DifferentialFunction this ^java.lang.Object o]
    (-> this (.equals o))))

(defn config-field-name
  "Returns the name of the field to be used for looking up field names.
  This should be used in conjunction with isConfigProperties()
  to facilitate mapping fields for model import.

  returns: `java.lang.String`"
  (^java.lang.String [^DifferentialFunction this]
    (-> this (.configFieldName))))

