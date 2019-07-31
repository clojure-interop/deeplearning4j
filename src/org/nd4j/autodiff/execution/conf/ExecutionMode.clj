(ns org.nd4j.autodiff.execution.conf.ExecutionMode
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.autodiff.execution.conf ExecutionMode]))

(def SEQUENTIAL
  "Enum Constant.

  all operations will be executed sequentially

  type: org.nd4j.autodiff.execution.conf.ExecutionMode"
  ExecutionMode/SEQUENTIAL)

(def STRICT
  "Enum Constant.

  all operations will be following device id for execution mode selection

  type: org.nd4j.autodiff.execution.conf.ExecutionMode"
  ExecutionMode/STRICT)

(def AUTO
  "Enum Constant.

  all operations that can be executed in parallel - will be executed in parallel

  type: org.nd4j.autodiff.execution.conf.ExecutionMode"
  ExecutionMode/AUTO)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (ExecutionMode c : ExecutionMode.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.nd4j.autodiff.execution.conf.ExecutionMode[]`"
  ([]
    (ExecutionMode/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.nd4j.autodiff.execution.conf.ExecutionMode`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.nd4j.autodiff.execution.conf.ExecutionMode [^java.lang.String name]
    (ExecutionMode/valueOf name)))

