(ns org.datavec.api.transform.transform.normalize.Normalize
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.transform.normalize Normalize]))

(def MinMax
  "Enum Constant.

  type: org.datavec.api.transform.transform.normalize.Normalize"
  Normalize/MinMax)

(def MinMax2
  "Enum Constant.

  type: org.datavec.api.transform.transform.normalize.Normalize"
  Normalize/MinMax2)

(def Standardize
  "Enum Constant.

  type: org.datavec.api.transform.transform.normalize.Normalize"
  Normalize/Standardize)

(def SubtractMean
  "Enum Constant.

  type: org.datavec.api.transform.transform.normalize.Normalize"
  Normalize/SubtractMean)

(def Log2Mean
  "Enum Constant.

  type: org.datavec.api.transform.transform.normalize.Normalize"
  Normalize/Log2Mean)

(def Log2MeanExcludingMin
  "Enum Constant.

  type: org.datavec.api.transform.transform.normalize.Normalize"
  Normalize/Log2MeanExcludingMin)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (Normalize c : Normalize.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.datavec.api.transform.transform.normalize.Normalize[]`"
  ([]
    (Normalize/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.datavec.api.transform.transform.normalize.Normalize`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.datavec.api.transform.transform.normalize.Normalize [^java.lang.String name]
    (Normalize/valueOf name)))

