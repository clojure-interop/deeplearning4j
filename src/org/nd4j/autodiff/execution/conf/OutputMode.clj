(ns org.nd4j.autodiff.execution.conf.OutputMode
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.autodiff.execution.conf OutputMode]))

(def IMPLICIT
  "Enum Constant.

  only final nodes of graph will be returned

  type: org.nd4j.autodiff.execution.conf.OutputMode"
  OutputMode/IMPLICIT)

(def EXPLICIT
  "Enum Constant.

  only declared output fields

  type: org.nd4j.autodiff.execution.conf.OutputMode"
  OutputMode/EXPLICIT)

(def EXPLICIT_AND_IMPLICIT
  "Enum Constant.

  both options enabled

  type: org.nd4j.autodiff.execution.conf.OutputMode"
  OutputMode/EXPLICIT_AND_IMPLICIT)

(def VARIABLE_SPACE
  "Enum Constant.

  whole content of VariableSpace will be returned back

  type: org.nd4j.autodiff.execution.conf.OutputMode"
  OutputMode/VARIABLE_SPACE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (OutputMode c : OutputMode.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.nd4j.autodiff.execution.conf.OutputMode[]`"
  ([]
    (OutputMode/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.nd4j.autodiff.execution.conf.OutputMode`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.nd4j.autodiff.execution.conf.OutputMode [^java.lang.String name]
    (OutputMode/valueOf name)))

