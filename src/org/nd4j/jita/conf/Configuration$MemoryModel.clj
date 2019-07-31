(ns org.nd4j.jita.conf.Configuration$MemoryModel
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.jita.conf Configuration$MemoryModel]))

(def IMMEDIATE
  "Enum Constant.

  type: org.nd4j.jita.conf.Configuration$MemoryModel"
  Configuration$MemoryModel/IMMEDIATE)

(def DELAYED
  "Enum Constant.

  type: org.nd4j.jita.conf.Configuration$MemoryModel"
  Configuration$MemoryModel/DELAYED)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (Configuration.MemoryModel c : Configuration.MemoryModel.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.nd4j.jita.conf.Configuration$MemoryModel[]`"
  ([]
    (Configuration$MemoryModel/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.nd4j.jita.conf.Configuration$MemoryModel`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.nd4j.jita.conf.Configuration$MemoryModel [^java.lang.String name]
    (Configuration$MemoryModel/valueOf name)))

