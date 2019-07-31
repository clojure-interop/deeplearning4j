(ns org.datavec.api.transform.condition.BooleanCondition$Type
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.condition BooleanCondition$Type]))

(def AND
  "Enum Constant.

  type: org.datavec.api.transform.condition.BooleanCondition$Type"
  BooleanCondition$Type/AND)

(def OR
  "Enum Constant.

  type: org.datavec.api.transform.condition.BooleanCondition$Type"
  BooleanCondition$Type/OR)

(def NOT
  "Enum Constant.

  type: org.datavec.api.transform.condition.BooleanCondition$Type"
  BooleanCondition$Type/NOT)

(def XOR
  "Enum Constant.

  type: org.datavec.api.transform.condition.BooleanCondition$Type"
  BooleanCondition$Type/XOR)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (BooleanCondition.Type c : BooleanCondition.Type.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.datavec.api.transform.condition.BooleanCondition$Type[]`"
  ([]
    (BooleanCondition$Type/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.datavec.api.transform.condition.BooleanCondition$Type`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.datavec.api.transform.condition.BooleanCondition$Type [^java.lang.String name]
    (BooleanCondition$Type/valueOf name)))

