(ns org.datavec.api.transform.join.Join$JoinType
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.join Join$JoinType]))

(def Inner
  "Enum Constant.

  type: org.datavec.api.transform.join.Join$JoinType"
  Join$JoinType/Inner)

(def LeftOuter
  "Enum Constant.

  type: org.datavec.api.transform.join.Join$JoinType"
  Join$JoinType/LeftOuter)

(def RightOuter
  "Enum Constant.

  type: org.datavec.api.transform.join.Join$JoinType"
  Join$JoinType/RightOuter)

(def FullOuter
  "Enum Constant.

  type: org.datavec.api.transform.join.Join$JoinType"
  Join$JoinType/FullOuter)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (Join.JoinType c : Join.JoinType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.datavec.api.transform.join.Join$JoinType[]`"
  ([]
    (Join$JoinType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.datavec.api.transform.join.Join$JoinType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.datavec.api.transform.join.Join$JoinType [^java.lang.String name]
    (Join$JoinType/valueOf name)))

