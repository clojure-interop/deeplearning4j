(ns org.nd4j.jita.conf.Configuration$AllocationModel
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.jita.conf Configuration$AllocationModel]))

(def DIRECT
  "Enum Constant.

  type: org.nd4j.jita.conf.Configuration$AllocationModel"
  Configuration$AllocationModel/DIRECT)

(def CACHE_HOST
  "Enum Constant.

  type: org.nd4j.jita.conf.Configuration$AllocationModel"
  Configuration$AllocationModel/CACHE_HOST)

(def CACHE_ALL
  "Enum Constant.

  type: org.nd4j.jita.conf.Configuration$AllocationModel"
  Configuration$AllocationModel/CACHE_ALL)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (Configuration.AllocationModel c : Configuration.AllocationModel.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.nd4j.jita.conf.Configuration$AllocationModel[]`"
  ([]
    (Configuration$AllocationModel/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.nd4j.jita.conf.Configuration$AllocationModel`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.nd4j.jita.conf.Configuration$AllocationModel [^java.lang.String name]
    (Configuration$AllocationModel/valueOf name)))

