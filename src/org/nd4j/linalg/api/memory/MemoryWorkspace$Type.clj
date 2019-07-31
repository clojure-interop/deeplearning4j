(ns org.nd4j.linalg.api.memory.MemoryWorkspace$Type
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.memory MemoryWorkspace$Type]))

(def DUMMY
  "Enum Constant.

  This mode means you have dummy workspace here. It doesn't provide any functionality.

  type: org.nd4j.linalg.api.memory.MemoryWorkspace$Type"
  MemoryWorkspace$Type/DUMMY)

(def SCOPED
  "Enum Constant.

  Most regular workspace. It starts somewhere, and ends somewhere. It has limits, aka scope of use.

  type: org.nd4j.linalg.api.memory.MemoryWorkspace$Type"
  MemoryWorkspace$Type/SCOPED)

(def CIRCULAR
  "Enum Constant.

  Special workspace mode: circular buffer. Workspace is never closed, and gets reset only once end reached.

  type: org.nd4j.linalg.api.memory.MemoryWorkspace$Type"
  MemoryWorkspace$Type/CIRCULAR)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (MemoryWorkspace.Type c : MemoryWorkspace.Type.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.nd4j.linalg.api.memory.MemoryWorkspace$Type[]`"
  ([]
    (MemoryWorkspace$Type/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.nd4j.linalg.api.memory.MemoryWorkspace$Type`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.nd4j.linalg.api.memory.MemoryWorkspace$Type [^java.lang.String name]
    (MemoryWorkspace$Type/valueOf name)))

