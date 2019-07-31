(ns org.nd4j.linalg.api.ops.impl.layers.convolution.Pooling2D$Divisor
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.layers.convolution Pooling2D$Divisor]))

(def EXCLUDE_PADDING
  "Enum Constant.

  type: org.nd4j.linalg.api.ops.impl.layers.convolution.Pooling2D$Divisor"
  Pooling2D$Divisor/EXCLUDE_PADDING)

(def INCLUDE_PADDING
  "Enum Constant.

  type: org.nd4j.linalg.api.ops.impl.layers.convolution.Pooling2D$Divisor"
  Pooling2D$Divisor/INCLUDE_PADDING)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (Pooling2D.Divisor c : Pooling2D.Divisor.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.nd4j.linalg.api.ops.impl.layers.convolution.Pooling2D$Divisor[]`"
  ([]
    (Pooling2D$Divisor/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.nd4j.linalg.api.ops.impl.layers.convolution.Pooling2D$Divisor`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.nd4j.linalg.api.ops.impl.layers.convolution.Pooling2D$Divisor [^java.lang.String name]
    (Pooling2D$Divisor/valueOf name)))
