(ns org.nd4j.linalg.api.ops.impl.layers.convolution.Pooling3D$Pooling3DType
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.layers.convolution Pooling3D$Pooling3DType]))

(def MAX
  "Enum Constant.

  type: org.nd4j.linalg.api.ops.impl.layers.convolution.Pooling3D$Pooling3DType"
  Pooling3D$Pooling3DType/MAX)

(def AVG
  "Enum Constant.

  type: org.nd4j.linalg.api.ops.impl.layers.convolution.Pooling3D$Pooling3DType"
  Pooling3D$Pooling3DType/AVG)

(def PNORM
  "Enum Constant.

  type: org.nd4j.linalg.api.ops.impl.layers.convolution.Pooling3D$Pooling3DType"
  Pooling3D$Pooling3DType/PNORM)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (Pooling3D.Pooling3DType c : Pooling3D.Pooling3DType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.nd4j.linalg.api.ops.impl.layers.convolution.Pooling3D$Pooling3DType[]`"
  ([]
    (Pooling3D$Pooling3DType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.nd4j.linalg.api.ops.impl.layers.convolution.Pooling3D$Pooling3DType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.nd4j.linalg.api.ops.impl.layers.convolution.Pooling3D$Pooling3DType [^java.lang.String name]
    (Pooling3D$Pooling3DType/valueOf name)))

