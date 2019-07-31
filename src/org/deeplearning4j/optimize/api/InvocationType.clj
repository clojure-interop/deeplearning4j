(ns org.deeplearning4j.optimize.api.InvocationType
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.optimize.api InvocationType]))

(def EPOCH_START
  "Enum Constant.

  Iterator will be called on start of epoch.
  PLEASE NOTE: This option makes sense only for pretrained models.

  type: org.deeplearning4j.optimize.api.InvocationType"
  InvocationType/EPOCH_START)

(def EPOCH_END
  "Enum Constant.

  Iterator will be called on end of epoch

  type: org.deeplearning4j.optimize.api.InvocationType"
  InvocationType/EPOCH_END)

(def ITERATION_END
  "Enum Constant.

  Iterator will be called on iteration end

  type: org.deeplearning4j.optimize.api.InvocationType"
  InvocationType/ITERATION_END)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (InvocationType c : InvocationType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.deeplearning4j.optimize.api.InvocationType[]`"
  ([]
    (InvocationType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.deeplearning4j.optimize.api.InvocationType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.deeplearning4j.optimize.api.InvocationType [^java.lang.String name]
    (InvocationType/valueOf name)))

