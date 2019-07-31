(ns org.nd4j.linalg.activations.Activation
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.activations Activation]))

(def CUBE
  "Enum Constant.

  type: org.nd4j.linalg.activations.Activation"
  Activation/CUBE)

(def ELU
  "Enum Constant.

  type: org.nd4j.linalg.activations.Activation"
  Activation/ELU)

(def HARDSIGMOID
  "Enum Constant.

  type: org.nd4j.linalg.activations.Activation"
  Activation/HARDSIGMOID)

(def HARDTANH
  "Enum Constant.

  type: org.nd4j.linalg.activations.Activation"
  Activation/HARDTANH)

(def IDENTITY
  "Enum Constant.

  type: org.nd4j.linalg.activations.Activation"
  Activation/IDENTITY)

(def LEAKYRELU
  "Enum Constant.

  type: org.nd4j.linalg.activations.Activation"
  Activation/LEAKYRELU)

(def RATIONALTANH
  "Enum Constant.

  type: org.nd4j.linalg.activations.Activation"
  Activation/RATIONALTANH)

(def RELU
  "Enum Constant.

  type: org.nd4j.linalg.activations.Activation"
  Activation/RELU)

(def RELU6
  "Enum Constant.

  type: org.nd4j.linalg.activations.Activation"
  Activation/RELU6)

(def RRELU
  "Enum Constant.

  type: org.nd4j.linalg.activations.Activation"
  Activation/RRELU)

(def SIGMOID
  "Enum Constant.

  type: org.nd4j.linalg.activations.Activation"
  Activation/SIGMOID)

(def SOFTMAX
  "Enum Constant.

  type: org.nd4j.linalg.activations.Activation"
  Activation/SOFTMAX)

(def SOFTPLUS
  "Enum Constant.

  type: org.nd4j.linalg.activations.Activation"
  Activation/SOFTPLUS)

(def SOFTSIGN
  "Enum Constant.

  type: org.nd4j.linalg.activations.Activation"
  Activation/SOFTSIGN)

(def TANH
  "Enum Constant.

  type: org.nd4j.linalg.activations.Activation"
  Activation/TANH)

(def RECTIFIEDTANH
  "Enum Constant.

  type: org.nd4j.linalg.activations.Activation"
  Activation/RECTIFIEDTANH)

(def SELU
  "Enum Constant.

  type: org.nd4j.linalg.activations.Activation"
  Activation/SELU)

(def SWISH
  "Enum Constant.

  type: org.nd4j.linalg.activations.Activation"
  Activation/SWISH)

(def THRESHOLDEDRELU
  "Enum Constant.

  type: org.nd4j.linalg.activations.Activation"
  Activation/THRESHOLDEDRELU)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (Activation c : Activation.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.nd4j.linalg.activations.Activation[]`"
  ([]
    (Activation/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.nd4j.linalg.activations.Activation`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.nd4j.linalg.activations.Activation [^java.lang.String name]
    (Activation/valueOf name)))

(defn *from-string
  "Returns the activation function enum value

  name - the case-insensitive opName of the activation function - `java.lang.String`

  returns: the activation function enum value - `org.nd4j.linalg.activations.Activation`"
  (^org.nd4j.linalg.activations.Activation [^java.lang.String name]
    (Activation/fromString name)))

(defn get-activation-function
  "Creates an instance of the activation function

  returns: an instance of the activation function - `org.nd4j.linalg.activations.IActivation`"
  (^org.nd4j.linalg.activations.IActivation [^Activation this]
    (-> this (.getActivationFunction))))

(defn as-same-diff
  "Get the Activation as a SameDiff variable

  variable-name - Variable name - `java.lang.String`
  sd - SameDiff instance - `org.nd4j.autodiff.samediff.SameDiff`
  input - Input variable to apply the activation function to - `org.nd4j.autodiff.samediff.SDVariable`

  returns: SDVariable: output after applying the activation function - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^Activation this ^java.lang.String variable-name ^org.nd4j.autodiff.samediff.SameDiff sd ^org.nd4j.autodiff.samediff.SDVariable input]
    (-> this (.asSameDiff variable-name sd input)))
  (^org.nd4j.autodiff.samediff.SDVariable [^Activation this ^org.nd4j.autodiff.samediff.SameDiff sd ^org.nd4j.autodiff.samediff.SDVariable input]
    (-> this (.asSameDiff sd input))))

(defn as-transform
  "Get the Activation function as an ND4J Transform, applied on either the input or a copy of the input

  in - Input to apply the activation function op to - `org.nd4j.linalg.api.ndarray.INDArray`
  dup - If true: duplicate the array before applying the transform. If false: don't duplicate - `boolean`

  returns: The transform op (execute using Nd4j.getExecutioner().exec(op) - `org.nd4j.linalg.api.ops.TransformOp`"
  (^org.nd4j.linalg.api.ops.TransformOp [^Activation this ^org.nd4j.linalg.api.ndarray.INDArray in ^Boolean dup]
    (-> this (.asTransform in dup))))

(defn as-transform-derivative
  "Get the Activation function derivative (i.e., dOut/dIn) as an ND4J Transform, applied on either the input
  or a copy of the input

  in - Input to apply the activation function derivative op to - `org.nd4j.linalg.api.ndarray.INDArray`
  dup - If true: duplicate the array before applying the transform. If false: don't duplicate - `boolean`

  returns: The op (execute using Nd4j.getExecutioner().exec(op) - `org.nd4j.linalg.api.ops.Op`"
  (^org.nd4j.linalg.api.ops.Op [^Activation this ^org.nd4j.linalg.api.ndarray.INDArray in ^Boolean dup]
    (-> this (.asTransformDerivative in dup))))

