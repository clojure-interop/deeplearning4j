(ns org.nd4j.jita.conf.Configuration$ExecutionModel
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.jita.conf Configuration$ExecutionModel]))

(def SEQUENTIAL
  "Enum Constant.

  type: org.nd4j.jita.conf.Configuration$ExecutionModel"
  Configuration$ExecutionModel/SEQUENTIAL)

(def ASYNCHRONOUS
  "Enum Constant.

  type: org.nd4j.jita.conf.Configuration$ExecutionModel"
  Configuration$ExecutionModel/ASYNCHRONOUS)

(def OPTIMIZED
  "Enum Constant.

  type: org.nd4j.jita.conf.Configuration$ExecutionModel"
  Configuration$ExecutionModel/OPTIMIZED)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (Configuration.ExecutionModel c : Configuration.ExecutionModel.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.nd4j.jita.conf.Configuration$ExecutionModel[]`"
  ([]
    (Configuration$ExecutionModel/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.nd4j.jita.conf.Configuration$ExecutionModel`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.nd4j.jita.conf.Configuration$ExecutionModel [^java.lang.String name]
    (Configuration$ExecutionModel/valueOf name)))

