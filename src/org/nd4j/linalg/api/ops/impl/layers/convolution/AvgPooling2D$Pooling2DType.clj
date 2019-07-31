(ns org.nd4j.linalg.api.ops.impl.layers.convolution.AvgPooling2D$Pooling2DType
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.layers.convolution AvgPooling2D$Pooling2DType]))

(def MAX
  "Enum Constant.

  type: org.nd4j.linalg.api.ops.impl.layers.convolution.AvgPooling2D$Pooling2DType"
  AvgPooling2D$Pooling2DType/MAX)

(def AVG
  "Enum Constant.

  type: org.nd4j.linalg.api.ops.impl.layers.convolution.AvgPooling2D$Pooling2DType"
  AvgPooling2D$Pooling2DType/AVG)

(def PNORM
  "Enum Constant.

  type: org.nd4j.linalg.api.ops.impl.layers.convolution.AvgPooling2D$Pooling2DType"
  AvgPooling2D$Pooling2DType/PNORM)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (AvgPooling2D.Pooling2DType c : AvgPooling2D.Pooling2DType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.nd4j.linalg.api.ops.impl.layers.convolution.AvgPooling2D$Pooling2DType[]`"
  ([]
    (AvgPooling2D$Pooling2DType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.nd4j.linalg.api.ops.impl.layers.convolution.AvgPooling2D$Pooling2DType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.nd4j.linalg.api.ops.impl.layers.convolution.AvgPooling2D$Pooling2DType [^java.lang.String name]
    (AvgPooling2D$Pooling2DType/valueOf name)))

