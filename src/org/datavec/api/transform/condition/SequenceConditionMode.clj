(ns org.datavec.api.transform.condition.SequenceConditionMode
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.condition SequenceConditionMode]))

(def And
  "Enum Constant.

  type: org.datavec.api.transform.condition.SequenceConditionMode"
  SequenceConditionMode/And)

(def Or
  "Enum Constant.

  type: org.datavec.api.transform.condition.SequenceConditionMode"
  SequenceConditionMode/Or)

(def NoSequenceMode
  "Enum Constant.

  type: org.datavec.api.transform.condition.SequenceConditionMode"
  SequenceConditionMode/NoSequenceMode)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (SequenceConditionMode c : SequenceConditionMode.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.datavec.api.transform.condition.SequenceConditionMode[]`"
  ([]
    (SequenceConditionMode/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.datavec.api.transform.condition.SequenceConditionMode`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.datavec.api.transform.condition.SequenceConditionMode [^java.lang.String name]
    (SequenceConditionMode/valueOf name)))

