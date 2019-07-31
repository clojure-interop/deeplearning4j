(ns org.datavec.api.transform.condition.ConditionOp
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.condition ConditionOp]))

(def LessThan
  "Enum Constant.

  type: org.datavec.api.transform.condition.ConditionOp"
  ConditionOp/LessThan)

(def LessOrEqual
  "Enum Constant.

  type: org.datavec.api.transform.condition.ConditionOp"
  ConditionOp/LessOrEqual)

(def GreaterThan
  "Enum Constant.

  type: org.datavec.api.transform.condition.ConditionOp"
  ConditionOp/GreaterThan)

(def GreaterOrEqual
  "Enum Constant.

  type: org.datavec.api.transform.condition.ConditionOp"
  ConditionOp/GreaterOrEqual)

(def Equal
  "Enum Constant.

  type: org.datavec.api.transform.condition.ConditionOp"
  ConditionOp/Equal)

(def NotEqual
  "Enum Constant.

  type: org.datavec.api.transform.condition.ConditionOp"
  ConditionOp/NotEqual)

(def InSet
  "Enum Constant.

  type: org.datavec.api.transform.condition.ConditionOp"
  ConditionOp/InSet)

(def NotInSet
  "Enum Constant.

  type: org.datavec.api.transform.condition.ConditionOp"
  ConditionOp/NotInSet)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (ConditionOp c : ConditionOp.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.datavec.api.transform.condition.ConditionOp[]`"
  ([]
    (ConditionOp/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.datavec.api.transform.condition.ConditionOp`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.datavec.api.transform.condition.ConditionOp [^java.lang.String name]
    (ConditionOp/valueOf name)))

(defn apply
  "x - `double`
  value - `double`
  set - `java.util.Set`

  returns: `boolean`"
  (^Boolean [^ConditionOp this ^Double x ^Double value ^java.util.Set set]
    (-> this (.apply x value set))))

