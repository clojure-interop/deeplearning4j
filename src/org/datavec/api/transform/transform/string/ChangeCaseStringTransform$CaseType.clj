(ns org.datavec.api.transform.transform.string.ChangeCaseStringTransform$CaseType
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.transform.string ChangeCaseStringTransform$CaseType]))

(def LOWER
  "Enum Constant.

  type: org.datavec.api.transform.transform.string.ChangeCaseStringTransform$CaseType"
  ChangeCaseStringTransform$CaseType/LOWER)

(def UPPER
  "Enum Constant.

  type: org.datavec.api.transform.transform.string.ChangeCaseStringTransform$CaseType"
  ChangeCaseStringTransform$CaseType/UPPER)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (ChangeCaseStringTransform.CaseType c : ChangeCaseStringTransform.CaseType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.datavec.api.transform.transform.string.ChangeCaseStringTransform$CaseType[]`"
  ([]
    (ChangeCaseStringTransform$CaseType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.datavec.api.transform.transform.string.ChangeCaseStringTransform$CaseType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.datavec.api.transform.transform.string.ChangeCaseStringTransform$CaseType [^java.lang.String name]
    (ChangeCaseStringTransform$CaseType/valueOf name)))

