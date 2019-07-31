(ns org.nd4j.linalg.api.memory.enums.DebugMode
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.memory.enums DebugMode]))

(def DISABLED
  "Enum Constant.

  Default mode, means that workspaces work in production mode

  type: org.nd4j.linalg.api.memory.enums.DebugMode"
  DebugMode/DISABLED)

(def SPILL_EVERYTHING
  "Enum Constant.

  All allocations will be considered spilled

  type: org.nd4j.linalg.api.memory.enums.DebugMode"
  DebugMode/SPILL_EVERYTHING)

(def BYPASS_EVERYTHING
  "Enum Constant.

  All workspaces will be disabled. There will be literally no way to enable workspace anywhere

  type: org.nd4j.linalg.api.memory.enums.DebugMode"
  DebugMode/BYPASS_EVERYTHING)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (DebugMode c : DebugMode.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.nd4j.linalg.api.memory.enums.DebugMode[]`"
  ([]
    (DebugMode/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.nd4j.linalg.api.memory.enums.DebugMode`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.nd4j.linalg.api.memory.enums.DebugMode [^java.lang.String name]
    (DebugMode/valueOf name)))

