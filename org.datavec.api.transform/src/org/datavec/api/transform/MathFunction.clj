(ns org.datavec.api.transform.MathFunction
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform MathFunction]))

(def ABS
  "Enum Constant.

  type: org.datavec.api.transform.MathFunction"
  MathFunction/ABS)

(def ACOS
  "Enum Constant.

  type: org.datavec.api.transform.MathFunction"
  MathFunction/ACOS)

(def ASIN
  "Enum Constant.

  type: org.datavec.api.transform.MathFunction"
  MathFunction/ASIN)

(def ATAN
  "Enum Constant.

  type: org.datavec.api.transform.MathFunction"
  MathFunction/ATAN)

(def CEIL
  "Enum Constant.

  type: org.datavec.api.transform.MathFunction"
  MathFunction/CEIL)

(def COS
  "Enum Constant.

  type: org.datavec.api.transform.MathFunction"
  MathFunction/COS)

(def COSH
  "Enum Constant.

  type: org.datavec.api.transform.MathFunction"
  MathFunction/COSH)

(def EXP
  "Enum Constant.

  type: org.datavec.api.transform.MathFunction"
  MathFunction/EXP)

(def FLOOR
  "Enum Constant.

  type: org.datavec.api.transform.MathFunction"
  MathFunction/FLOOR)

(def LOG
  "Enum Constant.

  type: org.datavec.api.transform.MathFunction"
  MathFunction/LOG)

(def LOG10
  "Enum Constant.

  type: org.datavec.api.transform.MathFunction"
  MathFunction/LOG10)

(def SIGNUM
  "Enum Constant.

  type: org.datavec.api.transform.MathFunction"
  MathFunction/SIGNUM)

(def SIN
  "Enum Constant.

  type: org.datavec.api.transform.MathFunction"
  MathFunction/SIN)

(def SINH
  "Enum Constant.

  type: org.datavec.api.transform.MathFunction"
  MathFunction/SINH)

(def SQRT
  "Enum Constant.

  type: org.datavec.api.transform.MathFunction"
  MathFunction/SQRT)

(def TAN
  "Enum Constant.

  type: org.datavec.api.transform.MathFunction"
  MathFunction/TAN)

(def TANH
  "Enum Constant.

  type: org.datavec.api.transform.MathFunction"
  MathFunction/TANH)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (MathFunction c : MathFunction.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.datavec.api.transform.MathFunction[]`"
  ([]
    (MathFunction/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.datavec.api.transform.MathFunction`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.datavec.api.transform.MathFunction [^java.lang.String name]
    (MathFunction/valueOf name)))

