(ns org.nd4j.imports.converters.DifferentialFunctionClassHolder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.imports.converters DifferentialFunctionClassHolder]))

(defn *get-instance
  "returns: `org.nd4j.imports.converters.DifferentialFunctionClassHolder`"
  (^org.nd4j.imports.converters.DifferentialFunctionClassHolder []
    (DifferentialFunctionClassHolder/getInstance )))

(defn op-names
  "returns: `java.util.Set<java.lang.String>`"
  (^java.util.Set [^DifferentialFunctionClassHolder this]
    (-> this (.opNames))))

(defn get-op-descriptor-for-onnx
  "Get the op definition of a given
  onnx op
  Note that if the name does not exist,
  an ND4JIllegalStateException
  will be thrown.

  name - the name of the op - `java.lang.String`

  returns: the op definition for a given op - `org.nd4j.imports.descriptors.onnx.OpDescriptor`"
  (^org.nd4j.imports.descriptors.onnx.OpDescriptor [^DifferentialFunctionClassHolder this ^java.lang.String name]
    (-> this (.getOpDescriptorForOnnx name))))

(defn has-name?
  "name - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^DifferentialFunctionClassHolder this ^java.lang.String name]
    (-> this (.hasName name))))

(defn missing-tensorflow-ops
  "Returns the missing tensorflow ops

  returns: `java.util.Set<java.lang.String>`"
  (^java.util.Set [^DifferentialFunctionClassHolder this]
    (-> this (.missingTensorflowOps))))

(defn get-op-def-by-tensorflow-name
  "Get the op definition of a given
  tensorflow op.
  Note that if the name does not exist,
  an ND4JIllegalStateException will be thrown

  name - the name of the op - `java.lang.String`

  returns: the op definition for a given op - `org.tensorflow.framework.OpDef`"
  (^org.tensorflow.framework.OpDef [^DifferentialFunctionClassHolder this ^java.lang.String name]
    (-> this (.getOpDefByTensorflowName name))))

(defn missing-onnx-ops
  "Returns the missing onnx ops

  returns: `java.util.Set<java.lang.String>`"
  (^java.util.Set [^DifferentialFunctionClassHolder this]
    (-> this (.missingOnnxOps))))

(defn get-fields-for-function
  "Get the fields for a given DifferentialFunction

  function - the function to get the fields for - `org.nd4j.autodiff.functions.DifferentialFunction`

  returns: the fields for a given function - `java.util.Map<java.lang.String,java.lang.reflect.Field>`"
  (^java.util.Map [^DifferentialFunctionClassHolder this ^org.nd4j.autodiff.functions.DifferentialFunction function]
    (-> this (.getFieldsForFunction function))))

(defn get-instance
  "name - `java.lang.String`

  returns: `org.nd4j.autodiff.functions.DifferentialFunction`"
  (^org.nd4j.autodiff.functions.DifferentialFunction [^DifferentialFunctionClassHolder this ^java.lang.String name]
    (-> this (.getInstance name))))

(defn get-op-with-tensorflow-name
  "Get the

  tensorflow-name - `java.lang.String`

  returns: `org.nd4j.autodiff.functions.DifferentialFunction`"
  (^org.nd4j.autodiff.functions.DifferentialFunction [^DifferentialFunctionClassHolder this ^java.lang.String tensorflow-name]
    (-> this (.getOpWithTensorflowName tensorflow-name))))

(defn missing-ops
  "Returns the missing ops
  for c++ vs java.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^DifferentialFunctionClassHolder this]
    (-> this (.missingOps))))

(defn get-op-with-onnx-name
  "onnx-name - `java.lang.String`

  returns: `org.nd4j.autodiff.functions.DifferentialFunction`"
  (^org.nd4j.autodiff.functions.DifferentialFunction [^DifferentialFunctionClassHolder this ^java.lang.String onnx-name]
    (-> this (.getOpWithOnnxName onnx-name))))

