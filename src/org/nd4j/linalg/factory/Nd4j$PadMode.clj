(ns org.nd4j.linalg.factory.Nd4j$PadMode
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.factory Nd4j$PadMode]))

(def CONSTANT
  "Enum Constant.

  type: org.nd4j.linalg.factory.Nd4j$PadMode"
  Nd4j$PadMode/CONSTANT)

(def EDGE
  "Enum Constant.

  type: org.nd4j.linalg.factory.Nd4j$PadMode"
  Nd4j$PadMode/EDGE)

(def LINEAR_RAMP
  "Enum Constant.

  type: org.nd4j.linalg.factory.Nd4j$PadMode"
  Nd4j$PadMode/LINEAR_RAMP)

(def MAXIMUM
  "Enum Constant.

  type: org.nd4j.linalg.factory.Nd4j$PadMode"
  Nd4j$PadMode/MAXIMUM)

(def MEAN
  "Enum Constant.

  type: org.nd4j.linalg.factory.Nd4j$PadMode"
  Nd4j$PadMode/MEAN)

(def MEDIAN
  "Enum Constant.

  type: org.nd4j.linalg.factory.Nd4j$PadMode"
  Nd4j$PadMode/MEDIAN)

(def MINIMUM
  "Enum Constant.

  type: org.nd4j.linalg.factory.Nd4j$PadMode"
  Nd4j$PadMode/MINIMUM)

(def REFLECT
  "Enum Constant.

  type: org.nd4j.linalg.factory.Nd4j$PadMode"
  Nd4j$PadMode/REFLECT)

(def SYMMETRIC
  "Enum Constant.

  type: org.nd4j.linalg.factory.Nd4j$PadMode"
  Nd4j$PadMode/SYMMETRIC)

(def WRAP
  "Enum Constant.

  type: org.nd4j.linalg.factory.Nd4j$PadMode"
  Nd4j$PadMode/WRAP)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (Nd4j.PadMode c : Nd4j.PadMode.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.nd4j.linalg.factory.Nd4j$PadMode[]`"
  ([]
    (Nd4j$PadMode/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.nd4j.linalg.factory.Nd4j$PadMode`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.nd4j.linalg.factory.Nd4j$PadMode [^java.lang.String name]
    (Nd4j$PadMode/valueOf name)))

