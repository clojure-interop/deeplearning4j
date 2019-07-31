(ns org.deeplearning4j.nn.api.FwdPassType
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.api FwdPassType]))

(def STANDARD
  "Enum Constant.

  type: org.deeplearning4j.nn.api.FwdPassType"
  FwdPassType/STANDARD)

(def RNN_TIMESTEP
  "Enum Constant.

  type: org.deeplearning4j.nn.api.FwdPassType"
  FwdPassType/RNN_TIMESTEP)

(def RNN_ACTIVATE_WITH_STORED_STATE
  "Enum Constant.

  type: org.deeplearning4j.nn.api.FwdPassType"
  FwdPassType/RNN_ACTIVATE_WITH_STORED_STATE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (FwdPassType c : FwdPassType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.deeplearning4j.nn.api.FwdPassType[]`"
  ([]
    (FwdPassType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.deeplearning4j.nn.api.FwdPassType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.deeplearning4j.nn.api.FwdPassType [^java.lang.String name]
    (FwdPassType/valueOf name)))

