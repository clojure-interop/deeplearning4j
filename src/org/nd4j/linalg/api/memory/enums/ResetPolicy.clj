(ns org.nd4j.linalg.api.memory.enums.ResetPolicy
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.memory.enums ResetPolicy]))

(def BLOCK_LEFT
  "Enum Constant.

  This policy means - once end of MemoryWorkspace block reached its end - it'll be reset to the beginning.

  type: org.nd4j.linalg.api.memory.enums.ResetPolicy"
  ResetPolicy/BLOCK_LEFT)

(def ENDOFBUFFER_REACHED
  "Enum Constant.

  This policy means - this Workspace instance will be acting as
  circular buffer, so it'll be reset only after
  end of workspace buffer is reached.

  type: org.nd4j.linalg.api.memory.enums.ResetPolicy"
  ResetPolicy/ENDOFBUFFER_REACHED)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (ResetPolicy c : ResetPolicy.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.nd4j.linalg.api.memory.enums.ResetPolicy[]`"
  ([]
    (ResetPolicy/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.nd4j.linalg.api.memory.enums.ResetPolicy`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.nd4j.linalg.api.memory.enums.ResetPolicy [^java.lang.String name]
    (ResetPolicy/valueOf name)))

