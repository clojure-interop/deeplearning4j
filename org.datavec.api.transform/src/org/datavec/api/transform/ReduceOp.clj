(ns org.datavec.api.transform.ReduceOp
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform ReduceOp]))

(def Prod
  "Enum Constant.

  type: org.datavec.api.transform.ReduceOp"
  ReduceOp/Prod)

(def Min
  "Enum Constant.

  type: org.datavec.api.transform.ReduceOp"
  ReduceOp/Min)

(def Max
  "Enum Constant.

  type: org.datavec.api.transform.ReduceOp"
  ReduceOp/Max)

(def Range
  "Enum Constant.

  type: org.datavec.api.transform.ReduceOp"
  ReduceOp/Range)

(def Append
  "Enum Constant.

  type: org.datavec.api.transform.ReduceOp"
  ReduceOp/Append)

(def Prepend
  "Enum Constant.

  type: org.datavec.api.transform.ReduceOp"
  ReduceOp/Prepend)

(def Sum
  "Enum Constant.

  type: org.datavec.api.transform.ReduceOp"
  ReduceOp/Sum)

(def Mean
  "Enum Constant.

  type: org.datavec.api.transform.ReduceOp"
  ReduceOp/Mean)

(def Stdev
  "Enum Constant.

  type: org.datavec.api.transform.ReduceOp"
  ReduceOp/Stdev)

(def UncorrectedStdDev
  "Enum Constant.

  type: org.datavec.api.transform.ReduceOp"
  ReduceOp/UncorrectedStdDev)

(def Variance
  "Enum Constant.

  type: org.datavec.api.transform.ReduceOp"
  ReduceOp/Variance)

(def PopulationVariance
  "Enum Constant.

  type: org.datavec.api.transform.ReduceOp"
  ReduceOp/PopulationVariance)

(def Count
  "Enum Constant.

  type: org.datavec.api.transform.ReduceOp"
  ReduceOp/Count)

(def CountUnique
  "Enum Constant.

  type: org.datavec.api.transform.ReduceOp"
  ReduceOp/CountUnique)

(def TakeFirst
  "Enum Constant.

  type: org.datavec.api.transform.ReduceOp"
  ReduceOp/TakeFirst)

(def TakeLast
  "Enum Constant.

  type: org.datavec.api.transform.ReduceOp"
  ReduceOp/TakeLast)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (ReduceOp c : ReduceOp.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.datavec.api.transform.ReduceOp[]`"
  ([]
    (ReduceOp/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.datavec.api.transform.ReduceOp`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.datavec.api.transform.ReduceOp [^java.lang.String name]
    (ReduceOp/valueOf name)))

