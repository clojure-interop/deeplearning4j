(ns org.deeplearning4j.ui.api.LengthUnit
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.api LengthUnit]))

(def Px
  "Enum Constant.

  type: org.deeplearning4j.ui.api.LengthUnit"
  LengthUnit/Px)

(def Percent
  "Enum Constant.

  type: org.deeplearning4j.ui.api.LengthUnit"
  LengthUnit/Percent)

(def CM
  "Enum Constant.

  type: org.deeplearning4j.ui.api.LengthUnit"
  LengthUnit/CM)

(def MM
  "Enum Constant.

  type: org.deeplearning4j.ui.api.LengthUnit"
  LengthUnit/MM)

(def In
  "Enum Constant.

  type: org.deeplearning4j.ui.api.LengthUnit"
  LengthUnit/In)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (LengthUnit c : LengthUnit.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.deeplearning4j.ui.api.LengthUnit[]`"
  ([]
    (LengthUnit/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.deeplearning4j.ui.api.LengthUnit`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.deeplearning4j.ui.api.LengthUnit [^java.lang.String name]
    (LengthUnit/valueOf name)))

