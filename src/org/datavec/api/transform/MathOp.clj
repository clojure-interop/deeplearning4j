(ns org.datavec.api.transform.MathOp
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform MathOp]))

(def Add
  "Enum Constant.

  type: org.datavec.api.transform.MathOp"
  MathOp/Add)

(def Subtract
  "Enum Constant.

  type: org.datavec.api.transform.MathOp"
  MathOp/Subtract)

(def Multiply
  "Enum Constant.

  type: org.datavec.api.transform.MathOp"
  MathOp/Multiply)

(def Divide
  "Enum Constant.

  type: org.datavec.api.transform.MathOp"
  MathOp/Divide)

(def Modulus
  "Enum Constant.

  type: org.datavec.api.transform.MathOp"
  MathOp/Modulus)

(def ReverseSubtract
  "Enum Constant.

  type: org.datavec.api.transform.MathOp"
  MathOp/ReverseSubtract)

(def ReverseDivide
  "Enum Constant.

  type: org.datavec.api.transform.MathOp"
  MathOp/ReverseDivide)

(def ScalarMin
  "Enum Constant.

  type: org.datavec.api.transform.MathOp"
  MathOp/ScalarMin)

(def ScalarMax
  "Enum Constant.

  type: org.datavec.api.transform.MathOp"
  MathOp/ScalarMax)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (MathOp c : MathOp.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.datavec.api.transform.MathOp[]`"
  ([]
    (MathOp/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.datavec.api.transform.MathOp`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.datavec.api.transform.MathOp [^java.lang.String name]
    (MathOp/valueOf name)))

